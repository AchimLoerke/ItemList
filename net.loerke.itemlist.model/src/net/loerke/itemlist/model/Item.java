/*******************************************************************************
 * Copyright (c) 2010 Achim Loerke and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Achim Loerke - initial API and implementation
 *******************************************************************************/
package net.loerke.itemlist.model;


/**
 * @author achim
 *
 */
public class Item extends AbstractNode {

	/**
	 * @see AbstractNode#AbstractNode(String)
	 */
	public Item(String name) {
		super(name);
		
	}

	/**
	 * 
	 * This implementation just throws an {@link UnsupportedOperationException}
	 * when called because an item is a leaf node and can't have children.
	 * 
	 * @param newChild no used
	 * 
	 * @throws UnsupportedOperationException This implementation just throws an {@link UnsupportedOperationException}
	 * when called because an item is a leaf node and can't have children.
	 */
	@Override
	public void addChild(AbstractNode newChild) {
		throw new UnsupportedOperationException("Leaf nodes can't have children");
	}
	
}
