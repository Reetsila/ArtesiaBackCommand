package fr.reetsila.artesiabackcommand;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        getCommand("back").setExecutor(new BackCommand());
        super.onEnable();
    }
}
