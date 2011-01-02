package net.loerke.itemlist.ui.intro;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.Separator;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IAction editActionSetsAction;
	private IAction savePerspectiveAction;
	private IAction quitAction;
	private IAction resetPerspectiveAction;
	private IAction closePerspectiveAction;
	private IAction closeAllPerspectivesAction;
	private IAction openPerspectiveDialogAction;
	private IAction introAction;
	private IAction helpContentsAction;
	private IAction helpSearchAction;
	private IAction dynamicHelpAction;
    
	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	protected void makeActions(IWorkbenchWindow window) {
		{
			editActionSetsAction = ActionFactory.EDIT_ACTION_SETS.create(window);
			register(editActionSetsAction);
		}
		{
			savePerspectiveAction = ActionFactory.SAVE_PERSPECTIVE.create(window);
			register(savePerspectiveAction);
		}
		{
			quitAction = ActionFactory.QUIT.create(window);
			register(quitAction);
		}
		{
			resetPerspectiveAction = ActionFactory.RESET_PERSPECTIVE.create(window);
			register(resetPerspectiveAction);
		}
		{
			closePerspectiveAction = ActionFactory.CLOSE_PERSPECTIVE.create(window);
			register(closePerspectiveAction);
		}
		{
			closeAllPerspectivesAction = ActionFactory.CLOSE_ALL_PERSPECTIVES.create(window);
			register(closeAllPerspectivesAction);
		}
		{
			openPerspectiveDialogAction = ActionFactory.OPEN_PERSPECTIVE_DIALOG.create(window);
			register(openPerspectiveDialogAction);
		}
		{
			helpContentsAction = ActionFactory.HELP_CONTENTS.create(window);
			register(helpContentsAction);
		}
		{
			helpSearchAction = ActionFactory.HELP_SEARCH.create(window);
			register(helpSearchAction);
		}
		{
			dynamicHelpAction = ActionFactory.DYNAMIC_HELP.create(window);
			register(dynamicHelpAction);
		}
		{
			introAction = ActionFactory.INTRO.create(window);
			register(introAction);
		}
	}

	protected void fillMenuBar(IMenuManager menuBar) {
		
		MenuManager fileMenu = new MenuManager("&File", IWorkbenchActionConstants.M_FILE);
		menuBar.add(fileMenu);
		fileMenu.add(quitAction);
		MenuManager windowMenu = new MenuManager("&Window", IWorkbenchActionConstants.M_WINDOW);
		menuBar.add(windowMenu);
		windowMenu.add(openPerspectiveDialogAction);
		windowMenu.add(new Separator());
		windowMenu.add(editActionSetsAction);
		windowMenu.add(savePerspectiveAction);
		windowMenu.add(resetPerspectiveAction);
		windowMenu.add(closePerspectiveAction);
		windowMenu.add(closeAllPerspectivesAction);
		MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
		menuBar.add(helpMenu);
		helpMenu.add(introAction);
		helpMenu.add(new Separator());
		helpMenu.add(helpContentsAction);
		helpMenu.add(helpSearchAction);
		helpMenu.add(dynamicHelpAction);
	}

}
