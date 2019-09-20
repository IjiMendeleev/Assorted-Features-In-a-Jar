package com.evershy.afiajar;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;

public class EntityModMob extends EntityMob
{
	public EntityModMob(World worldIn) 
	{
		super(worldIn);
	}
 @Override
 protected boolean isValidLightLevel()
 {
	return true;
 }
 
}
