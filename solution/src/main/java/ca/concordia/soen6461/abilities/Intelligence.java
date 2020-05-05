package ca.concordia.soen6461.abilities;

/**
 * Classs contains the Attributes of Intelligence of a Character
 * 
 * @author Ashish
 *
 */
public enum Intelligence implements IAbilities {
	inquisitive(3), studious(5), simple(2), forgetful(1);

	private int abilityPoints;

	/**
	 * constructor to initialize ability level
	 * 
	 * @param abilityLevel
	 */
	private Intelligence(int abilityLevel) {
		this.abilityPoints = abilityLevel;
	}

	/**
	 * mehtod is used to get ability points
	 * 
	 * @return ability points
	 */
	@Override
	public int getAbility() {
		return abilityPoints;
	}

}
