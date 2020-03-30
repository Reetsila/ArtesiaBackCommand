package fr.reetsila.artesiabackcommand;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BackCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(!(sender instanceof Player)){
            sender.sendMessage("Attention: Cette commande est executable que par un joueur !");
            return false;
        }

        Player player = (Player) sender;

        if (label.equalsIgnoreCase("back")){
            if (args.length == 0){
                if (PlayerListener.back.containsKey(player)){
                    player.teleport(PlayerListener.back.get(player));
                    player.sendMessage("§7(§cBack§7) §bVous avez été téléporter sur le lieu de votre mort.");
                } else {
                    player.sendMessage("§7(§cBack§7) §cVous n'êtes pas mort.");
                }
            }
        }

        return false;
    }
}
