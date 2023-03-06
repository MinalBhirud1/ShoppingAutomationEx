package com.Shopping.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Shopping.TestBase.TestBase;

public class HomePage extends TestBase

{
	@FindBy(xpath ="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement home;
	
	@FindBy(xpath ="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	WebElement product;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement cart;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
    WebElement login;
	
	@FindBy(xpath = "//h2[contains(text(),'Brands')]")
	WebElement Brand;
	
	@FindBy (xpath ="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[8]/a[1]")
	WebElement contactus;
	
	public HomePage()//constructor
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public void clickonhomelink()
	{
		home.click();
	}
	
	public String verifytitle()
	{
		String title=driver.getTitle();
		return title;
	
	}
	
	public boolean verifyhomepage()
	{
		boolean brand = Brand.isDisplayed();
		return brand;
		
	}
	
	public ContactusPage clickoncontactus()
	{
		contactus.click();
		return new ContactusPage();
		
	}
	
	
	
	
	public LoginPage clickonlogin()
	{
		login.click();
		return new LoginPage();
		
	}
	
	
}
