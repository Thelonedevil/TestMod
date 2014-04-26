package com.github.thelonedevil.BloodArmor.redner;

import java.util.Map;

import com.google.common.collect.Maps;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;

public class CustomRenderBiped extends RenderBiped {
	 private static final Map field_110859_k = Maps.newHashMap();

	
	public CustomRenderBiped(ModelBiped par1ModelBiped, float par2)
    {
        super(par1ModelBiped, par2, 1.0F);
    }

    public CustomRenderBiped(ModelBiped par1ModelBiped, float par2, float par3)
    {
        super(par1ModelBiped, par2, par3);
        this.modelBipedMain = par1ModelBiped;
        this.field_77070_b = par3;
        this.func_82421_b();
    }
    
    public static ResourceLocation getArmorResource(Entity entity, ItemStack stack, int slot, String type){
    	ItemArmor item = (ItemArmor)stack.getItem();
        String s1 = String.format("textures/models/armor/%s_layer_%d%s.png",
                bipedArmorFilenamePrefix[item.renderIndex], (slot == 2 ? 2 : 1), type == null ? "" : String.format("_%s", type));

        s1 = CustomHooksClient.getArmorTexture(entity, stack, s1, slot, type);
        ResourceLocation resourcelocation = (ResourceLocation)field_110859_k.get(s1);

        if (resourcelocation == null)
        {
            resourcelocation = new ResourceLocation(s1);
            field_110859_k.put(s1, resourcelocation);
        }

        return resourcelocation;
    	
    }

}
