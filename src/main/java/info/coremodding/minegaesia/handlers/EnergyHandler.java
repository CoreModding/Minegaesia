package info.coremodding.minegaesia.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;

public class EnergyHandler {

	public static boolean useEnergy(EntityPlayer p, int energy){
		if(p.getFoodStats().getFoodLevel() > 0){
			if(p.getFoodStats().getFoodLevel() >= energy){
				p.getFoodStats().setFoodLevel(p.getFoodStats().getFoodLevel() - energy);
				return true;
			}
			energy -= p.getFoodStats().getFoodLevel();
			p.getFoodStats().setFoodLevel(0);
		}
		if(p.getHealth() >= energy){
			p.setHealth(p.getHealth() - energy);
			return true;
		} 
		p.attackEntityFrom(new DamageSource("Too much magic"), 100);
		p.setDead();
		return false;
	}
	
	public static int determineEnergyUsageForPlayer(EntityPlayer p, int energy){
		return energy  * 10;
	}
}
