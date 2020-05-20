package ca.concordia.soen6461.factory;

import ca.concordia.soen6461.abilities.IItem;
import ca.concordia.soen6461.abilities.IPower;
import ca.concordia.soen6461.abilities.Infravision;
import ca.concordia.soen6461.abilities.Spells;

public class PowerFactory implements IAbstractFactory {

	@Override
	public IItem getItem(String itemname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPower getPower(String power) {
		switch (power) {
		case "spells":
			return new Spells();
		case "infravision":
			return new Infravision();
		default:
			return null;
		}

	}

}
