package com.evershy.afiajar;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import com.evershy.afiajar.util.handlers.iHasModel;


public class BlockBase extends Block 
{   
	public BlockBase(String name, Material material, SoundType sound)
	{
       super(material);
       setUnlocalizedName(name);
       setRegistryName(name);
       setCreativeTab(CreativeTabs.MISC);
       setSoundType(sound);
                     
       ABlocks.BLOCKS.add(this);
       AItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
   	} 
	public void registerModels()
	    {
	        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "normal");
	    }
}
