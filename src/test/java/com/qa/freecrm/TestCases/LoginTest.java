package com.qa.freecrm.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.freecrm.Base.TestBase;
import com.qa.freecrm.Pages.LoginPage;

public class LoginTest extends TestBase {
	
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup(){
		inilitization();
		 loginpage=new LoginPage(); 
	}
	
	@Test(priority=1)
	public void VerifyTitleTest(){
		String title=loginpage.VerifyloginTitle();
		Assert.assertEquals(title,"CRMPRO - CRM software for customer relationship management, sales, and support.","Title is matched");
	}
	@Test(priority=2)
	public void VerifyLogoTest(){
		boolean flag=loginpage.verifyCRMPROLogo();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void LoginAppTest() throws Exception{
		 loginpage.LoginApp(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
