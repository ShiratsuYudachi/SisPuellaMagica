package madokamod.sispuellamagica.potion;

import madokamod.sispuellamagica.SisPuellaMagica;
import net.minecraft.potion.Potion;

public class PotionDirtProtection extends Potion{
    public PotionDirtProtection(){
        super(false, 0x806144);
        this.setRegistryName(SisPuellaMagica.MODID + ":dirt_protection");
        this.setPotionName("effect." + SisPuellaMagica.MODID + ".dirtProtection");
    }
}
