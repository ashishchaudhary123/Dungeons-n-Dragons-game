package ca.concordia.soen6461.abilities;

public enum Wisdom implements IAbilities {
	goodjudgement(3), empathy(2), foolish(1), oblivious(4);

	private int abilityPoints;

	private Wisdom(int abilityLevel) {
		this.abilityPoints = abilityLevel;
	}

	@Override
	public int getAbility() {
		return abilityPoints;
	}

}
