package info.coremodding.minegaesia.magic;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BrisingrSpell implements IMagicSpell {

	@Override
	public String getName() {
		return "Brisingr";
	}

	@Override
	public int castOnEntity(EntityPlayer caster, World world, Entity castOn) {
		if(castOn instanceof EntityAnimal)
			return 1;
		if(castOn instanceof EntityMob)
			return 2;
		if(castOn instanceof EntityPlayer)
			return 4;
		castOn.setFire(5);
		return 2;
	}

	@Override
	public int castOnBlock(EntityPlayer caster, World world, int x, int y, int z) {
		world.setBlock(x, y + 1, z, Blocks.fire);
		return 2;
	}

}
