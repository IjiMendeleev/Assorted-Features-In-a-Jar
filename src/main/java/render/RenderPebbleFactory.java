package render;

import com.evershy.afiajar.AItems;
import com.evershy.afiajar.EntityPebble;
import com.evershy.afiajar.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderPebbleFactory 
{
   private static void registerEntityRenderers() 
   {
    RenderingRegistry.registerEntityRenderingHandler(EntityPebble.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.PEBBLE,Minecraft.getMinecraft().getRenderItem()));
   }
   
}

/**
*    public static final ResourceLocation MODEL = new ResourceLocation(Reference.MOD_ID + ":models/entity/ModelPebble.java");
*    
*	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entities/projectiles/cobble_pebble.png");
*    
*	public static final RenderPebbleFactory INSTANCE = new RenderPebbleFactory();
*
*	@Override
*	public Render<? super EntityThrowable> createRenderFor(RenderManager manager) 
*	{
*		return new RenderPebble.class;
*	}
*
*   
*
*/