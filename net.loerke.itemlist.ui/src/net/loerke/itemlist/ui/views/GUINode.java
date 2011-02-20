package net.loerke.itemlist.ui.views;

import java.util.ArrayList;
import java.util.List;

import net.loerke.itemlist.model.data.AbstractNode;
import net.loerke.itemlist.model.data.Category;
import net.loerke.itemlist.model.data.Item;

import org.eclipse.core.runtime.Assert;
import org.eclipse.ui.views.properties.IPropertySource2;
import org.eclipse.ui.views.properties.PropertyDescriptor;

/**
 * Provide display functions to the {@link AbstractNode} data
 * entry.
 * 
 * @author achim
 *
 */
abstract class GUINode implements IPropertySource2 {

	/**
	 * Populate a GUInode tree matching the {@link AbstractNode}
	 * tree.
	 * @param root Base node.
	 * @return The root GUINode matching the root {@link AbstractNode}.
	 */
	static GUINode populateTree(Category root) {
		return new CategoryGUINode(root, null);
	}

	private AbstractNode m_data;
	
	private List<GUINode> m_children;
	private GUINode m_parent;
	
	/**
	 * Create a wrapper tree which is fully initialized. All parent/child
	 * releations will be resolved.
	 * 
	 * @param data An {@link AbstractNode} which is wrapped for
	 * display. Must be not null.
	 * 
	 */
	
	protected GUINode(AbstractNode data, GUINode parent) {
		Assert.isNotNull(data, "Null data not allowed."); //$NON-NLS-1$
		m_data = data;
		m_parent = parent;
		List<AbstractNode> dataChildren = m_data.getChildren();
		m_children = new ArrayList<GUINode>(dataChildren.size());
		for (AbstractNode node : dataChildren) {
			GUINode newNode = null;
			if (node instanceof Category) {
				newNode = new CategoryGUINode(node, this);
			}
			if (node instanceof Item) {
				newNode = new ItemGUINode(node, this);
			}
			Assert.isNotNull(newNode, "Internal error: unknown node type found."); //$NON-NLS-1$
			m_children.add(newNode);
		}
	}
	
	protected static final String NAME_ID = "node.name"; //$NON-NLS-1$
	protected static final PropertyDescriptor NAME_PROP_DESC = 
		new PropertyDescriptor(NAME_ID, Messages.GUINode_NameLabel);

	protected static final String INFO_PROP_CATEGORY = Messages.GUINode_CategoryInfoLabel;
	protected static final String STATE_PROP_CATEGORY = Messages.GUINode_CategoryStateLabel;
	
	static {
		NAME_PROP_DESC.setCategory(INFO_PROP_CATEGORY);
	}

	/**
	 * @return the data
	 */
	public AbstractNode getData() {
		return m_data;
	}

	/**
	 * @return the children
	 */
	public List<GUINode> getChildren() {
		return m_children;
	}

	/**
	 * @return the parent
	 */
	public GUINode getParent() {
		return m_parent;
	}
}