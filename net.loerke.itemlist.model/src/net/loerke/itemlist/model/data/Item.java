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
package net.loerke.itemlist.model.data;

import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;


/**
 * @author achim
 *
 */
@XmlRootElement(name="item")
@XmlDiscriminatorValue("item")
public class Item extends AbstractNode {

	/** Bar code for this item. */
	private String m_barCode;
	
	/** set to description if any defect is known, null otherwise */
	private String m_knownDefect;
	
	/** is the item still usable? */
	private boolean m_usable;
	
	/**
	 * needed by persistence API
	 */
	public Item() {
		super();
	}
	/**
	 * @see AbstractNode#AbstractNode(String)
	 */
	public Item(String name) {
		super(name);
		init();
	}

	/**
	 * initalize this instance
	 */
	private void init() {
		m_usable = true;
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
	/**
	 * @return the barCode
	 */
	public String getBarCode() {
		return m_barCode;
	}
	/**
	 * @param barCode the barCode to set
	 */
	public void setBarCode(String barCode) {
		m_barCode = barCode;
	}
	/**
	 * @return the knownDefect
	 */
	public String getKnownDefect() {
		return m_knownDefect;
	}
	/**
	 * @param knownDefect the knownDefect to set
	 */
	public void setKnownDefect(String knownDefect) {
		m_knownDefect = knownDefect;
	}
	/**
	 * @return the usable
	 */
	public boolean isUsable() {
		return m_usable;
	}
	/**
	 * @param usable the usable to set
	 */
	public void setUsable(boolean usable) {
		m_usable = usable;
	}
	
}
