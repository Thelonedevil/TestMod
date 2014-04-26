package com.github.thelonedevil.BloodArmor.Items.iron;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CamoIronHelmet extends ItemArmor{

	public CamoIronHelmet(ArmorMaterial material_, int p_i45325_2_, int p_i45325_3_		) {
		super(material_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon){
		this.itemIcon = icon.registerIcon("testmod:alienironhelmet");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){

		return "testmod:textures/models/armor/bloodDiamond_layer_1.png";
		
	}
}
