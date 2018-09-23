package com.nekoninjax3.obsidianmod.items;



import com.nekoninjax3.obsidianmod.Main;
import com.nekoninjax3.obsidianmod.init.ModItems;
import com.nekoninjax3.obsidianmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel 

{

	public ItemBase(String name)
	{
	
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}

}
