package com.goillusion.walking.init;

import java.util.ArrayList;
import java.util.List;

import com.goillusion.walking.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class BlockInit {
	
public static final List<Block> BLOCKS = new ArrayList<Block>();


/** Blocks */
public static final Block BLOCK_MINI_DIAMOND = new BlockBase("block_mini_diamond", Material.IRON);
public static final Block BLOCK_MINI_EMERALD = new BlockBase("block_mini_emerald", Material.IRON);
public static final Block BLOCK_MINI_GOLD = new BlockBase("block_mini_gold", Material.IRON);
public static final Block BLOCK_MINI_IRON = new BlockBase("block_mini_iron", Material.IRON);

/** Blocks Tiles */
//public static final Block BLOCK_OVER = new BlockOver("over");

/** Ores */
//public static final Block ORE_NETHER = new BlockOresPlus("ore_nether", "nether");
//public static final Block ORE = new BlockOres("ore");





}
