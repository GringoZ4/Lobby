/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.SrFernando.mc.flylobby.Listener;

import com.SrFernando.mc.flylobby.Main;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 *
 * @author Fernando
 */
public class Fly implements Listener , CommandExecutor{
    Main plugin;
    public List<Player> players = new ArrayList();
    public Fly(Main pl)        
    {
        this.plugin=pl;
    } 
    
  @EventHandler
  public void onPvP(final PlayerJoinEvent event)
  {
       Bukkit.getScheduler().runTaskLater(this.plugin, new Runnable()
            {
    
    
           public void run()
                {  
      
       if(!event.getPlayer().hasPermission("fly.vip")){
         return;
        } else{
          players.add(event.getPlayer());
          event.getPlayer().setFlying(true);
          event.getPlayer().setAllowFlight(true);
      }
    
    
                       }


                   }, 20);
  
     
  }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        
        
        
        return true;
    }
    
}
