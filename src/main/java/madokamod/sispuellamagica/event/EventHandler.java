package madokamod.sispuellamagica.event;

import madokamod.sispuellamagica.enchantment.EnchantmentRegistryHandler;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
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

}
