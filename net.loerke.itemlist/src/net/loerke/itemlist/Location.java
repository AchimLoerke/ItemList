/**
 */
package net.loerke.itemlist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.loerke.itemlist.Location#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.loerke.itemlist.ItemlistPackage#getLocation()
 * @model abstract="true"
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference.
	 * @see #setContains(Item)
	 * @see net.loerke.itemlist.ItemlistPackage#getLocation_Contains()
	 * @model
	 * @generated
	 */
	Item getContains();

	/**
	 * Sets the value of the '{@link net.loerke.itemlist.Location#getContains <em>Contains</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(Item value);

} // Location
