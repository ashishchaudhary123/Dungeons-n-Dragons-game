package ca.concordia.soen6461.factory;

import ca.concordia.soen6461.abilities.IItem;

public interface IAbstractFactory {

	IItem getItem(String itemname);
}
