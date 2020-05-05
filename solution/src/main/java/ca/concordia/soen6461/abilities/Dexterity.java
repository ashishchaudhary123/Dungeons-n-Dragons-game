package ca.concordia.soen6461.abilities;

/**
 * Classs contains the Attributes of Dexterity of a Character
 * 
 * @author Ashish
 *
 */
public enum Dexterity implements IAbilities {
	slim(2), sneaky(5), awkward(4), clumsy(1);

	private int abilityPoints;

	/**
	 * constructor to initialize ability level
	 * 
	 * @param abilityLevel
	 */
	private Dexterity(int abilityLevel) {

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
		return 0;
	}

}
