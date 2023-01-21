package com.mini;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Bookmyshow {

public static void main(String[] args) throws IOException {
	


		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("(//div[@class='sc-cgHJcJ hPcraY'])[7]")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class='sc-7o7nez-0 fNzwUg'])[5]")).click();
		
		driver.findElement(By.xpath("(//div[@class='sc-1vmod7e-2 iBonLL'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='sc-vhz3gb-3 dRokFO'])[1]")).click();
		
		driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
		
		driver.findElement(By.xpath("(//div[@class='date-numeric'])[5]")).click();
		
		driver.findElement(By.xpath("(//div[@class='__text'])[4]")).click();
		
		driver.findElement(By.id("btnPopupAccept")).click();
		
//		
		driver.findElement(By.xpath("//li[@id='pop_1']")).click();
	
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		
		driver.findElement(By.xpath("(//table/tbody/tr[18]/td[2])//div[31]")).click();
		
//		driver.findElement(By.xpath("//div[@id='A_17_015']")).click();
		
		
		driver.findElement(By.xpath("(//span[@id='btnSTotal_reserve'])[1]")).click();
		
		driver.findElement(By.xpath("//span[@class='__totalinbtn']")).click();
		
		driver.findElement(By.xpath("//input[@id='txtEmailId']")).sendKeys("nandacbe06@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='txtMobile']")).sendKeys("9442442718");
		
		TakesScreenshot k2 = (TakesScreenshot)driver;
		File Scr = k2.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\Home\\eclipse-workspace\\MiniProject\\Screenshot\\Ticket.png");
		FileHandler.copy(Scr, des);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
