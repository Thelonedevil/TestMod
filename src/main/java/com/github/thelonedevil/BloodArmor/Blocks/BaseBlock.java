package com.github.thelonedevil.BloodArmor.Blocks;

import java.util.Random;

import com.github.thelonedevil.BloodArmor.Items.MyItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BaseBlock extends Block {
	private Item drop;

	public BaseBlock(Material material, Item item) {
		super(material);
		drop = item;
	}
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		if(drop.equals(MyItems.bloodCrystal) && random.nextInt(40) == 1){
			return MyItems.alienBloodCrystal;
		}/*else if(drop.equals(MyItems.bloodCrystal) && random.nextInt(8192) == 1){
			return MyItems.SuperAwesomeSuprise;
		}*/
		else return drop;
	}
}