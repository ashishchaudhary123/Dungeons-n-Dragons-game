package ca.concordia.soen6461.decorator;

import ca.concordia.soen6461.abilities.IAbilities;

public class Shirt implements IClothing, IAbilities {

	private int abilityLevel;

	public Shirt() {
		this.abilityLevel = 4;
	}

	@Override
	public int getAbility() {
		return this.abilityLevel;
	}

	public String getName() {
		return "Shirt";
	}

	@Override
	public String toString() {
		return "Shirt [abilityLevel=" + abilityLevel + "]";
	}

}
