package com.goillusion.walking.util;

public class Reference {
	
	public Reference() {
		
	}
	
	// Mod Constants
    public static final String MOD_ID = "walking";
    public static final String MOD_NAME = "Walking Mod";
    public static final String MOD_VERSION = "1.12.2-1.0.1";
    public static final String BUILD = "GRADLE:BUILD";
	public static final String VERSION = "GRADLE:VERSION-" + BUILD;
 
    // Gen Constants  
    public static final String URL = "http://www.goillusion.com";
	public static final String APDATEURL = "";
	public static final String COPYRYGHT = "GAME OF ILLUSION";
    
    // Common Constants
	
	public static final String CLIENT_PROXY_CLASS = "com.goillusion.walking.client.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.goillusion.walking.client.proxy.CommonProxy";
	public static final String SERVER_PROXY_CLASS = "com.goillusion.walking.ServerProxy";
	
    // UI Constants
	public static final String PREFIX_MOD = MOD_ID+":";
	public static final String GUI_CONFIG_FACTORY = PREFIX_MOD + "config/GuiConfigFactory";
    public static final String PREFIX_GUI = PREFIX_MOD + "textures/gui/";

    // Dependencies
    
    public static final String DEPENDENCIES = "";
	public static final String MAIN_CONFIG = "com.goillusion.walking.config.MainConfig";
    public static final String GOGUI_FACTORY_CONFIG = "com.goillusion.walking.config.GoIllusionGuiFactory";
	
	public static final String RESOURCE_PREFIX = MOD_ID + ":";
	
}
