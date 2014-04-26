package com.github.thelonedevil.BloodArmor.Items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import com.github.thelonedevil.BloodArmor.BloodArmor;
import com.github.thelonedevil.BloodArmor.Items.chain.AlienChainBoots;
import com.github.thelonedevil.BloodArmor.Items.chain.AlienChainChestplate;
import com.github.thelonedevil.BloodArmor.Items.chain.AlienChainHelmet;
import com.github.thelonedevil.BloodArmor.Items.chain.AlienChainLeggings;
import com.github.thelonedevil.BloodArmor.Items.chain.BloodChainBoots;
import com.github.thelonedevil.BloodArmor.Items.chain.BloodChainChestplate;
import com.github.thelonedevil.BloodArmor.Items.chain.BloodChainHelmet;
import com.github.thelonedevil.BloodArmor.Items.chain.BloodChainLeggings;
import com.github.thelonedevil.BloodArmor.Items.chain.CamoChainBoots;
import com.github.thelonedevil.BloodArmor.Items.chain.CamoChainChestplate;
import com.github.thelonedevil.BloodArmor.Items.chain.CamoChainHelmet;
import com.github.thelonedevil.BloodArmor.Items.chain.CamoChainLeggings;
import com.github.thelonedevil.BloodArmor.Items.diamond.AlienDiamondBoots;
import com.github.thelonedevil.BloodArmor.Items.diamond.AlienDiamondChestplate;
import com.github.thelonedevil.BloodArmor.Items.diamond.AlienDiamondHelmet;
import com.github.thelonedevil.BloodArmor.Items.diamond.AlienDiamondLeggings;
import com.github.thelonedevil.BloodArmor.Items.diamond.BloodDiamondBoots;
import com.github.thelonedevil.BloodArmor.Items.diamond.BloodDiamondChestplate;
import com.github.thelonedevil.BloodArmor.Items.diamond.BloodDiamondHelmet;
import com.github.thelonedevil.BloodArmor.Items.diamond.BloodDiamondLeggings;
import com.github.thelonedevil.BloodArmor.Items.diamond.CamoDiamondBoots;
import com.github.thelonedevil.BloodArmor.Items.diamond.CamoDiamondChestplate;
import com.github.thelonedevil.BloodArmor.Items.diamond.CamoDiamondHelmet;
import com.github.thelonedevil.BloodArmor.Items.diamond.CamoDiamondLeggings;
import com.github.thelonedevil.BloodArmor.Items.gold.AlienGoldBoots;
import com.github.thelonedevil.BloodArmor.Items.gold.AlienGoldChestplate;
import com.github.thelonedevil.BloodArmor.Items.gold.AlienGoldHelmet;
import com.github.thelonedevil.BloodArmor.Items.gold.AlienGoldLeggings;
import com.github.thelonedevil.BloodArmor.Items.gold.BloodGoldBoots;
import com.github.thelonedevil.BloodArmor.Items.gold.BloodGoldChestplate;
import com.github.thelonedevil.BloodArmor.Items.gold.BloodGoldHelmet;
import com.github.thelonedevil.BloodArmor.Items.gold.BloodGoldLeggings;
import com.github.thelonedevil.BloodArmor.Items.gold.CamoGoldBoots;
import com.github.thelonedevil.BloodArmor.Items.gold.CamoGoldChestplate;
import com.github.thelonedevil.BloodArmor.Items.gold.CamoGoldHelmet;
import com.github.thelonedevil.BloodArmor.Items.gold.CamoGoldLeggings;
import com.github.thelonedevil.BloodArmor.Items.iron.AlienIronBoots;
import com.github.thelonedevil.BloodArmor.Items.iron.AlienIronChestplate;
import com.github.thelonedevil.BloodArmor.Items.iron.AlienIronHelmet;
import com.github.thelonedevil.BloodArmor.Items.iron.AlienIronLeggings;
import com.github.thelonedevil.BloodArmor.Items.iron.BloodIronBoots;
import com.github.thelonedevil.BloodArmor.Items.iron.BloodIronChestplate;
import com.github.thelonedevil.BloodArmor.Items.iron.BloodIronHelmet;
import com.github.thelonedevil.BloodArmor.Items.iron.BloodIronLeggings;
import com.github.thelonedevil.BloodArmor.Items.iron.CamoIronBoots;
import com.github.thelonedevil.BloodArmor.Items.iron.CamoIronChestplate;
import com.github.thelonedevil.BloodArmor.Items.iron.CamoIronHelmet;
import com.github.thelonedevil.BloodArmor.Items.iron.CamoIronLeggings;
import com.github.thelonedevil.BloodArmor.Items.swords.AlienDiamondSword;
import com.github.thelonedevil.BloodArmor.Items.swords.BloodDiamondSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class MyItems {
	public static Item bloodCrystal;
	
	public static Item bloodLeatherHelmet;
	public static Item bloodLeatherChestplate;
	public static Item bloodLeatherLeggings;
	public static Item bloodLeatherBoots;
	
	public static Item bloodIronHelmet;
	public static Item bloodIronChestplate;
	public static Item bloodIronLeggings;
	public static Item bloodIronBoots;
	
	public static Item bloodGoldHelmet;
	public static Item bloodGoldChestplate;
	public static Item bloodGoldLeggings;
	public static Item bloodGoldBoots;
	
	public static Item bloodDiamondHelmet;
	public static Item bloodDiamondChestplate;
	public static Item bloodDiamondLeggings;
	public static Item bloodDiamondBoots;
	
	public static Item bloodChainHelmet;
	public static Item bloodChainChestplate;
	public static Item bloodChainLeggings;
	public static Item bloodChainBoots;
	
	public static Item alienLeatherHelmet;
	public static Item alienLeatherChestplate;
	public static Item alienLeatherLeggings;
	public static Item alienLeatherBoots;
	
	public static Item alienIronHelmet;
	public static Item alienIronChestplate;
	public static Item alienIronLeggings;
	public static Item alienIronBoots;
	
	public static Item alienGoldHelmet;
	public static Item alienGoldChestplate;
	public static Item alienGoldLeggings;
	public static Item alienGoldBoots;
	
	public static Item alienDiamondHelmet;
	public static Item alienDiamondChestplate;
	public static Item alienDiamondLeggings;
	public static Item alienDiamondBoots;
	
	public static Item alienChainHelmet;
	public static Item alienChainChestplate;
	public static Item alienChainLeggings;
	public static Item alienChainBoots;
	
	public static Item camoDiamondHelmet;
	public static Item camoDiamondChestplate;
	public static Item camoDiamondLeggings;
	public static Item camoDiamondBoots;
	
	public static Item camoChainHelmet;
	public static Item camoChainChestplate;
	public static Item camoChainLeggings;
	public static Item camoChainBoots;
	
	public static Item camoGoldHelmet;
	public static Item camoGoldChestplate;
	public static Item camoGoldLeggings;
	public static Item camoGoldBoots;
	
	public static Item camoIronHelmet;
	public static Item camoIronChestplate;
	public static Item camoIronLeggings;
	public static Item camoIronBoots;
	
	public static Item test;
	
	public static Item bloodDiamondSword;
	public static Item alienDiamondSword;
	
	private static int e = 40;
	
	public static ToolMaterial bloodDiamondTool = EnumHelper.addToolMaterial("BloodDiamond", 4, 2000, 4.0f, 15.0f, e);
	public static ToolMaterial alienDiamondTool = EnumHelper.addToolMaterial("BloodDiamond", 4, 2000, 4.0f, 20.0f, e);
	
	public static ArmorMaterial bloodDiamond = EnumHelper.addArmorMaterial("BloodDiamond", 66, new int[]{7,12,10,7}, e);
	public static ArmorMaterial bloodLeather = EnumHelper.addArmorMaterial("BloodLeather", 66, new int[]{5,7,6,5}, e);
	public static ArmorMaterial bloodGold = EnumHelper.addArmorMaterial("BloodGold", 66, new int[]{6,9,7,5}, e);
	public static ArmorMaterial bloodIron = EnumHelper.addArmorMaterial("BloodIron", 66, new int[]{6,10,9,6}, e);
	public static ArmorMaterial bloodChain = EnumHelper.addArmorMaterial("BloodChain", 66, new int[]{6,9,8,5}, e);
	
	public static ArmorMaterial alienDiamond = EnumHelper.addArmorMaterial("AlienDiamond", 66, new int[]{9,14,12,9}, e);
	public static ArmorMaterial alienLeather = EnumHelper.addArmorMaterial("AlienLeather", 66, new int[]{7,9,8,7}, e);
	public static ArmorMaterial alienGold = EnumHelper.addArmorMaterial("AlienGold", 66, new int[]{8,11,9,7}, e);
	public static ArmorMaterial alienIron = EnumHelper.addArmorMaterial("AlienIron", 66, new int[]{8,13,11,8}, e);
	public static ArmorMaterial alienChain = EnumHelper.addArmorMaterial("AlienChain", 66, new int[]{8,11,10,7}, e);
	
	public static ArmorMaterial camoDiamond = EnumHelper.addArmorMaterial("CamoDiamond", 66, new int[]{9,14,12,9}, e);
	public static ArmorMaterial camoLeather = EnumHelper.addArmorMaterial("CamoLeather", 66, new int[]{7,9,8,7}, e);
	public static ArmorMaterial camoGold = EnumHelper.addArmorMaterial("CamoGold", 66, new int[]{8,11,9,7}, e);
	public static ArmorMaterial camoIron = EnumHelper.addArmorMaterial("CamoIron", 66, new int[]{8,13,11,8}, e);
	public static ArmorMaterial camoChain = EnumHelper.addArmorMaterial("CamoChain", 66, new int[]{8,11,10,7}, e);

	public static Item alienBloodCrystal;
	public static Item camoTransfer;
	
	public static void init(){
		BloodCrystal();
		//CamoTransfer();
		BloodArmor();
		AlienArmor();
		BloodSwords();
		AlienSwords();
		//CamoArmor();
		//test();
		
	}
	static void test(){
		
	
	}
	static void BloodCrystal(){
		bloodCrystal = new Item().setUnlocalizedName("bloodcrystal").setTextureName("bloodarmor:bloodcrystal").setCreativeTab(BloodArmor.myTab).setMaxStackSize(64);
		GameRegistry.registerItem(bloodCrystal, "bloodcrystal");
		OreDictionary.registerOre("gemBlood", bloodCrystal);
		alienBloodCrystal = new Item().setUnlocalizedName("alienbloodcrystal").setTextureName("bloodarmor:alienbloodcrystal").setCreativeTab(BloodArmor.myTab).setMaxStackSize(8);
		GameRegistry.registerItem(alienBloodCrystal, "alienbloodcrystal");
		OreDictionary.registerOre("gemAlienBlood", alienBloodCrystal);
	}
	static void BloodSwords(){
		bloodDiamondSword = new BloodDiamondSword(bloodDiamondTool).setUnlocalizedName("blooddiamondsword").setCreativeTab(BloodArmor.myTab);
		GameRegistry.registerItem(bloodDiamondSword, "blooddiamondsword");
	}
	
	static void AlienSwords(){
		alienDiamondSword = new AlienDiamondSword(alienDiamondTool).setUnlocalizedName("aliendiamondsword").setCreativeTab(BloodArmor.myTab);
		GameRegistry.registerItem(alienDiamondSword, "aliendiamondsword");
		
	}
	static void BloodArmor(){
	/*	int renderl = TestMod.proxy.addArmor("bloodLeather");
		bloodLeatherHelmet = new BloodLeatherHelmet(bloodLeather, renderl, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodLeatherhelmet");
		bloodLeatherChestplate = new BloodLeatherChestplate(bloodLeather, renderl, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodLeatherchestplate");
		bloodLeatherLeggings = new BloodLeatherLeggings(bloodLeather, renderl, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodLeatherleggings");
		bloodLeatherBoots = new BloodLeatherBoots(bloodLeather, renderl, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodLeatherboots");
		*/
		int renderg = BloodArmor.proxy.addArmor("bloodGold");
		bloodGoldHelmet = new BloodGoldHelmet(bloodGold, renderg, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodGoldhelmet");
		bloodGoldChestplate = new BloodGoldChestplate(bloodGold, renderg, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodGoldchestplate");
		bloodGoldLeggings = new BloodGoldLeggings(bloodGold, renderg, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodGoldleggings");
		bloodGoldBoots = new BloodGoldBoots(bloodGold, renderg, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodGoldboots");
	
		int renderi = BloodArmor.proxy.addArmor("bloodIron");
		bloodIronHelmet = new BloodIronHelmet(bloodIron, renderi, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodIronhelmet");
		bloodIronChestplate = new BloodIronChestplate(bloodIron, renderi, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodIronchestplate");
		bloodIronLeggings = new BloodIronLeggings(bloodIron, renderi, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodIronleggings");
		bloodIronBoots = new BloodIronBoots(bloodIron, renderi, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodIronboots");
		
		int renderc = BloodArmor.proxy.addArmor("bloodChain");
		bloodChainHelmet = new BloodChainHelmet(bloodChain, renderc, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodChainhelmet");
		bloodChainChestplate = new BloodChainChestplate(bloodChain, renderc, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodChainchestplate");
		bloodChainLeggings = new BloodChainLeggings(bloodChain, renderc, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodChainleggings");
		bloodChainBoots = new BloodChainBoots(bloodChain, renderc, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("bloodChainboots");
		
		int renderd = BloodArmor.proxy.addArmor("bloodDiamond");
		bloodDiamondHelmet = new BloodDiamondHelmet(bloodDiamond, renderd, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("blooddiamondhelmet");
		bloodDiamondChestplate = new BloodDiamondChestplate(bloodDiamond, renderd, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("blooddiamondchestplate");
		bloodDiamondLeggings = new BloodDiamondLeggings(bloodDiamond, renderd, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("blooddiamondleggings");
		bloodDiamondBoots = new BloodDiamondBoots(bloodDiamond, renderd, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("blooddiamondboots");
		
		GameRegistry.registerItem(bloodDiamondHelmet, "blooddiamondhelmet");
		GameRegistry.registerItem(bloodDiamondChestplate, "blooddiamondchestplate");
		GameRegistry.registerItem(bloodDiamondLeggings, "blooddiamondleggings");
		GameRegistry.registerItem(bloodDiamondBoots, "blooddiamondboots");
		
		/*GameRegistry.registerItem(bloodLeatherHelmet, "bloodleatherhelmet");
		GameRegistry.registerItem(bloodLeatherChestplate, "bloodleatherchestplate");
		GameRegistry.registerItem(bloodLeatherLeggings, "bloodleatherleggings");
		GameRegistry.registerItem(bloodLeatherBoots, "bloodleatherboots");*/
		
		GameRegistry.registerItem(bloodGoldHelmet, "bloodgoldhelmet");
		GameRegistry.registerItem(bloodGoldChestplate, "bloodgoldchestplate");
		GameRegistry.registerItem(bloodGoldLeggings, "bloodgoldleggings");
		GameRegistry.registerItem(bloodGoldBoots, "bloodgoldboots");
		
		GameRegistry.registerItem(bloodChainHelmet, "bloodchainhelmet");
		GameRegistry.registerItem(bloodChainChestplate, "bloodchainchestplate");
		GameRegistry.registerItem(bloodChainLeggings, "bloodchainleggings");
		GameRegistry.registerItem(bloodChainBoots, "bloodchainboots");
		
		GameRegistry.registerItem(bloodIronHelmet, "bloodironhelmet");
		GameRegistry.registerItem(bloodIronChestplate, "bloodironchestplate");
		GameRegistry.registerItem(bloodIronLeggings, "bloodironleggings");
		GameRegistry.registerItem(bloodIronBoots, "bloodironboots");
		
	}
	static void AlienArmor(){
	/*	int renderl = TestMod.proxy.addArmor("alienLeather");
		alienLeatherHelmet = new AlienLeatherHelmet(alienLeather, renderl, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienLeatherhelmet");
		alienLeatherChestplate = new AlienLeatherChestplate(alienLeather, renderl, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienLeatherchestplate");
		alienLeatherLeggings = new AlienLeatherLeggings(alienLeather, renderl, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienLeatherleggings");
		alienLeatherBoots = new AlienLeatherBoots(alienLeather, renderl, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienLeatherboots");
		*/
		int renderg = BloodArmor.proxy.addArmor("alienGold");
		alienGoldHelmet = new AlienGoldHelmet(alienGold, renderg, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienGoldhelmet");
		alienGoldChestplate = new AlienGoldChestplate(alienGold, renderg, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienGoldchestplate");
		alienGoldLeggings = new AlienGoldLeggings(alienGold, renderg, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienGoldleggings");
		alienGoldBoots = new AlienGoldBoots(alienGold, renderg, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienGoldboots");
	
		int renderi = BloodArmor.proxy.addArmor("alienIron");
		alienIronHelmet = new AlienIronHelmet(alienIron, renderi, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienIronhelmet");
		alienIronChestplate = new AlienIronChestplate(alienIron, renderi, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienIronchestplate");
		alienIronLeggings = new AlienIronLeggings(alienIron, renderi, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienIronleggings");
		alienIronBoots = new AlienIronBoots(alienIron, renderi, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienIronboots");
		
		int renderc = BloodArmor.proxy.addArmor("alienChain");
		alienChainHelmet = new AlienChainHelmet(alienChain, renderc, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienChainhelmet");
		alienChainChestplate = new AlienChainChestplate(alienChain, renderc, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienChainchestplate");
		alienChainLeggings = new AlienChainLeggings(alienChain, renderc, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienChainleggings");
		alienChainBoots = new AlienChainBoots(alienChain, renderc, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("alienChainboots");
		
		int renderd = BloodArmor.proxy.addArmor("alienDiamond");
		alienDiamondHelmet = new AlienDiamondHelmet(alienDiamond, renderd, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("aliendiamondhelmet");
		alienDiamondChestplate = new AlienDiamondChestplate(alienDiamond, renderd, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("aliendiamondchestplate");
		alienDiamondLeggings = new AlienDiamondLeggings(alienDiamond, renderd, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("aliendiamondleggings");
		alienDiamondBoots = new AlienDiamondBoots(alienDiamond, renderd, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("aliendiamondboots");
		
		GameRegistry.registerItem(alienDiamondHelmet, "aliendiamondhelmet");
		GameRegistry.registerItem(alienDiamondChestplate, "aliendiamondchestplate");
		GameRegistry.registerItem(alienDiamondLeggings, "aliendiamondleggings");
		GameRegistry.registerItem(alienDiamondBoots, "aliendiamondboots");
		/*
		GameRegistry.registerItem(alienLeatherHelmet, "alienleatherhelmet");
		GameRegistry.registerItem(alienLeatherChestplate, "alienleatherchestplate");
		GameRegistry.registerItem(alienLeatherLeggings, "alienleatherleggings");
		GameRegistry.registerItem(alienLeatherBoots, "alienleatherboots");*/
		
		GameRegistry.registerItem(alienGoldHelmet, "aliengoldhelmet");
		GameRegistry.registerItem(alienGoldChestplate, "aliengoldchestplate");
		GameRegistry.registerItem(alienGoldLeggings, "aliengoldleggings");
		GameRegistry.registerItem(alienGoldBoots, "aliengoldboots");
		
		GameRegistry.registerItem(alienChainHelmet, "alienchainhelmet");
		GameRegistry.registerItem(alienChainChestplate, "alienchainchestplate");
		GameRegistry.registerItem(alienChainLeggings, "alienchainleggings");
		GameRegistry.registerItem(alienChainBoots, "alienchainboots");
		
		GameRegistry.registerItem(alienIronHelmet, "alienironhelmet");
		GameRegistry.registerItem(alienIronChestplate, "alienironchestplate");
		GameRegistry.registerItem(alienIronLeggings, "alienironleggings");
		GameRegistry.registerItem(alienIronBoots, "alienironboots");
		
	}
	static void CamoArmor(){
	/*	int renderl = TestMod.proxy.addArmor("camoLeather");
		camoLeatherHelmet = new CamoLeatherHelmet(camoLeather, renderl, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("camoLeatherhelmet");
		camoLeatherChestplate = new CamoLeatherChestplate(camoLeather, renderl, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("camoLeatherchestplate");
		camoLeatherLeggings = new CamoLeatherLeggings(camoLeather, renderl, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("camoLeatherleggings");
		camoLeatherBoots = new CamoLeatherBoots(camoLeather, renderl, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("camoLeatherboots");
		*/
		int renderg = BloodArmor.proxy.addArmor("camoGold");
		camoGoldHelmet = new CamoGoldHelmet(camoGold, renderg, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoGoldhelmet");
		camoGoldChestplate = new CamoGoldChestplate(camoGold, renderg, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoGoldchestplate");
		camoGoldLeggings = new CamoGoldLeggings(camoGold, renderg, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoGoldleggings");
		camoGoldBoots = new CamoGoldBoots(camoGold, renderg, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoGoldboots");
	
		int renderi = BloodArmor.proxy.addArmor("camoIron");
		camoIronHelmet = new CamoIronHelmet(camoIron, renderi, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoIronhelmet");
		camoIronChestplate = new CamoIronChestplate(camoIron, renderi, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoIronchestplate");
		camoIronLeggings = new CamoIronLeggings(camoIron, renderi, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoIronleggings");
		camoIronBoots = new CamoIronBoots(camoIron, renderi, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoIronboots");
		
		int renderc = BloodArmor.proxy.addArmor("camoDiamond");
		camoChainHelmet = new CamoChainHelmet(camoChain, renderc, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoChainhelmet");
		camoChainChestplate = new CamoChainChestplate(camoChain, renderc, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoChainchestplate");
		camoChainLeggings = new CamoChainLeggings(camoChain, renderc, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoChainleggings");
		camoChainBoots = new CamoChainBoots(camoChain, renderc, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camoChainboots");
		
		int renderd = BloodArmor.proxy.addArmor("camoDiamond");
		camoDiamondHelmet = new CamoDiamondHelmet(camoDiamond, renderd, 0).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camodiamondhelmet");
		camoDiamondChestplate = new CamoDiamondChestplate(camoDiamond, renderd, 1).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camodiamondchestplate");
		camoDiamondLeggings = new CamoDiamondLeggings(camoDiamond, renderd, 2).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camodiamondleggings");
		camoDiamondBoots = new CamoDiamondBoots(camoDiamond, renderd, 3).setCreativeTab(BloodArmor.myTab).setUnlocalizedName("camodiamondboots");
		
		GameRegistry.registerItem(camoDiamondHelmet, "camodiamondhelmet");
		GameRegistry.registerItem(camoDiamondChestplate, "camodiamondchestplate");
		GameRegistry.registerItem(camoDiamondLeggings, "camodiamondleggings");
		GameRegistry.registerItem(camoDiamondBoots, "camodiamondboots");
		/*
		GameRegistry.registerItem(camoLeatherHelmet, "camoleatherhelmet");
		GameRegistry.registerItem(camoLeatherChestplate, "camoleatherchestplate");
		GameRegistry.registerItem(camoLeatherLeggings, "camoleatherleggings");
		GameRegistry.registerItem(camoLeatherBoots, "camoleatherboots");*/
		
		GameRegistry.registerItem(camoGoldHelmet, "camogoldhelmet");
		GameRegistry.registerItem(camoGoldChestplate, "camogoldchestplate");
		GameRegistry.registerItem(camoGoldLeggings, "camogoldleggings");
		GameRegistry.registerItem(camoGoldBoots, "camogoldboots");
		
		GameRegistry.registerItem(camoChainHelmet, "camochainhelmet");
		GameRegistry.registerItem(camoChainChestplate, "camochainchestplate");
		GameRegistry.registerItem(camoChainLeggings, "camochainleggings");
		GameRegistry.registerItem(camoChainBoots, "camochainboots");
		
		GameRegistry.registerItem(camoIronHelmet, "camoironhelmet");
		GameRegistry.registerItem(camoIronChestplate, "camoironchestplate");
		GameRegistry.registerItem(camoIronLeggings, "camoironleggings");
		GameRegistry.registerItem(camoIronBoots, "camoironboots");
		
	}
	
	static void CamoTransfer(){
		camoTransfer = new Item().setUnlocalizedName("camotransfer").setTextureName("minecraft:skull").setCreativeTab(BloodArmor.myTab);
		GameRegistry.registerItem(camoTransfer, "camotransfer");
	}
}
