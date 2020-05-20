package ca.concordia.soen6461.decorator;

import ca.concordia.soen6461.abilities.IItem;

public class GoldCoinItem implements IItem, BoxesMarker {

	@Override
	public String toString() {
		return "GoldCoinItem [abilityLevel=" + abilityLevel + "]";
	}

	private int abilityLevel;
	
	public GoldCoinItem() {
		this.abilityLevel = 8;
	}
	
	public int getAbility() {
		return this.abilityLevel;
	}
}
