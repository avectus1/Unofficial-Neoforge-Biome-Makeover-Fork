Biome Makeover Refoxed

This is an unofficial NeoForge 1.21.1 port of Biome Makeover. It's a fork of eirmax's Biome Makeover Continuation with a bunch of fixes I needed for my modpack.

It is not affiliated with LASER KNIGHTS, please don't bother them with bugs from this port. Open an issue here instead.

Credits

- Original mod by Lemonszz (LASER KNIGHTS): https://github.com/Lemonszz/Biome-Makeover
- Continuation by eirmax, which this is based on: https://github.com/eirmax/Biome-Makeover-Continuation
- Taniwha library port by eirmax: https://github.com/eirmax/taniwha-remaked

What I changed

- Added a NeoForge access transformer. The Fabric access widener isn't applied on NeoForge, which caused crashes (for example during the Adjudicator fight)
- Projectile Resistance no longer crashes when you take damage
- Mansions no longer search the live world while generating, which could freeze the server
- Structure pieces don't place blocks outside the chunk being generated anymore
- Mansion layout and Moth Blossom use the world's random instead of a shared one
- Curse of Enfeeblement takes away a heart per level instead of setting your max health to zero
- Fixed arrow speed and multishot spread with the Inaccuracy curse
- Fixed some checks that compared registry entries the wrong way, so Projectile Resistance, Ectoplasm composting, Paydirt and the Black Thistle work again
- Fixed curse attributes being tracked more than once
- Helmit Crab shells render armor layers and dye colors properly
- Fixed the Adjudicator's invulnerability overlay texture
- Tumbleweeds render with transparency and have no collision
- Updated 10 advancements and 6 loot tables to the 1.21 format, they weren't loading before

Requirements

- Minecraft 1.21.1
- NeoForge 21.1 or newer
- Architectury API 13.0.11 or newer

Taniwha is included in the jar. Don't install this together with the original Biome Makeover.

Building

Run ./gradlew :neoforge:build and the jar ends up in neoforge/build/libs. You need the Taniwha jar from eirmax's GitHub packages to build.

License

MIT, same as the original. Copyright LASER KNIGHTS, see LICENCE.
