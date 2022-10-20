package com.power.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.power.qa.base.TestBase;
import com.power.qa.pages.DashboardPage;
/**
 * 
 * @author Surya
 *
 */



public class Verify_Facebook_Dashboard_Filters extends TestBase{
	
	
	
	@Test
	public void Verify_Fb_Filters () throws InterruptedException {
		//extent.createTest("Dashboard_test");		
		DashboardPage dp = new DashboardPage(getDriver());		
		dp.fb_Search();
		
		
	}
}
