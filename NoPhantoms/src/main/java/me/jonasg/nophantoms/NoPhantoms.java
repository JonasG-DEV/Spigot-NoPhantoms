package me.jonasg.nophantoms;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoPhantoms extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onSpawn(EntitySpawnEvent e){
        if(e.getEntityType() == EntityType.PHANTOM){
            e.setCancelled(true);
        }
    }
}
