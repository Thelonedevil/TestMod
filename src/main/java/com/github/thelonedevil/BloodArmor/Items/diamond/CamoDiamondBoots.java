package com.github.thelonedevil.BloodArmor.Items.diamond;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CamoDiamondBoots extends ItemArmor{

	public CamoDiamondBoots(ArmorMaterial material_, int p_i45325_2_, int p_i45325_3_		) {
		super(material_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon){
		this.itemIcon = icon.registerIcon("testmod:camodiamondboots");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		String camo  = stack.getTagCompound().getString("SkullOwner");
		
		return "testmod:textures/models/armor/"+camo+"camodiamond_layer_1.png";
		
	}
}
