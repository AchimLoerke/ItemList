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
import net.loerke.itemlist.model.data.Item;

import org.apache.commons.lang.StringUtils;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

/**
 * @author achim
 *
 */
public class ItemGUINode extends GUINode {

	private static final String BARCODE_ID = "node.barcode";
	private static final PropertyDescriptor BARCODE_PROP_DESC =
		new PropertyDescriptor(BARCODE_ID, "Bar code");
	private static final String DEFAULT_BARCODE = "--";	
	static {
		BARCODE_PROP_DESC.setCategory(INFO_PROP_CATEGORY);
	}

	private static final String KNOWN_DEFECT_ID ="node.knownDefect";
	private static final PropertyDescriptor KNOWN_DEFECT_PROP_DESC =
		new TextPropertyDescriptor(KNOWN_DEFECT_ID, "Known defect(s)");
	static {
		KNOWN_DEFECT_PROP_DESC.setCategory(STATE_PROP_CATEGORY);
	}
	
	private static final String USABLE_ID = "node.usable";
	private static final String[] USABLE_VALUES = {"Yes", "No"};
	private static final PropertyDescriptor USABLE_PROP_DESC =
		new ComboBoxPropertyDescriptor(USABLE_ID, "Is usable", USABLE_VALUES);
	static {
		USABLE_PROP_DESC.setCategory(STATE_PROP_CATEGORY);
	}
	
	private static final IPropertyDescriptor[] PROP_DESCS =
		{NAME_PROP_DESC, BARCODE_PROP_DESC, KNOWN_DEFECT_PROP_DESC, USABLE_PROP_DESC};
	
	/**
	 * @see GUINode#GUINode(AbstractNode, GUINode)
	 */
	public ItemGUINode(AbstractNode data, GUINode parent) {
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
		if (BARCODE_ID.equals(id)) {
			if (getData() instanceof Item) {
				return StringUtils.defaultIfEmpty(((Item)getData()).getBarCode(), DEFAULT_BARCODE);
			}
		}
		if (KNOWN_DEFECT_ID.equals(id)) {
			if (getData() instanceof Item) {
				return StringUtils.defaultIfEmpty(((Item)getData()).getKnownDefect(), "");
			}
		}
		if (USABLE_ID.equals(id)) {
			if (getData() instanceof Item) {
				Item item = (Item) getData();
				return item.isUsable() ? 0 : 1;
			}
		}
		return null;
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object arg0) {

	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		if (NAME_ID.equals(id)) {
			getData().setName((String)value);
		}
		if (BARCODE_ID.equals(id)) {
			String barcode = (String) value;
			if (DEFAULT_BARCODE.equals(barcode)) {
				barcode = null;
			}
			if (getData() instanceof Item) {
				Item item = (Item) getData();
				item.setBarCode(barcode);
			}				
		}
		if (KNOWN_DEFECT_ID.equals(id)) {
			String defect = (String) value;
			if (defect.isEmpty()) {
				defect = null;
			}
			if (getData() instanceof Item) {
				Item item = (Item) getData();
				item.setKnownDefect(defect);
			}				
		}
		if (USABLE_ID.equals(id)) {
			Integer index = (Integer)value;
			if (getData() instanceof Item) {
				Item item = (Item) getData();
				item.setUsable(index == 0);
			}
		}
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource2#isPropertyResettable(java.lang.Object)
	 */
	public boolean isPropertyResettable(Object arg0) {
		return false;
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource2#isPropertySet(java.lang.Object)
	 */
	public boolean isPropertySet(Object arg0) {
		return false;
	}

}
