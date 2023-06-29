package net.yf.tutorialmod.item.client;

import net.minecraft.resources.ResourceLocation;
import net.yf.tutorialmod.TutorialMod;
import net.yf.tutorialmod.item.custom.AnimatedItem;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedItemModel extends GeoModel<AnimatedItem> {
    @Override
    public ResourceLocation getModelResource(AnimatedItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/animated_item.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AnimatedItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "/textures/item/animated_item.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AnimatedItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/animated_item.animation.json");
    }
}
