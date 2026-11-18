package party.lemons.biomemakeover.mixin;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import party.lemons.biomemakeover.util.EntityUtil;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin
{
    /*
        Apply Projectile Resisitence attritube
     */

    // Capturing the local MutableFloat crashed on 1.21.1, so add our bonus to the return value instead
    @Inject(at = @At("RETURN"), method = "getDamageProtection", cancellable = true)
    private static void applyProjectileResistance(ServerLevel serverLevel, LivingEntity livingEntity, DamageSource damageSource, CallbackInfoReturnable<Float> cir)
    {
        if(damageSource.is(DamageTypeTags.IS_PROJECTILE))
        {
            MutableFloat extra = new MutableFloat(0);
            EntityUtil.applyProjectileResistance(livingEntity.getArmorAndBodyArmorSlots(), extra);
            if(extra.floatValue() != 0)
                cir.setReturnValue(cir.getReturnValue() + extra.floatValue());
        }
    }
}
