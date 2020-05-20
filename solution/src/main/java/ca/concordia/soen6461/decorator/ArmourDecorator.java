package ca.concordia.soen6461.decorator;

import ca.concordia.soen6461.abilities.IAbilities;

public class ArmourDecorator implements IClothing, IAbilities {

	private int abilityLevel;

	private Shirt shirt;

	public ArmourDecorator(Shirt shirt) {

		this.abilityLevel = 10;
		this.shirt = shirt;

	}

	
	public int getAbility() {
		// TODO Auto-generated method stub
		return this.abilityLevel;
	}

	
	public String getName() {
		// TODO Auto-generated method stub
		return "Armour";
	}

	
	public String toString() {
		return "Armour = [abilityLevel=" + abilityLevel;
	}
}
