package madokamod.sispuellamagica.item;

import madokamod.sispuellamagica.SisPuellaMagica;
import madokamod.sispuellamagica.creativetab.TabSisPuellaMagica;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemGriefPickaxe extends ItemPickaxe {
    public ItemGriefPickaxe(){
        super(ItemRegistryHandler.GRIEF_TOOL_MATERIAL);
        this.setUnlocalizedName(SisPuellaMagica.MODID+".griefPickaxe");
        this.setCreativeTab(TabSisPuellaMagica.TAB_SPM);
        this.setRegistryName("grief_pickaxe");
    }
    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state){
        Block block = state.getBlock();
        float Speed = super.getDestroySpeed(stack, state);
        //SisPuellaMagica.debuginfo("Block <"+block.getLocalizedName()+"> is being breaked");
        return (block == Blocks.LOG || block == Blocks.LOG2)? Speed*10 : Speed;
    }

}
