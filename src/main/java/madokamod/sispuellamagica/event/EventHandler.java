package madokamod.sispuellamagica.event;

import madokamod.sispuellamagica.enchantment.EnchantmentRegistryHandler;
import madokamod.sispuellamagica.potion.PotionRegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class EventHandler {
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onPlayerJoin(EntityJoinWorldEvent event){
        Entity entity = event.getEntity();
        if (entity instanceof EntityPlayer){
            String message = "\u6b22\u8fce\u6210\u4e3a\u9b54\u6cd5\u5c11\u5973" + entity.getName() + "! ";//欢迎成为魔法少女
            TextComponentString text = new TextComponentString(message);
            entity.sendMessage(text);
        }
    }
    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event){
        Entity source = event.getSource().getImmediateSource();
        if (source instanceof EntityPlayer && !source.world.isRemote){
            EntityPlayer player = (EntityPlayer) source;
            ItemStack heldItemMainhand = player.getHeldItemMainhand();
            int level = EnchantmentHelper.getEnchantmentLevel(EnchantmentRegistryHandler.EXPLOSION, heldItemMainhand);
            if (level>0){
                Entity target = event.getEntity();
                target.world.createExplosion(null,target.posX,target.posY,target.posZ,2*level,false);
            }
        }
    }

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event){
        DamageSource damageSource = event.getSource();
        if ("fall".equals(damageSource.getDamageType())){
            EntityLivingBase target = event.getEntityLiving();
            Potion potion = PotionRegistryHandler.POTION_DIRT_PROTECTION;
            if (target.isPotionActive(potion)){
                PotionEffect effect = target.getActivePotionEffect(potion);
                BlockPos pos = new BlockPos(target.posX, target.posY - 0.2, target.posZ);
                Block block = target.world.getBlockState(pos).getBlock();
                if (block == Blocks.DIRT || block == Blocks.GRASS){
                    event.setAmount(effect.getAmplifier() > 0 ? 0 :event.getAmount() / 2);
                }
            }

        }
    }

}
