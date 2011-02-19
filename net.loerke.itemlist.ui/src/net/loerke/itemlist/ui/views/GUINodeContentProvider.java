package net.loerke.itemlist.ui.views;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

class GUINodeContentProvider implements ITreeContentProvider {
	
	private GUINode m_root;
	
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		m_root = (GUINode) newInput;
	}
	public void dispose() {
	}
	public Object[] getElements(Object inputElement) {
		return ((GUINode)inputElement).getChildren().toArray();
	}
	public Object[] getChildren(Object parentElement) {
		return ((GUINode)parentElement).getChildren().toArray();
	}
	public Object getParent(Object element) {
		return ((GUINode)element).getParent();
	}
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}
}