package com.evershy.afiajar;

import com.evershy.afiajar.util.handlers.iHasModel;
import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.WeightedSpawnerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockWC extends BlockBase 
{
    public BlockWC(String name, Material material, SoundType sound) 
	{
    	super(name, material, sound);
        setCreativeTab(CreativeTabs.MISC);
        setLightLevel(1F);
                     
        AItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
    
    @Override
	public void randomTick(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState state, java.util.Random random)
	{
    	 Entity entity = spawnCreature(worldIn, getNamedIdFrom(), (double)pos.getX() + 0.5D, (double)pos.getY() + 1D, (double)pos.getZ() + 0.5D);
	}

	private Object getNamedIdFrom() 
	{		
		return Lists.<WeightedSpawnerEntity>newArrayList();
	}

	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "normal");		
	}
}