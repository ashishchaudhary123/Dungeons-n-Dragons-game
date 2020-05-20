package ca.concordia.soen6461.factory;

import ca.concordia.soen6461.abilities.IItem;
import ca.concordia.soen6461.abilities.IPower;

public interface IAbstractFactory {

	IItem getItem(String itemname);
	IPower getPower(String power);
}
