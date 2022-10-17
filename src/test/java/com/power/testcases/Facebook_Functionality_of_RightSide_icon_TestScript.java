package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_functionality_of_RightSide_icon_Page;

public class Facebook_Functionality_of_RightSide_icon_TestScript extends TestBase{

	@Test
	public void Facebook_Functionality_of_RightSide_icon_TestScript() throws Exception
	{
		Facebook_functionality_of_RightSide_icon_Page rightsideicon= new Facebook_functionality_of_RightSide_icon_Page(getDriver());
		rightsideicon.Facebook();
		rightsideicon.CreateRequest();
		rightsideicon.InvitedFirend();
		
	}
}
