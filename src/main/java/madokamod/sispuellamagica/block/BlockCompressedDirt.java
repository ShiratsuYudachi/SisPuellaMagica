package madokamod.sispuellamagica.block;


import madokamod.sispuellamagica.SisPuellaMagica;
import madokamod.sispuellamagica.creativetab.TabSisPuellaMagica;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCompressedDirt extends Block{
    public BlockCompressedDirt(){
        super(Material.GROUND);
        this.setUnlocalizedName(SisPuellaMagica.MODID+".compressedDirt");
        this.setRegistryName("compressed_dirt");
        this.setHarvestLevel("shovel", 0);
        this.setCreativeTab(TabSisPuellaMagica.TAB_SPM);
        this.setHardness(0.5f);
    }
}
