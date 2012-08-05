/**
 */
package net.loerke.itemlist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.loerke.itemlist.Item#getIs <em>Is</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.loerke.itemlist.ItemlistPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Is</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' reference.
	 * @see #setIs(ItemType)
	 * @see net.loerke.itemlist.ItemlistPackage#getItem_Is()
	 * @model required="true"
	 * @generated
	 */
	ItemType getIs();

	/**
	 * Sets the value of the '{@link net.loerke.itemlist.Item#getIs <em>Is</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' reference.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(ItemType value);

} // Item
