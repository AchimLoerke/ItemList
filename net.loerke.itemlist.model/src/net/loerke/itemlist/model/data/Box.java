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
package net.loerke.itemlist.model.data;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

/**
 * @author achim
 *
 */
@XmlRootElement(name="box")
@XmlDiscriminatorValue("box")
public class Box extends AbstractLocation {
	
	private Set<Item> m_content;

	/**
	 * @see AbstractLocation#AbstractLocation()
	 */
	protected Box() {
		super();
		m_content = new HashSet<Item>();
	}

	/**
	 * @see AbstractLocation#AbstractLocation(String)
	 */
	public Box(String name) {
		super(name);
		
	}

	public Set<Item> getContent() {
		return m_content;
	}

	public void addItem(Item item) {
		m_content.add(item);
	}
	
	public void removeItem(Item item) {
		m_content.remove(item);
	}
	
}
