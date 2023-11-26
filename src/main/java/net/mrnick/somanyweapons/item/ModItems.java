package net.mrnick.somanyweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mrnick.somanyweapons.SoManyWeapons;
import net.mrnick.somanyweapons.item.custom.LegoSwordItem;
import net.mrnick.somanyweapons.item.custom.StickSwordItem;
import net.mrnick.somanyweapons.item.custom.StinkyToiletItem;
import net.mrnick.somanyweapons.item.custom.WoodenChairItem;

public class ModItems {
    public static final Item ENDER_STICK = registerItem("ender_stick", new Item(new FabricItemSettings()));
    public static final Item ENDER_DIAMOND = registerItem("ender_diamond", new Item(new FabricItemSettings()));

    public static final Item ENDER_SWORD = registerItem("ender_sword", new SwordItem(ModToolMaterial.ENDER_DIAMOND,
            10, 5f, new FabricItemSettings()));
    public static final Item TOILET = registerItem("toilet", new StinkyToiletItem(ModToolMaterial.TOILET,
            1000000, 100f, new FabricItemSettings()));
    public static final Item WOODEN_CHAIR = registerItem("wooden_chair", new WoodenChairItem(ModToolMaterial.WOODEN_CHAIR,
            15, 100f, new FabricItemSettings()));
    public static final Item LEGO_SWORD = registerItem("lego_sword", new LegoSwordItem(ModToolMaterial.LEGO_SWORD,
            30, 100f, new FabricItemSettings()));
    public static final Item STICK_SWORD = registerItem("stick_sword", new StickSwordItem(ModToolMaterial.STICK_SWORD,
            2, 100f, new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SoManyWeapons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SoManyWeapons.LOGGER.info("Registering Mod Items for " + SoManyWeapons.MOD_ID);
    }
}
