package com.mini;

import java.awt.AWTException;
import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Mobile_comparision {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				Robot r= new Robot();
				driver.get("https://www.amazon.in/Redmi-Phantom-Additional-Exchange-Included/dp/B09T2S8X9C/ref=sr_1_3?crid=2F2MJQHZECW9O&keywords=Redmi%2BNote%2B11%2BPRO%2BPlus%2B5G%2B(Mirage%2BBlue%2C%2B256%2BGB)%2B(8%2BGB%2BRAM)&qid=1672077412&s=electronics&sprefix=redmi%2Bnote%2B11%2Bpro%2Bplus%2B5g%2Bmirage%2Bblue%2C%2B256%2Bgb%2B8%2Bgb%2Bram%2B%2Celectronics%2C396&sr=1-3&th=1");
				String Amazontab = driver.getWindowHandle();
				System.out.println(Amazontab);
				driver.manage().window().maximize();
				String text = driver.findElement(By.xpath("(//span[@class='a-color-price'])[3]")).getText();
				String replaceAll = text.replaceAll("   ", "");
				String replaceAll2 = replaceAll.replaceAll(".00", "");
				String replaceAll3 = replaceAll2.replaceAll("22,999", "22999");
				int Amazonprice = Integer.parseInt(replaceAll3); 
				System.out.println("Price of Redmi11pro Stealthblack in amazon is-"+Amazonprice);
		
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Set<String> alltab = driver.getWindowHandles();
				System.out.println(alltab);
				
				driver.switchTo().window(Amazontab);
				
				for (String newwindow : alltab) {
					if (!Amazontab.equals(alltab)) {
						driver.switchTo().window(newwindow);	
					}
				}
				System.out.println();
				System.out.println();
				driver.get("https://www.flipkart.com/redmi-note-11-pro-plus-5g-stealth-black-256-gb/p/itmd029928dc2e7e?pid=MOBGCQSBUPZHUNZB&lid=LSTMOBGCQSBUPZHUNZBELG1UO&marketplace=FLIPKART&sattr[]=color&sattr[]=storage&sattr[]=ram&st=color");
				String text2 = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
				System.out.println("flipkart price-"+text2);
				
				String replaceAll4 = text2.replaceAll("₹","");
				String replaceAll5 = replaceAll4.replaceAll("23,890","23890");
				int Flipkartprice = Integer.parseInt(replaceAll5);
				System.out.println("Price of Redmi11pro Stealthblack in flipkart is-"+Flipkartprice);
		
		
				if (Amazonprice<=Flipkartprice) {
					driver.switchTo().window(Amazontab);
					driver.findElement(By.id("buy-now-button")).click();
					driver.findElement(By.name("email")).sendKeys("nandacbe06@gmail.com");
					driver.findElement(By.id("continue")).click();
					driver.findElement(By.id("ap_password")).sendKeys("augborn96");
					driver.findElement(By.id("signInSubmit")).click();
					Thread.sleep(15000);
					driver.findElement(By.xpath("//span[@class='a-button a-button-span12 a-button-primary auth-disable-button-on-submit']")).click();
					Thread.sleep(15000);
					TakesScreenshot k2 = (TakesScreenshot)driver;
					File Scr = k2.getScreenshotAs(OutputType.FILE);
					
					File des = new File("C:\\Users\\Home\\eclipse-workspace\\MiniProject\\Screenshot\\amazon.png");
					FileHandler.copy(Scr, des);

					
				}else {
					driver.findElement(By.className("_1_3w1N")).click();
					driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("9442442718");
					driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
					driver.findElement(By.className("_2KpZ6l _2U9uOA ihZ75k _3AWRsL")).click();
					driver.findElement(By.className("_2KpZ6l RLM7ES _3AWRsL")).click();
					driver.findElement(By.xpath("//span[@class='a-button a-button-span12 a-button-primary auth-disable-button-on-submit']")).click();
				    driver.findElement(By.id("pp-3XZGWp-121")).click();
					driver.findElement(By.id("pp-3XZGWp-112")).click();
					driver.findElement(By.className("__sif_encryptedVPA_collect")).sendKeys("nandacbe06@ybl");
					driver.findElement(By.className("ppw-widgetEvent:ValidateUpiIdEvent")).click();
					driver.findElement(By.className("os-primary-action-button-text buy-button-line-height")).click();
					
					
					TakesScreenshot k2 = (TakesScreenshot)driver;
					File Scr = k2.getScreenshotAs(OutputType.FILE);
					
					File des = new File("C:\\Users\\Home\\eclipse-workspace\\MiniProject\\Screenshot\\Flipkart.png");
					FileHandler.copy(Scr, des);

				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	
	
}
		
//driver.findElement(By.id("pp-3XZGWp-121")).click();
//driver.findElement(By.id("pp-3XZGWp-112")).click();
//driver.findElement(By.className("__sif_encryptedVPA_collect")).sendKeys("nandacbe06@ybl");
//driver.findElement(By.className("ppw-widgetEvent:ValidateUpiIdEvent")).click();
//driver.findElement(By.className("os-primary-action-button-text buy-button-line-height")).click();
	
		



