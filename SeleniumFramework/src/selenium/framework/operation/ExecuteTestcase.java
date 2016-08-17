package selenium.framework.operation;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import selenium.framework.operation.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExecuteTestcase {


public static void main(String[] args) throws InterruptedException  {        // TODO Auto-generated method stub
	WebDriver webdriver = new ChromeDriver();
	ReadExcel file = new ReadExcel();
	ReadObjects object = new ReadObjects();
	Properties allObjects = null;
	webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	try {
		allObjects = object.getObjectRepository();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	UIOperation operation = new UIOperation(webdriver);
   //Read keyword sheet
   file.openSheet(System.getProperty("user.dir")+"/src/"+"Test.xlsx");
   //Find number of rows in excel file
    int rowCount = file.getRowCount();
  
    System.out.println(" row "+ rowCount);
    //Create a loop over all the rows of excel file to read it
    for (int i = 0; i < rowCount + 1; i++) {
    
    	    String keyword ;
    	    String Objectname;
    	    String Objecttype;
    	    String Value;
 
	    	keyword = file.getValueFromCell( 0, i);
	    	keyword = keyword.trim();
	    	keyword = keyword.replaceAll("\\s+", "");
	    	
	        Objectname = file.getValueFromCell( 1, i).trim();
	        Objectname = Objectname.replaceAll("\\s+", "");

	        Objecttype = file.getValueFromCell(2, i).trim();
	        Objecttype = Objecttype.replaceAll("\\s+", "");

	        Value = file.getValueFromCell( 3, i).trim();
	        Value = Value.replaceAll("\\s+", "");

	        
	        System.out.println("output "+ " keyword- " + keyword + " Objectname- " + Objectname + " Objecttype- " + Objecttype + " Value- " + Value);
	        try {
			operation.perform(allObjects,keyword,Objectname,Objecttype,Value);
			keyword = null;
			Objectname = null;
			Objecttype = null;
			Value = null;
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
    	 
      
           
      }
      
    webdriver.close();
  
    }
    
    
 }


