package com.loganwm.Volumetric.Volume.Event;

public class VolumeEvent
{
	private boolean cancelled;
	
	public boolean isCancelled()
	{
		return cancelled;
	}
	
	public void setCancelled(boolean value)
	{
		cancelled = value;
	}
}
