package com.qa.freecrm.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.utilites.utilityPage;
import com.qa.freecrm.Base.TestBase;
import com.qa.freecrm.Pages.HomePage;
import com.qa.freecrm.Pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	utilityPage utilpage;
	
	
	@BeforeMethod
	public void setup() throws Exception{
		inilitization();
		 loginpage=new LoginPage(); 
		  homepage=new HomePage();
		  utilpage=new utilityPage();
		homepage=loginpage.LoginApp(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void AfterLoginTittleTest(){
		String aftertitle=homepage.AfterLoginTittle();
		Assert.assertEquals(aftertitle, "CRMPRO","Title is Matched");
	}
	@Test(priority=2)
	public void VerifyUserLogotest(){
		utilpage.EnterFrame();
		boolean logo=homepage.VerifyUserLogo();
		Assert.assertTrue(logo);
	}
	@Test(priority=3)
	public void ClickOnNewCompany() throws Exception{
		utilpage.EnterFrame();
		Thread.sleep(2000);
		homepage.NewCompany();
		
	}
	@Test(priority=4)
	public void EnterName() throws Exception{
		ClickOnNewCompany();
		homepage.Entername();
		
	}
	@AfterMethod
	public void teardown(){
	driver.quit();

}}
