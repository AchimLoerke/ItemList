/**
 */
package net.loerke.itemlist;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.loerke.itemlist.Room#getStores <em>Stores</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.loerke.itemlist.ItemlistPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends Location {
	/**
	 * Returns the value of the '<em><b>Stores</b></em>' reference list.
	 * The list contents are of type {@link net.loerke.itemlist.Box}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stores</em>' reference list.
	 * @see net.loerke.itemlist.ItemlistPackage#getRoom_Stores()
	 * @model
	 * @generated
	 */
	EList<Box> getStores();

} // Room
