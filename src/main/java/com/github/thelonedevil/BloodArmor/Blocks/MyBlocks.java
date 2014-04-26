package com.github.thelonedevil.BloodArmor.Blocks;

import com.github.thelonedevil.BloodArmor.BloodArmor;
import com.github.thelonedevil.BloodArmor.Items.MyItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class MyBlocks {

	public static Block bloodOre;
	public static Block bloodblock;
	public static void init(){
		BloodOre();
		BloodBlock();
	}
	public static void BloodOre(){
		bloodOre = new BaseBlock(Material.ground, MyItems.bloodCrystal).setHardness(30.0F).setStepSound(Block.soundTypeStone).setBlockName("bloodore").setCreativeTab(BloodArmor.myTab).setBlockTextureName("bloodarmor:bloodore");
		bloodOre.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(bloodOre, "bloodore");
		OreDictionary.registerOre("oreBlood", bloodOre);
		
	}
	
	public static void BloodBlock(){
		bloodblock = new BaseBlock(Material.ground, Item.getItemFromBlock(bloodblock)).setHardness(30.0F).setStepSound(Block.soundTypeStone).setBlockName("bloodblock").setCreativeTab(BloodArmor.myTab).setBlockTextureName("bloodarmor:bloodblock");
		bloodblock.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(bloodblock, "bloodblock");
	}
}
