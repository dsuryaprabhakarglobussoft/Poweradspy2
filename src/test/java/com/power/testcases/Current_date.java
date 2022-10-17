package com.power.testcases;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Current_date {
	@Test
	public void Current_date() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dsurya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://app-dev.poweradspy.com/amember/member");
		driver.findElement(By.id("amember-login")).sendKeys("rahul2017");
		driver.findElement(By.id("amember-pass")).sendKeys("rahul2017");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).submit();

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		LocalDate date2 = LocalDate.now();
		System.out.println("Current Date: "+date2);
		LocalTime time1=LocalTime.now();
		System.out.println("Current time: "+time1);

		//get current date time with Date()
		Date date = new Date(0);

		// Now format the date
		String date1= dateFormat.format(date);

		// Print the Date
		System.out.println("Current date and time is " +date1);
		driver.close();
	}

}

