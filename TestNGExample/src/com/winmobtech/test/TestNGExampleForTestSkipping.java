package com.winmobtech.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;;


public class TestNGExampleForTestSkipping {



	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}

	@Test(priority=1)
	public void runTest1() {
		System.out.println("@Test - runTest1");
	}

	@Test(priority=3)
	public void runTest2() {
		System.out.println("@Test - runTest2");
	}
 

	@Test(priority=2)
	public void runTest3() {
		System.out.println("@Test - runTest3");
	}

	@Test(enabled=false)
	public void runTest4() {
		System.out.println("@Test - runTest4");
	}
 
}
