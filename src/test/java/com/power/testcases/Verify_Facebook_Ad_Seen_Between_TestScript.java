package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_Ad_Seen_Between_Verification_Page;
/**
 * 
 * @author Surya
 *
 */
public class Verify_Facebook_Ad_Seen_Between_TestScript extends TestBase
{

	@Test
	public void Facebook_Ad_Seen_Between_TestScript() throws InterruptedException
	{
		Facebook_Ad_Seen_Between_Verification_Page ad_seen_between=new Facebook_Ad_Seen_Between_Verification_Page(getDriver());
		ad_seen_between.FacebookPage();
		
		ad_seen_between.AdSeenBetween_All();  
		
		ad_seen_between.AdSeenBetween_Today();
		
		ad_seen_between.AdSeenBetween_Yesterday();
		


	}
}
