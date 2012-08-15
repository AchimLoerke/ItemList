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
 *   <li>{@link net.loerke.itemlist.Room#getBoxes <em>Boxes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.loerke.itemlist.ItemlistPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends Storage {
	/**
	 * Returns the value of the '<em><b>Boxes</b></em>' reference list.
	 * The list contents are of type {@link net.loerke.itemlist.Box}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boxes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boxes</em>' reference list.
	 * @see net.loerke.itemlist.ItemlistPackage#getRoom_Boxes()
	 * @model
	 * @generated
	 */
	EList<Box> getBoxes();

} // Room
