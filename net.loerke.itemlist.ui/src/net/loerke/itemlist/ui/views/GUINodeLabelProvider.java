package net.loerke.itemlist.ui.views;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

class GUINodeLabelProvider extends LabelProvider {
	public Image getImage(Object element) {
		return super.getImage(element);
	}
	public String getText(Object element) {
		if (element instanceof GUINode) {
			GUINode node = (GUINode) element;
			return node.getData().getName();
		} else {
			return super.getText(element);
		}
	}
}