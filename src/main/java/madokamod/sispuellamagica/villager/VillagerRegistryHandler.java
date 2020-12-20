package madokamod.sispuellamagica.villager;

import madokamod.sispuellamagica.SisPuellaMagica;
import madokamod.sispuellamagica.item.ItemRegistryHandler;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Random;

@EventBusSubscriber
public class VillagerRegistryHandler {
    public static final VillagerRegistry.VillagerProfession MAGICALGIRL= new VillagerRegistry.VillagerProfession(SisPuellaMagica.MODID+"magicalgirl",SisPuellaMagica.MODID+":textures/entity/villager/magicalgirl.png",SisPuellaMagica.MODID+"textures/entity/zombie_villager/zombie_magicalgirl.png");
    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<VillagerRegistry.VillagerProfession> event){
        IForgeRegistry<VillagerRegistry.VillagerProfession> registry = event.getRegistry();
        COORDINATOR.addTrade(1,
                new BuyItemWithGriefSeed(ItemRegistryHandler.ITEM_GRIEF_SEED,
                        new EntityVillager.PriceInfo(8,10)),
                new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(Blocks.STONE),
                        new EntityVillager.PriceInfo(1,2)));
        EntityVillager.PriceInfo griefPickaxePriceInfo = new EntityVillager.PriceInfo(3, 6);
        COORDINATOR.addTrade(2, (EntityVillager.ITradeList) (merchant, recipeList, random) -> {
            int emeraldAmount = griefPickaxePriceInfo.getPrice(random);
            recipeList.add(new MerchantRecipe(
                    new ItemStack(ItemRegistryHandler.ITEM_GRIEF_SEED,3,0),
                    new ItemStack(Items.EMERALD, emeraldAmount, 0),
                    new ItemStack(ItemRegistryHandler.GRIEF_PICKAXE)));
        });
        registry.register(MAGICALGIRL);
    }

    public static class BuyItemWithGriefSeed implements EntityVillager.ITradeList
    {
        public Item buyingItem;
        public EntityVillager.PriceInfo price;

        public BuyItemWithGriefSeed(Item itemIn, EntityVillager.PriceInfo priceIn)
        {
            this.buyingItem = itemIn;
            this.price = priceIn;
        }

        @Override
        public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
        {
            int i = 1;

            if (this.price != null)
            {
                i = this.price.getPrice(random);
            }

            recipeList.add(new MerchantRecipe(new ItemStack(this.buyingItem, i, 0), ItemRegistryHandler.ITEM_GRIEF_SEED));
        }
    }


    public static final VillagerRegistry.VillagerCareer COORDINATOR = new VillagerRegistry.VillagerCareer(MAGICALGIRL, SisPuellaMagica.MODID+".coordinator");


}
