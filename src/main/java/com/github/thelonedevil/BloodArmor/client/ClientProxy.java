package com.github.thelonedevil.BloodArmor.client;

import com.github.thelonedevil.BloodArmor.BloodArmorProxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends BloodArmorProxy {

	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	
	}
}
