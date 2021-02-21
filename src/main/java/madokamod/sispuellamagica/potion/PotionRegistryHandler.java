package madokamod.sispuellamagica.potion;

import madokamod.sispuellamagica.SisPuellaMagica;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class PotionRegistryHandler {
    public static final Potion POTION_DIRT_PROTECTION = new PotionDirtProtection();
    @SubscribeEvent
    public static void onPotionRegistry(RegistryEvent.Register<Potion> event){
        SisPuellaMagica.debuginfo("trying to register potion effect!///////////////////////");
        IForgeRegistry<Potion> registry = event.getRegistry();
        registry.registerAll(POTION_DIRT_PROTECTION);
    }
}
