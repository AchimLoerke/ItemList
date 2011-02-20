/**
 * 
 */
package net.loerke.itemlist.ui.views;

import java.util.List;

import net.loerke.itemlist.model.data.AbstractLocation;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource2;

/**
 * @author achim
 *
 */
public class GUILocation implements IPropertySource2 {

	private AbstractLocation m_data;
	private List<GUILocation> m_children;
	private GUILocation m_parent;
	
	/**
	 * @param data
	 * @param parent
	 */
	public GUILocation(AbstractLocation data, GUILocation parent) {
		m_data = data;
		m_parent = parent;
	}

	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return null;
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
