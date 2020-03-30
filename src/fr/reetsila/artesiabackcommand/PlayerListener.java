package fr.reetsila.artesiabackcommand;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.HashMap;

public class PlayerListener implements Listener {

    static HashMap<Player, Location> back = new HashMap<Player, Location>();

    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        Player player = event.getEntity();
        back.put(player, player.getLocation());
    }
}
