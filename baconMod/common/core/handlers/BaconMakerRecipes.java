package minecraftwero.baconMod.common.core.handlers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import minecraftwero.baconMod.common.config.BaconItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class BaconMakerRecipes 
{
	private static BaconMakerRecipes recipe = new BaconMakerRecipes();
	
	private HashMap<List<Integer>, ItemStack> metaRecipes = new HashMap<List<Integer>, ItemStack>();
	
	public static BaconMakerRecipes getRecipes()
	{
		return recipe;
	}
	

	
	public void addMillRecipe(ItemStack input, ItemStack output)
	{
		metaRecipes.put(Arrays.asList(input.itemID, input.getItemDamage()), output);
	}
	
	public ItemStack getRecipeOuput(ItemStack input)
	{
		ItemStack par1 = (ItemStack)metaRecipes.get(Arrays.asList(input.itemID, input.getItemDamage()));
		if(par1 != null)
		{
			return par1;
		}
		return null;
	}
}
