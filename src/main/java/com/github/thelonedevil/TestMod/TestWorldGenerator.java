package com.github.thelonedevil.TestMod;

import java.util.Random;

import com.github.thelonedevil.TestMod.Blocks.MyBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class TestWorldGenerator implements IWorldGenerator  {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		world.setBlock(chunkX*16 + random.nextInt(16), 7, chunkZ*16 + random.nextInt(16), MyBlocks.bloodOre);
		
	}

}
