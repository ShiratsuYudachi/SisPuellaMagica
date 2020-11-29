package madokamod.sispuellamagica.item;

import madokamod.sispuellamagica.SisPuellaMagica;
import madokamod.sispuellamagica.creativetab.TabSisPuellaMagica;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGriefSeed extends Item{
    @Override
    public int getItemBurnTime(ItemStack itemStack) {
        return 12000;
    }

    public ItemGriefSeed() {
        this.setUnlocalizedName(SisPuellaMagica.MODID+".griefSeed");
        this.setRegistryName("grief_seed");
        this.setCreativeTab(TabSisPuellaMagica.TAB_SPM);


    }
}
