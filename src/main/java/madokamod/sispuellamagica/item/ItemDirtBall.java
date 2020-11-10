package madokamod.sispuellamagica.item;

import madokamod.sispuellamagica.SisPuellaMagica;
import madokamod.sispuellamagica.creativetab.TabSisPuellaMagica;
import net.minecraft.item.Item;

public class ItemDirtBall extends Item {
    public ItemDirtBall(){
        this.setUnlocalizedName(SisPuellaMagica.MODID + ".dirtBall");
        this.setCreativeTab(TabSisPuellaMagica.TAB_SPM);
        this.setRegistryName("dirt_ball");
        this.setMaxStackSize(16);
    }
}
