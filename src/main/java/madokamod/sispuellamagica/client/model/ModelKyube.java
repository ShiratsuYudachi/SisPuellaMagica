package madokamod.sispuellamagica.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKyube extends ModelBase {
    ModelRenderer head;
    ModelRenderer earL;
    ModelRenderer earR;
    ModelRenderer body;

    // 4 legs
    ModelRenderer legLB;
    ModelRenderer legLF;
    ModelRenderer legRB;
    ModelRenderer legRF;

    // tail is split into 3 segments
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;


    public ModelKyube(){
        int textureWidth=64;
        int textureHeight=32;
        // TODO: Change the texture offsets in the ModelRender constructors to better match where the textures live in the image
        //   In other words, once we have the texture done, change each of offsets accordingly

        // base model, texture offset (where in the texture should we look) x, texture offset y
        head = new ModelRenderer(this,0,0);
        // offset x,y,z AND dimensions x,y,z
        // I think each whole number is supposed to represent 1 pixel (so, for example, in ModelBiped, the head is set with dimensions each to 8, and the head is 8 pixels by 8 pixels by 8 pixels)
        //    Also, I think this means that the offset is where in the model the box should start in the world (ModelBox.java describes the first 3 parameters as the lower box corner)
        //    The offset is saying to travel from the BOTTOM of the model and find our starting position (I believe this is supposed to be the bottom right, though it could be bottom left as well)
        head.addBox(-2.5F,-1F,-5F,5,5,5); // TODO: Find out how to create good values for the offsets. Each dimension value is how many pixels in each direction from the starting point
        // I think this model is saying, from the center, how many pixels should we head out in each dimensional direction before we get to the point around which the box rotates around
        // For example, in ModelBiped, the rotation points for rightArm travel from the center of the model to the right 5 pixels, and up 5 pixels (not inwards at all)
        head.setRotationPoint(0F,0F,-5F);
        head.setTextureSize(textureWidth,textureHeight);
        // setRotation(head,0F,0F,0F);

        earR = new ModelRenderer(this,0,13);
        earR.addBox(-1.0F,0.0F,-1.0F,2,4,1);
        earR.setRotationPoint(0F,0F,0F);
        head.addChild(earR);

        earL = new ModelRenderer(this,0,13);
        earL.mirror = true;
        earL.addBox(-1.0F,0.0F,-1.0F,2,4,1);
        earL.setRotationPoint(0F,0F,0F); // The ears should not rotate
        head.addChild(earL);

        body = new ModelRenderer(this,16,16);
        body.addBox(-2F,0F,-4F,4,4,8);
        body.setRotationPoint(0F,0F,0F);

        legLF = new ModelRenderer(this,1,5);
        legLF.addBox(-.5F,.5F,1.0F,1,2,1);
        legLF.setRotationPoint(0F,0F,0F); // TODO: Fix this
        body.addChild(legLF);

        legLB = new ModelRenderer(this,1,5);
        legLB.addBox(-.5F,.5F,1.0F,1,2,1);
        legLB.setRotationPoint(0F,0F,0F);
        body.addChild(legLB);

        legRF = new ModelRenderer(this,1,5);
        legRF.addBox(-.5F,.5F,1.0F,1,2,1);
        legRF.setRotationPoint(0F,0F,0F);
        body.addChild(legRF);

        legRB = new ModelRenderer(this,1,5);
        legRB.addBox(-.5F,.5F,1.0F,1,2,1);
        legRB.setRotationPoint(0F,0F,0F);
        body.addChild(legRB);

        // TODO: Fix offsets
        tail1 = new ModelRenderer(this,2,5);
        tail1.addBox(0.0F,0.0F,0.0F,2,4,2);
        tail1.setRotationPoint(0F,0F,0F);
        body.addChild(tail1);

        tail2 = new ModelRenderer(this,2,5);
        tail2.addBox(0.0F,0.0F,0.0F,2,4,2);
        tail2.setRotationPoint(0F,0F,0F);
        tail1.addChild(tail2);

        tail3 = new ModelRenderer(this,2,5);
        tail3.addBox(0.0F,0.0F,0.0F,2,4,2);
        tail3.setRotationPoint(0F,0F,0F);
        tail2.addChild(tail3);
    }
    @Override
    public void render(Entity entity,float time,float swingsuppress,float tick,float headAngleY,float headAngleX, float size){
        renderIncubator(entity,time,swingsuppress,tick,headAngleY,headAngleX,size);
    }

    public void renderIncubator(Entity entity,float time,float swingsuppress,float tick,float headAngleY,float headAngleX, float size){
        setRotationAngles(time,swingsuppress,tick,headAngleY,headAngleX,size,entity);

        head.render(size);

        earL.render(size);
        earR.render(size);

        body.render(size);

        legLB.render(size);
        legLF.render(size);
        legRB.render(size);
        legRF.render(size);

        tail1.render(size);
        tail2.render(size);
        tail3.render(size);
        // super.render(entity,time,swingsuppress,tick,headAngleY,headAngleX,size);
    }
}
