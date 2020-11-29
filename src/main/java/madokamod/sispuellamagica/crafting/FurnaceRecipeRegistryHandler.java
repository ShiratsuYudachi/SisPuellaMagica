package madokamod.sispuellamagica.crafting;

import madokamod.sispuellamagica.item.ItemRegistryHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipeRegistryHandler {
    public static void register(){
        GameRegistry.addSmelting(ItemRegistryHandler.GRIEF_PICKAXE,new ItemStack(ItemRegistryHandler.ITEM_GRIEF_SEED),.01F);
    }
}
