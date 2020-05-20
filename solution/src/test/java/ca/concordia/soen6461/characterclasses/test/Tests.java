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
package ca.concordia.soen6461.characterclasses.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import ca.concordia.soen6461.factory.Factory;

public class Tests {
	@Test
	public void testRangerItems() throws IOException {

		RangerImpl ranger = new RangerImpl();
		ranger.addItem(new Factory().getItem("satchels", "food"));
		List sachelItems = ranger.getSatchelitems();
		Assert.assertEquals("FoodItem [abilityLevel=5]", sachelItems.get(0).toString());
	}

	@Test
	public void testRangerPowers() throws IOException {

		RangerImpl ranger = new RangerImpl();
		ranger.addPower(new Factory().addPower("Power", "spells"));
		List Powers = ranger.getPowers();
		Assert.assertEquals("Spells [abilityLevel=6]", Powers.get(0).toString());
	}

}
