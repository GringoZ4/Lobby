/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.SrFernando.mc.flylobby;

import com.SrFernando.mc.flylobby.Listener.Fly;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Fernando
 */
public class Main extends JavaPlugin{
    
    @Override
    public void onEnable(){
        Fly fly = new Fly(this);
       getServer().getPluginManager().registerEvents(fly, this);
    }
    
}
