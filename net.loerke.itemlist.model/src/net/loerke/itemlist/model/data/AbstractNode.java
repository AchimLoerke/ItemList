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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorNode;

/**
 * @author achim
 *
 * Plumbing for a simple tree of nodes
 */

@XmlRootElement(name="equipment")
@XmlDiscriminatorNode("@nodetype")
public abstract class AbstractNode extends AbstractData {

	private List<AbstractNode> m_children = new ArrayList<AbstractNode>();
	
	private AbstractNode m_parent;

	/**
	 * needed by persistence API
	 */
	protected AbstractNode() {
		super();
	}

	
	/**
	 * Creates a node.
	 * @param name The name for this node.
	 */
	public AbstractNode(String name) {
		super(name);
	}
	
	
	/**
	 * Adds a child to this node. The child's parent is set to
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
	 * @return the parent
	 */
	@XmlIDREF
	public AbstractData getParent() {
		return m_parent;
	}

	/**
	 * @param parent the parent to set
	 */
	private void setParent(AbstractNode parent) {
		m_parent = parent;
	}
	
}
