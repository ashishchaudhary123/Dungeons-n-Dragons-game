/* (c) Copyright 2020 and following years, Yann-Gaël Guéhéneuc,
 * Concordia University.
 * 
 * Use and copying of this software and preparation of derivative works
 * based upon this software are permitted. Any copy of this software or
 * of any derivative work must include the above copyright notice of
 * the author, this paragraph and the one after it.
 * 
 * This software is made available AS IS, and THE AUTHOR DISCLAIMS
 * ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE, AND NOT WITHSTANDING ANY OTHER PROVISION CONTAINED HEREIN,
 * ANY LIABILITY FOR DAMAGES RESULTING FROM THE SOFTWARE OR ITS USE IS
 * EXPRESSLY DISCLAIMED, WHETHER ARISING IN CONTRACT, TORT (INCLUDING
 * NEGLIGENCE) OR STRICT LIABILITY, EVEN IF THE AUTHOR IS ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 * 
 * All Rights Reserved.
 */
package ca.concordia.soen6461.characterclasses;

import java.util.List;

import ca.concordia.soen6461.abilities.Charisma;
import ca.concordia.soen6461.abilities.Constitution;
import ca.concordia.soen6461.abilities.Dexterity;
import ca.concordia.soen6461.abilities.IItem;
import ca.concordia.soen6461.abilities.IPower;
import ca.concordia.soen6461.abilities.Intelligence;
import ca.concordia.soen6461.abilities.Strength;
import ca.concordia.soen6461.abilities.Wisdom;

public interface ICharacter {
	Strength getStrength();
	Dexterity getDexterity();
	Constitution getConstitution();
	Intelligence getIntelligence();
	Wisdom getWisdom();
	Charisma getCharisma();
	
	void addItem(IItem item);

	List getSatchelitems();
	
	List getBoxesItems();
	
	void addPower(IPower ipower);
	
	List getPowers();
	
	int getFinalStrength(ICharacter character);
}
