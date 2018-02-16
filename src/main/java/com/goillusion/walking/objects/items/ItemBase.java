package com.goillusion.walking.objects.items;

import com.goillusion.walking.Main;
import com.goillusion.walking.init.ItemInit;
import com.goillusion.walking.util.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MAIN_ITEMS);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}