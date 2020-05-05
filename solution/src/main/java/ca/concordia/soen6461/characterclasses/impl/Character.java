package ca.concordia.soen6461.characterclasses.impl;

import ca.concordia.soen6461.abilities.Charisma;
import ca.concordia.soen6461.abilities.Constitution;
import ca.concordia.soen6461.abilities.Dexterity;
import ca.concordia.soen6461.abilities.Intelligence;
import ca.concordia.soen6461.abilities.Strength;
import ca.concordia.soen6461.abilities.Wisdom;
import ca.concordia.soen6461.characterclasses.ICharacter;

public class Character implements ICharacter {

	protected Strength strength;
	protected Dexterity dexterity;
	protected Constitution constitution;
	protected Intelligence intelligence;
	protected Wisdom wisdom;
	protected Charisma charisma;
	
	public Strength getStrength() {
		return strength;
	}
	public Dexterity getDexterity() {
		return dexterity;
	}
	public Constitution getConstitution() {
		return constitution;
	}
	public Intelligence getIntelligence() {
		return intelligence;
	}
	public Wisdom getWisdom() {
		return wisdom;
	}
	public Charisma getCharisma() {
		return charisma;
	}

}
