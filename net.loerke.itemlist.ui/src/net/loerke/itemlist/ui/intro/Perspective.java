package net.loerke.itemlist.ui.intro;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		addViewShortcuts(layout);
		addFastViews(layout);
		layout.addView("net.loerke.itemlist.ui.views.ItemsView", IPageLayout.LEFT, .3f, layout.getEditorArea());
	}
	private void addFastViews(IPageLayout layout) {
	}
	private void addViewShortcuts(IPageLayout layout) {
	}
}
