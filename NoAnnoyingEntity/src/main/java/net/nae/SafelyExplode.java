package net.nae;

import org.bukkit.Bukkit;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SafelyExplode extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event){
        Entity entity=event.getEntity();
        if(entity instanceof Creeper){
            //Remove all blocks from the list
            event.blockList().clear();
        }
    }

    @Override
    public void onDisable() {
    }
}