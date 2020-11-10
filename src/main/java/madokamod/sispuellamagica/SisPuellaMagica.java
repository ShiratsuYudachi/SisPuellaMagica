package madokamod.sispuellamagica;

import madokamod.sispuellamagica.client.renderer.RenderRegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;

@Mod(modid = SisPuellaMagica.MODID, name = SisPuellaMagica.NAME, version = SisPuellaMagica.VERSION)
public class SisPuellaMagica
{
    public static final String MODID = "sispuellamagica";
    public static final String NAME = "Sis Puella Magica";
    public static final String VERSION = "1.0";

    private static final boolean debug = false;

    private static Logger logger;

    @EventHandler
    @SideOnly(Side.CLIENT)
    public void preInitClient(FMLInitializationEvent event){
        RenderRegistryHandler.register();
        this.debuginfo("looks like Sis Puella Magica launched successfully! enjoy becoming a magical girl!");
    }

    public static void debuginfo(String info){
        logger.info(info);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }
}
