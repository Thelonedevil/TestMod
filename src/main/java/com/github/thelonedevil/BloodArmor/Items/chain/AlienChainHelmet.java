package com.github.thelonedevil.BloodArmor.Items.chain;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class AlienChainHelmet extends ItemArmor{

	public AlienChainHelmet(ArmorMaterial material_, int p_i45325_2_, int p_i45325_3_		) {
		super(material_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon){
		this.itemIcon = icon.registerIcon("bloodarmor:alienchainhelmet");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){

		return "bloodarmor:textures/models/armor/bloodDiamond_layer_1.png";
		
	}
}