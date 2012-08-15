/**
 */
package net.loerke.itemlist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.loerke.itemlist.Storage#getContains <em>Contains</em>}</li>
 *   <li>{@link net.loerke.itemlist.Storage#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.loerke.itemlist.ItemlistPackage#getStorage()
 * @model abstract="true"
 * @generated
 */
public interface Storage extends EObject {
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
	 * @see net.loerke.itemlist.ItemlistPackage#getStorage_Contains()
	 * @model
	 * @generated
	 */
	Item getContains();

	/**
	 * Sets the value of the '{@link net.loerke.itemlist.Storage#getContains <em>Contains</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(Item value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.loerke.itemlist.ItemlistPackage#getStorage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.loerke.itemlist.Storage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Storage
