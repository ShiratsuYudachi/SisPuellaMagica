package madokamod.sispuellamagica.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class EnchantmentRegistryHandler {
    public static final EnchantmentExplosion EXPLOSION = new EnchantmentExplosion();
    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Enchantment> event){
        IForgeRegistry<Enchantment> registry = event.getRegistry();
        registry.register(EXPLOSION);
    };
}
