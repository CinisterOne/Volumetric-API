package com.loganwm.Volumetric.Volume;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class SphereVolume extends Volume
{
	int x;
	int y;
	int z;
	int radius;
	
	public SphereVolume(String name, int x, int y, int z, int radius)
	{
		this.volumeName = name;
		this.type = VolumeType.Sphere;
		this.x = x;
		this.y = y;
		this.z = z;
		this.radius = radius;
		this.effects = new ArrayList<VolumeEffect>();
		this.players = new ArrayList<Player>();
	}

	public boolean withinBounds(float x, float y, float z)
	{
		Vector origin = new Vector(this.x,this.y,this.z);
		Vector position = new Vector(x,y,z);
		
		if (origin.distance(position) >= radius)
			return false;
		
		return true;
	}
	
	public Vector getOriginPoint()
	{
		return new Vector(x,y,z);
	}

}
