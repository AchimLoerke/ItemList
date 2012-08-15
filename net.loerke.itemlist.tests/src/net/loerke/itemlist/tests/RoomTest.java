/**
 */
package net.loerke.itemlist.tests;

import junit.textui.TestRunner;

import net.loerke.itemlist.ItemlistFactory;
import net.loerke.itemlist.Room;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomTest extends StorageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoomTest.class);
	}

	/**
	 * Constructs a new Room test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Room test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Room getFixture() {
		return (Room)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ItemlistFactory.eINSTANCE.createRoom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RoomTest
