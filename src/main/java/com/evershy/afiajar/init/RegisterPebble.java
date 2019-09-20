package com.evershy.afiajar.init;

import java.util.Set;

import javax.annotation.Nonnull;

import net.minecraft.block.material.MapColor;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

import com.evershy.afiajar.EntityPebble;
import com.evershy.afiajar.util.Reference;
import com.google.common.collect.ImmutableSet;


public abstract class RegisterPebble
{
	    @SubscribeEvent
		public static void onRegisterEntitiesEvent(@Nonnull final RegistryEvent.Register<EntityEntry> event)
		{
	    	final ResourceLocation cobble_pebble = new ResourceLocation(Reference.MOD_ID, "cobble_pebble");
	    	    	
			event.getRegistry().registerAll(
			EntityEntryBuilder.create()
		    .entity(EntityPebble.class)
		    .id(new ResourceLocation(Reference.MOD_ID,"cobble_pebble"), 0)
		    .name("cobble_Pebble")
		    .tracker(25, 1, true)
			.egg(0x696969, 0x111111)
		    .build());
			
		};	
		

} 