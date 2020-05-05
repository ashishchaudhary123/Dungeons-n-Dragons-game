package ca.concordia.soen6461.abilities;

public enum Strength implements IAbilities{
	BURLY(1), FIT(5), SCRAWNY(3), PLUMP(9), XYZ(10);

	private int abilityPoints;
	Strength(int abilityLevel) {
		this.abilityPoints = abilityLevel;
	}
	public int getAbility() {
		// TODO Auto-generated method stub
		return abilityPoints;
	}
}