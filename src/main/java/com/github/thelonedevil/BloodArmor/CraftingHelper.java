package com.github.thelonedevil.BloodArmor;

import java.awt.Image;
import java.awt.image.BufferedImage;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;

public class CraftingHelper {

	/*public static int getSlot(IInventory inv, Item item) {
		for (int i = 0; i < 9; i++) {
			if (inv.getStackInSlot(i) != null) {
				if (inv.getStackInSlot(i).getItem() == item) {
					return i;
				}
			}
		}
		return 9;
	}*/
	public static BufferedImage getLayer1(BufferedImage skin){
	/*	BufferedImage layer1 = new BufferedImage(64, 32, BufferedImage.TYPE_INT_ARGB);
		BufferedImage hat;
		BufferedImage chest;
		BufferedImage boots;
		hat = skin.getSubimage(0, 0, 32, 16);
		//chest = skin.getSubimage(16, 16, w, h);
		//boots = skin.getSubimage(x, y, w, h);
		*/
		return skin;
	}
	
	public static BufferedImage getLayer2(BufferedImage skin){
		return skin;
	}
}
