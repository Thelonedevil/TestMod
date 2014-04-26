package com.github.thelonedevil.BloodArmor;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import net.minecraft.nbt.NBTTagCompound;

import com.github.thelonedevil.BloodArmor.Items.MyItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class CraftingHandler {

	@SubscribeEvent
	public void SomethingCrafted(ItemCraftedEvent event) {
		//System.out.println("crafting event happened here");
		// Crafted camo transfer and transfered to it from player head
		if (event.crafting.getItem().equals(MyItems.camoTransfer)) {
			 //System.out.println("camo transfer crafted");
			if (event.craftMatrix.getStackInSlot(4).getTagCompound() != null) {
			//	System.out.println(event.craftMatrix.getStackInSlot(4).getItem().getUnlocalizedName());
				String player = event.craftMatrix.getStackInSlot(4).getTagCompound().getString("SkullOwner");
				if (!player.isEmpty()) {
				//	 System.out.println("player=" + player);
					NBTTagCompound tag = new NBTTagCompound();
					tag.setString("SkullOwner", player);
				//	 System.out.println("CamoTransfer crafter player: " +
				//	player);
					event.crafting.setTagCompound(tag);
				//	 System.out.println("SkullOwner:"+event.crafting.getTagCompound().getString("SkullOwner"));
					event.crafting.setStackDisplayName(event.crafting.getDisplayName() + " (" + player + ")");
				}
			} else {
				// do thing to stop crafting
				NBTTagCompound tag = new NBTTagCompound();
				tag.setString("SkullOwner", "TheLoneDevil");

				event.crafting.setTagCompound(tag);
				event.crafting.setStackDisplayName(event.crafting.getDisplayName() + " (No Player)");
			}
		}
		if (event.crafting.getItem().equals(MyItems.camoDiamondChestplate) || event.crafting.getItem().equals(MyItems.camoDiamondHelmet)
				|| event.crafting.getItem().equals(MyItems.camoDiamondLeggings) || event.crafting.getItem().equals(MyItems.camoDiamondBoots)
				|| event.crafting.getItem().equals(MyItems.camoGoldChestplate) || event.crafting.getItem().equals(MyItems.camoGoldHelmet) || event.crafting.getItem().equals(MyItems.camoGoldLeggings)
				|| event.crafting.getItem().equals(MyItems.camoGoldBoots) || event.crafting.getItem().equals(MyItems.camoIronChestplate) || event.crafting.getItem().equals(MyItems.camoIronHelmet)
				|| event.crafting.getItem().equals(MyItems.camoIronLeggings) || event.crafting.getItem().equals(MyItems.camoIronBoots) || event.crafting.getItem().equals(MyItems.camoChainChestplate)
				|| event.crafting.getItem().equals(MyItems.camoChainHelmet) || event.crafting.getItem().equals(MyItems.camoChainLeggings) || event.crafting.getItem().equals(MyItems.camoChainBoots)) {
			// System.out.println("camo chest crafted");
			// System.out.println(event.craftMatrix.getStackInSlot(0).getItem().getUnlocalizedName());
			String player = event.craftMatrix.getStackInSlot(0).getTagCompound().getString("SkullOwner");
			if (!player.isEmpty()) {
				// System.out.println("player=" + player);
				NBTTagCompound tag = new NBTTagCompound();
				tag.setString("SkullOwner", player);
				// System.out.println("CamoChest crafter player: " + player);
				event.crafting.setTagCompound(tag);
				// System.out.println("SkullOwner:"+event.crafting.getTagCompound().getString("SkullOwner"));
				event.crafting.setStackDisplayName(event.crafting.getDisplayName() + " (" + player + ")");
				
			}
		}
	}
}
