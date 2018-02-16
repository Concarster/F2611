package com.goillusion.walking.client.proxy;

import com.goillusion.walking.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	    }
	
	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, filename), id));
	    }
	
	public void preInit() {
	    super.preInit();
        }

	public void init() {
	    super.init();
	    }

	public void postInit() {
	    super.postInit();
        }

	@Override
    public boolean playerIsInCreativeMode(EntityPlayer player) {
	    if (player instanceof EntityPlayerMP) {
	      EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
	      return entityPlayerMP.interactionManager.isCreative();
	    } else if (player instanceof EntityPlayerSP) {
	      return Minecraft.getMinecraft().playerController.isInCreativeMode();
	    }
	    return false;
	  }

	@Override
	public boolean isDedicatedServer() {
		return false;
		}
	
}
