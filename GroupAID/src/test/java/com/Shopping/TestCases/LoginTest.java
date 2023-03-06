package com.Shopping.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Shopping.TestBase.TestBase;
import com.Shopping.TestPages.HomePage;
import com.Shopping.TestPages.LoginPage;

public class LoginTest extends TestBase
{
	HomePage home;
	LoginPage log;
	
	public LoginTest() // constructor
	{
		super();
		
	}
	
	@BeforeMethod 
	void setup()
	{
		Initilization();
		home = new HomePage();
		log = new LoginPage();
	}
	
	@Test
	void verifyvalidlogin() 
	{
		log=home.clickonlogin();
		log.login(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertEquals("https://automationexercise.com/", "https://automationexercise.com/");
	}
	
	
	
	@AfterMethod
	void teardown()
	{
		driver.quit();
	}
  
}
