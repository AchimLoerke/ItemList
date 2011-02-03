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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorNode;

/**
 * @author achim
 *
 * Plumbing for a simple tree of nodes
 */

@XmlRootElement(name="equipment")
@XmlDiscriminatorNode("@nodetype")
@XmlType(propOrder={"name","id","parent","children"})
public abstract class AbstractNode {
	
	private BigInteger m_id;
	
	private String m_name;
	
	private List<AbstractNode> m_children;
	
	private AbstractNode m_parent;

	/**
	 * needed by persistence API
	 */
	protected AbstractNode() {
		m_children = new ArrayList<AbstractNode>();
	}

	
	/**
	 * Creates a node.
	 * @param name The name for this node.
	 */
	public AbstractNode(String name) {
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
	 * Adds a child to this node. The childs parent is set to
	 * this node.
	 * @param newChild Item to be added
	 * @throws IllegalArgumentException If newChild is already a
	 * child of this node an {@link IllegalArgumentException} is
	 * thrown.
	 */
	public void addChild(AbstractNode newChild) {
		if (m_children.contains(newChild)) {
			throw new IllegalArgumentException("No duplicates allowed");
		}
		m_children.add(newChild);
		newChild.setParent(this);
	}
	
	/**
	 * Get the children of this node.
	 * @return An List containing the children of this
	 * node is returned.
	 */
	public List<AbstractNode> getChildren() {
		return m_children;
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

	/**
	 * @return the parent
	 */
	@XmlIDREF
	public AbstractNode getParent() {
		return m_parent;
	}

	/**
	 * @param parent the parent to set
	 */
	private void setParent(AbstractNode parent) {
		m_parent = parent;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbstractNode [m_name=" + m_name + "]";
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_id == null) ? 0 : m_id.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AbstractNode)) {
			return false;
		}
		AbstractNode other = (AbstractNode) obj;
		if (m_id == null) {
			if (other.m_id != null) {
				return false;
			}
		} else if (!m_id.equals(other.m_id)) {
			return false;
		}
		return true;
	}
	
}
