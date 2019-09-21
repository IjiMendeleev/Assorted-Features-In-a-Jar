package com.evershy.afiajar;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.evershy.afiajar.util.handlers.iHasModel;

public class BlockWC extends BlockBase implements iHasModel
{
    @SideOnly(Side.CLIENT)
	public BlockWC(String name, Material material, SoundType sound) 
	{
    	super(name, material, sound);
        setCreativeTab(CreativeTabs.MISC);
        setLightLevel(0F);  
        setTickRandomly(true);
	}
	
	public static void SpawnMob(WorldServer world, BlockPos pos, EntityLiving mob)
	{
		mob.forceSpawn = true;
		if (!ForgeEventFactory.doSpecialSpawn(mob, world, pos.getX(), pos.getY() + 1F, pos.getZ()))
			mob.onInitialSpawn(world.getDifficultyForLocation(new BlockPos(mob)), null);
		
		if (!mob.isNotColliding() || !mob.getCanSpawnHere()) {
			mob.setDead();
			return;
		}
		
	}
	protected void trytospawnmob(WorldServer world, BlockPos pos, Biome.SpawnListEntry entry)
	{
		
    EntityEntry entityEntry = EntityRegistry.getEntry(entry.entityClass);
	EntityLiving mob = (EntityLiving) entityEntry.newInstance(world);;
	EnumCreatureType type = EnumCreatureType.MONSTER;
	if (entry == null || !world.canCreatureTypeSpawnHere(type, entry, pos))
		return;

	if (mob == null) return;

	SpawnMob(world, pos, mob);
	}
	@Override
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
       
    @Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "normal");		
	}
}