package net.panther0706.psm;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.panther0706.psm.items.PSMWeapons;
import net.panther0706.psm.tabs.PSMCreativeTabs;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PSM.MODID)
public class PSM
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "psm";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public PSM()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        PSMCreativeTabs.Register(modEventBus);
        PSMWeapons.Register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            //Unique
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.FLAMEBERGE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.BLOODBATH.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.DRAGONS_CLAW.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Iron
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PSMWeapons.IRON_FLAMMENSCHWERT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PSMWeapons.IRON_ZWEIHANDER.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PSMWeapons.IRON_GREATSWORD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PSMWeapons.IRON_FLAMBERGE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PSMWeapons.IRON_LONGSWORD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PSMWeapons.IRON_SCIMITAR.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PSMWeapons.IRON_STAR_FALCHION.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PSMWeapons.IRON_FLAMMARD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PSMWeapons.IRON_HALF_SWORD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PSMWeapons.IRON_KRIS.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(),
                    PSMWeapons.IRON_DAGGER.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Diamond
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PSMWeapons.DIAMOND_FLAMMENSCHWERT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PSMWeapons.DIAMOND_ZWEIHANDER.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PSMWeapons.DIAMOND_GREATSWORD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PSMWeapons.DIAMOND_FLAMBERGE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PSMWeapons.DIAMOND_LONGSWORD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PSMWeapons.DIAMOND_SCIMITAR.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PSMWeapons.DIAMOND_STAR_FALCHION.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PSMWeapons.DIAMOND_FLAMMARD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PSMWeapons.DIAMOND_HALF_SWORD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PSMWeapons.DIAMOND_KRIS.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(),
                    PSMWeapons.DIAMOND_DAGGER.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Netherite
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.NETHERITE_FLAMMENSCHWERT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.NETHERITE_ZWEIHANDER.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.NETHERITE_GREATSWORD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.NETHERITE_FLAMBERGE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.NETHERITE_LONGSWORD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.NETHERITE_SCIMITAR.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.NETHERITE_STAR_FALCHION.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.NETHERITE_FLAMMARD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.NETHERITE_HALF_SWORD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.NETHERITE_KRIS.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.NETHERITE_SWORD.getDefaultInstance(),
                    PSMWeapons.NETHERITE_DAGGER.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
