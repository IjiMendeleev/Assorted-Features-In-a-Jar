package com.evershy.afiajar.init;

import javax.annotation.Nonnull;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

import com.evershy.afiajar.EntityPebble;
import com.evershy.afiajar.util.Reference;

public class RegisterBrick 
{
	 @SubscribeEvent
		public static void onRegisterEntitiesEvent(@Nonnull final RegistryEvent.Register<EntityEntry> event)
		{
	    	final ResourceLocation brick = new ResourceLocation(Reference.MOD_ID, "brick");
	    	    	
			event.getRegistry().registerAll(
			EntityEntryBuilder.create()
		    .entity(EntityPebble.class)
		    .id(new ResourceLocation(Reference.MOD_ID,"brick"), 0)
		    .name("brick")
		    .tracker(25, 1, true)
			.egg(0x696969, 0x111111)
		    .build());
			
		};	
}
