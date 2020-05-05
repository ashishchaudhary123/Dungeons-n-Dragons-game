package ca.concordia.soen6461.abilities;

public enum Dexterity implements IAbilities {
	slim(2) ,sneaky(5) , awkward(4) , clumsy(1);

	private int abilityPoints;
	private Dexterity(int abilityLevel) {
		this.abilityPoints = abilityLevel;
	}
	
	@Override
	public int getAbility() {
		// TODO Auto-generated method stub
		return 0;
	}

}
