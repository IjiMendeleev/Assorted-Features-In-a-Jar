package com.evershy.afiajar;

import com.evershy.afiajar.util.handlers.iHasModel;
import com.evershy.afiajar.EntityPebble;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.*;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemPebble extends Item  implements iHasModel 
{
		
		public ItemPebble(String name)
		{
	       setUnlocalizedName(name);
	       setRegistryName(name);
	       setCreativeTab(CreativeTabs.COMBAT);
	              
	       AItems.ITEMS.add(this); 
		}
		@Override 
		public void registerModels()
		    {
		        Main.proxy.registerItemRenderer(this, 0, "inventory");
		    }
	
	
   public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
   {
       ItemStack itemstack = playerIn.getHeldItem(handIn);

       if (!playerIn.capabilities.isCreativeMode)
       {
           itemstack.shrink(1);
       }

       worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

       if (!worldIn.isRemote)
       {
    	   EntityPebble entitypebble = new EntityPebble(worldIn, playerIn);
    	   entitypebble.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
    	   worldIn.spawnEntity(entitypebble);
       }

       playerIn.addStat(StatList.getObjectUseStats(this));
       return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
   }
}



	


