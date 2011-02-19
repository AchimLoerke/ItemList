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

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import net.loerke.itemlist.model.data.AbstractData;
import net.loerke.itemlist.model.data.AbstractLocation;
import net.loerke.itemlist.model.data.AbstractNode;
import net.loerke.itemlist.model.data.Category;
import net.loerke.itemlist.model.data.Item;

/**
 * @author achim
 *
 * Utility for persistence handling
 */
abstract public class ItemListPM {
	public static class ItemListPersistenceException extends Exception {
		private static final long serialVersionUID = 4972414597061787778L;

		/**
		 * @see Exception#Exception(String, Throwable)
		 */
		public ItemListPersistenceException(String arg0, Throwable arg1) {
			super(arg0, arg1);
		}

		/**
		 * @see Exception#Exception(String)
		 */
		public ItemListPersistenceException(String arg0) {
			super(arg0);
		}

		/**
		 * @see Exception#Exception(Throwable)
		 */
		public ItemListPersistenceException(Throwable arg0) {
			super(arg0);
		}
		
	}
	public static void persist(AbstractNode root, File storage) throws ItemListPersistenceException {
		try {
			JAXBContext context = JAXBContext.newInstance(AbstractNode.class, Category.class, Item.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);		
			marshaller.marshal(root, storage);
		} catch (JAXBException e) {
			throw new ItemListPersistenceException("Persisting "
					+ root.toString() + " to file " + storage.toString()
					+ " failed", e);
		}
		
	}
	
	public static Category read(File storage) throws ItemListPersistenceException {
		try {
			JAXBContext context = JAXBContext.newInstance(Category.class, Item.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			return (Category) unmarshaller.unmarshal(storage);
		} catch (JAXBException e) {
			throw new ItemListPersistenceException("Reading from file " + storage.toString()
					+ " failed", e);
		}
		
	}
}
