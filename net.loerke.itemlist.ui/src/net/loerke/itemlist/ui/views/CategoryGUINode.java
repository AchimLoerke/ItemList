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
package net.loerke.itemlist.ui.views;

import net.loerke.itemlist.model.data.AbstractNode;

import org.eclipse.ui.views.properties.IPropertyDescriptor;

/**
 * @author achim
 *
 */
public class CategoryGUINode extends GUINode {

	private static final IPropertyDescriptor[] PROP_DESCS =
		{NAME_PROP_DESC};
	
	/**
	 * @see GUINode#GUINode(AbstractNode, GUINode)
	 */
	public CategoryGUINode(AbstractNode data, GUINode parent) {
		super(data, parent);
	}


	
	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
	 */
	public Object getEditableValue() {
		return getData();
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return PROP_DESCS;
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		if (NAME_ID.equals(id)) {
			return getData().getName();
		}
		return null;
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		if (NAME_ID.equals(id)) {
			getData().setName((String)value);
		}
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource2#isPropertyResettable(java.lang.Object)
	 */
	public boolean isPropertyResettable(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource2#isPropertySet(java.lang.Object)
	 */
	public boolean isPropertySet(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
