package com.power.qa.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class Facebook_sortBy_newest_AdsCountsPage extends BasePage {
	
	Helpers helper = new Helpers();
	
	public Facebook_sortBy_newest_AdsCountsPage (WebDriver driver) throws InterruptedException {
		super(TestBase.getDriver());
	}
	@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
	WebElement Logo;

	@FindBy(css = "a#fb_ads > img")
	WebElement fb;
	
	@FindBy(css = ".search_icon_top")
	WebElement search;
	
	@FindBy(id = "totaladscount")
	WebElement TotalCount;
	@FindBy(id = "totaladscount-div")
	WebElement totaladscount_div;
	
	@FindBy(xpath = "//div[@class='ad_date']")
	WebElement Date1;
	
	public void Facebook_AdsCounts()
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
		
		String totaladscount=totaladscount_div.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Total Ad Count is :"+ totaladscount);
		System.out.println();
		
		LocalDate date2 = LocalDate.now();
		String formattedDate = date2.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
		System.out.println("Local Date: "+formattedDate);
		
		
		String imageDate=Date1.getText();
		System.out.println("Current Image Date: "+imageDate);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Total Ad Count is :"+imageDate);
		if (imageDate == formattedDate)
		{
			System.out.println("Both Date are Match");
		}
		else
		{
			System.out.println("Both Date are Not Match");
		}
		Assert.assertEquals(imageDate,formattedDate);
		System.out.println();
		 
		
	}
}
