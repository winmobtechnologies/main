package selenium.framework.operation;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIOperation {


	 WebDriver driver;
	    public UIOperation(WebDriver driver){
	        this.driver = driver;
	    }
	    


		public void perform(Properties p,String operation,String objectName,String objectType,String value) throws Exception{
	     //   System.out.println("");
			operation = operation.toUpperCase();
			
			if ( operation.contains("TEXT"))
			{
			     	operation="TEXT";
			}
			
	        switch (operation) {
	        
	        
	        case "DBCLICK":
	            //Perform click
	            Actions action = new Actions(driver);
	        	WebElement element0 = driver.findElement(this.getObject(p,objectName,objectType));
	        	
	        	WebDriverWait wait0 = new WebDriverWait(driver, 10);
	        	wait0.until(ExpectedConditions.elementToBeClickable(element0));
	        	
	        	action.doubleClick(element0).perform();
	        	break;
	        
	        case "CLICK":
	            //Perform clickthis.getObject(p,objectName,objectType)
	        	WebElement element1 =   driver.findElement(this.getObject(p,objectName,objectType));
	        	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	        	wait1.until(ExpectedConditions.elementToBeClickable(element1));
	        	element1.click();
	            break;
	            
	        case "TEXT":
	            //Set text on control
	        	WebElement element2 =   driver.findElement(this.getObject(p,objectName,objectType));
	        	WebDriverWait wait2 = new WebDriverWait(driver, 10);
	        	wait2.until(ExpectedConditions.elementToBeClickable(element2));
	        	element2.clear();
	        	element2.sendKeys(value);
	            break;
	            
	     
	            
	        case "GOTOURL":
	            //Go to url of application
	            driver.get(value);
	            break;
	            
	            
	        case "CHECKBOX":
		        
		       List<WebElement> selectElements= driver.findElements(this.getObject(p,objectName,objectType));
					
		       for(WebElement checkbox : selectElements){
		    	
			   String values = checkbox.getAttribute("value").toUpperCase();
			   values = values.replaceAll("\\s+", "");
			   value = value.toUpperCase();
			   value = value.replaceAll("\\s+", "");
		    		    // uncheck 'em all
		    		    if(!checkbox.isSelected() && value.equals(values))
		    		    {
		    		    	WebDriverWait wait3 = new WebDriverWait(driver, 10);
				        	wait3.until(ExpectedConditions.elementToBeClickable(checkbox));
			    		      checkbox.click();
		    		    }
		    		    
		    		    
		    		}    
	      	  break;
	        
	        
	        case "RADIO":
	        
			       List<WebElement> selectElem= driver.findElements(this.getObject(p,objectName,objectType));
						
			       for(WebElement radio : selectElem){
				   String values = radio.getAttribute("value").toUpperCase();
				   values = values.replaceAll("\\s+", "");
				   value = value.toUpperCase();
				   value = value.replaceAll("\\s+", "");
			    		    // uncheck 'em all
			    		    if(!radio.isSelected() && value.equals(values))
			    		    {
			    		    	WebDriverWait wait4 = new WebDriverWait(driver, 10);
					        	wait4.until(ExpectedConditions.elementToBeClickable(radio));
			    		    	radio.click();
			    		    }
			    		    
			    		    
			    		}   
	       
	          break;
	          
	       
	           default:
	          
	           break;
	        
	        
	        }
	    }
	    


	    
	    
	    
	    
	    
	    
	    
	    
	    /**
	     * Find element BY using object type and value
	     * @param p
	     * @param objectName
	     * @param objectType
	     * @return
	     * @throws Exception
	     */
	    private By getObject(Properties p,String objectName,String objectType) throws Exception{
	        //Find by xpath
	        if(objectType.equalsIgnoreCase("XPATH")){
	            
	            return By.xpath(p.getProperty(objectName));
	        }
	        //find by class
	        else if(objectType.equalsIgnoreCase("CLASSNAME")){
	            
	            return By.className(p.getProperty(objectName));
	            
	        }
	        //find by name
	        else if(objectType.equalsIgnoreCase("NAME")){
	            
	            return By.name(p.getProperty(objectName));
	            
	        }
	        //Find by css
	        else if(objectType.equalsIgnoreCase("CSS")){
	            
	            return By.cssSelector(p.getProperty(objectName));
	            
	        }
	        //find by link
	        else if(objectType.equalsIgnoreCase("LINK")){
	            
	            return By.linkText(p.getProperty(objectName));
	            
	        }
	        //find by partial link
	        else if(objectType.equalsIgnoreCase("PARTIALLINK")){
	            
	            return By.partialLinkText(p.getProperty(objectName));
	            
	        }else
	        {
	            throw new Exception("Wrong object type");
	        }
	    }
	    
	    

}
