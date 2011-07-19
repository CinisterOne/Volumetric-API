package com.loganwm.Volumetric.Volume;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class CuboidVolume extends Volume
{
	int x1;
	int x2;
	int y1;
	int y2;
	int z1;
	int z2;
	
	public CuboidVolume(String name, int x1, int y1, int z1, int x2, int y2, int z2)
	{
		super();
		
		this.volumeName = name;
		this.type = VolumeType.Cube;
		this.x1 = x1;
		this.y1 = y1;
		this.z1 = z1;
		this.x2 = x2;
		this.y2 = y2;
		this.z2 = z2;
	}

	
	public boolean withinBounds(float x, float y, float z)
	{
		if (!(x >= Math.min(x1, x2) && x <= Math.max(x1, x2)))
			return false;
		if (!(y >= Math.min(y1, y2) && y <= Math.max(y1, y2)))
			return false;
		if (!(z >= Math.min(z1, z2) && z <= Math.max(z1, z2)))
			return false;
		
		return true;
	}
	
	public Vector getOriginPoint()
	{
		int x;
		int y;
		int z;
		
		if (x1 < x2)
			x = x1;
		else
			x = x2;
		
		if (y1 < y2)
			y = y1;
		else
			y = y2;

		if (z1 < z2)
			z = z1;
		else
			z = z2;
		
		return new Vector(x,y,z);
	}

}
