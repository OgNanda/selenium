package org.Skyraan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MugaamNewUserLogin {

	 public static void main(String[] args) {
		    
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Home\\Downloads\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
	
			driver.get("https://mugaam.com/");
			 driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@class='btn btn_c_si px-2 py-1 text-white me-5 '])")).click(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("(//input[@name='email'])")).sendKeys("nandacbe03@gmail.com");
	 driver.findElement(By.xpath("//button[@class='btn form-control btn_c_s btn-primary text-center text-white']")).click(); 
	 driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Nandacbe"); 
	 driver.findElement(By.xpath("//input[@class='form-control password']")).sendKeys("Nanda@kumar1"); 
	 driver.findElement(By.xpath("(//button[@class='btn form-control btn_c_s btn-primary text-center text-white'])")).click();
	 driver.findElement(By.xpath("(//input[@id='otp'])")).click();
	  }

		  }
	

