/*******************************************************************************
 * Copyright (c) 2010 Achim Loerke and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Achim Loerke - initial API and implementation
 *******************************************************************************/
package net.loerke.itemlist.ui.views;


import net.loerke.itemlist.model.osgi.Activator;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.part.ViewPart;

/**
 * @author achim
 *
 */
public class ItemsView extends ViewPart {
	private DataBindingContext m_bindingContext;
	public static final String ID = "net.loerke.itemlist.ui.views.ItemsView"; //$NON-NLS-1$
	private TreeViewer m_treeViewer;

	public ItemsView() {
	}

	/**
	 * Create contents of the view part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		{
			m_treeViewer = new TreeViewer(container, SWT.BORDER);
			m_treeViewer.setAutoExpandLevel(2);
			Tree tree = m_treeViewer.getTree();
			m_treeViewer.setLabelProvider(new GUINodeLabelProvider());
			m_treeViewer.setContentProvider(new GUINodeContentProvider());	
			m_treeViewer.setInput(GUINode.populateTree(Activator.instance().getRoot()));
			getSite().setSelectionProvider(m_treeViewer);
		}

		createActions();
		initializeToolBar();
		initializeMenu();
		m_bindingContext = initDataBindings();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager toolbarManager = getViewSite().getActionBars()
				.getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager menuManager = getViewSite().getActionBars()
				.getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		return bindingContext;
	}
}
