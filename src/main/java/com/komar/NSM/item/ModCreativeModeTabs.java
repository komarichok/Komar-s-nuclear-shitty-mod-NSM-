package com.komar.NSM.item;

import com.komar.NSM.Knsm;
import com.komar.NSM.block.Modblocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Knsm.MODID);

    public static final Supplier<CreativeModeTab> KNSM_ingredients = CREATIVE_MODE_TAB.register("knsm_ingredients_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.STEEL.get()))
                    .title(Component.translatable("knsm ingridients"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(ModItems.STEEL);
                        output.accept(ModItems.ALUMINIUM);
                        output.accept(ModItems.RAW_ALUMINIUM);



                    }).build());public static final Supplier<CreativeModeTab> KNSM_blocks = CREATIVE_MODE_TAB.register("knsm_blocks_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Modblocks.ALUMINIUM_BLOCK.get()))
                    .title(Component.translatable("knsm blocks"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(Modblocks.ALUMINIUM_BLOCK);
                        output.accept(Modblocks.BAUXITE_ORE);
                        output.accept(Modblocks.DEEPSLATE_BAUXITE_ORE);



                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);

    }
}
