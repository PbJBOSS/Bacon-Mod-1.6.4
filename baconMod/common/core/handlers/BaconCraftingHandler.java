package minecraftwero.baconMod.common.core.handlers;

import java.util.Random;

import minecraftwero.baconMod.common.config.BaconItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.common.ICraftingHandler;
import net.minecraft.util.DamageSource;

public class BaconCraftingHandler implements ICraftingHandler
{
	public Random rand = new Random();
	
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) 
	{
		
		if(BaconItems.FineSword != null)
		{
			for(int i = 0; i<craftMatrix.getSizeInventory();i++)
			{
				ItemStack par1 = craftMatrix.getStackInSlot(i);
				if(par1 != null && par1.itemID == BaconItems.fineSword.itemID)
				{
					if(rand.nextInt(3) == 0)
					{
						player.attackEntityFrom(BaconItems.FineSword, 2F);
					}
				}
			}
		}
		

		
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) 
	{
		
	}
	
}
