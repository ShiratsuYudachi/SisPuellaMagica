package madokamod.sispuellamagica.enchantment;

import madokamod.sispuellamagica.SisPuellaMagica;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentExplosion extends Enchantment {
    public EnchantmentExplosion(){
        super(Rarity.RARE, EnumEnchantmentType.WEAPON,new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
        this.setName(SisPuellaMagica.MODID + ".explosion");
        this.setRegistryName("explosion");
    }
}
