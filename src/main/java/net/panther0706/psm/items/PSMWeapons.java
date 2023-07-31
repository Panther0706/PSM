package net.panther0706.psm.items;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.panther0706.psm.PSM;
import net.panther0706.psm.PSMBloodbath;
import net.panther0706.psm.PSMDragonsClaw;
import net.panther0706.psm.PSMFlameberge;

public class PSMWeapons {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PSM.MODID);

    //Iron
    public static final RegistryObject<SwordItem> IRON_DAGGER = ITEMS.register("iron_dagger",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 2, -2.2f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_KRIS = ITEMS.register("iron_kris",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 2, -2.2f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_HALF_SWORD = ITEMS.register("iron_half_sword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_FLAMMARD = ITEMS.register("iron_flammard",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_STAR_FALCHION = ITEMS.register("iron_star_falchion",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 7, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_SCIMITAR = ITEMS.register("iron_scimitar",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 5, -2.5f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_LONGSWORD = ITEMS.register("iron_longsword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_FLAMBERGE = ITEMS.register("iron_flamberge",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_ZWEIHANDER = ITEMS.register("iron_zweihander",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 14, -3.6f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_FLAMMENSCHWERT = ITEMS.register("iron_flammenschwert",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 14, -3.6f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_GREATSWORD = ITEMS.register("iron_greatsword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 12, -3.4f, new Item.Properties()));

    //Diamond
    public static final RegistryObject<SwordItem> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 2, -2.2f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_KRIS = ITEMS.register("diamond_kris",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 2, -2.2f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_HALF_SWORD = ITEMS.register("diamond_half_sword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_FLAMMARD = ITEMS.register("diamond_flammard",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_STAR_FALCHION = ITEMS.register("diamond_star_falchion",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 7, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_SCIMITAR = ITEMS.register("diamond_scimitar",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 5, -2.5f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_FLAMBERGE = ITEMS.register("diamond_flamberge",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_ZWEIHANDER = ITEMS.register("diamond_zweihander",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 14, -3.6f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_FLAMMENSCHWERT = ITEMS.register("diamond_flammenschwert",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 14, -3.6f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 12, -3.4f, new Item.Properties()));

    //Netherite
    public static final RegistryObject<SwordItem> NETHERITE_DAGGER = ITEMS.register("netherite_dagger",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 2, -2.2f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_KRIS = ITEMS.register("netherite_kris",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 2, -2.2f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_HALF_SWORD = ITEMS.register("netherite_half_sword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_FLAMMARD = ITEMS.register("netherite_flammard",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_STAR_FALCHION = ITEMS.register("netherite_star_falchion",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 7, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_SCIMITAR = ITEMS.register("netherite_scimitar",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 5, -2.5f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_LONGSWORD = ITEMS.register("netherite_longsword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_FLAMBERGE = ITEMS.register("netherite_flamberge",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_ZWEIHANDER = ITEMS.register("netherite_zweihander",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 14, -3.6f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_FLAMMENSCHWERT = ITEMS.register("netherite_flammenschwert",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 14, -3.6f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 12, -3.4f, new Item.Properties()));

    //Unique
    public static final RegistryObject<PSMDragonsClaw> DRAGONS_CLAW = ITEMS.register("dragons_claw",
            () -> new PSMDragonsClaw(Tiers.DRAGONS_CLAW_TIER, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<PSMBloodbath> BLOODBATH = ITEMS.register("bloodbath",
            () -> new PSMBloodbath(Tiers.BLOODBATH_TIER, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<PSMFlameberge> FLAMEBERGE = ITEMS.register("flameberge",
            () -> new PSMFlameberge(Tiers.FLAMEBERGE_TIER, 7, -3.1f, new Item.Properties()));

    public static class Tiers {
        public static final Tier DRAGONS_CLAW_TIER = new ForgeTier(5, 3000, 13f, 3f, 50, null, () -> Ingredient.of(Items.ENDER_PEARL));
        public static final Tier BLOODBATH_TIER = new ForgeTier(5, 3500, 9f, 7f, 50, null, () -> Ingredient.of(Items.REDSTONE));
        public static final Tier FLAMEBERGE_TIER = new ForgeTier(5, 4000, 9f, 9f, 50, null, () -> Ingredient.of(Items.BLAZE_ROD));
    }

    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
