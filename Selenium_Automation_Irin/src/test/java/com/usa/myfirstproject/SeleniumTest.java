package com.usa.myfirstproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/mdhaque/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://zoopla.com");
		driver.findElement(By.id("search-tabs-to-rent")).click();
	    driver.findElement(By.id("search-input-location")).sendKeys("London");
	    driver.findElement(By.id("search-input-location")).click();
		//driver.findElement(By.name("price_min")).sendKeys("900");
		

	}

}
