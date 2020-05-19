package ca.concordia.soen6461.abilities;

public class GoldCoinItem implements IItem, BoxesMarker {

	private int abilityLevel;
	
	public GoldCoinItem() {
		this.abilityLevel = 8;
	}
	
	public int getAbility() {
		return this.abilityLevel;
	}
}
