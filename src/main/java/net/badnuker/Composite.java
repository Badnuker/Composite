package net.badnuker;

import net.badnuker.Items.EnderSwordItem;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Composite implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "composite";

    public static final Logger LOGGER = LoggerFactory.getLogger("composite");

    public static Item EnderSword;

    static {
        EnderSword = Registry.register(Registry.ITEM, new Identifier(Composite.MOD_ID, "ender_sword"), (Item) new EnderSwordItem(ToolMaterials.DIAMOND, 3, -1.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
    }

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello Fabric world!");
    }
}