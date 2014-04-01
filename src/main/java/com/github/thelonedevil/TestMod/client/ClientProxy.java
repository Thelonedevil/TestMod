package com.github.thelonedevil.TestMod.client;

import com.github.thelonedevil.TestMod.TestModProxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends TestModProxy {

	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	
	}
}
