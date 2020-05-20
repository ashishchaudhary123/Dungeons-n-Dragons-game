package ca.concordia.soen6461.characterclasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.RuntimeErrorException;

import ca.concordia.soen6461.abilities.Charisma;
import ca.concordia.soen6461.abilities.Constitution;
import ca.concordia.soen6461.abilities.Dexterity;
import ca.concordia.soen6461.abilities.IItem;
import ca.concordia.soen6461.abilities.IPower;
import ca.concordia.soen6461.abilities.Intelligence;
import ca.concordia.soen6461.abilities.Strength;
import ca.concordia.soen6461.abilities.Wisdom;
import ca.concordia.soen6461.decorator.BoxesMarker;
import ca.concordia.soen6461.decorator.SatchelMarker;
import ca.concordia.soen6461.factory.SachetFactory;

public class Character implements ICharacter{

	protected Strength strength;
	protected Dexterity dexterity;
	protected Constitution constitution;
	protected Intelligence intelligence;
	protected Wisdom wisdom;
	protected Charisma charisma;
	
	protected List<IItem> satchelItems = new ArrayList<IItem>();
	protected List<IItem> boxesItems = new ArrayList<IItem>();
	protected List<IPower> powers = new ArrayList<IPower>();

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
	public void addItem(IItem item) {
		if (item instanceof SatchelMarker) {
			this.satchelItems.add(item);
		} else if (item instanceof BoxesMarker) {
			this.boxesItems.add(item);
		} else {
			throw new RuntimeException("Unknown item added");
		}
	}

	@Override
	public List getSatchelitems() {
		return satchelItems;
	}

	@Override
	public void addPower(IPower ipower) {

		if (ipower instanceof IPower) {
			this.powers.add(ipower);
		} else
			throw new RuntimeException("Unknown Power added");

	}

	@Override
	public List getPowers() {

		return powers;
	}

	@Override
	public List getBoxesItems() {
		return boxesItems;
	}
	@Override
	public int getFinalStrength(ICharacter character) {
		
		int sachelItemStrength = 0;
		int BoxesItemsStrength = 0;
		int powerStrength = 0;
		
		int abilityStrength = character.getStrength().getAbility() + character.getConstitution().getAbility() + character.getCharisma().getAbility() +
				character.getDexterity().getAbility() + character.getIntelligence().getAbility() + character.getWisdom().getAbility();
		
		Iterator sachelItems = satchelItems.iterator();
		while(sachelItems.hasNext())
		{
			IItem item = (IItem) sachelItems.next();
			
			sachelItemStrength += item.getAbility();
		}
		
		Iterator boxesitems = boxesItems.iterator();
		while(boxesitems.hasNext())
		{
			IItem item = (IItem) boxesitems.next();
			BoxesItemsStrength += item.getAbility();
		}
		
		Iterator power = powers.iterator();
		while(power.hasNext())
		{
			IPower ipower = (IPower) power.next();
			powerStrength += ipower.getAbility();
		}
		
		return abilityStrength + sachelItemStrength + BoxesItemsStrength + powerStrength;
	}

}
