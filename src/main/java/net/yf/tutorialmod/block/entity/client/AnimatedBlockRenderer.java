package net.yf.tutorialmod.block.entity.client;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.yf.tutorialmod.block.entity.AnimatedBlockEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class AnimatedBlockRenderer extends GeoBlockRenderer<AnimatedBlockEntity> {
    public AnimatedBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new AnimatedBlockModel());
    }
}
