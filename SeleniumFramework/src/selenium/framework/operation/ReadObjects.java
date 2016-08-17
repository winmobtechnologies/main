package selenium.framework.operation;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObjects {

// Element Text area 
// This element can be seleced by Xpath , id , name 
//     xpath //*[@id="vfb-10"]  , <textarea id="vfb-10" class="vfb-textarea vfb-medium valid" name="vfb-10">This is a text area</textarea>


// Element Text  
// This element can be seleced by Xpath , id , name 
// xpath  //*[@id="vfb-9"] , <input id="vfb-9" class="vfb-text vfb-medium valid" type="text" value="This is a text box" name="vfb-9">


// Check box ( option 1 ,2 and 3)
// item can be slected by Xpath or id
// //*[@id="vfb-6-0"]     or id vfb-6-0
// //*[@id="vfb-6-1"]     or idvfb-6-1
// //*[@id="vfb-6-2"]     or idvfb-6-2


// Radio
// item can be selected by xpath or id
//   //*[@id="vfb-7-1"]    or vfb-7-1
//  //*[@id="vfb-7-2"]    or vfb-7-2
//  //*[@id="vfb-7-3"]    or vfb-7-3

// date picker by xpath  or id 
// //*[@id="item-vfb-8"]  or item-vfb-8


// URL by Xpath or id or name 
//  //*[@id="vfb-11"]  or id/name =  vfb-11

// select by Xpath  or id or name 
// //*[@id="vfb-12"] or id/name = vfb-12


// verification submit by xpath or id 
//	//*[@id="vfb-4"]  or id =vfb-4 or name vfb-submit
// input for verification
//   //*[@id="vfb-3"]  or id or name - vfb-3


// Java Alert Xpath
//	//*[@id="alert"]  or id =alert

// change color button
// //*[@id="colorVar"]

// double click
// //*[@id="doubleClick"]

    Properties p = new Properties();
    public Properties getObjectRepository() throws IOException{
        //Read object repository file
        InputStream stream = new FileInputStream(new File(System.getProperty("user.dir")+"/src/objects/config.properties"));
        //load all objects
        p.load(stream);
         return p;
    }
    


}