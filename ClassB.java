package org.testngtest;

import org.dayone.BaseClass;
import org.testng.annotations.Test;

public class ClassB extends BaseClass {
	
	@Test
	private void test1() {
    System.out.println("ClassB test1 @Test");
	}
	
	@Test
	private void test2() {
		
	browserLaunch("http://facebook.com/");	
		
    System.out.println("ClassB test2 @Test");
	}
	
	@Test
	private void test3() {
		
	browserLaunch("https://www.amazon.com/");	
		
    System.out.println("ClassB test3 @Test");
	}
	
	@Test
	private void test4() {
		
		browserLaunch("https://www.flipkart.com/");
		
    System.out.println("ClassB test4 @Test");
	}

}
