package net.loerke.itemlist.ui.views;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "net.loerke.itemlist.ui.views.messages"; //$NON-NLS-1$
	public static String GUINode_CategoryInfoLabel;
	public static String GUINode_CategoryStateLabel;
	public static String GUINode_NameLabel;
	public static String ItemGUINode_BarcodeDefaultString;
	public static String ItemGUINode_BarcodeLabel;
	public static String ItemGUINode_KnownDefectsLabel;
	public static String ItemGUINode_UsableLabel;
	public static String ItemGUINode_UsableValueNo;
	public static String ItemGUINode_UsableValuesYes;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
