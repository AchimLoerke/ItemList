/**
 */
package net.loerke.itemlist.impl;

import java.util.Collection;

import net.loerke.itemlist.Box;
import net.loerke.itemlist.ItemlistPackage;
import net.loerke.itemlist.Room;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.loerke.itemlist.impl.RoomImpl#getBoxes <em>Boxes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends StorageImpl implements Room {
	/**
	 * The cached value of the '{@link #getBoxes() <em>Boxes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxes()
	 * @generated
	 * @ordered
	 */
	protected EList<Box> boxes;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItemlistPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Box> getBoxes() {
		if (boxes == null) {
			boxes = new EObjectResolvingEList<Box>(Box.class, this, ItemlistPackage.ROOM__BOXES);
		}
		return boxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItemlistPackage.ROOM__BOXES:
				return getBoxes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ItemlistPackage.ROOM__BOXES:
				getBoxes().clear();
				getBoxes().addAll((Collection<? extends Box>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ItemlistPackage.ROOM__BOXES:
				getBoxes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ItemlistPackage.ROOM__BOXES:
				return boxes != null && !boxes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoomImpl
