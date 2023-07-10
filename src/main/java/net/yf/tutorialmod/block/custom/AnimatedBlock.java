package net.yf.tutorialmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.yf.tutorialmod.block.entity.AnimatedBlockEntity;
import net.yf.tutorialmod.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

public class AnimatedBlock extends BaseEntityBlock {
    public AnimatedBlock(Properties properties) {
        super(properties);
    }

    //play sound on right click
    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        level.playSound(player, blockPos, ModSounds.COOL_SOUND.get(), SoundSource.BLOCKS, 1f, 1f);
        return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new AnimatedBlockEntity(blockPos, blockState);
    }

    @Override
    public RenderShape getRenderShape(BlockState blockState) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }
}
