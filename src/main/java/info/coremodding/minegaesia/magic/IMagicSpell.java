package info.coremodding.minegaesia.magic;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public interface IMagicSpell {
	
	public String getName();
	
	public int castOnEntity(EntityPlayer caster, World world, Entity castOn);
	
	public int castOnBlock(EntityPlayer caster, World world, int x, int y, int z);
}
