package org.allocatednetwork.banondeath.listeners;

import org.allocatednetwork.banondeath.Main;
import org.allocatednetwork.banondeath.utils.Utils;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import net.md_5.bungee.api.ChatColor;

public class PlayerDeathListener implements Listener {

	private static Main plugin;

	public PlayerDeathListener(Main plugin) {
		this.plugin = plugin;

		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		if (e.getEntity().getKiller() instanceof Player) {

			Player killer = e.getEntity().getKiller();
			Player P = e.getEntity();

			killer.sendMessage(Utils.chat("well you died lol"));
			plugin.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), "ban " + P.getUniqueId() + " §4You Died!");
			
			

		}
	}

}
