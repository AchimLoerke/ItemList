package net.loerke.itemlist.model.osgi;

import java.io.File;

import net.loerke.itemlist.model.data.Category;
import net.loerke.itemlist.model.persistence.ItemListPM;
import net.loerke.itemlist.model.persistence.ItemListPM.ItemListPersistenceException;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	public final static String BUNDLE_ID = "net.loerke.itemlist.model";

	private static Activator m_instance;
	private static BundleContext context;
	private Category m_root;
	private File m_storage;
	
	static BundleContext getContext() {
		return context;
	}

	public static Activator instance() {
		return m_instance;
	}
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		Activator.m_instance = this;
		getDataRoot();
	}

	/**
	 * @throws ItemListPersistenceException
	 */
	public void getDataRoot() throws ItemListPersistenceException {
		m_storage = Platform.getLocation().makeAbsolute().toFile();
		m_storage = new File(m_storage, "equipment.xml");
		if (m_storage.isFile() && m_storage.canRead()) {
			m_root = (Category)ItemListPM.read(m_storage);
		} else {
			m_root = new Category("equipment");
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		storeDataRoot();
		Activator.context = null;
	}

	/**
	 * @throws ItemListPersistenceException
	 */
	public void storeDataRoot() throws ItemListPersistenceException {
		if (m_storage.isFile() && m_storage.canWrite()) {
			ItemListPM.persist(m_root, m_storage);
		}
	}

	/**
	 * @return the root
	 */
	public Category getRoot() {
		return m_root;
	}

}
