package com.winmobtext.dataprovider;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;



public class Parameter {

  @Test
  @Parameters("myName")
  public void parameterTest1(String myName) {
     System.out.println("method 1 Parameterized value is : " + myName);
  }
  
  @Test
  @Parameters("myName")
  public void parameterTest2(String myName) {
     System.out.println("method 2 Parameterized value is : " + myName);
  }
  
  @Test
  @Parameters("myName")
  public void parameterTest3(String myName) {
     System.out.println("method 3 Parameterized value is : " + myName);
  }
  
}
