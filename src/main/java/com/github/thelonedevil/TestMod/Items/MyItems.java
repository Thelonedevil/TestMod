package com.github.thelonedevil.TestMod.Items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import com.github.thelonedevil.TestMod.TestMod;
import com.github.thelonedevil.TestMod.Items.chain.BloodChainBoots;
import com.github.thelonedevil.TestMod.Items.chain.BloodChainChestplate;
import com.github.thelonedevil.TestMod.Items.chain.BloodChainHelmet;
import com.github.thelonedevil.TestMod.Items.chain.BloodChainLeggings;
import com.github.thelonedevil.TestMod.Items.diamond.BloodDiamondBoots;
import com.github.thelonedevil.TestMod.Items.diamond.BloodDiamondChestplate;
import com.github.thelonedevil.TestMod.Items.diamond.BloodDiamondHelmet;
import com.github.thelonedevil.TestMod.Items.diamond.BloodDiamondLeggings;
import com.github.thelonedevil.TestMod.Items.gold.BloodGoldBoots;
import com.github.thelonedevil.TestMod.Items.gold.BloodGoldChestplate;
import com.github.thelonedevil.TestMod.Items.gold.BloodGoldHelmet;
import com.github.thelonedevil.TestMod.Items.gold.BloodGoldLeggings;
import com.github.thelonedevil.TestMod.Items.iron.BloodIronBoots;
import com.github.thelonedevil.TestMod.Items.iron.BloodIronChestplate;
import com.github.thelonedevil.TestMod.Items.iron.BloodIronHelmet;
import com.github.thelonedevil.TestMod.Items.iron.BloodIronLeggings;
import com.github.thelonedevil.TestMod.Items.leather.BloodLeatherBoots;
import com.github.thelonedevil.TestMod.Items.leather.BloodLeatherChestplate;
import com.github.thelonedevil.TestMod.Items.leather.BloodLeatherHelmet;
import com.github.thelonedevil.TestMod.Items.leather.BloodLeatherLeggings;
import com.github.thelonedevil.TestMod.Items.chain.AlienChainBoots;
import com.github.thelonedevil.TestMod.Items.chain.AlienChainChestplate;
import com.github.thelonedevil.TestMod.Items.chain.AlienChainHelmet;
import com.github.thelonedevil.TestMod.Items.chain.AlienChainLeggings;
import com.github.thelonedevil.TestMod.Items.diamond.AlienDiamondBoots;
import com.github.thelonedevil.TestMod.Items.diamond.AlienDiamondChestplate;
import com.github.thelonedevil.TestMod.Items.diamond.AlienDiamondHelmet;
import com.github.thelonedevil.TestMod.Items.diamond.AlienDiamondLeggings;
import com.github.thelonedevil.TestMod.Items.gold.AlienGoldBoots;
import com.github.thelonedevil.TestMod.Items.gold.AlienGoldChestplate;
import com.github.thelonedevil.TestMod.Items.gold.AlienGoldHelmet;
import com.github.thelonedevil.TestMod.Items.gold.AlienGoldLeggings;
import com.github.thelonedevil.TestMod.Items.iron.AlienIronBoots;
import com.github.thelonedevil.TestMod.Items.iron.AlienIronChestplate;
import com.github.thelonedevil.TestMod.Items.iron.AlienIronHelmet;
import com.github.thelonedevil.TestMod.Items.iron.AlienIronLeggings;
import com.github.thelonedevil.TestMod.Items.leather.AlienLeatherBoots;
import com.github.thelonedevil.TestMod.Items.leather.AlienLeatherChestplate;
import com.github.thelonedevil.TestMod.Items.leather.AlienLeatherHelmet;
import com.github.thelonedevil.TestMod.Items.leather.AlienLeatherLeggings;
import com.github.thelonedevil.TestMod.Items.swords.AlienDiamondSword;
import com.github.thelonedevil.TestMod.Items.swords.BloodDiamondSword;

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

	public static Item alienBloodCrystal;
	public static Item camoTransfer;
	
	public static void init(){
		BloodCrystal();
		//CamoTransfer();
		BloodArmor();
		AlienArmor();
		BloodSwords();
		AlienSwords();
		test();
		
	}
	static void test(){
		test=new Item().setUnlocalizedName("camodiamondchestplate").setCreativeTab(TestMod.myTab);
		GameRegistry.registerItem(test, "camodiamondchestplate");
		test=new Item().setUnlocalizedName("camogoldchestplate").setCreativeTab(TestMod.myTab);
		GameRegistry.registerItem(test, "camogoldchestplate");
		test=new Item().setUnlocalizedName("camoironchestplate").setCreativeTab(TestMod.myTab);
		GameRegistry.registerItem(test, "camoironchestplate");
		test=new Item().setUnlocalizedName("camoleatherchestplate").setCreativeTab(TestMod.myTab);
		GameRegistry.registerItem(test, "camodleatherchestplate");
		test=new Item().setUnlocalizedName("camochainchestplate").setCreativeTab(TestMod.myTab);
		GameRegistry.registerItem(test, "camochainchestplate");
		
	
	}
	static void BloodCrystal(){
		bloodCrystal = new Item().setUnlocalizedName("bloodcrystal").setTextureName("testmod:bloodcrystal").setCreativeTab(TestMod.myTab).setMaxStackSize(64);
		GameRegistry.registerItem(bloodCrystal, "bloodcrystal");
		OreDictionary.registerOre("gemBlood", bloodCrystal);
		alienBloodCrystal = new Item().setUnlocalizedName("alienbloodcrystal").setTextureName("testmod:alienbloodcrystal").setCreativeTab(TestMod.myTab).setMaxStackSize(8);
		GameRegistry.registerItem(alienBloodCrystal, "alienbloodcrystal");
		OreDictionary.registerOre("gemAlienBlood", alienBloodCrystal);
	}
	static void BloodSwords(){
		bloodDiamondSword = new BloodDiamondSword(bloodDiamondTool).setUnlocalizedName("blooddiamondsword").setCreativeTab(TestMod.myTab);
		GameRegistry.registerItem(bloodDiamondSword, "blooddiamondsword");
	}
	
	static void AlienSwords(){
		alienDiamondSword = new AlienDiamondSword(alienDiamondTool).setUnlocalizedName("aliendiamondsword").setCreativeTab(TestMod.myTab);
		GameRegistry.registerItem(alienDiamondSword, "aliendiamondsword");
		
	}
	static void BloodArmor(){
	/*	int renderl = TestMod.proxy.addArmor("bloodLeather");
		bloodLeatherHelmet = new BloodLeatherHelmet(bloodLeather, renderl, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodLeatherhelmet");
		bloodLeatherChestplate = new BloodLeatherChestplate(bloodLeather, renderl, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodLeatherchestplate");
		bloodLeatherLeggings = new BloodLeatherLeggings(bloodLeather, renderl, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodLeatherleggings");
		bloodLeatherBoots = new BloodLeatherBoots(bloodLeather, renderl, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodLeatherboots");
		*/
		int renderg = TestMod.proxy.addArmor("bloodGold");
		bloodGoldHelmet = new BloodGoldHelmet(bloodGold, renderg, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodGoldhelmet");
		bloodGoldChestplate = new BloodGoldChestplate(bloodGold, renderg, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodGoldchestplate");
		bloodGoldLeggings = new BloodGoldLeggings(bloodGold, renderg, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodGoldleggings");
		bloodGoldBoots = new BloodGoldBoots(bloodGold, renderg, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodGoldboots");
	
		int renderi = TestMod.proxy.addArmor("bloodIron");
		bloodIronHelmet = new BloodIronHelmet(bloodIron, renderi, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodIronhelmet");
		bloodIronChestplate = new BloodIronChestplate(bloodIron, renderi, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodIronchestplate");
		bloodIronLeggings = new BloodIronLeggings(bloodIron, renderi, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodIronleggings");
		bloodIronBoots = new BloodIronBoots(bloodIron, renderi, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodIronboots");
		
		int renderc = TestMod.proxy.addArmor("bloodDiamond");
		bloodChainHelmet = new BloodChainHelmet(bloodChain, renderc, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodChainhelmet");
		bloodChainChestplate = new BloodChainChestplate(bloodChain, renderc, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodChainchestplate");
		bloodChainLeggings = new BloodChainLeggings(bloodChain, renderc, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodChainleggings");
		bloodChainBoots = new BloodChainBoots(bloodChain, renderc, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("bloodChainboots");
		
		int renderd = TestMod.proxy.addArmor("bloodDiamond");
		bloodDiamondHelmet = new BloodDiamondHelmet(bloodDiamond, renderd, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("blooddiamondhelmet");
		bloodDiamondChestplate = new BloodDiamondChestplate(bloodDiamond, renderd, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("blooddiamondchestplate");
		bloodDiamondLeggings = new BloodDiamondLeggings(bloodDiamond, renderd, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("blooddiamondleggings");
		bloodDiamondBoots = new BloodDiamondBoots(bloodDiamond, renderd, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("blooddiamondboots");
		
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
		int renderg = TestMod.proxy.addArmor("alienGold");
		alienGoldHelmet = new AlienGoldHelmet(alienGold, renderg, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienGoldhelmet");
		alienGoldChestplate = new AlienGoldChestplate(alienGold, renderg, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienGoldchestplate");
		alienGoldLeggings = new AlienGoldLeggings(alienGold, renderg, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienGoldleggings");
		alienGoldBoots = new AlienGoldBoots(alienGold, renderg, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienGoldboots");
	
		int renderi = TestMod.proxy.addArmor("alienIron");
		alienIronHelmet = new AlienIronHelmet(alienIron, renderi, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienIronhelmet");
		alienIronChestplate = new AlienIronChestplate(alienIron, renderi, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienIronchestplate");
		alienIronLeggings = new AlienIronLeggings(alienIron, renderi, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienIronleggings");
		alienIronBoots = new AlienIronBoots(alienIron, renderi, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienIronboots");
		
		int renderc = TestMod.proxy.addArmor("alienDiamond");
		alienChainHelmet = new AlienChainHelmet(alienChain, renderc, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienChainhelmet");
		alienChainChestplate = new AlienChainChestplate(alienChain, renderc, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienChainchestplate");
		alienChainLeggings = new AlienChainLeggings(alienChain, renderc, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienChainleggings");
		alienChainBoots = new AlienChainBoots(alienChain, renderc, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("alienChainboots");
		
		int renderd = TestMod.proxy.addArmor("alienDiamond");
		alienDiamondHelmet = new AlienDiamondHelmet(alienDiamond, renderd, 0).setCreativeTab(TestMod.myTab).setUnlocalizedName("aliendiamondhelmet");
		alienDiamondChestplate = new AlienDiamondChestplate(alienDiamond, renderd, 1).setCreativeTab(TestMod.myTab).setUnlocalizedName("aliendiamondchestplate");
		alienDiamondLeggings = new AlienDiamondLeggings(alienDiamond, renderd, 2).setCreativeTab(TestMod.myTab).setUnlocalizedName("aliendiamondleggings");
		alienDiamondBoots = new AlienDiamondBoots(alienDiamond, renderd, 3).setCreativeTab(TestMod.myTab).setUnlocalizedName("aliendiamondboots");
		
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
	static void CamoTransfer(){
		camoTransfer = new Item().setUnlocalizedName("camotransfer").setTextureName("minecraft:skull").setCreativeTab(TestMod.myTab);
		GameRegistry.registerItem(camoTransfer, "camotransfer");
	}
}
