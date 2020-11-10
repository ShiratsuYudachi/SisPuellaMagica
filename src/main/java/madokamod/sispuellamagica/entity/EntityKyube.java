package madokamod.sispuellamagica.entity;

import madokamod.sispuellamagica.SisPuellaMagica;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityKyube extends EntityMob {
    public static final String ID = "kyube";
    public static final String NAME = SisPuellaMagica.MODID+ ".kyube";

    public EntityKyube(World worldIn){
        super(worldIn);
        this.setSize(1.2f, 1.95f);
    }
}
