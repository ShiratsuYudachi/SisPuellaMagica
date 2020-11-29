package madokamod.sispuellamagica.item;

import madokamod.sispuellamagica.SisPuellaMagica;
import madokamod.sispuellamagica.creativetab.TabSisPuellaMagica;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemGriefArmor extends ItemArmor{
    public ItemGriefArmor(EntityEquipmentSlot equipmentSlot){
         super(ItemRegistryHandler.GRIEF_ARMOR_MATERIAL, 0,equipmentSlot);
         this.setUnlocalizedName(SisPuellaMagica.MODID+".griefArmor."+equipmentSlot.getName());
         this.setRegistryName("grief_armor_"+equipmentSlot.getName());
         this.setCreativeTab(TabSisPuellaMagica.TAB_SPM);
    }
}
