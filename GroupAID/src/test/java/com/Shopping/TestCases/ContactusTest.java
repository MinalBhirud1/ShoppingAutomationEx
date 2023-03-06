package com.Shopping.TestCases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Shopping.TestBase.TestBase;
import com.Shopping.TestPages.ContactusPage;
import com.Shopping.TestPages.HomePage;
import com.Shopping.TestPages.ProfilePage;

public class ContactusTest extends TestBase
{
	HomePage home;
	ContactusPage cont;
	ProfilePage pp;
	
	
	public ContactusTest()//constructor
	{
		super();
	}
	
	@BeforeTest
	void setUp()
	{
		Initilization();
		home = new HomePage();
		cont = new ContactusPage();
		
	}
	
	@Test
	public void verifycontactpage()
	{
		cont=home.clickoncontactus();
		cont.submit(prop.getProperty("name"), prop.getProperty("email"), prop.getProperty("sub"),prop.getProperty("msg"),prop.getProperty("upload"));
		Alert art=driver.switchTo().alert();
		art.accept();
	     pp = cont.clickonsubmit();
	   
		Assert.assertEquals("https://automationexercise.com/","https://automationexercise.com/");
		
	}
   
	
	@AfterMethod
	void tearDown()
	{
		driver.quit();
	}
	
	
}
