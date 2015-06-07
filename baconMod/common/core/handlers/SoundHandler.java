package minecraftwero.baconMod.common.core.handlers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import minecraftwero.baconMod.common.lib.BaconLib;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.client.event.sound.SoundLoadEvent;

public class SoundHandler
{
	@SideOnly(Side.CLIENT)
	@ForgeSubscribe
	public void onSoundsLoaded(SoundLoadEvent event)
	{
		event.manager.soundPoolStreaming.addSound(BaconLib.modID+":BaconPancakes.ogg");
	}
}
