package com.github.thelonedevil.BloodArmor.Items.diamond;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import org.apache.commons.io.FileUtils;

import com.github.thelonedevil.BloodArmor.BloodArmor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CamoDiamondChestplate extends ItemArmor {

	public CamoDiamondChestplate(ArmorMaterial material_, int p_i45325_2_, int p_i45325_3_) {
		super(material_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon) {
		this.itemIcon = icon.registerIcon("testmod:camodiamondchestplate");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		String camo;

		if (stack.hasTagCompound()) {
			camo = stack.getTagCompound().getString("SkullOwner");
			try {
				File input = new File(BloodArmor.getModsFolder(), "/TestMod/textures/models/armor/" + camo + ".png");

				if (input.exists()) {
					return "testmod:" + camo + ".png";
				}
				URL skin = new URL("http://s3.amazonaws.com/MinecraftSkins/" + camo + ".png");
				FileUtils.copyURLToFile(skin, input, 1000, 1000);
				return "testmod:" + camo + ".png";

			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			camo = "";
		}
		return null;

	}
}
