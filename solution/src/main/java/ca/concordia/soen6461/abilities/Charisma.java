package ca.concordia.soen6461.abilities;

public enum Charisma implements IAbilities {
	leadership(4), confidence(5), timid(2), awkward(1);

	private int abilityPoints;

	private Charisma(int abilityLevel) {
		this.abilityPoints = abilityLevel;
	}

	@Override
	public int getAbility() {
		return abilityPoints;
	}

}
