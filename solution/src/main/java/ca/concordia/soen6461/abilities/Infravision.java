package ca.concordia.soen6461.abilities;

public class Infravision implements IPower {

	private int abilityLevel;

	public Infravision() {
		this.abilityLevel = 8;
	}

	@Override
	public int getAbility() {
		// TODO Auto-generated method stub
		return abilityLevel;
	}

	@Override
	public String toString() {
		return "Infravision [abilityLevel=" + abilityLevel + "]";
	}

	

}
