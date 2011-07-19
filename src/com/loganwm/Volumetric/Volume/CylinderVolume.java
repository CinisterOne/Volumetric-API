package com.loganwm.Volumetric.Volume;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class CylinderVolume extends Volume
{
	int x;
	int y;
	int z;
	int radius;
	int height;
	
	public CylinderVolume(String name, int x, int y, int z, int radius, int height)
	{
		this.volumeName = name;
		this.type = VolumeType.Cylinder;
		this.x = x;
		this.y = y;
		this.z = z;
		this.radius = radius;
		this.height = height;
		this.effects = new ArrayList<VolumeEffect>();
		this.players = new ArrayList<Player>();
	}
	
	
	
	public boolean withinBounds(int x, int y, int z)
	{
		Vector origin = new Vector(this.x,this.y,this.z);
		Vector position = new Vector(x,y,z);
		
		if (origin.distance(position) >= this.radius)
			return false;
		
		return true;
	}
	
	public Vector getOriginPoint()
	{
		return new Vector(x,y,z);
	}

}
