package minecraftwero.baconMod.common.items;

import minecraftwero.baconMod.Bacon;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaconRecords extends ItemRecord {

	public String name;
	public String texture;
	
	public BaconRecords(int par1, String recordName, String string2, String baconDisc) 
	{
		super(par1, recordName);
		this.setCreativeTab(Bacon.baconMod);
		name = string2;
		texture = baconDisc;
		this.setTextureName(string2);
	}

	public String getItemDisplayName(ItemStack par1)
	{
		return name;
	}
	
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(texture);
	}
	
	@Override
    public String getRecordTitle()
    {
        return "C418 - Bacon Pancakes";
    }

}
