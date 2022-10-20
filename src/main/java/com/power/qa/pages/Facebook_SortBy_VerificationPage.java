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

public class Facebook_SortBy_VerificationPage extends BasePage {
	Helpers helper=new Helpers();

	public Facebook_SortBy_VerificationPage(WebDriver driver) throws InterruptedException  {
		super(TestBase.getDriver());

	}

	@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
	WebElement Logo;

	@FindBy(css = "a#fb_ads > img")
	WebElement fb;

	@FindBy(id = "search-ads")
	WebElement searchButton;

	@FindBy(xpath = "//span[@class='dropdown-label dropdown_filter']")
	WebElement sortBy;

	@FindBy(id = "totaladscount-div")
	WebElement totaladscount_div;

	@FindBy(xpath = "//a[normalize-space()='Newest']")
	WebElement SortBy_Newest;

	@FindBy(xpath = "//div[@class='ad_date']")
	WebElement Date1;

	@FindBy(xpath = "//a[text()='Show Analytics']")
	WebElement showAnalytics;

	@FindBy(id  = "first_seen1")
	WebElement firstSeen;

	@FindBy(id = "last_seen1")
	WebElement lastSeen;

	@FindBy(id = "post_date1")
	WebElement postDate;

	@FindBy(css = ".clear_filters")
	WebElement Clear_Filters;

	@FindBy(xpath = "//a[normalize-space()='Last Seen']")
	WebElement sortBy_LastSeen;

	@FindBy(xpath = "//a[normalize-space()='Running Longest']")
	WebElement sortby_Running_longest;

	@FindBy(id = "days_running1")
	WebElement LongestRunningDate;

	@FindBy(xpath = "//a[normalize-space()='Domain Registration Date']")
	WebElement domain_Registration_Date;

	@FindBy(id = "domain_date")
	WebElement domain_Registration;

	/****  Facebook page ****/	
	public void Facebookpage()
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
	/****  Facebook SortBy Newest ****/	
	public void Facebook_SortBy_Newest() throws Exception
	{

		Reporter.log("<B><font color = 'red'>  -</font> ShortBy Newest Step will Start from here ");
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

		String totaladscount=totaladscount_div.getText();
		System.out.println("Newest Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Newest Total Ad Count is :"+ totaladscount);
		System.out.println();

		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		String imageDate=Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Image Date is :"+imageDate);

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
				String imageDate1 = firstSeen.getText();
				System.out.println("Analytics Image First Seen Date: "+imageDate1);
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate2);
				String imageDate3 = postDate.getText();
				System.out.println("Analytics Image Post Seen Date: "+imageDate3);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of First Seen is :"+imageDate1);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Last Seen is :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step9 -</font> Image Date of Post Seen is :"+imageDate3);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsScrollintoview(Clear_Filters);
		Clear_Filters.click();
		Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Clear Filters Icon");
		helper.waitForPageToLoad();
	}

	/****  Facebook SortBy Last Seen ****/	
	public void Facebook_SortBy_LastSeen() throws Exception
	{
		Reporter.log("<B><font color = 'red'>  -</font> ShortBy Last Seen Step will Start from here ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(sortBy_LastSeen);
		helper.highLightElement(driver, sortBy_LastSeen);
		sortBy_LastSeen.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On sortBy Last Seen Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_div.getText();
		System.out.println("Last Seen Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Last Seen Total Ad Count is :"+ totaladscount);
		System.out.println();

		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		String imageDate=Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Image Date is :"+imageDate);

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
				String imageDate1 = lastSeen.getText();
				System.out.println("Analytics Image Last Seen Date: "+imageDate1);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Date of Last Seen is :"+imageDate1);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsScrollintoview(Clear_Filters);
		Clear_Filters.click();
		Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked On Clear Filters Icon");
		helper.waitForPageToLoad();

	}


	/****  Facebook SortBy Running Longest ****/	
	public void Facebook_SortBy_RunningLongest() throws InterruptedException
	{
		Reporter.log("<B><font color = 'red'>  -</font> ShortBy Running Longest Step will Start from here ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(sortby_Running_longest);
		helper.highLightElement(driver, sortby_Running_longest);
		sortby_Running_longest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On sortBy Running longest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_div.getText();
		System.out.println("Running Longest Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Running Longest Total Ad Count is :"+ totaladscount);
		System.out.println();

		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		String imageDate=Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Image  Date is :"+imageDate);

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
				String imageDate1 = lastSeen.getText();
				System.out.println("Analytics LastSeen Date: "+imageDate1);

				String imageDate2 = LongestRunningDate.getText();
				System.out.println("Analytics LongestRunning Date: "+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Last Seen Date of is :"+imageDate1);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Running Longest is :"+imageDate2);
				driver.close();
			}
		}
		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsScrollintoview(Clear_Filters);
		Clear_Filters.click();
		Reporter.log("<B><font color = 'orange'> Step10 -</font> Clicked On Clear Filters Icon");
		helper.waitForPageToLoad();

	}



	/****  SortBy Domain Registration Date ****/
	public void SortBy_Domain_Registration_Date() throws InterruptedException
	{
		Reporter.log("<B><font color = 'red'>  -</font> ShortBy Domain Registration Date Step will Start from here ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(domain_Registration_Date);
		helper.highLightElement(driver, domain_Registration_Date);
		domain_Registration_Date.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On sortBy Domain Registration Date Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();

		String totaladscount=totaladscount_div.getText();
		System.out.println("Domain Registration Date Totaladscount: "+totaladscount);
		Reporter.log("<B><font color = 'orange'> Step4 -</font> domain Registration Date Total Ad Count is :"+ totaladscount);
		System.out.println();

		helper.waitFor(showAnalytics);
		helper.highLightElement(driver, showAnalytics);
		helper.jsScrollintoview(showAnalytics);
		showAnalytics.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Show Analytics Icon");
		helper.waitForPageToLoad();
		String imageDate=Date1.getText();
		Reporter.log("<B><font color = 'orange'> Step6 -</font> Image Date is :"+imageDate);

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
				String imageDate2 = lastSeen.getText();
				System.out.println("Analytics Last Seen Date: "+imageDate2);
				String imageDate1 = domain_Registration.getText();
				System.out.println("Analytics Domain Registration Date: "+imageDate1);
				Reporter.log("<B><font color = 'orange'> Step7 -</font> Image Last Seen Date of :"+imageDate2);
				Reporter.log("<B><font color = 'orange'> Step8 -</font> Image Date of Domain Registration Date is :"+imageDate1);
				driver.close();
			}
		}

		System.out.println("Current Image Date: "+imageDate);
		driver.switchTo().window(parent);

		helper.waitFor(Clear_Filters);
		helper.highLightElement(driver, Clear_Filters);
		helper.jsScrollintoview(Clear_Filters);
		Clear_Filters.click();
		Reporter.log("<B><font color = 'orange'> Step9 -</font> Clicked On Clear Filters Icon");
		helper.waitForPageToLoad();

	}




}
