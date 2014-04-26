package com.github.thelonedevil.BloodArmor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PlayerDeathHandler {
	
	@SubscribeEvent
	public void playerDeath(LivingDeathEvent event){
		if(event.entityLiving instanceof EntityPlayer){
			ItemStack head = new ItemStack(Items.skull, 1, 3);
			NBTTagCompound tag = new NBTTagCompound();
			tag.setString("SkullOwner", event.entityLiving.getCommandSenderName());
			head.setTagCompound(tag);
			event.entityLiving.entityDropItem(head, 1.0f);
		}
	}
}
