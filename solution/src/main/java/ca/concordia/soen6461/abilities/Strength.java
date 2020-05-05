package ca.concordia.soen6461.abilities;

/**
 * Classs contains the Attributes of Strength of a Character
 * 
 * @author Ashish
 *
 */
public enum Strength implements IAbilities {
	BURLY(1), FIT(5), SCRAWNY(3), PLUMP(9), XYZ(10);

	private int abilityPoints;

	/**
	 * constructor to initialize ability level
	 * 
	 * @param abilityLevel
	 */
	Strength(int abilityLevel) {
		this.abilityPoints = abilityLevel;
	}

	/**
	 * mehtod is used to get ability points
	 * 
	 * @return ability points
	 */
	public int getAbility() {
		// TODO Auto-generated method stub
		return abilityPoints;
	}
}