package madokamod.sispuellamagica.crafting;

import madokamod.sispuellamagica.item.ItemRegistryHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipeRegistryHandler {
    public static void register(){
        GameRegistry.addSmelting(ItemRegistryHandler.GRIEF_PICKAXE,new ItemStack(ItemRegistryHandler.ITEM_GRIEF_SEED),.01F);
    }

    /*
    @SubscribeEvent
    public static void onFurnaceFuelBurnTime(FurnaceFuelBurnTimeEvent event){
        ResourceLocation registryName = event.getItemStack().getItem().getRegistryName();
        String registryNameResourceDomain = registryName.getResourceDomain();
        String registryNameResourcePath = registryName.getResourcePath();
        if ("minecraft".equals(registryNameResourceDomain)&&"stick".equals(registryNameResourcePath)){
            event.setBurnTime(20);
        }
    }
    */
}
