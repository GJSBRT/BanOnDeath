package org.allocatednetwork.banondeath;

import org.bukkit.plugin.java.JavaPlugin;

import org.allocatednetwork.banondeath.listeners.PlayerDeathListener;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new PlayerDeathListener(this);
	}
}
