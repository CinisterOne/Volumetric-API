package com.loganwm.Volumetric.Volume;

import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.loganwm.Volumetric.Volume.Event.PlayerEnterVolumeEvent;
import com.loganwm.Volumetric.Volume.Event.PlayerLeaveVolumeEvent;

public class VolumeEffect
{
	public void onPlayerEnterVolume(PlayerEnterVolumeEvent event)
	{
		event.getPlayer().sendMessage("Entered Volume.");		
	}
	
	public void onPlayerLeaveVolume(PlayerLeaveVolumeEvent event)
	{
		event.getPlayer().sendMessage("Left Volume.");
	}
	
	public void onBlockPlace(BlockPlaceEvent event)
	{
		event.getPlayer().sendMessage("Placed block.");
	}
	
	public void onBlockBreak(BlockBreakEvent event)
	{
		event.getPlayer().sendMessage("Destroyed block.");		
	}
}
