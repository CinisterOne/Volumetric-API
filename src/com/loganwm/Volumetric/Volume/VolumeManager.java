package com.loganwm.Volumetric.Volume;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;

import com.loganwm.Volumetric.VolumetricPlugin;
import com.loganwm.Volumetric.Volume.Event.VolumetricBlockListener;
import com.loganwm.Volumetric.Volume.Event.VolumetricPlayerListener;

public class VolumeManager
{
	private static VolumeManager instance;
	
	ArrayList<Volume> volumes;
	
	public VolumeManager()
	{
		if (instance == null)
			instance = this;

		VolumetricPlayerListener playerListener = new VolumetricPlayerListener();
		VolumetricBlockListener blockListener = new VolumetricBlockListener();
		
		volumes = new ArrayList<Volume>();
		
		VolumetricPlugin.getInstance().getServer().getPluginManager().registerEvent(Event.Type.PLAYER_MOVE, playerListener, Priority.Low, VolumetricPlugin.getInstance());
		
		VolumetricPlugin.getInstance().getServer().getPluginManager().registerEvent(Event.Type.BLOCK_PLACE, blockListener, Priority.Low, VolumetricPlugin.getInstance());
		VolumetricPlugin.getInstance().getServer().getPluginManager().registerEvent(Event.Type.BLOCK_BREAK, blockListener, Priority.Low, VolumetricPlugin.getInstance());
		VolumetricPlugin.getInstance().getServer().getPluginManager().registerEvent(Event.Type.BLOCK_BURN, blockListener, Priority.Low, VolumetricPlugin.getInstance());
		VolumetricPlugin.getInstance().getServer().getPluginManager().registerEvent(Event.Type.BLOCK_IGNITE, blockListener, Priority.Low, VolumetricPlugin.getInstance());		
		VolumetricPlugin.getInstance().getServer().getPluginManager().registerEvent(Event.Type.BLOCK_PHYSICS, blockListener, Priority.Low, VolumetricPlugin.getInstance());
		
	}
	
	public static VolumeManager getInstance()
	{
		if (instance == null)
			instance = new VolumeManager();
		
		return instance;
	}
	
	public List<Volume> getVolumes()
	{
		return volumes;
	}
	
	public void addVolume(Volume volume)
	{
		volumes.add(volume);
	}
	
	public Volume getVolumeByName(String name)
	{
		for (Volume volume : volumes)
			if (volume.getName().equals(name))
				return volume;
				
		return null;
	}
}
