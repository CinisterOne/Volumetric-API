package com.loganwm.Volumetric.Volume;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.loganwm.Volumetric.VolumetricPlugin;

public class Volume implements IVolume
{
	protected VolumeType type;
	protected ArrayList<VolumeEffect> effects;
	protected ArrayList<Player> players;
	protected String volumeName;
	
	public Volume()
	{
		this.effects = new ArrayList<VolumeEffect>();
		this.players = new ArrayList<Player>();
	}

	public String getName()
	{
		return this.volumeName;
	}
	
	@Override
	public boolean withinBounds(float x, float y, float z) {
		return false;
	}
	
	public void addPlayer(String playerName)
	{
		Player player = VolumetricPlugin.getInstance().getServer().getPlayer(playerName);
		
		if (player != null)
			players.add(player);
		else
			System.out.println("addPlayer: Player doesn't exist.");
	}

	public Vector getOriginPoint()
	{
		return null;
	}
	
	public void removePlayer(String playerName)
	{
		Player player = VolumetricPlugin.getInstance().getServer().getPlayer(playerName);
		
		if (player != null)
			players.remove(player);
		else
			System.out.println("removePlayer: Player doesn't exist.");
	}
	
	public boolean isPlayerWithinVolume(String playerName)
	{
		Player player = VolumetricPlugin.getInstance().getServer().getPlayer(playerName);
		
		if (players.contains(player))
			return true;
		else
			return false;	
	}
	
	public List<VolumeEffect> getEffects()
	{
		return effects;
	}
	
	public void addEffect(VolumeEffect effect)
	{
		effects.add(effect);
	}
	
	public void removeEffect(VolumeEffect effect)
	{
		effects.remove(effect);
	}	
}
