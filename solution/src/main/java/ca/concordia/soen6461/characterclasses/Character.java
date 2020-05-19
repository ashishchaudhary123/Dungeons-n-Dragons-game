package ca.concordia.soen6461.characterclasses;

import java.util.ArrayList;
import java.util.List;


import ca.concordia.soen6461.decorator.IClothing;

public class Character implements ICharacter {

	
	protected List<IClothing> clothes = new ArrayList<IClothing>();
	
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

	
	public void addCloth(IClothing cloth) {
		this.clothes.add(cloth);
	}

	@Override
	public List getClothes() {
		
		return clothes;
	}
}
