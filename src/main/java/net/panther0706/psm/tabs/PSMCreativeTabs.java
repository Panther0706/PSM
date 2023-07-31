package net.panther0706.psm.tabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.panther0706.psm.PSM;
import net.panther0706.psm.items.PSMWeapons;

@Mod.EventBusSubscriber(modid = PSM.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PSMCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PSM.MODID);
    public static final RegistryObject<CreativeModeTab> PSM_TAB = TABS.register("psm_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.literal("Panther's Sword Mod"))
                    .icon(PSMWeapons.IRON_HALF_SWORD.get()::getDefaultInstance)
                    .displayItems((displayParameters, displayOutput) -> {
                        //Iron
                        displayOutput.accept(PSMWeapons.IRON_DAGGER.get());
                        displayOutput.accept(PSMWeapons.IRON_KRIS.get());
                        displayOutput.accept(PSMWeapons.IRON_HALF_SWORD.get());
                        displayOutput.accept(PSMWeapons.IRON_FLAMMARD.get());
                        displayOutput.accept(PSMWeapons.IRON_STAR_FALCHION.get());
                        displayOutput.accept(PSMWeapons.IRON_SCIMITAR.get());
                        displayOutput.accept(PSMWeapons.IRON_LONGSWORD.get());
                        displayOutput.accept(PSMWeapons.IRON_FLAMBERGE.get());
                        displayOutput.accept(PSMWeapons.IRON_GREATSWORD.get());
                        displayOutput.accept(PSMWeapons.IRON_ZWEIHANDER.get());
                        displayOutput.accept(PSMWeapons.IRON_FLAMMENSCHWERT.get());
                        //Diamond
                        displayOutput.accept(PSMWeapons.DIAMOND_DAGGER.get());
                        displayOutput.accept(PSMWeapons.DIAMOND_KRIS.get());
                        displayOutput.accept(PSMWeapons.DIAMOND_HALF_SWORD.get());
                        displayOutput.accept(PSMWeapons.DIAMOND_FLAMMARD.get());
                        displayOutput.accept(PSMWeapons.DIAMOND_STAR_FALCHION.get());
                        displayOutput.accept(PSMWeapons.DIAMOND_SCIMITAR.get());
                        displayOutput.accept(PSMWeapons.DIAMOND_LONGSWORD.get());
                        displayOutput.accept(PSMWeapons.DIAMOND_FLAMBERGE.get());
                        displayOutput.accept(PSMWeapons.DIAMOND_GREATSWORD.get());
                        displayOutput.accept(PSMWeapons.DIAMOND_ZWEIHANDER.get());
                        displayOutput.accept(PSMWeapons.DIAMOND_FLAMMENSCHWERT.get());
                        //Netherite
                        displayOutput.accept(PSMWeapons.NETHERITE_DAGGER.get());
                        displayOutput.accept(PSMWeapons.NETHERITE_KRIS.get());
                        displayOutput.accept(PSMWeapons.NETHERITE_HALF_SWORD.get());
                        displayOutput.accept(PSMWeapons.NETHERITE_FLAMMARD.get());
                        displayOutput.accept(PSMWeapons.NETHERITE_STAR_FALCHION.get());
                        displayOutput.accept(PSMWeapons.NETHERITE_SCIMITAR.get());
                        displayOutput.accept(PSMWeapons.NETHERITE_LONGSWORD.get());
                        displayOutput.accept(PSMWeapons.NETHERITE_FLAMBERGE.get());
                        displayOutput.accept(PSMWeapons.NETHERITE_GREATSWORD.get());
                        displayOutput.accept(PSMWeapons.NETHERITE_ZWEIHANDER.get());
                        displayOutput.accept(PSMWeapons.NETHERITE_FLAMMENSCHWERT.get());
                        //Unique
                        displayOutput.accept(PSMWeapons.DRAGONS_CLAW.get());
                        displayOutput.accept(PSMWeapons.BLOODBATH.get());
                        displayOutput.accept(PSMWeapons.FLAMEBERGE.get());
                    })
                    .build()
    );

    public static void Register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
