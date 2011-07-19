package com.loganwm.Volumetric.Volume.Event;

import org.bukkit.entity.Player;

import com.loganwm.Volumetric.Volume.Volume;

public class PlayerEnterVolumeEvent extends VolumeEvent
{
	Player player;
	Volume volume;
	
	public PlayerEnterVolumeEvent(Player player, Volume volume)
	{
		this.player = player;
		this.volume = volume;
	}
	
	public Player getPlayer()
	{
		return player;
	}
	
	public Volume getVolume()
	{
		return volume;
	}
}
