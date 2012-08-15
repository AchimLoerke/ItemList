/**
 */
package net.loerke.itemlist.tests;

import junit.textui.TestRunner;

import net.loerke.itemlist.Box;
import net.loerke.itemlist.ItemlistFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoxTest extends StorageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoxTest.class);
	}

	/**
	 * Constructs a new Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Box getFixture() {
		return (Box)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ItemlistFactory.eINSTANCE.createBox());
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

} //BoxTest
