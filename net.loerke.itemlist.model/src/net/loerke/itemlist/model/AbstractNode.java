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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author achim
 *
 * Plumbing for a simple tree of nodes
 */
public abstract class AbstractNode {
	
	private String m_name;
	private List<AbstractNode> m_children;
	private AbstractNode m_parent;

	/**
	 * Creates a node.
	 * @param name The name for this node.
	 */
	public AbstractNode(String name) {
		m_children = new ArrayList<AbstractNode>();
		setName(name);
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
	 * @return An unmodifiable List containing the children of this
	 * node is returned.
	 */
	public List<AbstractNode> getChildren() {
		return Collections.unmodifiableList(m_children);
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
	private void setName(String name) {
		m_name = name;
	}

	/**
	 * @return the parent
	 */
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_name == null) ? 0 : m_name.hashCode());
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
		if (m_name == null) {
			if (other.m_name != null) {
				return false;
			}
		} else if (!m_name.equals(other.m_name)) {
			return false;
		}
		return true;
	}
	
}
