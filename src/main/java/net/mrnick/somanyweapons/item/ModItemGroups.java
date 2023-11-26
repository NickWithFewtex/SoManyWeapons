package net.mrnick.somanyweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mrnick.somanyweapons.SoManyWeapons;

public class ModItemGroups {
    public static final ItemGroup SO_MANY_WEAPONS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SoManyWeapons.MOD_ID, "so_many_weapons_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.so_many_weapons_tab"))
                    .icon(() -> new ItemStack(ModItems.ENDER_STICK)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.ENDER_SWORD);
                        entries.add(ModItems.LEGO_SWORD);
                    })).build());

    public static final ItemGroup SO_MANY_WEAPON_MATERIALS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SoManyWeapons.MOD_ID, "so_many_weapons_material"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.so_many_weapons_material"))
                    .icon(() -> new ItemStack(ModItems.ENDER_DIAMOND)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDER_DIAMOND);
                        entries.add(ModItems.ENDER_STICK);
                    }).build());

    public static final ItemGroup SO_MANY_SILLY_WEAPONS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SoManyWeapons.MOD_ID, "so_many_silly_weapons_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.so_many_silly_weapons_tab"))
                    .icon(() -> new ItemStack(ModItems.TOILET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TOILET);
                        entries.add(ModItems.WOODEN_CHAIR);
                    }).build());


    public static void registerItemGroups() {
        SoManyWeapons.LOGGER.info("Registering item groups for " + SoManyWeapons.MOD_ID);
    }
}
