package com.axion.library;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testDataProvider {

	 String filename ="G:\\sheet1.xls";
	 String sheetname="Sheet1";
	 String sheetname1="Sheet2";
	 String sheetname2="Sheet3";
	 String sheetname3="Sheet4";
	 String sheetname4="Sheet5";
	 String sheetname5="Sheet6";
	 
	 
	 
	 
	 
	  @DataProvider(name="readdata")
	  public Object[][] loginData() {
	   ReadExcel  Excelobj = new ReadExcel();
	   
	 Object[][] arrayObject =  Excelobj.getExcelData(filename, sheetname);
	 
	 
	 
	  
	   

	    return arrayObject;
	  }
	  
	  
	  
	  
	  
	  
	  
	   @DataProvider(name="readdata2")
	   public Object[][] loginData7() {
	    ReadExcel  Excelobj2 = new ReadExcel();  
	   
	  
	   Object[][] arrayObject1 =  Excelobj2.getExcelData(filename, sheetname1);
	   return arrayObject1;


	}
	 
	   @DataProvider(name="readdata3")
	   public Object[][] loginData3() {
	    ReadExcel  Excelobj3 = new ReadExcel();  
	   
	  
	   Object[][] arrayObject2 =  Excelobj3.getExcelData(filename, sheetname2);
	   return arrayObject2;
	   
	   }
	   
	   @DataProvider(name="readdata4")
	   public Object[][] loginData4() {
	    ReadExcel  Excelobj4 = new ReadExcel();  
	   
	  
	   Object[][] arrayObject3 =  Excelobj4.getExcelData(filename, sheetname3);
	   return arrayObject3;
	   }
	   
	  
	     
	    
	   
	   
	   
	   @DataProvider(name="readdata5")
	   public Object[][] loginData5() {
	    ReadExcel  Excelobj5 = new ReadExcel();  
	   
	  
	   Object[][] arrayObject4 =  Excelobj5.getExcelData(filename, sheetname4);
	   return arrayObject4;
	   
	   }
	   
	   @DataProvider(name="readdata6")
	   public Object[][] loginData6() {
	   ReadExcel  Excelobj6 = new ReadExcel();  
	   
	  
	   Object[][] arrayObject5 =  Excelobj6.getExcelData(filename, sheetname5);
	   return arrayObject5;
	   }
	   
	   
	   
	   
	  


	     @Test(dataProvider="readdata")
	  public void testExcelsheet(String userName, String password ) {
	  
	 System.out.println("output is"+userName + password );

	  
	 }
	     
	     @Test(dataProvider="readdata2")
	    public void testExcelsheet1(String userName, String password  ,String Mobileno) {
	    
	   System.out.println("output is"+userName + password + Mobileno );

	    
	   }
	     
	     @Test(dataProvider="readdata3")
	    public void testExcelsheet2(String userName, String password,String Mobileno,String emailid ) {
	    
	   System.out.println("output is"+userName + password + Mobileno + emailid );

	    
	   }
	     
	     
	     @Test(dataProvider="readdata4")
	    public void testExcelsheet3(String userName, String password,String Mobileno,String emailid,String empid ) {
	    
	   System.out.println("output is"+userName + password + Mobileno + emailid + empid);
	     }
	     
	     @Test(dataProvider="readdata5")
	    public void testExcelsheet4(String userName, String password,String Mobileno,String emailid,String empid,String postion) {
	    
	   System.out.println("output is"+userName + password + Mobileno + emailid + empid );

	    
	   }
	     @Test(dataProvider="readdata6")
	    public void testExcelsheet5(String userName, String password ,String Mobileno,String emailid,String empid,String postion,String Cofee ) {
	    
	   System.out.println("output is"+userName + password + Mobileno + emailid + empid + postion + Cofee );
	   

	   }
	     
	     


}
