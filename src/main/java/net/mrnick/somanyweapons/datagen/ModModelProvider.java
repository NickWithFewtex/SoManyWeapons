package net.mrnick.somanyweapons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.mrnick.somanyweapons.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Items
        itemModelGenerator.register(ModItems.ENDER_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_DIAMOND, Models.GENERATED);

        // Weapons
        itemModelGenerator.register(ModItems.ENDER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TOILET, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_CHAIR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LEGO_SWORD, Models.HANDHELD);
    }
}
