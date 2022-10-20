package com.power.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample_Testing   {

	@Test
	public void TestPage () throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dsurya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.get("https://app.poweradspy.com/amember/member");
			driver.findElement(By.id("amember-login")).sendKeys("palladiumyearly");
			driver.findElement(By.id("amember-pass")).sendKeys("palladiumyearly");
			driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).submit();
		Thread.sleep(1000);
		driver.quit();
	
	
	}
}
