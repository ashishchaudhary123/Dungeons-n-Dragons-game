package ca.concordia.soen6461.abilities;

/**
 * Classs contains the Attributes of Constitution of a Character
 * 
 * @author Ashish
 *
 */
public enum Constitution implements IAbilities {
	strong(4), healthy(5), frail(3), sick(1);

	private int abilityPoints;

	/**
	 * constructor to initialize ability level
	 * 
	 * @param abilityLevel
	 */
	private Constitution(int abilityLevel) {
		this.abilityPoints = abilityLevel;
	}

	/**
	 * mehtod is used to get ability points
	 * 
	 * @return ability points
	 */
	@Override
	public int getAbility() {
		// TODO Auto-generated method stub
		return abilityPoints;
	}

}
