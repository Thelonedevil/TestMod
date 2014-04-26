package com.github.thelonedevil.BloodArmor;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import com.github.thelonedevil.BloodArmor.Blocks.MyBlocks;
import com.github.thelonedevil.BloodArmor.Items.MyItems;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = BloodArmor.MODID, version = BloodArmor.VERSION, name = BloodArmor.NAME)
public class BloodArmor {
	public static final String MODID = "BloodArmor";
	public static final String VERSION = "1.0";
	public static final String NAME = "BloodArmor";
	@SidedProxy(clientSide = "com.github.thelonedevil.BloodArmor.client.ClientProxy", serverSide = "com.github.thelonedevil.BloodArmor.BloodArmorProxy")
	public static BloodArmorProxy proxy;
	public static CreativeTabs myTab = new CreativeTabs("MyTab") {
		public Item getTabIconItem() {
			return MyItems.bloodCrystal;
		}
	};
	public static final CraftingHandler craftingHandler = new CraftingHandler();
	
	public static final PlayerDeathHandler playerDeathHandler = new PlayerDeathHandler();
	
	public static BloodArmorGenerator worldgen = new BloodArmorGenerator();
	
	private static Logger logger;

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		logger = LogManager.getLogger("BloodArmor");
		MyItems.init();
		MyBlocks.init();
		MyRecipes.init();

		GameRegistry.registerWorldGenerator(worldgen, 9);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(craftingHandler);
		MinecraftForge.EVENT_BUS.register(playerDeathHandler);
	}

	public static File getModsFolder() {
		// TODO Auto-generated method stub
		return new File(Minecraft.getMinecraft().mcDataDir,"mods");
	}
}
