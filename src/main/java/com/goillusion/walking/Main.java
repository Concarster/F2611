package com.goillusion.walking;

import com.goillusion.walking.client.proxy.CommonProxy;
import com.goillusion.walking.client.tabs.*;
import com.goillusion.walking.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;


@Mod(modid = Reference.MOD_ID, version = Reference.MOD_VERSION )
public class Main
{
	@Instance(Reference.MOD_ID)
    public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    
    public static CommonProxy proxy;
	public static SimpleNetworkWrapper network;
	
	public static final CreativeTabs MAIN_TAB = new MainTab("mainTab");
	public static final CreativeTabs MAIN_BLOCKS = new MainBlocks("mainBlocks");
	public static final CreativeTabs MAIN_ITEMS = new MainItems("mainItems");
	public static final CreativeTabs MAIN_TOOLS = new MainTools("mainTools");
	public static final CreativeTabs MAIN_ARMORS = new MainArmors("mainArmors");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
      proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
      proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
      proxy.postInit();
    }

    public static String prependModID(String name) {return Reference.MOD_ID + ":" + name;}
}
