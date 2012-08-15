/**
 */
package net.loerke.itemlist;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.loerke.itemlist.ItemlistFactory
 * @model kind="package"
 * @generated
 */
public interface ItemlistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "itemlist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://itemlist/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "itemlist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItemlistPackage eINSTANCE = net.loerke.itemlist.impl.ItemlistPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.loerke.itemlist.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.loerke.itemlist.impl.ItemImpl
	 * @see net.loerke.itemlist.impl.ItemlistPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 0;

	/**
	 * The feature id for the '<em><b>Is</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.loerke.itemlist.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.loerke.itemlist.impl.StorageImpl
	 * @see net.loerke.itemlist.impl.ItemlistPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 4;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.loerke.itemlist.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.loerke.itemlist.impl.BoxImpl
	 * @see net.loerke.itemlist.impl.ItemlistPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__CONTAINS = STORAGE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__NAME = STORAGE__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__COLOR = STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = STORAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.loerke.itemlist.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.loerke.itemlist.impl.RoomImpl
	 * @see net.loerke.itemlist.impl.ItemlistPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 2;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CONTAINS = STORAGE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = STORAGE__NAME;

	/**
	 * The feature id for the '<em><b>Boxes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BOXES = STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = STORAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.loerke.itemlist.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.loerke.itemlist.impl.ItemTypeImpl
	 * @see net.loerke.itemlist.impl.ItemlistPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link net.loerke.itemlist.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see net.loerke.itemlist.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference '{@link net.loerke.itemlist.Item#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is</em>'.
	 * @see net.loerke.itemlist.Item#getIs()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Is();

	/**
	 * Returns the meta object for class '{@link net.loerke.itemlist.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see net.loerke.itemlist.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the attribute '{@link net.loerke.itemlist.Box#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.loerke.itemlist.Box#getColor()
	 * @see #getBox()
	 * @generated
	 */
	EAttribute getBox_Color();

	/**
	 * Returns the meta object for class '{@link net.loerke.itemlist.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see net.loerke.itemlist.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference list '{@link net.loerke.itemlist.Room#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boxes</em>'.
	 * @see net.loerke.itemlist.Room#getBoxes()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Boxes();

	/**
	 * Returns the meta object for class '{@link net.loerke.itemlist.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see net.loerke.itemlist.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute '{@link net.loerke.itemlist.ItemType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.loerke.itemlist.ItemType#getName()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Name();

	/**
	 * Returns the meta object for class '{@link net.loerke.itemlist.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see net.loerke.itemlist.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the reference '{@link net.loerke.itemlist.Storage#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contains</em>'.
	 * @see net.loerke.itemlist.Storage#getContains()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Contains();

	/**
	 * Returns the meta object for the attribute '{@link net.loerke.itemlist.Storage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.loerke.itemlist.Storage#getName()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ItemlistFactory getItemlistFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.loerke.itemlist.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.loerke.itemlist.impl.ItemImpl
		 * @see net.loerke.itemlist.impl.ItemlistPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__IS = eINSTANCE.getItem_Is();

		/**
		 * The meta object literal for the '{@link net.loerke.itemlist.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.loerke.itemlist.impl.BoxImpl
		 * @see net.loerke.itemlist.impl.ItemlistPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOX__COLOR = eINSTANCE.getBox_Color();

		/**
		 * The meta object literal for the '{@link net.loerke.itemlist.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.loerke.itemlist.impl.RoomImpl
		 * @see net.loerke.itemlist.impl.ItemlistPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Boxes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__BOXES = eINSTANCE.getRoom_Boxes();

		/**
		 * The meta object literal for the '{@link net.loerke.itemlist.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.loerke.itemlist.impl.ItemTypeImpl
		 * @see net.loerke.itemlist.impl.ItemlistPackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__NAME = eINSTANCE.getItemType_Name();

		/**
		 * The meta object literal for the '{@link net.loerke.itemlist.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.loerke.itemlist.impl.StorageImpl
		 * @see net.loerke.itemlist.impl.ItemlistPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__CONTAINS = eINSTANCE.getStorage_Contains();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__NAME = eINSTANCE.getStorage_Name();

	}

} //ItemlistPackage
