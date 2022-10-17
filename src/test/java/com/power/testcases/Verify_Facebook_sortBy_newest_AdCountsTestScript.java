package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_sortBy_newest_AdsCountsPage;

public class Verify_Facebook_sortBy_newest_AdCountsTestScript extends TestBase{

	
	@Test
	public void Verify_Facebook_sortBy_newest_AdCountsTestScript() throws InterruptedException {
		
		Facebook_sortBy_newest_AdsCountsPage Fb_New_AdsCount= new Facebook_sortBy_newest_AdsCountsPage(getDriver());
		Fb_New_AdsCount.Facebook_AdsCounts();
	}
	
}
