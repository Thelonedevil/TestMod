package com.github.thelonedevil.TestMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.github.thelonedevil.TestMod.Blocks.MyBlocks;
import com.github.thelonedevil.TestMod.Items.MyItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class MyRecipes {

	public static void init() {
		/*
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodDiamondHelmet), MyItems.bloodCrystal, Items.diamond_helmet);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodDiamondChestplate), MyItems.bloodCrystal, Items.diamond_chestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodDiamondLeggings), MyItems.bloodCrystal, Items.diamond_leggings);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodDiamondBoots), MyItems.bloodCrystal, Items.diamond_boots);
		
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienDiamondHelmet), MyItems.alienBloodCrystal, MyItems.bloodDiamondHelmet);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienDiamondChestplate), MyItems.alienBloodCrystal, MyItems.bloodDiamondChestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienDiamondLeggings), MyItems.alienBloodCrystal, MyItems.bloodDiamondLeggings);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienDiamondBoots), MyItems.alienBloodCrystal, MyItems.bloodDiamondBoots);
		
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodIronHelmet), MyItems.bloodCrystal, Items.iron_helmet);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodIronChestplate), MyItems.bloodCrystal, Items.iron_chestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodIronLeggings), MyItems.bloodCrystal, Items.iron_leggings);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodIronBoots), MyItems.bloodCrystal, Items.iron_boots);
		
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienIronHelmet), MyItems.alienBloodCrystal, MyItems.bloodIronHelmet);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienIronChestplate), MyItems.alienBloodCrystal, MyItems.bloodIronChestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienIronLeggings), MyItems.alienBloodCrystal, MyItems.bloodIronLeggings);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienIronBoots), MyItems.alienBloodCrystal, MyItems.bloodIronBoots);
		
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodChainHelmet), MyItems.bloodCrystal, Items.chainmail_helmet);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodChainChestplate), MyItems.bloodCrystal, Items.chainmail_chestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodChainLeggings), MyItems.bloodCrystal, Items.chainmail_leggings);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodChainBoots), MyItems.bloodCrystal, Items.chainmail_boots);
		
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienChainHelmet), MyItems.alienBloodCrystal, MyItems.bloodChainHelmet);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienChainChestplate), MyItems.alienBloodCrystal, MyItems.bloodChainChestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienChainLeggings), MyItems.alienBloodCrystal, MyItems.bloodChainLeggings);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienChainBoots), MyItems.alienBloodCrystal, MyItems.bloodChainBoots);
		
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodGoldHelmet), MyItems.bloodCrystal, Items.golden_helmet);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodGoldChestplate), MyItems.bloodCrystal, Items.golden_chestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodGoldLeggings), MyItems.bloodCrystal, Items.golden_leggings);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodGoldBoots), MyItems.bloodCrystal, Items.golden_boots);
		
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienGoldHelmet), MyItems.alienBloodCrystal, MyItems.bloodGoldHelmet);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienGoldChestplate), MyItems.alienBloodCrystal, MyItems.bloodGoldChestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienGoldLeggings), MyItems.alienBloodCrystal, MyItems.bloodGoldLeggings);
		GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienGoldBoots), MyItems.alienBloodCrystal, MyItems.bloodGoldBoots);*/
		
		//GameRegistry.addShapelessRecipe(new ItemStack(MyItems.bloodDiamondSword), MyItems.bloodCrystal, Items.diamond_sword);
		//GameRegistry.addShapelessRecipe(new ItemStack(MyItems.alienDiamondSword), MyItems.alienBloodCrystal, MyItems.bloodDiamondSword);
		
		//blood diamond
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodDiamondHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.diamond_helmet});
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodDiamondChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.diamond_chestplate});
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodDiamondLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.diamond_leggings});
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodDiamondBoots), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.diamond_boots});
		
		//alien blood diamond
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodDiamondHelmet});
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodDiamondChestplate});
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodDiamondLeggings});
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondBoots), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodDiamondBoots});
		
		//alien upgrades
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienIronHelmet});
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienIronChestplate});
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienIronLeggings});
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondBoots), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienIronBoots});
		
		
		
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodDiamondSword), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.diamond_sword});
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondSword), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodDiamondSword});
		
		GameRegistry.addRecipe(new ItemStack(MyBlocks.bloodblock), new Object[] { "AAA", "AAA", "AAA", 'A', MyItems.bloodCrystal});
		
		GameRegistry.addSmelting(MyBlocks.bloodOre, new ItemStack(MyItems.bloodCrystal), 3.0f);
		/*ItemStack playerhead =  new ItemStack(Items.skull,1,3);
		GameRegistry.addRecipe(new ItemStack(MyItems.camoTransfer, 4), new Object[]{" A ","ABA"," A ",'A',MyItems.bloodCrystal, 'B',playerhead });*/
	}
}
