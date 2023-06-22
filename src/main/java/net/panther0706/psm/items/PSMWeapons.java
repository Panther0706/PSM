package net.panther0706.psm.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
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

    public static final RegistryObject<SwordItem> IRON_HALF_SWORD = ITEMS.register("iron_half_sword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_LONGSWORD = ITEMS.register("iron_longsword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<SwordItem> IRON_FLAMBERGE = ITEMS.register("iron_flamberge",
            () -> new SwordItem(net.minecraft.world.item.Tiers.IRON, 12, -3.4f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_HALF_SWORD = ITEMS.register("diamond_half_sword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMOND_FLAMBERGE = ITEMS.register("diamond_flamberge",
            () -> new SwordItem(net.minecraft.world.item.Tiers.DIAMOND, 12, -3.4f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_HALF_SWORD = ITEMS.register("netherite_half_sword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_LONGSWORD = ITEMS.register("netherite_longsword",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITE_FLAMBERGE = ITEMS.register("netherite_flamberge",
            () -> new SwordItem(net.minecraft.world.item.Tiers.NETHERITE, 12, -3.4f, new Item.Properties()));
    public static final RegistryObject<PSMDragonsClaw> DRAGONS_CLAW = ITEMS.register("dragons_claw",
            () -> new PSMDragonsClaw(Tiers.DRAGONS_CLAW_TIER, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<PSMBloodbath> BLOODBATH = ITEMS.register("bloodbath",
            () -> new PSMBloodbath(Tiers.BLOODBATH_TIER, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<PSMFlameberge> FLAMEBERGE = ITEMS.register("flameberge",
            () -> new PSMFlameberge(Tiers.FLAMEBERGE_TIER, 12, -3.4f, new Item.Properties()));

    public static class Tiers {
        public static final Tier DRAGONS_CLAW_TIER = new ForgeTier(5, 3000, 13f, 3f, 50, null, () -> Ingredient.of(Items.ENDER_PEARL));
        public static final Tier BLOODBATH_TIER = new ForgeTier(5, 3500, 9f, 7f, 50, null, () -> Ingredient.of(Items.REDSTONE));
        public static final Tier FLAMEBERGE_TIER = new ForgeTier(5, 4000, 9f, 9f, 50, null, () -> Ingredient.of(Items.BLAZE_ROD));
    }

    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
