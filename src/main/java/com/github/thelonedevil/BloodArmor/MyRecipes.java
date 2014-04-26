package com.github.thelonedevil.BloodArmor;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.github.thelonedevil.BloodArmor.Blocks.MyBlocks;
import com.github.thelonedevil.BloodArmor.Items.MyItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class MyRecipes {

	public static void init() {

		// blood diamond
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodDiamondHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.diamond_helmet });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodDiamondChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.diamond_chestplate });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodDiamondLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.diamond_leggings });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodDiamondBoots), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.diamond_boots });

		// alien blood diamond
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodDiamondHelmet });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodDiamondChestplate });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodDiamondLeggings });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondBoots), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodDiamondBoots });

		// blood iron
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodIronHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.iron_helmet });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodIronChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.iron_chestplate });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodIronLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.iron_leggings });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodIronBoots), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.iron_boots });

		// alien blood iron
		GameRegistry.addRecipe(new ItemStack(MyItems.alienIronHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodIronHelmet });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienIronChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodIronChestplate });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienIronLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodIronLeggings });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienIronBoots), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodIronBoots });

		// blood chainmail
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodChainHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.chainmail_helmet });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodChainChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.chainmail_chestplate });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodChainLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.chainmail_leggings });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodChainBoots), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.chainmail_boots });

		// alien blood chainmail
		GameRegistry.addRecipe(new ItemStack(MyItems.alienChainHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodChainHelmet });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienChainChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodChainChestplate });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienChainLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodChainLeggings });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienChainBoots), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodChainBoots });

		// blood golden
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodGoldHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.golden_helmet });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodGoldChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.golden_chestplate });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodGoldLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.golden_leggings });
		GameRegistry.addRecipe(new ItemStack(MyItems.bloodGoldBoots), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.golden_boots });

		// alien blood golden
		GameRegistry.addRecipe(new ItemStack(MyItems.alienGoldHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodGoldHelmet });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienGoldChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodGoldChestplate });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienGoldLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodGoldLeggings });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienGoldBoots), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodGoldBoots });

		// alien upgrades
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienIronHelmet });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienIronChestplate });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienIronLeggings });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondBoots), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienIronBoots });

		GameRegistry.addRecipe(new ItemStack(MyItems.alienIronHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', Items.iron_ingot, 'B', MyItems.alienChainHelmet });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienIronChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', Items.iron_ingot, 'B', MyItems.alienChainChestplate });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienIronLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', Items.iron_ingot, 'B', MyItems.alienChainLeggings });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienIronBoots), new Object[] { "AAA", "ABA", "AAA", 'A', Items.iron_ingot, 'B', MyItems.alienChainBoots });

		GameRegistry.addRecipe(new ItemStack(MyItems.alienChainHelmet), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienGoldHelmet });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienChainChestplate), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienGoldChestplate });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienChainLeggings), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienGoldLeggings });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienChainBoots), new Object[] { "AAA", "ABA", "AAA", 'A', Items.diamond, 'B', MyItems.alienGoldBoots });

		GameRegistry.addRecipe(new ItemStack(MyItems.bloodDiamondSword), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.bloodCrystal, 'B', Items.diamond_sword });
		GameRegistry.addRecipe(new ItemStack(MyItems.alienDiamondSword), new Object[] { "AAA", "ABA", "AAA", 'A', MyItems.alienBloodCrystal, 'B', MyItems.bloodDiamondSword });

		GameRegistry.addRecipe(new ItemStack(MyBlocks.bloodblock), new Object[] { "AAA", "AAA", "AAA", 'A', MyItems.bloodCrystal });

		GameRegistry.addSmelting(MyBlocks.bloodOre, new ItemStack(MyItems.bloodCrystal), 3.0f);

		ItemStack playerhead = new ItemStack(Items.skull, 1, 3);
		/*
		 * NBTTagCompound tag = new NBTTagCompound(); tag.setString("", "");
		 * playerhead.setTagCompound(tag);
		 */
		//GameRegistry.addRecipe(new ItemStack(MyItems.camoTransfer, 4), new Object[] { " A ", "ABA", " A ", 'A', MyItems.bloodCrystal, 'B', playerhead });
	//	GameRegistry.addRecipe(new ItemStack(MyItems.camoDiamondChestplate), new Object[]{"A  ","B  ","   ",'A',MyItems.camoTransfer, 'B',MyItems.alienDiamondChestplate});
		// Extra-Terrestrial and Terrestrial blood soaked diamond covered iron
		// covered chain covered golden armour of camouflage
	}
}
