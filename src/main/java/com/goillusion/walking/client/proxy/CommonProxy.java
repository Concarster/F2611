package com.goillusion.walking.client.proxy;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.text.translation.I18n;

public abstract class CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {}
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}
	
	public void preInit() {	
		 
	  }
  
	public void init() {
		      
	  }

	public void postInit() {
		
	  }

	abstract public boolean playerIsInCreativeMode(EntityPlayer player);
	
	abstract public boolean isDedicatedServer();
	  
	
	}
