package com.power.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class Facebook_functionality_of_RightSide_icon_Page extends BasePage{
Helpers helper= new Helpers();
	public Facebook_functionality_of_RightSide_icon_Page (WebDriver driver) throws InterruptedException {
		super(TestBase.getDriver());
	}
	
	@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
	WebElement Logo;

	@FindBy(css = "a#fb_ads > img")
	WebElement fb;
	
	@FindBy(xpath = "//*[@class='right_icon_round introjs-step-14']")
	WebElement createrequesticon;
	
	@FindBy(xpath = "//*[@class='right_icon_round introjs-step-15']")
	WebElement invitedFirendicon;
	
	@FindBy(xpath = "//*[@class='right_icon_round introjs-step-16']")
	WebElement youtubeicon;
	
	public void Facebook()
	{
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");
		
		helper.waitFor(fb);
		helper.highLightElement(driver, fb);
		fb.click();
		Assert.assertTrue(fb.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On FaceBook Icon");
		helper.waitForPageToLoad();
		
	}
	public void  CreateRequest()
	{
		helper.waitFor(createrequesticon);
		helper.highLightElement(driver, createrequesticon);
		createrequesticon.click();
		Assert.assertTrue(createrequesticon.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On + Icon or Create Request Icon");
		helper.waitForPageToLoad();
	}
	
	public void InvitedFirend()
	{
		helper.waitFor(fb);
		helper.highLightElement(driver, fb);
		fb.click();
		Assert.assertTrue(fb.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On FaceBook Icon");
		helper.waitForPageToLoad();
		
		helper.waitFor(invitedFirendicon);
		helper.highLightElement(driver, invitedFirendicon);
		invitedFirendicon.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On   + Icon  or  Invited Firend Icon");
		helper.waitForPageToLoad();
		
	}
	
	public void Youtube()
	{
		helper.waitFor(fb);
		helper.highLightElement(driver, fb);
		fb.click();
		Assert.assertTrue(fb.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On FaceBook Icon");
		helper.waitForPageToLoad();
		
		helper.waitFor(youtubeicon);
		helper.highLightElement(driver, youtubeicon);
		youtubeicon.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On   + Icon  or YouTube Icon");
		helper.waitForPageToLoad();
		
	}
	}


