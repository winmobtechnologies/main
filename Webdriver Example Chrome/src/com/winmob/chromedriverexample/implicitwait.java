package com.winmob.chromedriverexample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	static String driverPath = "/Users/purush/eclipse/";
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException  {
		System.out.println("launching chrome browser" + driverPath+"chromedriver" );
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		

		driver.get("http://www.quikr.com ");
		System.out.println("find search element" );
		Date date = new Date();
		System.out.println(dateFormat.format(date)); 
		// find a element not present
		try
		{
			WebElement search_txt = driver.findElement(By.xpath("//*[@id='query_String']"));
		}
		catch( Exception e)
		{
		
		}
		
		
		
		date = new Date();
		System.out.println(dateFormat.format(date)); 
	}

	
}
