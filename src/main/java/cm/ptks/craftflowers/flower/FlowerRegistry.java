package cm.ptks.craftflowers.flower;

import cm.ptks.craftflowers.languages.Messages;
import org.bukkit.Material;
import org.bukkit.block.data.Bisected;
import org.bukkit.block.data.type.Bamboo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerRegistry {

    private static final List<Flower> flowers = new ArrayList<>();

    static {
        registerFlower(new Flower(Material.SUNFLOWER, Messages.FLOWER.SUNFLOWER));
        registerFlower(new Flower(Material.SUGAR_CANE, Messages.FLOWER.SUGAR_CANE));
        registerFlower(new Flower(Material.LILAC, Messages.FLOWER.LILAC));
        registerFlower(new Flower(Material.ROSE_BUSH, Messages.FLOWER.ROSE_BUSH));
        registerFlower(new Flower(Material.PEONY, Messages.FLOWER.PEONY));
        registerFlower(new Flower(Material.TALL_GRASS, Messages.FLOWER.TALL_GRASS));
        registerFlower(new Flower(Material.LARGE_FERN, Messages.FLOWER.LARGE_FERN));
        registerFlower(new Flower(Material.OAK_SAPLING, Messages.FLOWER.OAK_SAPLING));
        registerFlower(new Flower(Material.SPRUCE_SAPLING, Messages.FLOWER.SPRUCE_SAPLING));
        registerFlower(new Flower(Material.BIRCH_SAPLING, Messages.FLOWER.BIRCH_SAPLING));
        registerFlower(new Flower(Material.JUNGLE_SAPLING, Messages.FLOWER.JUNGLE_SAPLING));
        registerFlower(new Flower(Material.ACACIA_SAPLING, Messages.FLOWER.ACACIA_SAPLING));
        registerFlower(new Flower(Material.DARK_OAK_SAPLING, Messages.FLOWER.DARK_OAK_SAPLING));

        if (isValidMaterial("CHERRY_SAPLING") /* 1.20+ */) {
            registerFlower(new Flower(Material.CHERRY_SAPLING, Messages.FLOWER.CHERRY_SAPLING));
        }

        if (isValidMaterial("PALE_OAK_SAPLING")) {
            registerFlower(new Flower(Material.PALE_OAK_SAPLING, Messages.FLOWER.PALE_OAK_SAPLING));
        }

        registerFlower(new Flower(Material.DEAD_BUSH, Messages.FLOWER.DEAD_BUSH));

        if (isValidMaterial("GRASS")){
            registerFlower(new Flower(Material.getMaterial("GRASS"), Messages.FLOWER.GRASS));
        } else { /* 1.20.3+ */
            registerFlower(new Flower(Material.getMaterial("SHORT_GRASS"),Messages.FLOWER.GRASS));
        }
        registerFlower(new Flower(Material.FERN, Messages.FLOWER.FERN));
        registerFlower(new Flower(Material.NETHER_BRICK_FENCE, Messages.FLOWER.NETHER_BRICK_FENCE));

        registerFlower(new Flower(Material.DARK_OAK_FENCE, Messages.FLOWER.DARK_OAK_FENCE));
        registerFlower(new Flower(Material.SPRUCE_FENCE, Messages.FLOWER.SPRUCE_FENCE));
        registerFlower(new Flower(Material.OAK_FENCE, Messages.FLOWER.OAK_FENCE));
        registerFlower(new Flower(Material.BIRCH_FENCE, Messages.FLOWER.BIRCH_FENCE));
        registerFlower(new Flower(Material.JUNGLE_FENCE, Messages.FLOWER.JUNGLE_FENCE));
        registerFlower(new Flower(Material.ACACIA_FENCE, Messages.FLOWER.ACACIA_FENCE));
        registerFlower(new Flower(Material.CRIMSON_FENCE, Messages.FLOWER.CRIMSON_FENCE));
        registerFlower(new Flower(Material.WARPED_FENCE, Messages.FLOWER.WARPED_FENCE));

        if (isValidMaterial("MANGROVE_FENCE") /* 1.19+ */) {
            registerFlower(new Flower(Material.MANGROVE_FENCE, Messages.FLOWER.MANGROVE_FENCE));
        }

        if (isValidMaterial("CHERRY_FENCE") /* 1.20+ */) {
            registerFlower(new Flower(Material.CHERRY_FENCE, Messages.FLOWER.CHERRY_FENCE));
            registerFlower(new Flower(Material.BAMBOO_FENCE, Messages.FLOWER.BAMBOO_FENCE));
        }

        registerFlower(new Flower(Material.DANDELION, Messages.FLOWER.DANDELION));
        registerFlower(new Flower(Material.POPPY, Messages.FLOWER.POPPY));
        registerFlower(new Flower(Material.BLUE_ORCHID, Messages.FLOWER.BLUE_ORCHID));
        registerFlower(new Flower(Material.ALLIUM, Messages.FLOWER.ALLIUM));
        registerFlower(new Flower(Material.AZURE_BLUET, Messages.FLOWER.AZURE_BLUET));
        registerFlower(new Flower(Material.RED_TULIP, Messages.FLOWER.RED_TULIP));
        registerFlower(new Flower(Material.ORANGE_TULIP, Messages.FLOWER.ORANGE_TULIP));
        registerFlower(new Flower(Material.WHITE_TULIP, Messages.FLOWER.WHITE_TULIP));
        registerFlower(new Flower(Material.PINK_TULIP, Messages.FLOWER.PINK_TULIP));
        registerFlower(new Flower(Material.OXEYE_DAISY, Messages.FLOWER.OXEYE_DAISY));
        registerFlower(new Flower(Material.CORNFLOWER, Messages.FLOWER.CORNFLOWER));
        registerFlower(new Flower(Material.LILY_OF_THE_VALLEY, Messages.FLOWER.LILY_OF_THE_VALLEY));
        registerFlower(new Flower(Material.WITHER_ROSE, Messages.FLOWER.WITHER_ROSE));
        registerFlower(new Flower(Material.BROWN_MUSHROOM, Messages.FLOWER.BROWN_MUSHROOM));
        registerFlower(new Flower(Material.RED_MUSHROOM, Messages.FLOWER.RED_MUSHROOM));
        registerFlower(new Flower(Material.CRIMSON_FUNGUS, Messages.FLOWER.CRIMSON_FUNGUS));
        registerFlower(new Flower(Material.WARPED_FUNGUS, Messages.FLOWER.WARPED_FUNGUS));

        if (isValidMaterial("PITCHER_POD") /* 1.20+ */) {
            registerFlower(new Flower(Material.TORCHFLOWER, Messages.FLOWER.TORCHFLOWER));
            registerFlower(new FlowerGroup(Material.TORCHFLOWER_SEEDS, Messages.FLOWER.TORCHFLOWER_SEEDS, Arrays.asList(
                    new AgingFlower(Material.TORCHFLOWER_SEEDS, Messages.FLOWER.TORCHFLOWER_SEEDS, Material.TORCHFLOWER_CROP, 0),
                    new AgingFlower(Material.TORCHFLOWER_SEEDS, Messages.FLOWER.TORCHFLOWER_SEEDS, Material.TORCHFLOWER_CROP, 1)
            )));

            registerFlower(new FlowerGroup(Material.PITCHER_POD, Messages.FLOWER.PITCHER_POD, Arrays.asList(
                    new AgingFlower(Material.PITCHER_POD, Messages.FLOWER.PITCHER_POD, Material.PITCHER_CROP, 0),
                    new AgingFlower(Material.PITCHER_POD, Messages.FLOWER.PITCHER_POD, Material.PITCHER_CROP, 1),
                    new AgingFlower(Material.PITCHER_POD, Messages.FLOWER.PITCHER_POD, Material.PITCHER_CROP, 2),
                    new AgingFlower(Material.PITCHER_POD, Messages.FLOWER.PITCHER_POD, Material.PITCHER_CROP, 3),
                    new AgingFlower(Material.PITCHER_POD, Messages.FLOWER.PITCHER_POD, Material.PITCHER_CROP, 4)
            )));


            registerFlower(new FlowerGroup(Material.PITCHER_PLANT, Messages.FLOWER.PITCHER_PLANT, Arrays.asList(
                    new BisectedFlower(Material.PITCHER_PLANT, Messages.FLOWER.PITCHER_PLANT, Material.PITCHER_PLANT, Bisected.Half.TOP),
                    new BisectedFlower(Material.PITCHER_PLANT, Messages.FLOWER.PITCHER_PLANT, Material.PITCHER_PLANT, Bisected.Half.BOTTOM)
            )));

            registerFlower(new FlowerGroup(Material.PINK_PETALS, Messages.FLOWER.PINK_PETALS, Arrays.asList(
                    new FlowerAmountFlower(Material.PINK_PETALS, Messages.FLOWER.PINK_PETALS, 1),
                    new FlowerAmountFlower(Material.PINK_PETALS, Messages.FLOWER.PINK_PETALS, 2),
                    new FlowerAmountFlower(Material.PINK_PETALS, Messages.FLOWER.PINK_PETALS, 3),
                    new FlowerAmountFlower(Material.PINK_PETALS, Messages.FLOWER.PINK_PETALS, 4)
            )));

        }


        registerFlower(new Flower(Material.FLOWER_POT, Messages.FLOWER.FLOWER_POT));

        if (isValidMaterial("MANGROVE_ROOTS" /* 1.19*/)) {
            registerFlower(new Flower(Material.MANGROVE_ROOTS, Messages.FLOWER.MANGROVE_ROOTS));
            registerFlower(new Flower(Material.MANGROVE_PROPAGULE, Messages.FLOWER.MANGROVE_PROPAGULE));
        }

        if (isValidMaterial("AZALEA") /* 1.17 or newer*/) {
            registerFlower(new Flower(Material.MOSS_BLOCK, Messages.FLOWER.MOSS_BLOCK));
            registerFlower(new Flower(Material.MOSS_CARPET, Messages.FLOWER.MOSS_CARPET));
            registerFlower(new Flower(Material.HANGING_ROOTS, Messages.FLOWER.HANGING_ROOTS));
            registerFlower(new Flower(Material.AZALEA, Messages.FLOWER.AZALEA));
            registerFlower(new Flower(Material.FLOWERING_AZALEA, Messages.FLOWER.FLOWERING_AZALEA));
            registerFlower(new Flower(Material.GLOW_BERRIES, Messages.FLOWER.GLOW_BERRIES, Material.CAVE_VINES));
            registerFlower(new Flower(Material.BIG_DRIPLEAF, Messages.FLOWER.BIG_DRIPLEAF));
            registerFlower(new Flower(Material.BIG_DRIPLEAF, Messages.FLOWER.BIG_DRIPLEAF_STEM, Material.BIG_DRIPLEAF_STEM));

            registerFlower(new FlowerGroup(Material.SMALL_DRIPLEAF, Messages.FLOWER.SMALL_DRIPLEAF, Arrays.asList(
                    new BisectedFlower(Material.SMALL_DRIPLEAF, Messages.FLOWER.SMALL_DRIPLEAF, Material.SMALL_DRIPLEAF, Bisected.Half.TOP),
                    new BisectedFlower(Material.SMALL_DRIPLEAF, Messages.FLOWER.SMALL_DRIPLEAF, Material.SMALL_DRIPLEAF, Bisected.Half.BOTTOM)
            )));

            registerFlower(new Flower(Material.SPORE_BLOSSOM, Messages.FLOWER.SPORE_BLOSSOM));

            registerFlower(new FlowerGroup(Material.AMETHYST_CLUSTER, Messages.FLOWER.AMETHYST, List.of(
                    new Flower(Material.SMALL_AMETHYST_BUD, Messages.FLOWER.AMETHYST_SMALL_BUD),
                    new Flower(Material.MEDIUM_AMETHYST_BUD, Messages.FLOWER.AMETHYST_MEDIUM_BUD),
                    new Flower(Material.LARGE_AMETHYST_BUD, Messages.FLOWER.AMETHYST_LARGE_BUD),
                    new Flower(Material.AMETHYST_CLUSTER, Messages.FLOWER.AMETHYST_CLUSTER)
            )));


            registerFlower(new FlowerGroup(Material.CANDLE, Messages.FLOWER.CANDLE, List.of(
                    new CandleFlower(Material.CANDLE, Messages.FLOWER.CANDLE_CANDLE, false),
                    new CandleFlower(Material.WHITE_CANDLE, Messages.FLOWER.CANDLE_WHITE_CANDLE, false),
                    new CandleFlower(Material.ORANGE_CANDLE, Messages.FLOWER.CANDLE_ORANGE_CANDLE, false),
                    new CandleFlower(Material.MAGENTA_CANDLE, Messages.FLOWER.CANDLE_MAGENTA_CANDLE, false),
                    new CandleFlower(Material.LIGHT_BLUE_CANDLE, Messages.FLOWER.CANDLE_LIGHT_BLUE_CANDLE, false),
                    new CandleFlower(Material.YELLOW_CANDLE, Messages.FLOWER.CANDLE_YELLOW_CANDLE, false),
                    new CandleFlower(Material.LIME_CANDLE, Messages.FLOWER.CANDLE_LIME_CANDLE, false),
                    new CandleFlower(Material.PINK_CANDLE, Messages.FLOWER.CANDLE_PINK_CANDLE, false),
                    new CandleFlower(Material.GRAY_CANDLE, Messages.FLOWER.CANDLE_GRAY_CANDLE, false),
                    new CandleFlower(Material.LIGHT_GRAY_CANDLE, Messages.FLOWER.CANDLE_LIGHT_GRAY_CANDLE, false),
                    new CandleFlower(Material.CYAN_CANDLE, Messages.FLOWER.CANDLE_CYAN_CANDLE, false),
                    new CandleFlower(Material.PURPLE_CANDLE, Messages.FLOWER.CANDLE_PURPLE_CANDLE, false),
                    new CandleFlower(Material.BLUE_CANDLE, Messages.FLOWER.CANDLE_BLUE_CANDLE, false),
                    new CandleFlower(Material.BROWN_CANDLE, Messages.FLOWER.CANDLE_BROWN_CANDLE, false),
                    new CandleFlower(Material.GREEN_CANDLE, Messages.FLOWER.CANDLE_GREEN_CANDLE, false),
                    new CandleFlower(Material.RED_CANDLE, Messages.FLOWER.CANDLE_RED_CANDLE, false),
                    new CandleFlower(Material.BLACK_CANDLE, Messages.FLOWER.CANDLE_BLACK_CANDLE, false)
            )));

            registerFlower(new FlowerGroup(Material.CANDLE, Messages.FLOWER.LIT_CANDLE, List.of(
                    new CandleFlower(Material.CANDLE, Messages.FLOWER.CANDLE_CANDLE, true),
                    new CandleFlower(Material.WHITE_CANDLE, Messages.FLOWER.CANDLE_WHITE_CANDLE, true),
                    new CandleFlower(Material.ORANGE_CANDLE, Messages.FLOWER.CANDLE_ORANGE_CANDLE, true),
                    new CandleFlower(Material.MAGENTA_CANDLE, Messages.FLOWER.CANDLE_MAGENTA_CANDLE, true),
                    new CandleFlower(Material.LIGHT_BLUE_CANDLE, Messages.FLOWER.CANDLE_LIGHT_BLUE_CANDLE, true),
                    new CandleFlower(Material.YELLOW_CANDLE, Messages.FLOWER.CANDLE_YELLOW_CANDLE, true),
                    new CandleFlower(Material.LIME_CANDLE, Messages.FLOWER.CANDLE_LIME_CANDLE, true),
                    new CandleFlower(Material.PINK_CANDLE, Messages.FLOWER.CANDLE_PINK_CANDLE, true),
                    new CandleFlower(Material.GRAY_CANDLE, Messages.FLOWER.CANDLE_GRAY_CANDLE, true),
                    new CandleFlower(Material.LIGHT_GRAY_CANDLE, Messages.FLOWER.CANDLE_LIGHT_GRAY_CANDLE, true),
                    new CandleFlower(Material.CYAN_CANDLE, Messages.FLOWER.CANDLE_CYAN_CANDLE, true),
                    new CandleFlower(Material.PURPLE_CANDLE, Messages.FLOWER.CANDLE_PURPLE_CANDLE, true),
                    new CandleFlower(Material.BLUE_CANDLE, Messages.FLOWER.CANDLE_BLUE_CANDLE, true),
                    new CandleFlower(Material.BROWN_CANDLE, Messages.FLOWER.CANDLE_BROWN_CANDLE, true),
                    new CandleFlower(Material.GREEN_CANDLE, Messages.FLOWER.CANDLE_GREEN_CANDLE, true),
                    new CandleFlower(Material.RED_CANDLE, Messages.FLOWER.CANDLE_RED_CANDLE, true),
                    new CandleFlower(Material.BLACK_CANDLE, Messages.FLOWER.CANDLE_BLACK_CANDLE, true)
            )));
        }

        if (isValidMaterial("MANGROVE_LEAVES" /* 1.19*/)) {
            registerFlower(new Flower(Material.MANGROVE_LEAVES, Messages.FLOWER.MANGROVE_LEAVES));
        }

        if (isValidMaterial("CHERRY_LEAVES") /* 1.20+ */) {
            registerFlower(new Flower(Material.CHERRY_LEAVES, Messages.FLOWER.CHERRY_FENCE));
        }
        if (isValidMaterial("PALE_OAK_LEAVES")) {
            registerFlower(new Flower(Material.PALE_OAK_LEAVES, Messages.FLOWER.PALE_OAK_LEAVES));
        }

        if (isValidMaterial("DECORATED_POT") /* 1.20.3+ */) {
            registerFlower(new Flower(Material.DECORATED_POT, Messages.FLOWER.DECORATED_POT));
        }

        if(isValidMaterial("AZALEA")) {
            registerFlower(new Flower(Material.AZALEA_LEAVES, Messages.FLOWER.AZALEA_LEAVES));
            registerFlower(new Flower(Material.FLOWERING_AZALEA_LEAVES, Messages.FLOWER.FLOWERING_AZALEA_LEAVES));
        }
        registerFlower(new Flower(Material.OAK_LEAVES, Messages.FLOWER.OAK_LEAVES));
        registerFlower(new Flower(Material.SPRUCE_LEAVES, Messages.FLOWER.SPRUCE_LEAVES));
        registerFlower(new Flower(Material.BIRCH_LEAVES, Messages.FLOWER.BIRCH_LEAVES));
        registerFlower(new Flower(Material.JUNGLE_LEAVES, Messages.FLOWER.JUNGLE_LEAVES));
        registerFlower(new Flower(Material.ACACIA_LEAVES, Messages.FLOWER.ACACIA_LEAVES));
        registerFlower(new Flower(Material.DARK_OAK_LEAVES, Messages.FLOWER.DARK_OAK_LEAVES));
        registerFlower(new Flower(Material.LILY_PAD, Messages.FLOWER.LILY_PAD));
        registerFlower(new Flower(Material.VINE, Messages.FLOWER.VINE));
        registerFlower(new Flower(Material.CACTUS, Messages.FLOWER.CACTUS));
        registerFlower(new Flower(Material.MELON, Messages.FLOWER.MELON));
        registerFlower(new Flower(Material.PUMPKIN, Messages.FLOWER.PUMPKIN));
        registerFlower(new Flower(Material.SEAGRASS, Messages.FLOWER.SEAGRASS));
        registerFlower(new Flower(Material.SEA_PICKLE, Messages.FLOWER.SEA_PICKLE));
        registerFlower(new Flower(Material.KELP, Messages.FLOWER.KELP));
        registerFlower(new FlowerGroup(Material.BAMBOO, Messages.FLOWER.BAMBOO, Arrays.asList(
                new BambooFlower(Material.BAMBOO, Messages.FLOWER.BAMBOO, 0, Bamboo.Leaves.NONE),
                new BambooFlower(Material.BAMBOO, Messages.FLOWER.BAMBOO, 1, Bamboo.Leaves.NONE),
                new BambooFlower(Material.BAMBOO, Messages.FLOWER.BAMBOO, 0, Bamboo.Leaves.SMALL),
                new BambooFlower(Material.BAMBOO, Messages.FLOWER.BAMBOO, 1, Bamboo.Leaves.SMALL),
                new BambooFlower(Material.BAMBOO, Messages.FLOWER.BAMBOO, 0, Bamboo.Leaves.LARGE),
                new BambooFlower(Material.BAMBOO, Messages.FLOWER.BAMBOO, 1, Bamboo.Leaves.LARGE)

        )));
        registerFlower(new Flower(Material.END_ROD, Messages.FLOWER.END_ROD));
        registerFlower(new Flower(Material.SOUL_LANTERN, Messages.FLOWER.SOUL_LANTERN));
        registerFlower(new Flower(Material.LANTERN, Messages.FLOWER.LANTERN));
        registerFlower(new Flower(Material.COCOA_BEANS, Messages.FLOWER.COCOA_BEANS, Material.COCOA));
        registerFlower(new Flower(Material.CRIMSON_ROOTS, Messages.FLOWER.CRIMSON_ROOTS));
        registerFlower(new Flower(Material.WEEPING_VINES, Messages.FLOWER.WEEPING_VINES));
        registerFlower(new Flower(Material.WARPED_ROOTS, Messages.FLOWER.WARPED_ROOTS));
        registerFlower(new Flower(Material.NETHER_SPROUTS, Messages.FLOWER.NETHER_SPROUTS));
        registerFlower(new Flower(Material.TWISTING_VINES, Messages.FLOWER.TWISTING_VINES));
        registerFlower(new Flower(Material.BRAIN_CORAL, Messages.FLOWER.BRAIN_CORAL));
        registerFlower(new Flower(Material.BUBBLE_CORAL, Messages.FLOWER.BUBBLE_CORAL));
        registerFlower(new Flower(Material.FIRE_CORAL, Messages.FLOWER.FIRE_CORAL));
        registerFlower(new Flower(Material.HORN_CORAL, Messages.FLOWER.HORN_CORAL));
        registerFlower(new Flower(Material.TUBE_CORAL, Messages.FLOWER.TUBE_CORAL));
        registerFlower(new Flower(Material.BRAIN_CORAL_FAN, Messages.FLOWER.BRAIN_CORAL_FAN));
        registerFlower(new Flower(Material.BUBBLE_CORAL_FAN, Messages.FLOWER.BUBBLE_CORAL_FAN));
        registerFlower(new Flower(Material.FIRE_CORAL_FAN, Messages.FLOWER.FIRE_CORAL_FAN));
        registerFlower(new Flower(Material.HORN_CORAL_FAN, Messages.FLOWER.HORN_CORAL_FAN));
        registerFlower(new Flower(Material.TUBE_CORAL_FAN, Messages.FLOWER.TUBE_CORAL_FAN));

        registerFlower(new FlowerGroup(Material.WHEAT, Messages.FLOWER.WHEAT, Arrays.asList(
                new AgingFlower(Material.WHEAT, Messages.FLOWER.WHEAT, 0),
                new AgingFlower(Material.WHEAT, Messages.FLOWER.WHEAT, 1),
                new AgingFlower(Material.WHEAT, Messages.FLOWER.WHEAT, 2),
                new AgingFlower(Material.WHEAT, Messages.FLOWER.WHEAT, 3),
                new AgingFlower(Material.WHEAT, Messages.FLOWER.WHEAT, 4),
                new AgingFlower(Material.WHEAT, Messages.FLOWER.WHEAT, 5),
                new AgingFlower(Material.WHEAT, Messages.FLOWER.WHEAT, 6),
                new AgingFlower(Material.WHEAT, Messages.FLOWER.WHEAT, 7)
        )));

        registerFlower(new FlowerGroup(Material.POTATO, Messages.FLOWER.POTATO, Arrays.asList(
                new AgingFlower(Material.POTATO, Messages.FLOWER.POTATO, Material.POTATOES, 0),
                new AgingFlower(Material.POTATO, Messages.FLOWER.POTATO, Material.POTATOES, 1),
                new AgingFlower(Material.POTATO, Messages.FLOWER.POTATO, Material.POTATOES, 2),
                new AgingFlower(Material.POTATO, Messages.FLOWER.POTATO, Material.POTATOES, 3),
                new AgingFlower(Material.POTATO, Messages.FLOWER.POTATO, Material.POTATOES, 4),
                new AgingFlower(Material.POTATO, Messages.FLOWER.POTATO, Material.POTATOES, 5),
                new AgingFlower(Material.POTATO, Messages.FLOWER.POTATO, Material.POTATOES, 6),
                new AgingFlower(Material.POTATO, Messages.FLOWER.POTATO, Material.POTATOES, 7)
        )));

        registerFlower(new FlowerGroup(Material.CARROT, Messages.FLOWER.CARROT, Arrays.asList(
                new AgingFlower(Material.CARROT, Messages.FLOWER.CARROT, Material.CARROTS, 0),
                new AgingFlower(Material.CARROT, Messages.FLOWER.CARROT, Material.CARROTS, 1),
                new AgingFlower(Material.CARROT, Messages.FLOWER.CARROT, Material.CARROTS, 2),
                new AgingFlower(Material.CARROT, Messages.FLOWER.CARROT, Material.CARROTS, 3),
                new AgingFlower(Material.CARROT, Messages.FLOWER.CARROT, Material.CARROTS, 4),
                new AgingFlower(Material.CARROT, Messages.FLOWER.CARROT, Material.CARROTS, 5),
                new AgingFlower(Material.CARROT, Messages.FLOWER.CARROT, Material.CARROTS, 6),
                new AgingFlower(Material.CARROT, Messages.FLOWER.CARROT, Material.CARROTS, 7)
        )));

        registerFlower(new FlowerGroup(Material.BEETROOT,Messages.FLOWER.BEETROOT, Arrays.asList(
                new AgingFlower(Material.BEETROOT,Messages.FLOWER.BEETROOT,Material.BEETROOTS,0),
                new AgingFlower(Material.BEETROOT,Messages.FLOWER.BEETROOT,Material.BEETROOTS,1),
                new AgingFlower(Material.BEETROOT,Messages.FLOWER.BEETROOT,Material.BEETROOTS,2),
                new AgingFlower(Material.BEETROOT,Messages.FLOWER.BEETROOT,Material.BEETROOTS,3)
        )));

        registerFlower(new Flower(Material.PUMPKIN_SEEDS,Messages.FLOWER.ATTACHED_PUMPKIN_STEM,Material.ATTACHED_PUMPKIN_STEM));

        registerFlower(new FlowerGroup(Material.PUMPKIN_SEEDS,Messages.FLOWER.PUMPKIN_STEM,Arrays.asList(
                new AgingFlower(Material.PUMPKIN_SEEDS,Messages.FLOWER.PUMPKIN_STEM,Material.PUMPKIN_STEM,0),
                new AgingFlower(Material.PUMPKIN_SEEDS,Messages.FLOWER.PUMPKIN_STEM,Material.PUMPKIN_STEM,1),
                new AgingFlower(Material.PUMPKIN_SEEDS,Messages.FLOWER.PUMPKIN_STEM,Material.PUMPKIN_STEM,2),
                new AgingFlower(Material.PUMPKIN_SEEDS,Messages.FLOWER.PUMPKIN_STEM,Material.PUMPKIN_STEM,3),
                new AgingFlower(Material.PUMPKIN_SEEDS,Messages.FLOWER.PUMPKIN_STEM,Material.PUMPKIN_STEM,4),
                new AgingFlower(Material.PUMPKIN_SEEDS,Messages.FLOWER.PUMPKIN_STEM,Material.PUMPKIN_STEM,5),
                new AgingFlower(Material.PUMPKIN_SEEDS,Messages.FLOWER.PUMPKIN_STEM,Material.PUMPKIN_STEM,6),
                new AgingFlower(Material.PUMPKIN_SEEDS,Messages.FLOWER.PUMPKIN_STEM,Material.PUMPKIN_STEM,7)
        )));

        registerFlower(new Flower(Material.MELON_SEEDS,Messages.FLOWER.ATTACHED_MELON_STEM,Material.ATTACHED_MELON_STEM));

        registerFlower(new FlowerGroup(Material.MELON_SEEDS,Messages.FLOWER.MELON_STEM,Arrays.asList(
                new AgingFlower(Material.MELON_SEEDS,Messages.FLOWER.MELON_STEM,Material.MELON_STEM,0),
                new AgingFlower(Material.MELON_SEEDS,Messages.FLOWER.MELON_STEM,Material.MELON_STEM,1),
                new AgingFlower(Material.MELON_SEEDS,Messages.FLOWER.MELON_STEM,Material.MELON_STEM,2),
                new AgingFlower(Material.MELON_SEEDS,Messages.FLOWER.MELON_STEM,Material.MELON_STEM,3),
                new AgingFlower(Material.MELON_SEEDS,Messages.FLOWER.MELON_STEM,Material.MELON_STEM,4),
                new AgingFlower(Material.MELON_SEEDS,Messages.FLOWER.MELON_STEM,Material.MELON_STEM,5),
                new AgingFlower(Material.MELON_SEEDS,Messages.FLOWER.MELON_STEM,Material.MELON_STEM,6),
                new AgingFlower(Material.MELON_SEEDS,Messages.FLOWER.MELON_STEM,Material.MELON_STEM,7)
        )));

        if (isValidMaterial("SWEET_BERRY_BUSH")){
            registerFlower(new FlowerGroup(Material.SWEET_BERRIES,Messages.FLOWER.SWEET_BERRY_BUSH, Arrays.asList(
                    new AgingFlower(Material.SWEET_BERRIES, Messages.FLOWER.SWEET_BERRY_BUSH, Material.SWEET_BERRY_BUSH,0),
                    new AgingFlower(Material.SWEET_BERRIES, Messages.FLOWER.SWEET_BERRY_BUSH, Material.SWEET_BERRY_BUSH,1),
                    new AgingFlower(Material.SWEET_BERRIES, Messages.FLOWER.SWEET_BERRY_BUSH, Material.SWEET_BERRY_BUSH,2),
                    new AgingFlower(Material.SWEET_BERRIES, Messages.FLOWER.SWEET_BERRY_BUSH, Material.SWEET_BERRY_BUSH,3)
            )));
        }

        if (isValidMaterial("PALE_HANGING_MOSS")) {
            registerFlower(new Flower(Material.PALE_HANGING_MOSS, Messages.FLOWER.PALE_HANGING_MOSS));
            registerFlower(new Flower(Material.PALE_MOSS_BLOCK, Messages.FLOWER.PALE_MOSS_BLOCK));
            registerFlower(new Flower(Material.PALE_MOSS_CARPET, Messages.FLOWER.PALE_MOSS_CARPET));
        }


        registerFlower(new Flower(Material.BARRIER, Messages.FLOWER.AIR, Material.AIR));
    }

    private static <E extends Enum<E>> boolean isValidMaterial(String enumName) {
        if (enumName == null) {
            return false;
        } else {
            try {
                Material.valueOf(enumName);
                return true;
            } catch (IllegalArgumentException var3) {
                return false;
            }
        }
    }

    private static void registerFlower(Flower flower) {
        flowers.add(flower);
    }

    public static List<Flower> getFlowers() {
        return flowers;
    }
}
