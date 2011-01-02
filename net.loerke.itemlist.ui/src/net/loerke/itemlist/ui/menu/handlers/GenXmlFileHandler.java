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
package net.loerke.itemlist.ui.menu.handlers;

import java.io.File;

import net.loerke.itemlist.model.data.Category;
import net.loerke.itemlist.model.data.Item;
import net.loerke.itemlist.model.persistence.ItemListPM;
import net.loerke.itemlist.model.persistence.ItemListPM.ItemListPersistenceException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * @author achim
 *
 */
public class GenXmlFileHandler extends AbstractHandler {

	/**
	 * 
	 */
	private static final String ITEMS_XML_PATH = "/tmp/items.xml";

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		exportXML();
		importXML();
		return null;
	}

	/**
	 * 
	 */
	private void importXML() {
		try {
			Category root = ItemListPM.read(new File(ITEMS_XML_PATH));
			System.out.println(root);
		} catch (ItemListPersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * 
	 */
	private void exportXML() {
		Category root = new Category("Equipment");
		
		root.addChild(new Category("Amplifiers"));
		root.addChild(new Category("Microphones"));
		
		Category snacks = new Category("Snacks");
		root.addChild(snacks);
		
		Category sweets = new Category("Sweets");
		snacks.addChild(sweets);
		
		Category salty = new Category("Salty");
		snacks.addChild(salty);
		
		sweets.addChild(new Item("Chocolade"));
		sweets.addChild(new Item("Muffins"));
		
		salty.addChild(new Item("Peanuts"));
		
		try {
			ItemListPM.persist(root, new File(ITEMS_XML_PATH));
		} catch (ItemListPersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
