package com.qa.freecrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.freecrm.Base.TestBase;

public class LoginPage extends TestBase{

	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement logo;

	public LoginPage()  {
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyloginTitle(){
		return driver.getTitle();
	}
	
	public HomePage LoginApp(String un,String pas) throws Exception{
		username.sendKeys(un);
		password.sendKeys(pas);
		Thread.sleep(2000);
		loginbutton.click();
		return new HomePage();
	}
	public boolean verifyCRMPROLogo(){
		return logo.isDisplayed();
	}
	
	
	

}
