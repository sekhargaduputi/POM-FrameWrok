package com.qa.freecrm.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.freecrm.utilites.utilityPage;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	private long Implicity_Wait;
	
	public TestBase() {
		try{
		 prop=new Properties();
		FileInputStream file=new FileInputStream("E:\\Automation Pratice\\Java\\POM_FrameWrok\\src\\main\\java\\com\\freecrm\\config\\properties\\config.properties");
		prop.load(file);
		}
		catch(FileNotFoundException e){
			e.fillInStackTrace();
		}
		catch(IOException e){
			e.fillInStackTrace();
		}
	}
	
	
		public void inilitization(){
			
			String browsername=prop.getProperty("browser");
			if(browsername.equals("chrome")){
				System.setProperty("webdriver.chrome.driver","D:\\Testing Softwares\\Suresh Sir Selinum\\New Softwares&Jars\\Browser\\chromedriver_win 74.exe");
				 driver=new ChromeDriver();
			}
			else if(browsername.equals("firefox")){
				System.setProperty("webdriver.gecko.driver","D:\\Testing Softwares\\Suresh Sir Selinum\\New Softwares&Jars\\Browser\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(utilityPage.PageLoad_wait,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(utilityPage.Implicity_Wait, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	

}
