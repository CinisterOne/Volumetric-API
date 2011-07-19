package com.loganwm.Volumetric.Volume;

public interface IVolume
{
	public boolean withinBounds(float x, float y, float z);
	public boolean isPlayerWithinVolume(String playerName);
}
