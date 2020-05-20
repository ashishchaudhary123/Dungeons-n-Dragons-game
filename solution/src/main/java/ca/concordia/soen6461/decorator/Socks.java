package ca.concordia.soen6461.decorator;

import ca.concordia.soen6461.abilities.IAbilities;

public class Socks implements IClothing, IAbilities {

	@Override
	public String toString() {
		return "Socks" + "[abilityLevel=" + abilityLevel + "]";
	}

	private int abilityLevel;
	
	public Socks() {
		this.abilityLevel = 3;
	}

	public int getAbility() {
		return this.abilityLevel;
	}


	public String getName() {
		
		return "Socks";
	}
}
