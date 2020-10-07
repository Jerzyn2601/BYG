package corgiaoc.byg.common.world.feature.overworld.trees.araucaria;

import com.mojang.serialization.Codec;
import corgiaoc.byg.common.world.feature.config.BYGTreeFeatureConfig;
import corgiaoc.byg.common.world.feature.overworld.trees.util.BYGAbstractTreeFeature;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;

import java.util.Random;
import java.util.Set;

public class AraucariaTree1 extends BYGAbstractTreeFeature<BYGTreeFeatureConfig> {

    public AraucariaTree1(Codec<BYGTreeFeatureConfig> configIn) {
        super(configIn);
    }

    protected boolean place(Set<BlockPos> changedBlocks, ISeedReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling, BYGTreeFeatureConfig config) {

        int randTreeHeight = config.getMinHeight() + rand.nextInt(config.getMaxPossibleHeight());
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().setPos(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getHeight()) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.down(), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 7, 5, 5, isSapling)) {
                return false;
            } else {
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 0, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 1, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 2, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 3, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 4, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 5, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 6, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 7, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 8, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 11, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 12, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 13, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 14, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 15, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(0, 16, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 4, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 4, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 5, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 5, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 6, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 6, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 7, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 7, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 8, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 8, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 11, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 12, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 12, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 12, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 13, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 13, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 13, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 13, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 14, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 14, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 14, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 15, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 15, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 15, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 16, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 16, -3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 16, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 16, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 16, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 16, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 16, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 16, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 16, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 16, 3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(3, 16, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 17, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 17, -4), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 17, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 17, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 17, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 17, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 17, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 17, -4), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 17, -3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 17, -3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 17, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 17, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 17, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 17, 4), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(4, 17, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 18, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 18, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 5, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 5, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 5, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 5, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 6, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 6, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 6, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 6, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 6, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 7, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 7, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 11, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-5, 18, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-5, 18, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-5, 18, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-5, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-5, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 18, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 18, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 18, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 18, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 18, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 18, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 18, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 18, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 18, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 18, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 18, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 18, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 18, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 18, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 18, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 18, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 18, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 18, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 18, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 18, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 18, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 18, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 18, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 18, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 18, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 18, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, -6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 18, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, -6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 18, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, -6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 18, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 18, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 18, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 18, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 18, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 18, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 18, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 18, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 18, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 18, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 18, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 18, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 18, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 18, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 18, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 18, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 18, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 18, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 18, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(5, 18, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(5, 18, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(5, 18, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(5, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(5, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(5, 18, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(5, 18, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(5, 18, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(5, 18, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(6, 18, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(6, 18, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(6, 18, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(6, 18, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 19, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 19, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 19, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 19, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 19, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 19, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 19, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 19, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 19, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 19, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 19, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 19, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 19, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 19, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 19, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 19, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 19, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 19, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 19, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 19, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 19, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 19, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 19, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 19, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 19, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 19, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 19, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 19, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 19, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 19, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 19, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 19, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 19, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 19, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 19, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 19, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 19, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 19, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 19, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 19, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 19, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 19, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 19, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 19, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 19, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(4, 19, 2), boundsIn);
            }
        }
        return true;
    }
}