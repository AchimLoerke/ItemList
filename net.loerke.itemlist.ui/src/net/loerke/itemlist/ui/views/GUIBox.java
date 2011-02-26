/**
 * 
 */
package net.loerke.itemlist.ui.views;

import java.util.List;
import java.util.Set;

import net.loerke.itemlist.model.data.AbstractLocation;
import net.loerke.itemlist.model.data.Box;
import net.loerke.itemlist.model.data.Item;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource2;

/**
 * @author achim
 *
 */
public class GUIBox implements IPropertySource2 {

	private Box m_data;
	
	/**
	 * @param data
	 * @param parent
	 */
	public GUIBox(Box data) {
		m_data = data;
	}

	public Object getEditableValue() {
		return m_data;
	}

	public IPropertyDescriptor[] getPropertyDescriptors() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPropertyValue(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void resetPropertyValue(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setPropertyValue(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	public boolean isPropertyResettable(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isPropertySet(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}
