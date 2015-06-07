package minecraftwero.baconMod.common.core.handlers;

import java.util.Random;

import minecraftwero.baconMod.common.blocks.BlockBaconSapling;
import minecraftwero.baconMod.common.config.BaconItems;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class BoneMealEvent 
{
	@ForgeSubscribe
    public void bonemealUsed(BonemealEvent event)
    {
		if(BaconItems.baconSapling != null)
		{
		 	if(event.world.getBlockId(event.X, event.Y, event.Z) == BaconItems.baconSapling.blockID)
		 	{
		 		((BlockBaconSapling)BaconItems.baconSapling).growTree(event.world, event.X, event.Y, event.Z, new Random());
		 	}
		}
    }
}
