package net.project.project.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.project.project.Project;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Project.MOD_ID);

    public static final RegistryObject<Item> TUTORIAL_ITEM = ITEMS.register("tutorial_item",
            () -> new Item(new Item.Properties().group(ModItemGroup.CARROT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
