package ca.concordia.soen6461.abilities;

public class Spells implements IPower {

	private int abilityLevel;

	@Override
	public String toString() {
		return "Spells [abilityLevel=" + abilityLevel + "]";
	}

	public Spells() {
		this.abilityLevel = 6;

	}

	@Override
	public int getAbility() {
		return this.abilityLevel;
	}

	

}
