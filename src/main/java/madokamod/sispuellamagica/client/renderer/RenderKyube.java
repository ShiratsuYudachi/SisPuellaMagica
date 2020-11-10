package madokamod.sispuellamagica.client.renderer;

import madokamod.sispuellamagica.SisPuellaMagica;
import madokamod.sispuellamagica.client.model.ModelKyube;
import madokamod.sispuellamagica.entity.EntityKyube;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Logger;

public class RenderKyube extends RenderLiving{
    private static final ResourceLocation ENTITY_KYUBE_TEXTURE = new ResourceLocation(SisPuellaMagica.MODID+":textures/entity/" + EntityKyube.ID + "/" + EntityKyube.ID + ".png");
    private static Logger logger;
    public RenderKyube(RenderManager manager){
        super(manager, new ModelKyube(), 0.8f);
        logger.info("i wen there111111111111111111111111111111111111111111111111111111111111111");
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity){
        logger.info("i wen there222222222222222222222222222222222222222222222222222222222222222");
        return ENTITY_KYUBE_TEXTURE;
    }
}
