package madokamod.sispuellamagica.item;

import net.minecraft.item.Item;
import madokamod.sispuellamagica.SisPuellaMagica;
import madokamod.sispuellamagica.creativetab.TabSisPuellaMagica;

public class ItemMagicApple extends Item {
    public ItemMagicApple(){
        this.setUnlocalizedName(SisPuellaMagica.MODID + ".magicapple");
        this.setCreativeTab(TabSisPuellaMagica.TAB_SPM);
        this.setRegistryName("magicapple");
        this.setMaxStackSize(64);
    }
}
