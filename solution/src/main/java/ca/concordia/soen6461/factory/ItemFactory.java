package ca.concordia.soen6461.factory;

import ca.concordia.soen6461.abilities.IItem;

public class ItemFactory {
	
	public static IItem getItem(String categoryname,  String itemName) {
		switch (categoryname) {
		case "satchels" : {
			IAbstractFactory factory = new SachetFactory();
			return factory.getItem(itemName);
		}
		case "Boxes" : {
			IAbstractFactory factory = new Boxesfactory();
			return factory.getItem(itemName);
		} 
		default :
			return null;
		}
	}

}
