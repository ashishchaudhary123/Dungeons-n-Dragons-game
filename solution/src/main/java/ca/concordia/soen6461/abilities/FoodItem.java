package ca.concordia.soen6461.abilities;

public class FoodItem implements IItem, SatchelMarker {

	private int abilityLevel;
	
	public FoodItem() {
		this.abilityLevel = 5;
	}
	
	@Override
	public String toString() {
		return "FoodItem" + "[abilityLevel=" + abilityLevel + "]";
	}

	public int getAbility() {
		return this.abilityLevel;
	}
}
