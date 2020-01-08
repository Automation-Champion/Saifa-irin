package com.usa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class seleniumclass {
	public static void main(String[]args) {
		 
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Desktop/chromedriver");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.ups.com/us/en/Home.page");
		 driver.manage().window().maximize();
		 
		 
		  driver.findElement(By.id("ups-menuLinks0")).click(); 
		  driver.manage().deleteAllCookies();
		  driver.findElement(By.id("implicit_consent_prompt_submit")).click();
		  driver.findElement(By.xpath("(//ul//li//a[@class='ups-analytics'])[1]")).click();
		 
		 driver.findElement(By.id("email")).sendKeys("alammohammed79@gmail.com");
		 driver.findElement(By.id("pwd")).sendKeys("SAYEDawan2008");
		 driver.findElement(By.id("submitBtn")).click();
		 System.out.println( driver.getTitle());
		 driver.quit();
		 
		 
	
	}
	
		
}
