package com.winmob.chromedriverexample;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebdriverForChrome {
	
           // For Windows use the path and syntax as per Windows Path requirements
			static String driverPath = "/Users/purush/eclipse/";
			
			static WebDriver driver;
			
			public static void main(String[] args) throws InterruptedException  {
			
			  
	
				System.out.println("launching chrome browser" + driverPath+"chromedriver" );
				System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
				driver = new ChromeDriver();
		    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("http://www.seleniumframework.com/Practiceform/");
			    WebDriverWait wait = new WebDriverWait(driver, 15);
				
				// Find element by xpath
			    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/a")));	
				WebElement click_link = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/a"));
				System.out.println("Click link" );
				click_link.click();

			   
			    // Find Element by name
				System.out.println("Enter values to text area using Xpath" );
				WebElement text_area = driver.findElement(By.name("vfb-10"));
				text_area.clear();
				text_area.sendKeys(" Example Text ");
	
	
			    // Find Element by id
				System.out.println("Enter values to text box using id" );
					WebElement text_field = driver.findElement(By.id("vfb-9"));
					text_field.clear();
					text_field.sendKeys(" Text box");
			
		
					
			// When you do  inspect code you can find id of the options
			//<input type="checkbox" name="vfb-6[]" id="vfb-6-0" value="Option 1" class="vfb-checkbox  ">	
			System.out.println("Select check box using  id" );	
			WebElement check_box = driver.findElement(By.id("vfb-6-1"));
	
			if ( !check_box.isSelected() )
			{
		//		check_box.click();
			}
			// Radio item vfb-7-3
		
		
			System.out.println("Select radio button box using  id" );	
			WebElement radio_button = driver.findElement(By.id("vfb-7-3"));
	
			if ( !radio_button.isSelected() )
			{
				radio_button.click();
			}
			
			// date by id
			
			WebElement datepicker = driver.findElement(By.name("vfb-8")); 
			// date format mm/dd/yy
			datepicker.sendKeys("08/08/2016");


            // Java alert
            // id = alert
			WebElement alert_elem = driver.findElement(By.id("alert")); 
			alert_elem.click();
			
			Alert simpleAlert = driver.switchTo().alert();
			String alertText = simpleAlert.getText();
			System.out.println("Alert text is " + alertText);
			simpleAlert.accept();
            
            

	    	// select name="vfb-12"
		
			WebElement element=driver.findElement(By.name("vfb-12"));
			Select se=new Select(element);
			se.selectByIndex(2);
			
			}



}
