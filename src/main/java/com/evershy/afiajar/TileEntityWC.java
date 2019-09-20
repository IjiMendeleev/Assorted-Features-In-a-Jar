package com.evershy.afiajar;

import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.ITickable;
import net.minecraft.util.WeightedSpawnerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.evershy.afiajar.TileEntityWC;
import com.google.common.collect.Lists;

public class TileEntityWC extends TileEntity implements ITickable
{
	@Override
	public void update() 
	{
	}
    
	public <onRandomTick> TileEntityWC(World worldIn)
	{
		Entity entity = spawnCreature(worldIn, getNamedIdFrom());
	}
	
	private Object getNamedIdFrom() 
	{
		return Lists.<WeightedSpawnerEntity>newArrayList();;
	}

	private final MobSpawnerBaseLogic spawnerLogic = new MobSpawnerBaseLogic();
	
	public MobSpawnerBaseLogic getSpawnerBaseLogic()
   {
	        return this.spawnerLogic;
   }
	
	
}
