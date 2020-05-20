package ca.concordia.soen6461.abilities;

public enum Constitution implements IAbilities {
	strong(4), healthy(5), frail(3), sick(1);

	private int abilityPoints;

	private Constitution(int abilityLevel) {
		this.abilityPoints = abilityLevel;
	}

	@Override
	public int getAbility() {
		// TODO Auto-generated method stub
		return abilityPoints;
	}

}
