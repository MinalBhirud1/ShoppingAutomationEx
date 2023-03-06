package com.Shopping.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shopping.TestBase.TestBase;

public class ContactusPage extends TestBase
{
	@FindBy(xpath = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[1]/input[1]")
    WebElement Name;
	
	@FindBy(xpath ="//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[2]/input[1]")
	WebElement Email;
	
	@FindBy(xpath ="//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[3]/input[1]")
	WebElement Subject;
	
	@FindBy(xpath = "//textarea[@id='message']")
	WebElement Message;
	
	@FindBy(xpath ="//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[5]/input[1]")
	WebElement Uploadfile;
	
	@FindBy(xpath ="//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[6]/input[1]")
	WebElement Contactsub;
	
	@FindBy(xpath ="//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/a[1]/span[1]")
	WebElement HM;
	
	
	
	public ContactusPage()//constructor
	{
		PageFactory.initElements(driver,this);
	}
	
	public void submit(String name,String email,String sub, String msg, String upload)
	{
		Name.sendKeys(name);
		Email.sendKeys(email);
	    Subject.sendKeys(sub);
	    Message.sendKeys(msg);
	    Uploadfile.sendKeys(upload);
	    Contactsub.click();
	    HM.click();
	
	}

	public ProfilePage clickonsubmit() {
		HM.click();
		return new ProfilePage();
	}
	
	
	
	
	
}
