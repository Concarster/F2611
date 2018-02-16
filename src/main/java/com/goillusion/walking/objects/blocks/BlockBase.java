package com.goillusion.walking.objects.blocks;

import com.goillusion.walking.Main;
import com.goillusion.walking.init.BlockInit;
import com.goillusion.walking.init.ItemInit;
import com.goillusion.walking.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name , Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(5.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Main.MAIN_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}