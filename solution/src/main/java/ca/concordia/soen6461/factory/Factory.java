package ca.concordia.soen6461.factory;

import ca.concordia.soen6461.abilities.IItem;
import ca.concordia.soen6461.abilities.IPower;

public class Factory {
	
	public  IItem getItem(String categoryname,  String itemName) {
		switch (categoryname) {
		case "satchels" : {
			IAbstractFactory factory = new SachetFactory();
			return factory.getItem(itemName);
		}
		case "Boxes" : {
			IAbstractFactory factory = new Boxesfactory();
			return factory.getItem(itemName);
		} 
		case "Power" : {
			IAbstractFactory factory = new Boxesfactory();
			return factory.getItem(itemName);
		} 
		default :
			return null;
		}
	}
	public  IPower addPower(String categoryname,  String powerName) {
		switch (categoryname) {
		
		case "Power" : {
			IAbstractFactory factory = new PowerFactory();
			return factory.getPower(powerName);
		} 
		default :
			return null;
		}

}
}
