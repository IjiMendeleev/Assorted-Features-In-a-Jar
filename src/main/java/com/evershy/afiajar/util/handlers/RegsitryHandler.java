package com.evershy.afiajar.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;

import com.evershy.afiajar.ABlocks;
import com.evershy.afiajar.AItems;



@EventBusSubscriber
public class RegsitryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(AItems.ITEMS.toArray(new Item[0]));
	}
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ABlocks.BLOCKS.toArray(new Block[0]));
	}
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : AItems.ITEMS)
		{
			if(item instanceof iHasModel)
			{
				((iHasModel)item).registerModels();
			}
		}
		for(Block block : ABlocks.BLOCKS)
		{
			if(block instanceof iHasModel)
			{
				((iHasModel)block).registerModels();
				
			}
		}

	}
}
