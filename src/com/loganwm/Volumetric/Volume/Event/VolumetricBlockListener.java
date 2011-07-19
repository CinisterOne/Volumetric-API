package com.loganwm.Volumetric.Volume.Event;

import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.loganwm.Volumetric.Volume.Volume;
import com.loganwm.Volumetric.Volume.VolumeEffect;
import com.loganwm.Volumetric.Volume.VolumeManager;

public class VolumetricBlockListener extends BlockListener
{
	public void onBlockPlace(BlockPlaceEvent event)
	{
		
		for (Volume volume : VolumeManager.getInstance().getVolumes())
			if (volume.withinBounds(event.getBlock().getX(),event.getBlock().getY(),event.getBlock().getZ()))
				for (VolumeEffect effect : volume.getEffects())
					effect.onBlockPlace(event);
	}
	
	public void onBlockBreak(BlockBreakEvent event)
	{
		
		for (Volume volume : VolumeManager.getInstance().getVolumes())
			if (volume.withinBounds(event.getBlock().getX(),event.getBlock().getY(),event.getBlock().getZ()))
				for (VolumeEffect effect : volume.getEffects())
					effect.onBlockBreak(event);
	}
	
}
