package com.qa.freecrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.freecrm.Base.TestBase;

public class DealPage extends TestBase{
	
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement deallink;
	
	@FindBy(xpath="//ul[@class='mlddm']//ul//li//a[contains(text(),'Products')]")
	WebElement products;
	
	@FindBy(xpath="//input[@class='button']")
	WebElement newproduct;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@class='button']")
	WebElement savebutton;
	
	public DealPage(){
		PageFactory.initElements(driver,this);
	}
	
	public void DealPage1(){
		Actions actions=new Actions(driver);
		actions.moveToElement(deallink).build().perform();
		products.click();
	}
	
	public void ClickOnNewProdut(){
		newproduct.click();
		
	}
	public void EnterName(){
		name.sendKeys("FreeCrm");
	}
	public void savelink(){
		savebutton.click();
		
	}

	
	
}
