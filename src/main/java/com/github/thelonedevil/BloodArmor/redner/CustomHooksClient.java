package com.github.thelonedevil.BloodArmor.redner;

import com.github.thelonedevil.BloodArmor.Items.CustomItemArmor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class CustomHooksClient {
	public static String getArmorTexture(Entity entity, ItemStack armor, String _default, int slot, String type) {
		String result = null;
		if(armor.getItem()instanceof CustomItemArmor){
			
		}else{
		 result = armor.getItem().getArmorTexture(armor, entity, slot, type);
		}
		return result != null ? result : _default;
	}
}
