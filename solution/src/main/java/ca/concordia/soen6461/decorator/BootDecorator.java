package ca.concordia.soen6461.decorator;

import ca.concordia.soen6461.abilities.IAbilities;

public class BootDecorator implements IClothing, IAbilities {

	@Override
	public String toString() {

		return "Boot [abilityLevel=" + abilityLevel;
	}

	private int abilityLevel;

	private Socks socks;

	public BootDecorator(Socks socks) {
		this.abilityLevel = 5;
		this.socks = socks;
	}

	public int getAbility() {
		return this.abilityLevel;
	}

	@Override
	public String getName() {

		return "Boot [abilityLevel=" + abilityLevel;
	}
}
