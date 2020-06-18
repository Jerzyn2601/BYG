package voronoiaoc.byg.common.world.feature.biomefeatures;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidWithNoiseConfig;
import voronoiaoc.byg.common.world.feature.placements.AtOceanFloorWithExtra;
import voronoiaoc.byg.core.byglists.BYGFeatureList;

import static net.minecraft.world.biome.DefaultBiomeFeatures.*;


public class BYGTreeFeatures {
//    public static final BYGTreeFeatureConfig SWAMP_TREE_CONFIG = (new BYGTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.JACARANDA_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.JACARANDA_LEAVES.getDefaultState()), new BYGMappedBlobFoilagePlacer(3, 0))).baseHeight(5).heightRandA(3).foliageHeight(3).maxWaterDepth(1).decorators(ImmutableList.of(new LeaveVineTreeDecorator())).setSapling((net.minecraftforge.common.IPlantable) Blocks.OAK_SAPLING).build();

    public static void addJacarandaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.JACARANDA_TREE2.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.3F),
                BYGFeatureList.INDIGOJACARANDA_TREE2.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.3F),
                BYGFeatureList.INDIGOJACARANDA_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.3F)),
                BYGFeatureList.JACARANDA_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(45, 0.1F, -15))));
    }

    public static void addSparseJacarandaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.INDIGOJACARANDA_TREE2.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.3F)),
                BYGFeatureList.JACARANDA_TREE2.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(1, 0.5F, 2))));
    }

    public static void addBlueTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.SMALLBLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.BLUEPINETREE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.BLUESPRUCETREE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).withChance(0.5F),
                Feature.NORMAL_TREE.withConfiguration(SPRUCE_TREE_CONFIG).withChance(0.5F),
                BYGFeatureList.TALLBLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F)),
                BYGFeatureList.BLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(20, 0.1F, -8))));

    }

    public static void addBorealTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.BOREAL_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.5F)),
                BYGFeatureList.BOREAL_TREE2.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(55, 0.5F, -20))));
    }

    public static void addSparseBorealTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.BOREAL_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.5F)),
                BYGFeatureList.BOREAL_TREE2.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(0, 0.1F, 2))));
    }


    public static void addConiferousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.WIDECONIFEROUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(35, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.TALLCONIFEROUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(15, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALLCONIFEROUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(25, 0.1F, 1))));

    }

    public static void addSparseConiferousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALLCONIFEROUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 2))));

    }

    public static void addCypressTreeVegetation(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.HUGECYPRESS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }

    public static void addDeciduousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.DECIDUOUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(18, 0.3F, -8))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SHRUB.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(4, 0.2F, -3))));
    }

    public static void addSparseDeciduousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.DECIDUOUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SHRUB.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.08F, 1))));
    }

    public static void addBYGJungleTreeForest(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.FANCY_TREE.withConfiguration(FANCY_TREE_CONFIG).withChance(0.4F), Feature.JUNGLE_GROUND_BUSH.withConfiguration(JUNGLE_GROUND_BUSH_CONFIG).withChance(0.15F), Feature.MEGA_JUNGLE_TREE.withConfiguration(MEGA_JUNGLE_TREE_CONFIG).withChance(0.0F)), Feature.NORMAL_TREE.withConfiguration(JUNGLE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(30, 0.1F, -5))));
    }

    public static void addBlackForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.ASPEN_TREE3.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.2F),
                BYGFeatureList.ASPEN_TREE2.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.2F),
                BYGFeatureList.TALLCONIFEROUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.2F),
                BYGFeatureList.SMALLCONIFEROUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.2F),
                BYGFeatureList.PINE_TREE_LAGRE1.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.5F),
                BYGFeatureList.PINE_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withChance(0.5F)),
                BYGFeatureList.PINE_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(45, 0.4F, 5))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.PINE_TREE_LAGRE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withChance(0.5F)),
                BYGFeatureList.WIDECONIFEROUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(2, 0.3F, 1))));
    }

    public static void addSparseBlackForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.PINE_TREE_LAGRE1.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.45F),
                BYGFeatureList.PINE_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withChance(0.4F)),
                BYGFeatureList.PINE_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(0, 0.3F, 2))));
    }

    public static void addGiantBlueTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.BLUEGIANTSPUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.BLUEMEGAPINETREE_CONFIG).withChance(0.1F)),
                Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.BLUEMEGASPRUCETREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(10, 0.3F, 5))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.SMALLBLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.3F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.BLUEPINETREE_CONFIG).withChance(0.3F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.BLUESPRUCETREE_CONFIG).withChance(0.3F),
                BYGFeatureList.TALLBLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F)),
                BYGFeatureList.BLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(20, 0.3F, 1))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_SPRUCE_TREE_CONFIG).withChance(0.35F),
                Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_PINE_TREE_CONFIG).withChance(0.35F),
                Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).withChance(0.33333334F)),
                Feature.NORMAL_TREE.withConfiguration(SPRUCE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(20, 0.1F, 2))));
    }

    public static void addGiantSeasonalTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.GIANTORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F),
                Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.ORANGEMEGAPINETREE_CONFIG).withChance(0.15F),
                Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.ORANGEMEGASPRUCETREE_CONFIG).withChance(0.15F),
                BYGFeatureList.GIANTYELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.35F),
                Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.YELLOWMEGAPINETREE_CONFIG).withChance(0.15F),
                Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.YELLOWMEGASPRUCETREE_CONFIG).withChance(0.15F),
                BYGFeatureList.GIANTREDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F),
                Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.REDMEGAPINETREE_CONFIG).withChance(0.15F)),
                Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.REDMEGASPRUCETREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(5, 0.3F, 5))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.SMALLREDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.666F),
                BYGFeatureList.REDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.666F),
                BYGFeatureList.TALLREDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1f),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.REDPINETREE_CONFIG).withChance(0.3F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.REDSPRUCETREE_CONFIG).withChance(0.3F),
                BYGFeatureList.SMALLORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                BYGFeatureList.ORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                BYGFeatureList.TALLORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.666F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.ORANGEPINETREE_CONFIG).withChance(0.3F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.ORANGESPRUCETREE_CONFIG).withChance(0.3F),
                BYGFeatureList.SMALLYELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.666F),
                BYGFeatureList.YELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                BYGFeatureList.YELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.YELLOWPINETREE_CONFIG).withChance(0.3F)),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.YELLOWSPRUCETREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(5, 0.3F, 3))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_SPRUCE_TREE_CONFIG).withChance(0.35F),
                Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_PINE_TREE_CONFIG).withChance(0.35F),
                Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).withChance(0.33333334F)),
                Feature.NORMAL_TREE.withConfiguration(SPRUCE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(2, 0.1F, 2))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.PINE_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withChance(0.5F)),
                BYGFeatureList.PINE_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(1, 0.3F, 2))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BOREAL_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.6F, -2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.6F, -2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE3.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.6F, -2))));

    }

    public static void addRedOakForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                Feature.NORMAL_TREE.withConfiguration(DefaultBiomeFeatures.field_230129_h_).withChance(0.06F),
                Feature.NORMAL_TREE.withConfiguration(BIRCH_TREE_CONFIG).withChance(0.06F),
                Feature.NORMAL_TREE.withConfiguration(OAK_TREE_WITH_MORE_BEEHIVES_CONFIG).withChance(0.06F),
                Feature.FANCY_TREE.withConfiguration(BYGFeatureConfigs.FANCY_RED_OAK_WITH_MORE_BEEHIVES_CONFIG).withChance(0.1F)),
                BYGFeatureList.REDOAK_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(5, 0.5F, 3))));
    }

    public static void addSparseRedOakForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                Feature.NORMAL_TREE.withConfiguration(OAK_TREE_WITH_MORE_BEEHIVES_CONFIG).withChance(0.06F),
                Feature.FANCY_TREE.withConfiguration(BYGFeatureConfigs.FANCY_RED_OAK_WITH_MORE_BEEHIVES_CONFIG).withChance(0.1F)),
                BYGFeatureList.REDOAK_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(1, 0.5F, 2))));
    }

    public static void addSimpleMapleTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                Feature.NORMAL_TREE.withConfiguration(SPRUCE_TREE_CONFIG).withChance(0.06F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.RED_MAPLE_TREE_CONFIG).withChance(0.5F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.FANCY_SILVER_MAPLE_WITH_MORE_BEEHIVES_CONFIG).withChance(0.04F),
                Feature.FANCY_TREE.withConfiguration(BYGFeatureConfigs.FANCY_RED_MAPLE_WITH_MORE_BEEHIVES_CONFIG).withChance(0.2F),
                Feature.FANCY_TREE.withConfiguration(BYGFeatureConfigs.FANCY_MAPLE_WITH_MORE_BEEHIVES_CONFIG).withChance(0.1F)),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.MAPLE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(5, 0.4F, 2))));
    }

    public static void addSeasonalBirchForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.BROWNBIRCH_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.TALLBROWNBIRCHTREE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.BROWNBIRCHTREE_CONFIG).withChance(0.1F),
                BYGFeatureList.ORANGEBIRCH_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.TALLORANGEBIRCHTREE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.ORANGEBIRCHTREE_CONFIG).withChance(0.1F),
                BYGFeatureList.REDBIRCH_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.TALLREDBIRCHTREE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.REDBIRCHTREE_CONFIG).withChance(0.1F),
                BYGFeatureList.YELLOWBIRCH_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.TALLYELLOWBIRCHTREE_CONFIG).withChance(0.1F)),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.YELLOWBIRCHTREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(20, 0.4F, -8))));
    }

    public static void addSeasonalDeciduousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SEASONAL_SHRUBS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(4, 0.3F, -3))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.REDDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F),
                BYGFeatureList.ORANGEDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F),
                BYGFeatureList.DECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F),
                BYGFeatureList.BROWNDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F)),
                BYGFeatureList.YELLOWDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(20, 0.5F, -15))));
    }

    public static void addSparseSeasonalDeciduousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SEASONAL_SHRUBS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.08F, 1))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.REDDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F),
                BYGFeatureList.ORANGEDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F),
                BYGFeatureList.DECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F),
                BYGFeatureList.BROWNDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F)),
                BYGFeatureList.YELLOWDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(0, 0.1F, 2))));
    }

    public static void addSeasonalForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.BROWNOAK_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.BROWNOAKTREE_CONFIG).withChance(0.1F),
                BYGFeatureList.REDOAK_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.2F),
                BYGFeatureList.YELLOWBIRCH_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.2F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.REDOAKTREE_CONFIG).withChance(0.2F),
                Feature.FANCY_TREE.withConfiguration(FANCY_TREE_CONFIG).withChance(0.01F),
                BYGFeatureList.ORANGEOAK_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.05F)),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.ORANGEOAKTREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(20, 0.4F, -8))));
    }

    public static void addSeasonalTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.SMALLREDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                BYGFeatureList.REDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.2F),
                BYGFeatureList.TALLREDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.05f),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.REDPINETREE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.REDSPRUCETREE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(SPRUCE_TREE_CONFIG).withChance(0.1F),
                BYGFeatureList.SMALLORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                BYGFeatureList.ORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.2F),
                BYGFeatureList.TALLORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.05F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.ORANGEPINETREE_CONFIG).withChance(0.1F),
                Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.ORANGESPRUCETREE_CONFIG).withChance(0.1F),
                BYGFeatureList.SMALLYELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                BYGFeatureList.YELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F),
                BYGFeatureList.TALLYELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.2F),
                BYGFeatureList.YELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.1F)),
                BYGFeatureList.YELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(5, 0.3F, 3))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.PINE_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withChance(0.5F)),
                BYGFeatureList.PINE_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(1, 0.3F, 2))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BOREAL_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.6F, -2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.6F, -2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE3.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.6F, -2))));
    }

    public static void addShrubs(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SHRUB.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }

    public static void addTropJungleTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.MEGA_JUNGLE_TREE.withConfiguration(BYGFeatureConfigs.MEGATROPJUNGLETREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.0F, 0))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.TROPICALRAINFOREST_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.5F),
                BYGFeatureList.RAINBOW_TREE1.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F),
                Feature.JUNGLE_GROUND_BUSH.withConfiguration(BYGFeatureConfigs.TROPGROUNDBUSH_CONFIG).withChance(0.15F)),
                BYGFeatureList.SHORTTROPICALRAINFOREST_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(65, 0.1F, 10))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.VINES.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_HEIGHT_64.configure(new FrequencyConfig(50))));
    }

    public static void addSparseTropJungleTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.MEGA_JUNGLE_TREE.withConfiguration(BYGFeatureConfigs.MEGATROPJUNGLETREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.0F, 0))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.TROPICALRAINFOREST_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.5F),
                BYGFeatureList.RAINBOW_TREE1.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withChance(0.15F),
                Feature.JUNGLE_GROUND_BUSH.withConfiguration(BYGFeatureConfigs.TROPGROUNDBUSH_CONFIG).withChance(0.15F)),
                BYGFeatureList.SHORTTROPICALRAINFOREST_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(0, 0.1F, 2))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.VINES.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_HEIGHT_64.configure(new FrequencyConfig(50))));
    }

    public static void addRainbowTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.RAINBOW_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.5F, -4))));

    }

    public static void addCragRainbowTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.RAINBOW_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(55, 0.5F, 8))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.BAMBOO.withConfiguration(new ProbabilityConfig(0.2F)).withPlacement(Placement.TOP_SOLID_HEIGHTMAP_NOISE_BIASED.configure(new TopSolidWithNoiseConfig(160, 80.0D, 0.3D, Heightmap.Type.WORLD_SURFACE_WG))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.JUNGLE_GROUND_BUSH.withConfiguration(BYGFeatureConfigs.TROPGROUNDBUSH_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.5F, 8))));

    }

    public static void addIslandRainbowTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.RAINBOW_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.5F, 10))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.BAMBOO.withConfiguration(new ProbabilityConfig(0.05F)).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(64))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SHRUB.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(4, 0.1F, -1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(LILY_PAD_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(4))));

    }

    public static void addSparseTree(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.FANCY_TREE.withConfiguration(FANCY_TREE_WITH_MORE_BEEHIVES_CONFIG).withChance(0.33333334F)), Feature.NORMAL_TREE.withConfiguration(OAK_TREE_WITH_MORE_BEEHIVES_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.05F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PRAIRIE_SHRUB1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.8F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PRAIRIE_SHRUB2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.8F, 2))));

    }

    public static void addSpruceTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.3F, -5))));

    }

    public static void addBluffTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BLUFF_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(7, 0.3F, -5))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BLUFF_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(7, 0.3F, -5))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BLUFF_TREE3.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(7, 0.3F, -5))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALLCONIFEROUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.PINE_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withChance(0.5F)),
                BYGFeatureList.PINE_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(1, 0.3F, 2))));
    }

    public static void addDoverMTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.DOVERMEGASPRUCETREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.2F, -5))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PINE_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 2))));

    }

    public static void addNorthernForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.WIDECONIFEROUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.3F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALLCONIFEROUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.3F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.DOVERMEGASPRUCETREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(15, 0.5F, 5))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.DOVERMEGASPRUCETREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(15, 0.5F, 5))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.3F, -5))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                BYGFeatureList.PINE_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withChance(0.5F)),
                BYGFeatureList.PINE_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
                new AtSurfaceWithExtraConfig(6, 0.3F, 2))));
    }

    public static void addSkyrisTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SKYRIS_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.5F, 4))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SKYRIS_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.5F, 4))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SKYRIS_TREE3.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.5F, 4))));

    }

    public static void addBaobabTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BAOBAB_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.8F, -1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.ACACIA_TREE.withConfiguration(ACACIA_TREE_CONFIG).withChance(0.8F)), Feature.ACACIA_TREE.withConfiguration(ACACIA_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));
    }

    public static void addSavannaCanopyTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.ACACIA_TREE.withConfiguration(BYGFeatureConfigs.ACACIA_TREE_CONFIG).withChance(0.5F), Feature.ACACIA_TREE.withConfiguration(BYGFeatureConfigs.ACACIA_TREE_CONFIG).withChance(0.4F)), Feature.ACACIA_TREE.withConfiguration(ACACIA_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(25, 0.2F, 10))));
    }

    public static void addRedwoodTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.REDWOOD_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
    }

    public static void addMeadowTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.MEADOW_SHRUB1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.8F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.MEADOW_SHRUB2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.8F, 2))));
    }

    public static void addGroveTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BOREAL_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 2))));

    }

    public static void addEnchantedGroveTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BLUE_ENCHANTED_GROVE_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.GREEN_ENCHANTED_GROVE_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 2))));

    }

    public static void addPumpkinPatches(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PUMPKIN_PATCH1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.5F, -2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PUMPKIN_PATCH2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.8F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PUMPKIN_PATCH3.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 1))));

    }

    public static void addMarshTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PRAIRIE_SHRUB1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.8F, 8))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PRAIRIE_SHRUB2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.8F, 8))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(SWAMP_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

    }
    public static void addBayouVegetation(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BAYOU_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(AtOceanFloorWithExtra.OCEANFLOOR.configure(new AtSurfaceWithExtraConfig(9, 0.8F, -1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BAYOU_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(AtOceanFloorWithExtra.OCEANFLOOR.configure(new AtSurfaceWithExtraConfig(3, 0.8F, -1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BAYOU_TREE3.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(AtOceanFloorWithExtra.OCEANFLOOR.configure(new AtSurfaceWithExtraConfig(4, 0.8F, -1))));
    }

    public static void addAspenTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.5F, -1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.5F, -1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE3.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.5F, -1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_SHRUB1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(6, 0.8F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_SHRUB2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(6, 0.8F, 2))));

    }

    public static void addSparseClearingAspenTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_SHRUB1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_SHRUB2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

    }

    public static void addSparseAspenTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.5F, -2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.5F, -2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_TREE3.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.5F, -2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_SHRUB1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(6, 0.8F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ASPEN_SHRUB2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(6, 0.8F, 2))));

    }

    public static void addZelkovaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ZELKOVA_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.8F, -5))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ZELKOVA_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.8F, -5))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ZELKOVA_TREE3.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.8F, -5))));

    }

    public static void addSparseZelkovaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ZELKOVA_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 2))));

    }

    public static void addPaloVerdeTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PALO_VERDE_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PALO_VERDE_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 1))));
    }

    public static void addJoshuaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.JOSHUA_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.JOSHUA_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PRAIRIE_SHRUB1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.8F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PRAIRIE_SHRUB2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.8F, 2))));
    }

    public static void addBushes(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PRAIRIE_SHRUB1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.8F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PRAIRIE_SHRUB2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.8F, 2))));
    }

    public static void addRedRockCanyonVegetation(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.JOSHUA_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.JOSHUA_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.HEIGHTCHECKEDCACTUS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(8))));

    }

    public static void addPalmTree(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.PALM_TREE1.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 1))));

    }
}
