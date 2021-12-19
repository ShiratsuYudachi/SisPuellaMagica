package madokamod.sispuellamagica.client.renderer;

import madokamod.sispuellamagica.entity.EntityAdvancedFireball;
import madokamod.sispuellamagica.item.ItemRegistryHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import madokamod.sispuellamagica.entity.EntityKyube;
import org.apache.logging.log4j.Logger;


public class RenderRegistryHandler
{
    public static Logger logger;
    public static void register()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityKyube.class, manager ->
        {
            return new RenderKyube(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityAdvancedFireball.class, manager ->
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            return new RenderSnowball<EntityAdvancedFireball>(manager, ItemRegistryHandler.ITEM_ADVANCED_FIREBALL,renderItem);
        });
    }
}
