package net.loerke.itemlist.ui.intro;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		addViewShortcuts(layout);
		addFastViews(layout);
		layout.addView("net.loerke.itemlist.ui.views.ItemsView", IPageLayout.LEFT, .3f, layout.getEditorArea());
		layout.addView("net.loerke.itemlist.ui.views.BoxesView", IPageLayout.BOTTOM, 0.5f, "net.loerke.itemlist.ui.views.ItemsView");
		layout.addView(IPageLayout.ID_PROP_SHEET, IPageLayout.RIGHT, IPageLayout.DEFAULT_VIEW_RATIO, layout.getEditorArea());
	}
	private void addFastViews(IPageLayout layout) {
	}
	private void addViewShortcuts(IPageLayout layout) {
	}
}
