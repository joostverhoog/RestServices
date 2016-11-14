// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package unittesting.actions;

import unittesting.TestManager;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class UpdateUnitTestList extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __testRun;
	private unittesting.proxies.TestSuite testRun;

	public UpdateUnitTestList(IContext context, IMendixObject testRun)
	{
		super(context);
		this.__testRun = testRun;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.testRun = __testRun == null ? null : unittesting.proxies.TestSuite.initialize(getContext(), __testRun);

		// BEGIN USER CODE
		TestManager.instance().updateUnitTestList(testRun, getContext());
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "UpdateUnitTestList";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
