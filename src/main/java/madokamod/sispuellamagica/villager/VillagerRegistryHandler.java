package madokamod.sispuellamagica.villager;

import madokamod.sispuellamagica.SisPuellaMagica;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class VillagerRegistryHandler {
    public static final VillagerRegistry.VillagerProfession MAGICALGIRL= new VillagerRegistry.VillagerProfession(SisPuellaMagica.MODID+"magicalgirl",SisPuellaMagica.MODID+":textures/entity/villager/magicalgirl.png",SisPuellaMagica.MODID+"textures/entity/zombie_villager/zombie_magicalgirl.png");
    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<VillagerRegistry.VillagerProfession> event){
        IForgeRegistry<VillagerRegistry.VillagerProfession> registry = event.getRegistry();
        registry.register(MAGICALGIRL);
    }
    public static final VillagerRegistry.VillagerCareer COORDINATOR = new VillagerRegistry.VillagerCareer(MAGICALGIRL, SisPuellaMagica.MODID+".coordinator");


}
