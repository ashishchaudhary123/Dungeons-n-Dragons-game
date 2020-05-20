package ca.concordia.soen6461.factory;

import ca.concordia.soen6461.abilities.IItem;
import ca.concordia.soen6461.abilities.IPower;
import ca.concordia.soen6461.decorator.FoodItem;

public class SachetFactory implements IAbstractFactory {

	public IItem getItem(String itemName) {
		switch (itemName) {
		case "food":
			return new FoodItem();

		default:
			return null;
		}
	}

	@Override
	public IPower getPower(String power) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
