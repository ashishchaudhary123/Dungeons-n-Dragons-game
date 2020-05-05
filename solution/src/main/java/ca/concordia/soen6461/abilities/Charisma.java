package ca.concordia.soen6461.abilities;

/**
 * Classs contains the Attributes of Charisma of a Character
 * 
 * @author Ashish
 *
 */
public enum Charisma implements IAbilities {
	leadership(4), confidence(5), timid(2), awkward(1);

	private int abilityPoints;

	/**
	 * Contructor used to initialize ability points
	 * 
	 * @param abilityLevel
	 */
	private Charisma(int abilityLevel) {
		this.abilityPoints = abilityLevel;
	}

	/**
	 * method is used to get the ability point.
	 * 
	 * @return ability points of a particular ability
	 */
	@Override
	public int getAbility() {
		return abilityPoints;
	}

}
