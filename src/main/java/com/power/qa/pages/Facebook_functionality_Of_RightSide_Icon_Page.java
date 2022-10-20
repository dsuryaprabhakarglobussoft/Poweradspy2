package com.power.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class Facebook_functionality_Of_RightSide_Icon_Page extends BasePage{
	Helpers helper= new Helpers();
	public Facebook_functionality_Of_RightSide_Icon_Page (WebDriver driver) throws InterruptedException {
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

	@FindBy(xpath = "//*[@class='right_icon_round introjs-step-18']")
	WebElement twittericon;

	@FindBy(xpath = "//*[@class='right_icon_round']")
	WebElement bookDemo;

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
		Reporter.log("<B><font color = 'red'> -</font> Create Request step start here ");
		//		helper.waitFor(fb);
		helper.highLightElement(driver, fb);
		fb.click();
		Assert.assertTrue(fb.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On FaceBook Icon");
		helper.waitForPageToLoad();

		//		helper.waitFor(createrequesticon);
		helper.highLightElement(driver, createrequesticon);
		createrequesticon.click();
		Assert.assertTrue(createrequesticon.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On + Icon or Create Request Icon");
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Create Request: "+title);
		helper.waitForPageToLoad();
	}

	public void InvitedFirend()
	{
		Reporter.log("<B><font color = 'red'> -</font> Invited Firend step start here ");
		//		helper.waitFor(fb);
		helper.highLightElement(driver, fb);
		fb.click();
		Assert.assertTrue(fb.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On FaceBook Icon");

		helper.waitForPageToLoad();

		//		helper.waitFor(invitedFirendicon);
		helper.highLightElement(driver, invitedFirendicon);
		invitedFirendicon.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On Invited Firend Icon");
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Invited Firend: "+title);
		helper.waitForPageToLoad();

	}

	public void Youtube()
	{
		Reporter.log("<B><font color = 'red'> -</font> YouTube step start here ");
		//		helper.waitFor(fb);
		helper.highLightElement(driver, fb);
		fb.click();
		Assert.assertTrue(fb.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On FaceBook Icon");
		helper.waitForPageToLoad();

		//		helper.waitFor(youtubeicon);
		helper.highLightElement(driver, youtubeicon);
		youtubeicon.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On YouTube Icon");
		helper.waitForPageToLoad();
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				String gettitle = driver.switchTo().window(child_window).getTitle();
				System.out.println("Title: "+gettitle);
				Reporter.log("<B><font color = 'orange'> Step3 -</font> Displayed YouTube: "+gettitle);

				driver.close();

			}
		}
		driver.switchTo().window(parent);
	}

	public void Twitter() throws Exception
	{
		Reporter.log("<B><font color = 'red'> -</font> Twitter step start here ");
		helper.waitFor(fb);
		helper.highLightElement(driver, fb);
		fb.click();
		Assert.assertTrue(fb.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On FaceBook Icon");
		helper.waitForPageToLoad();

		//		helper.waitFor(twittericon);
		helper.highLightElement(driver, twittericon);
		twittericon.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On  Twitter Icon");
		helper.waitForPageToLoad();
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				String gettitle = driver.switchTo().window(child_window).getTitle();
				System.out.println("Title: "+gettitle);
				Reporter.log("<B><font color = 'orange'> Step3 -</font> Displayed Twitter: "+gettitle);

				driver.close();

			}
		}
		driver.switchTo().window(parent);

	}
	public void BookDemo()
	{
		Reporter.log("<B><font color = 'red'> -</font> Book Demo step start here ");
		helper.waitFor(fb);
		helper.highLightElement(driver, fb);
		fb.click();
		Assert.assertTrue(fb.isDisplayed(), "PowerAdSpy | Facebook Dashboard");
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On FaceBook Icon");
		helper.waitForPageToLoad();

		//			helper.waitFor(bookDemo);
		helper.highLightElement(driver, bookDemo);
		bookDemo.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On  Book Demo Icon");
		helper.waitForPageToLoad();
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				helper.waitForPageToLoad();
				String gettitle = driver.switchTo().window(child_window).getTitle();
				System.out.println("Title: "+gettitle);
				Reporter.log("<B><font color = 'orange'> Step3 -</font> Displayed Book Demo: "+gettitle);
				driver.close();

			}
		}
		driver.switchTo().window(parent);


	}
}



