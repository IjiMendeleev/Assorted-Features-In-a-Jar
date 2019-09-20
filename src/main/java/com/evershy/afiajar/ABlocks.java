package com.evershy.afiajar;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class ABlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final BlockWC WATER_CANDLE = new BlockWC("water_candle", Material.CACTUS, SoundType.ANVIL);
}



