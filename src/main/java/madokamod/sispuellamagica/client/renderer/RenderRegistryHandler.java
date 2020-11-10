package madokamod.sispuellamagica.client.renderer;

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
    }
}
