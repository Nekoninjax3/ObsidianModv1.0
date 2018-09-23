package com.nekoninjax3.obsidianmod.util.handlers;

import com.nekoninjax3.obsidianmod.init.ModItems;
import com.nekoninjax3.obsidianmod.util.IHasModel;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegistry(RegistryEvent.Register<Item> event)
{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
	}
}
