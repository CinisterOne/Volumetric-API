package com.loganwm.Volumetric.Volume;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.util.Vector;

public class CloneEffect extends VolumeEffect
{
	Volume vol1;
	Volume vol2;
	
	public CloneEffect(Volume volume1, Volume volume2)
	{
		this.vol1 = volume1;
		this.vol2 = volume2;
	}
	
	public void onBlockPlace(BlockPlaceEvent event)
	{
		Vector origin = vol1.getOriginPoint();
		System.out.println(origin);
		Vector blockLocation = event.getBlock().getLocation().toVector();
		Vector relativeLocation = blockLocation.subtract(origin);
		System.out.println(relativeLocation);
		Vector remoteOrigin = vol2.getOriginPoint();
		System.out.println(remoteOrigin);
		Vector remoteRelativePosition = remoteOrigin.add(relativeLocation);
		System.out.println(remoteRelativePosition);
		Location remoteLocation = remoteRelativePosition.toLocation(event.getBlock().getWorld());
		event.getBlock().getWorld().getBlockAt(remoteLocation).setType(event.getBlock().getType());
	}
	
	public void onBlockBreak(BlockBreakEvent event)
	{
		Vector origin = vol1.getOriginPoint();
		System.out.println(origin);
		Vector blockLocation = event.getBlock().getLocation().toVector();
		Vector relativeLocation = blockLocation.subtract(origin);
		System.out.println(relativeLocation);
		Vector remoteOrigin = vol2.getOriginPoint();
		System.out.println(remoteOrigin);
		Vector remoteRelativePosition = remoteOrigin.add(relativeLocation);
		System.out.println(remoteRelativePosition);
		Location remoteLocation = remoteRelativePosition.toLocation(event.getBlock().getWorld());
		event.getBlock().getWorld().getBlockAt(remoteLocation).setType(Material.AIR);
	}
}
