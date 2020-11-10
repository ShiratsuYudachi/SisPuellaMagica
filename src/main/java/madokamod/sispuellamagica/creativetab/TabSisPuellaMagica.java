package madokamod.sispuellamagica.creativetab;

import madokamod.sispuellamagica.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabSisPuellaMagica extends CreativeTabs{
    public static final TabSisPuellaMagica TAB_SPM = new TabSisPuellaMagica();
    public TabSisPuellaMagica(){
        super("sispuellamagica");
    }
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistryHandler.ITEM_COMPRESSED_DIRT);
    }
}
