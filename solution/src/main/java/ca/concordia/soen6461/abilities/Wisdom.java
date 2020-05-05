package ca.concordia.soen6461.abilities;

/**
 * Classs contains the Attributes of Wisdom of a Character
 * 
 * @author Ashish
 *
 */
public enum Wisdom implements IAbilities {
	goodjudgement(3), empathy(2), foolish(1), oblivious(4);

	private int abilityPoints;

	/**
	 * constructor to initialize ability level
	 * 
	 * @param abilityLevel
	 */
	private Wisdom(int abilityLevel) {
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
