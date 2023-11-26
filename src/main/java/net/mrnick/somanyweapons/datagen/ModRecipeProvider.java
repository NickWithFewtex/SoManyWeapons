package net.mrnick.somanyweapons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.mrnick.somanyweapons.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDER_DIAMOND, 1)
                .pattern("EEE")
                .pattern("EDE")
                .pattern("EEE")
                .input('E', Items.ENDER_PEARL)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(Items.ENDER_PEARL), conditionsFromItem(Items.ENDER_PEARL))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_DIAMOND)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDER_STICK, 1)
                .pattern("E")
                .pattern("E")
                .input('E', ModItems.ENDER_DIAMOND)
                .criterion(hasItem(ModItems.ENDER_DIAMOND), conditionsFromItem(ModItems.ENDER_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_STICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ENDER_SWORD, 1)
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .input('E', ModItems.ENDER_DIAMOND)
                .input('S', ModItems.ENDER_STICK)
                .criterion(hasItem(ModItems.ENDER_DIAMOND), conditionsFromItem(ModItems.ENDER_DIAMOND))
                .criterion(hasItem(ModItems.ENDER_STICK), conditionsFromItem(ModItems.ENDER_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_SWORD)));
    }
}
