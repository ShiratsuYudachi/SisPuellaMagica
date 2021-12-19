package madokamod.sispuellamagica.entity;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class EntityRegistryHandler {
    public static final EntityEntry KYUBE =
            EntityEntryBuilder.create().entity(EntityKyube.class)
                    .id(EntityKyube.ID, 0).name(EntityKyube.NAME).tracker(80, 3, true).build();
    public static final EntityEntry ADVANCED_FIREBALL = EntityEntryBuilder.create().entity(EntityAdvancedFireball.class).id(EntityAdvancedFireball.ID, 1).name(EntityAdvancedFireball.NAME).tracker(64, 10, true).build();

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<EntityEntry> event){
        IForgeRegistry<EntityEntry> registry = event.getRegistry();
        registry.register(KYUBE);
        registry.register(ADVANCED_FIREBALL);
    }
}
