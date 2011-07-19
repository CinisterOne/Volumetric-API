package com.loganwm.Volumetric;

import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

import com.loganwm.Volumetric.Volume.CloneEffect;
import com.loganwm.Volumetric.Volume.CuboidVolume;
import com.loganwm.Volumetric.Volume.Volume;
import com.loganwm.Volumetric.Volume.VolumeManager;

public class VolumetricPlugin extends JavaPlugin
{
	private static VolumetricPlugin instance;
		
	public static VolumetricPlugin getInstance()
	{		
		return instance;
	}
	
	public void onEnable()
	{
		if (instance == null)
			instance = this;
		
		VolumeManager.getInstance().addVolume(new CuboidVolume("VolumeA", 40, 96, 74, 37, 98, 72));
		VolumeManager.getInstance().addVolume(new CuboidVolume("VolumeB", 30, 96, 74, 27, 98, 72));
		VolumeManager.getInstance().getVolumeByName("VolumeA").addEffect(new CloneEffect(VolumeManager.getInstance().getVolumeByName("VolumeA"),VolumeManager.getInstance().getVolumeByName("VolumeB")));
	}
	
	public void onDisable()
	{
		
	}
}
