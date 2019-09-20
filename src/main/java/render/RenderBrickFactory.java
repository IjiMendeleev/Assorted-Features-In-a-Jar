package render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import com.evershy.afiajar.AItems;
import com.evershy.afiajar.EntityBrick;
import com.evershy.afiajar.EntityPebble;

public class RenderBrickFactory 
{
       private static void registerEntityRenderers() 
	   {
	    RenderingRegistry.registerEntityRenderingHandler(EntityBrick.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.BRICK,Minecraft.getMinecraft().getRenderItem()));
	   }
	   
}

