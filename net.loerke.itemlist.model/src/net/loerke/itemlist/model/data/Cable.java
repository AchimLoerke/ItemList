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

import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

/**
 * @author achim
 *
 */
@XmlRootElement(name="cable")
@XmlDiscriminatorValue("cable")
public class Cable extends Item {
	
	/** cable length in cm */
	private int m_length;

	/**
	 * needed by persistence API
	 */
	public Cable() {
		super();
	}

	/**
	 * @see Item#Item(String)
	 */
	public Cable(String name) {
		super(name);
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		m_length = length;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return m_length;
	}

}
