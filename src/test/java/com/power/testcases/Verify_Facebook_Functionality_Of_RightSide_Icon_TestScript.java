package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_functionality_Of_RightSide_Icon_Page;
/**
 * 
 * @author Surya
 *
 */

public class Verify_Facebook_Functionality_Of_RightSide_Icon_TestScript extends TestBase{

	@Test
	public void Facebook_Functionality_Of_RightSide_Icon_TestScript() throws Exception
	{
		Facebook_functionality_Of_RightSide_Icon_Page rightsideicon= new Facebook_functionality_Of_RightSide_Icon_Page(getDriver());
		rightsideicon.Facebook();
		rightsideicon.CreateRequest();
		rightsideicon.InvitedFirend();
		rightsideicon.Youtube();
		rightsideicon.Twitter();
		rightsideicon.BookDemo();

	}
}
