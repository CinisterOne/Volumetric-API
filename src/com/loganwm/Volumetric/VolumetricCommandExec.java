package com.loganwm.Volumetric;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VolumetricCommandExec implements CommandExecutor
{
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
	
	    if (sender instanceof Player)
	    {
	        Player player = (Player)sender;

	        if (command.getName().equalsIgnoreCase("volume"))
	    		if (args.length > 0)
	    		{
	    		}
	    }
	    else
	    	sender.sendMessage("This command cannont be executed from the server console.");
	    
		return true;
    }
}
