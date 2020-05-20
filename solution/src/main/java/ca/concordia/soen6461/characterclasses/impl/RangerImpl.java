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
package ca.concordia.soen6461.characterclasses.impl;

import ca.concordia.soen6461.abilities.Charisma;
import ca.concordia.soen6461.abilities.Constitution;
import ca.concordia.soen6461.abilities.Dexterity;
import ca.concordia.soen6461.abilities.Intelligence;
import ca.concordia.soen6461.abilities.Strength;
import ca.concordia.soen6461.abilities.Wisdom;
import ca.concordia.soen6461.characterclasses.Character;
import ca.concordia.soen6461.characterclasses.IRanger;

public class RangerImpl extends Character implements IRanger{

	public RangerImpl(Strength strength, Dexterity dexterity, 
			Intelligence intelligence, Charisma charisma,
			Wisdom wisdom, Constitution constitution) {
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.charisma = charisma;
		this.wisdom = wisdom;
		this.constitution = constitution;
	}
	public RangerImpl()
	{
		this.strength = Strength.FIT;
		this.charisma = Charisma.confidence;
		this.intelligence = intelligence.simple;
		this.constitution = constitution.healthy;
		this.dexterity = dexterity.sneaky;
		this.wisdom = wisdom.goodjudgement;
	}
}
