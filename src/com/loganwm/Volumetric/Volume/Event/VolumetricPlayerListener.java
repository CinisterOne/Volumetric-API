package com.loganwm.Volumetric.Volume.Event;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.loganwm.Volumetric.Volume.Volume;
import com.loganwm.Volumetric.Volume.VolumeEffect;
import com.loganwm.Volumetric.Volume.VolumeManager;

public class VolumetricPlayerListener extends PlayerListener
{
	public void onPlayerMove(PlayerMoveEvent event)
	{
		Player player = event.getPlayer();
		
		for (Volume volume : VolumeManager.getInstance().getVolumes())
			if (volume.withinBounds(player.getLocation().getBlockX(), player.getLocation().getBlockY(), player.getLocation().getBlockZ()))
			{
				//player enter volume event
				if (!volume.isPlayerWithinVolume(player.getName()))
				{
					volume.addPlayer(player.getName());
					
					//pass to all effects
					for (VolumeEffect effect : volume.getEffects())
						effect.onPlayerEnterVolume(new PlayerEnterVolumeEvent(player, volume));
				}
			}
			else
			{
				//player leave volume event
				if (volume.isPlayerWithinVolume(player.getName()))
				{
					volume.removePlayer(player.getName());

					//pass to all effects
					for (VolumeEffect effect : volume.getEffects())
						effect.onPlayerLeaveVolume(new PlayerLeaveVolumeEvent(player, volume));
				}
			}
	}
	
	
}
