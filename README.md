# Bacon-Mod-1.6.4

This is the src code for the Bacon Mod (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/1286184-1-6-2-1-6-4-bacon-mod)

#Changes from 1.6.4 to 1.7.10

- Bacon.java
 - NetworkRegistry.instance() -> NetworkRegistry.INSTANCE

- BaconClient.java
 - RegisterItemRenderer needs an item not a block, use Item.getItemFromBlock(static reference to block)
 
- All gui classes
 - fontRenderer -> fontRendererObj

- RenderSloth.java
 - don't know what function func_177_a is but its probably deobfuscated by now, I changed it to call super.doRender
 
- All Block classes
 - Icon is now IIcon
 - MinecraftForge.setHarvestLevel is now a Block method: setHarvestLevel
 - registerIIcons is now registerBlockIcons
 - getBlockTileEntity is now getTileEntity
 - getAABBPool().getAABB is now getBoundingBox
 - getIIcon is now getIcon
 - idPicked no longer exists
 - getSubBlocks takes an Item instead of an int
 - idDropped no longer exists
 - Few methods take IBlockAccess instead of World object
 - markTileEntityForDespawn no longer exists, just remove the block from the world.
 - Lots of small changes is methods because of the change with ids
 
- BaconItems.java
 - EnumArmorMaterial -> ArmorMaterial
 
- BaconCore.java
 - GameRegistry.registerWorldGenerator now takes a class that implements IWorldGenerator and a gen weight
 
- BaconWorld.java
 - Change all id usage to static Block usage

- BaconRecipes
 - Static minecraft items moved from Item class to Items class, same with blocks (Block to Blocks)

- Everywhere
 - Ids are not use for blocks or items, use the static references to them
 - @ForgeSubscribe -> @SubscribeEvent