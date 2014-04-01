package com.github.thelonedevil.TestMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.github.thelonedevil.TestMod.Blocks.MyBlocks;
import com.github.thelonedevil.TestMod.Items.MyItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TestMod.MODID, version = TestMod.VERSION, name = TestMod.NAME)
public class TestMod {
	public static final String MODID = "TestMod";
	public static final String VERSION = "1.0";
	public static final String NAME = "TestMod";
	@SidedProxy(clientSide = "com.github.thelonedevil.TestMod.client.ClientProxy", serverSide = "com.github.thelonedevil.TestMod.TestModProxy")
	public static TestModProxy proxy;
	public static CreativeTabs myTab = new CreativeTabs("MyTab") {
		public Item getTabIconItem() {
			return MyItems.bloodCrystal;
		}
	};
	public static TestWorldGenerator worldgen = new TestWorldGenerator();

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		MyItems.init();
		MyBlocks.init();
		MyRecipes.init();
		GameRegistry.registerWorldGenerator(worldgen, 9);

	}
}
