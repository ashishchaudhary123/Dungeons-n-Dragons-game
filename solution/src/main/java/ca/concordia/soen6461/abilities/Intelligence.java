package ca.concordia.soen6461.abilities;

public enum Intelligence implements IAbilities {
	inquisitive(3), studious(5), simple(2), forgetful(1);

	private int abilityPoints;

	private Intelligence(int abilityLevel) {
		this.abilityPoints = abilityLevel;
	}

	@Override
	public int getAbility() {
		return abilityPoints;
	}

}
