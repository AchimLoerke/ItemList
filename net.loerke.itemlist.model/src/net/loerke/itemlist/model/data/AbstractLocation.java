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

import java.math.BigInteger;
import java.util.UUID;

import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorNode;

/**
 * @author achim
 *
 */
@XmlRootElement(name="location")
@XmlDiscriminatorNode("@locationtype")
public abstract class AbstractLocation {
	private BigInteger m_id;

	private String m_name;
	
	/**
	 * needed by persistence layer
	 */
	protected AbstractLocation() {
	}

	protected AbstractLocation(String name) {
		this();
		initID();
		setName(name);
	}
	
	/**
	 * initialize the universal ID for this entity
	 */
	private void initID() {
		UUID id = UUID.randomUUID();
		m_id = BigInteger.valueOf(id.getMostSignificantBits());
		m_id.shiftLeft(64);
		m_id.or(BigInteger.valueOf(id.getLeastSignificantBits()));
	}
	
	/**
	 * @return the id
	 */
	@XmlID
	public BigInteger getId() {
		return m_id;
	}

	/**
	 * @param id the id to set
	 */
	@SuppressWarnings("unused")
	private void setId(BigInteger id) {
		m_id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return m_name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		m_name = name;
	}
}
