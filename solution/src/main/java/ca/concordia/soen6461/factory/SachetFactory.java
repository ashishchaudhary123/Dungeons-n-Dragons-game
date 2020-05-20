package ca.concordia.soen6461.factory;

import ca.concordia.soen6461.abilities.FoodItem;
import ca.concordia.soen6461.abilities.IItem;

public class SachetFactory implements IAbstractFactory {

	public IItem getItem(String itemName) {
		switch (itemName) {
		case "food":
			return new FoodItem();

		default:
			return null;
		}
	}
}
