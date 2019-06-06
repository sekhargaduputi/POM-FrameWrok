package com.qa.freecrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.freecrm.Base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Companies')]")
	WebElement companieslink;
	
	@FindBy(xpath="//a[contains(text(),'New Company')]")
	WebElement newcompanylink;

	@FindBy(xpath="//input[@id='company_name']")
	WebElement name;
	
	@FindBy(xpath="//td[contains(text(),'User: sekhkar g')]")
	WebElement usernamelogo;
	
	
	public HomePage(){
		PageFactory.initElements(driver,this);
		
	}
	public String AfterLoginTittle(){
		return driver.getTitle();
	}
	public boolean VerifyUserLogo(){
		return usernamelogo.isDisplayed();
	}
	
	public void NewCompany() throws Exception{
		Actions actions=new Actions(driver);
	
		actions.moveToElement(companieslink).build().perform();
		Thread.sleep(2000);
		newcompanylink.click();
	}
	public void Entername(){
		name.sendKeys("sekhar");
	}
	

}
