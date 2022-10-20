package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_SortBy_VerificationPage;
/**
 * 
 * @author Surya
 *
 */
public class Verify_Facebook_SortBy_TestScript extends TestBase {
	@Test
	public void Verify_Facebook_SortBy_TestScript () throws Exception {
		
		Facebook_SortBy_VerificationPage sortBy = new Facebook_SortBy_VerificationPage(getDriver());		
		
		sortBy.Facebookpage();    					//Facebook page
		
		sortBy.Facebook_SortBy_Newest();    		//Newest
		
		sortBy.Facebook_SortBy_LastSeen();			//Last Seen
		
		sortBy.Facebook_SortBy_RunningLongest();	//Running Longest
		
		sortBy.SortBy_Domain_Registration_Date();	//Domain Registration
}
}