package ca.concordia.soen6461.characterclasses;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import ca.concordia.soen6461.abilities.BoxesMarker;
import ca.concordia.soen6461.abilities.IItem;
import ca.concordia.soen6461.abilities.IPower;
import ca.concordia.soen6461.abilities.SatchelMarker;

public class Character implements ICharacter {

	protected List<IItem> satchelItems = new ArrayList<IItem>();
	protected List<IItem> boxesItems = new ArrayList<IItem>();
	protected List<IPower> powers = new ArrayList<IPower>();

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDexterity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getConstitution() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIntelligence() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWisdom() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCharisma() {
		// TODO Auto-generated method stub
		return 0;
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

}
