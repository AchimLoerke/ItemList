/*******************************************************************************
 * Copyright (c) 2011 Achim Loerke and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Achim Loerke - initial API and implementation
 *******************************************************************************/
package net.loerke.itemlist.model.persistence;

import static org.junit.Assert.*;

import java.io.File;

import net.loerke.itemlist.model.data.Category;
import net.loerke.itemlist.model.data.Item;
import net.loerke.itemlist.model.persistence.ItemListPM.ItemListPersistenceException;

import org.junit.Test;

/**
 * @author achim
 *
 */
public class ItemListPMTest {

	/**
	 * Test method for {@link net.loerke.itemlist.model.persistence.ItemListPM#persist(net.loerke.itemlist.model.data.AbstractNode, java.io.File)}.
	 * @throws ItemListPersistenceException 
	 */
	@Test
	public void testPersist() throws ItemListPersistenceException {
		Category root = new Category("root");
		root.addChild(new Category("Amplifier"));
		root.addChild(new Category("Microphones"));
		Category snacks = new Category("snacks");
		Category sweet = new Category("sweet");
		snacks.addChild(sweet);
		Category salty = new Category("salty");
		snacks.addChild(salty);
		sweet.addChild(new Item("Chocolade"));
		sweet.addChild(new Item("Donut"));
		salty.addChild(new Item("Peanuts"));
		
		ItemListPM.persist(root, new File("/tmp/items.xml"));
	}

}
