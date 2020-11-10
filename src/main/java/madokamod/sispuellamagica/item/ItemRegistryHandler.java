package madokamod.sispuellamagica.item;

import madokamod.sispuellamagica.SisPuellaMagica;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import madokamod.sispuellamagica.block.BlockRegistryHandler;

@EventBusSubscriber
public class ItemRegistryHandler {
    public static final Item.ToolMaterial GRIEF_TOOL_MATERIAL = EnumHelper.addToolMaterial("GRIEF", 4, 512, 15.0F, 4.0F, 30);
    public static final ItemArmor.ArmorMaterial GRIEF_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("GRIEF", SisPuellaMagica.MODID+".grief", 128, new int[] {5,8,10,5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2);

    public static final ItemDirtBall DIRT_BALL = new ItemDirtBall();
    public static final ItemMagicApple magicapple = new ItemMagicApple();
    public static final ItemBlock ITEM_COMPRESSED_DIRT = withRegistryName(new ItemBlock(BlockRegistryHandler.BLOCK_COMPRESSED_DIRT));
    public static final ItemMapleLeaf ITEM_MAPLE_LEAF = new ItemMapleLeaf();
    public static final ItemGriefSeed ITEM_GRIEF_SEED = new ItemGriefSeed();
    public static final ItemGriefPickaxe GRIEF_PICKAXE = new ItemGriefPickaxe();

    private static ItemBlock withRegistryName(ItemBlock item){
        item.setRegistryName(item.getBlock().getRegistryName());
        return item;
    }
    @SubscribeEvent
    public static void onRegistery(Register<Item> event){
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(DIRT_BALL);
        registry.register(magicapple);
        registry.register(ITEM_COMPRESSED_DIRT);
        registry.register(ITEM_MAPLE_LEAF);
        registry.register(ITEM_GRIEF_SEED);
        registry.register(GRIEF_PICKAXE);
    }
    @SideOnly(Side.CLIENT)
    private static void registerModel(Item item){
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(), "Inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModeRegistry(ModelRegistryEvent event){
        registerModel(DIRT_BALL);
        registerModel(magicapple);
        registerModel(ITEM_COMPRESSED_DIRT);
        registerModel(ITEM_MAPLE_LEAF);
        registerModel(GRIEF_PICKAXE);
        registerModel(ITEM_GRIEF_SEED);
    }
}