package madokamod.sispuellamagica.item;

import madokamod.sispuellamagica.SisPuellaMagica;
import madokamod.sispuellamagica.creativetab.TabSisPuellaMagica;
import net.minecraft.item.Item;

public class ItemGriefSeed extends Item{
    public ItemGriefSeed() {
        this.setUnlocalizedName(SisPuellaMagica.MODID+".griefSeed");
        this.setRegistryName("grief_seed");
        this.setCreativeTab(TabSisPuellaMagica.TAB_SPM);
    }
}
