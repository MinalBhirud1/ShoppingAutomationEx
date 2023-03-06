package com.Shopping.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shopping.TestBase.TestBase;

public class LoginPage extends TestBase
{
	
	@FindBy(xpath ="//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")
	WebElement uname;
	
	@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")
	WebElement pwd;
	
	@FindBy(xpath ="//button[contains(text(),'Login')]")
     WebElement submit;
	
	public LoginPage() // constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username ,String password)
	{
		uname.sendKeys(username);
		pwd.sendKeys(password);
		submit.click();
	}
	
	
	
}
