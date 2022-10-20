package com.power.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class Facebook_Ad_Seen_Between_Verification_Page extends BasePage 
{
	Helpers helper=new Helpers();

	public Facebook_Ad_Seen_Between_Verification_Page(WebDriver driver) throws InterruptedException 
	{
		super(TestBase.getDriver());
	}

	@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
	WebElement Logo;

	@FindBy(css = "a#fb_ads > img")
	WebElement fb;

	@FindBy(xpath = "//span[@class='dropdown-label dropdown_filter']")
	WebElement sortBy;

	@FindBy(xpath = "//a[normalize-space()='Newest']")
	WebElement SortBy_Newest;

	@FindBy(id = "search-ads")
	WebElement searchButton;

	@FindBy(id = "ads_timepicker")
	WebElement adSeenbetweenfilter;

	@FindBy(xpath = "//li[@class='active']")
	WebElement adSeenbetween_all;

	@FindBy(id = "totaladscount")
	WebElement totaladscount_ad;

	@FindBy(xpath = "//div[@class='ad_date']")
	WebElement Date1;

	@FindBy(xpath = "//a[text()='Show Analytics']")
	WebElement showAnalytics;

	@FindBy(id = "last_seen1")
	WebElement lastSeen;

	@FindBy(css = ".clear_filters")
	WebElement Clear_Filters;

	@FindBy(xpath = "(//div[@class='daterangepicker ltr auto-apply show-ranges opensright']//div[@class='ranges']//ul//li[text()='Today'])[1]")
	WebElement adSeenbetween_today;
	
	@FindBy(xpath = "(//li[text()='Yesterday'])[1]")
	WebElement adSeenbetween_yesterday;



	public void FacebookPage()
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

		Reporter.log("<B><font color = 'red'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();
	}

	public void AdSeenBetween_All() throws InterruptedException
	{
		Reporter.log("<B><font color = 'red'>  - ShortBy Ad Seen Between All Step will Start from here  </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On ad Seen between filter Icon");

		helper.waitFor(adSeenbetween_all);
		helper.highLightElement(driver, adSeenbetween_all);
		adSeenbetween_all.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On ad Seen between All Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :" +totaladscount);
		System.out.println();

		helper.waitFor(showAnalytics);
		try {
			helper.highLightElement(driver, showAnalytics);
			helper.jsScrollintoview(showAnalytics);
			showAnalytics.click();
			Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			String imageDate=Date1.getText();
			Reporter.log("<B><font color = 'orange'> Step6 -</font> Image Date is :"+imageDate);
			System.out.println("Current Image Date: "+imageDate);

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
					System.out.println(driver.switchTo().window(child_window).getTitle());
					String lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+lastimageDate1);

					driver.close();
				}
			}

			driver.switchTo().window(parent);

		} catch (Exception e) {
			
			// TODO: handle exception
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
			
			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\\r\\n\"\r\n"
					+ "				+ \"But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}
		
		/*	helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsScrollintoview(Clear_Filters);
		Clear_Filters.click();
		Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Clear Filters Icon");
		helper.waitForPageToLoad();*/


	}
	public void AdSeenBetween_Today() throws InterruptedException
	{
		Reporter.log("<B><font color = 'red'>  - ShortBy Ad Seen Between Today Step will Start from here </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On ad Seen between filter Icon");

		helper.waitFor(adSeenbetween_today);
		helper.highLightElement(driver, adSeenbetween_today);
		helper.jsScrollintoview(adSeenbetween_today);
		adSeenbetween_today.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On ad Seen between Today Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);
		System.out.println();

		helper.waitFor(showAnalytics);
	try {
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		String imageDate=Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Image Date is :"+imageDate);
		System.out.println("Current Image Date: "+imageDate);

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
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String lastimageDate1 = lastSeen.getText();
				System.out.println("Analytics Image last Seen Date: "+lastimageDate1);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+lastimageDate1);

				driver.close();
			}
		}

		driver.switchTo().window(parent);


	
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
				+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able:   Opp! Looks like we don't have data for this search criteria yet."
				+ "   But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
	}
	}
		
	public void AdSeenBetween_Yesterday() throws InterruptedException
	{
		Reporter.log("<B><font color = 'red'>  - ShortBy Ad Seen Between Yesterday Step will Start from here </font> ");
		helper.waitFor(adSeenbetweenfilter);
		helper.highLightElement(driver, adSeenbetweenfilter);
		helper.jsScrollintoview(adSeenbetweenfilter);
		adSeenbetweenfilter.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On ad Seen between filter Icon");
		
		helper.waitFor(adSeenbetween_yesterday);
		helper.highLightElement(driver, adSeenbetween_yesterday);
		helper.jsScrollintoview(adSeenbetween_yesterday);
		adSeenbetween_yesterday.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On ad Seen Between Yesterday Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.jsScrollintoview(searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On Search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_ad.getText();
		System.out.println("Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font>  Total Ad Count is :"+ totaladscount);
		System.out.println();

		helper.waitFor(showAnalytics);
		try {
			helper.highLightElement(driver, showAnalytics);
			helper.jsScrollintoview(showAnalytics);
			showAnalytics.click();
			Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Show Analytics Icon");
			helper.waitForPageToLoad();
			String imageDate=Date1.getText();
			Reporter.log("<B><font color = 'orange'> Step6 -</font> Image Date is :"+imageDate);
			System.out.println("Current Image Date: "+imageDate);

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
					System.out.println(driver.switchTo().window(child_window).getTitle());
					String lastimageDate1 = lastSeen.getText();
					System.out.println("Analytics Image last Seen Date: "+lastimageDate1);
					Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+lastimageDate1);

					driver.close();
				}
			}

			driver.switchTo().window(parent);

		} catch (Exception e) {
			
			// TODO: handle exception
			System.out.println("Image is not able:   Opp!Looks like we don't have data for this search criteria yet.\r\n"
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
			
			Reporter.log("<B><font color = 'orange'> Step5 -</font> Image is not able:   Opp!Looks like we don't have data for this search criteria yet."
					+ "But don't worry, Spidey is on the crawl now and it will scrape ads for this search criteria for you ASAP.");
		}
	}
	

}


