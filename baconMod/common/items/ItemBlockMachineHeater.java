package minecraftwero.baconMod.common.items;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMachineHeater extends ItemBlock
{

	public ItemBlockMachineHeater(int par1)
	{
		super(par1);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int par1) 
	{
		return par1;
	}

	@Override
	public String getItemDisplayName(ItemStack par1ItemStack) 
	{
		switch(par1ItemStack.getItemDamage())
		{
			case 0: return "Heater";
			case 1: return "Melter";
			default: return "Error";
		}
	}
	
	

}
