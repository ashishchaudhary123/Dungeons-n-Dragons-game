package ca.concordia.soen6461.factory;

import ca.concordia.soen6461.abilities.GoldCoinItem;
import ca.concordia.soen6461.abilities.IItem;
import ca.concordia.soen6461.abilities.IPower;

public class Boxesfactory implements IAbstractFactory {

	@Override
	public IItem getItem(String itemName) {
		switch (itemName) {
		case "Gold Coin":
			return new GoldCoinItem();

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
