package com.qa.freecrm.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.utilites.utilityPage;
import com.qa.freecrm.Base.TestBase;
import com.qa.freecrm.Pages.DealPage;
import com.qa.freecrm.Pages.HomePage;
import com.qa.freecrm.Pages.LoginPage;

public class DealTest extends TestBase{
	
	LoginPage  loginpage;
	HomePage homepage;
	DealPage dealpage;
	utilityPage utilpage;
	
	public DealTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception{
		inilitization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		dealpage=new DealPage();
		utilpage=new utilityPage();
		homepage=loginpage.LoginApp(prop.getProperty("username"),prop.getProperty("password"));
		
		
	}
	
	/*@Test(priority=1)
	public void VerifyTitleTest(){
		String tittle=loginpage.VerifyloginTitle();
		Assert.assertEquals(tittle,"CRMPRO - CRM software for customer relationship management, sales, and support.","Title is matched");
	}*/
	@Test(priority=1)
	public void AfterLoginTitle(){
		String Aftertitle=homepage.AfterLoginTittle();
		Assert.assertEquals(Aftertitle,"CRMPRO");
	}
	@Test(priority=2)
	public void MousetoDeal(){
		utilpage.EnterFrame();
		dealpage.DealPage1();
	}
	@Test(priority=3)
	public void ClickProductTest(){
		MousetoDeal();
		dealpage.ClickOnNewProdut();
	}
	@Test(priority=4)
	public void EnternameTest(){
		ClickProductTest();
		dealpage.EnterName();
	}
	@Test(priority=5)
	public void SaveTest(){
		EnternameTest();
		dealpage.savelink();
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
}
