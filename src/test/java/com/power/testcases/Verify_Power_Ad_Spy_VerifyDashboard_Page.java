package com.power.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.power.qa.base.TestBase;
import com.power.qa.pages.DashboardPage;




public class Verify_Power_Ad_Spy_VerifyDashboard_Page extends TestBase{
	
	

	@Test
	public void Verify_Dashboard_Pages () throws InterruptedException {			
		DashboardPage dp = new DashboardPage(getDriver());		
		dp.verify_Dashbaord_page();
		
		
	}
	
	
}
