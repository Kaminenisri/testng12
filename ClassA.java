package org.testngtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassA {
	
	@Test(priority=-126)
	private void test1() {
	System.out.println("ClassA test1 @BeforeSuite ");

	}
	@Test
	private void test2() {
		System.out.println("ClassA test2 @AfterSuite ");

		}
	
	@Test
	private void test3() {
		System.out.println("ClassA test3 @BeforeTest");
		}
	
	@Test(priority=-34)
	private void test4() {
		System.out.println("ClassA test4 @AfterTest ");

		}
	
	@Test(priority=-12)
	private void test5() {
		System.out.println("ClassA test5 @BeforeClass ");

		}
	@Test(priority=12, enabled= false)
	private void test6() {
		System.out.println("ClassA test6 @AfterClass ");

		}

	@Test(priority=4 , invocationCount=3)
	private void test7() {
		System.out.println("ClassA test7 @BeforeMethod");

		}
	
	@Test
	private void test8() {
		
		System.out.println("ClassA test8 @AfterMethod ");	
		
		}
	
	
	@Test
	private void test9() {
		System.out.println("ClassA test9 @Test ");

		}



}
