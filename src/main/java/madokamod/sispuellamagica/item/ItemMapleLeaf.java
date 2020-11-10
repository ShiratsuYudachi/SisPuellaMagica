package madokamod.sispuellamagica.item;

import madokamod.sispuellamagica.SisPuellaMagica;
import madokamod.sispuellamagica.creativetab.TabSisPuellaMagica;
import net.minecraft.item.Item;

public class ItemMapleLeaf extends Item{
    public ItemMapleLeaf() {
        this.setUnlocalizedName(SisPuellaMagica.MODID+".maple_leaf");
        this.setRegistryName("maple_leaf");
        this.setCreativeTab(TabSisPuellaMagica.TAB_SPM);
    }
}
