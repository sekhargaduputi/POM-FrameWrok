package com.freecrm.utilites;

import com.qa.freecrm.Base.TestBase;

public class utilityPage extends TestBase {

	public static long Implicity_Wait=50;
	public static long PageLoad_wait=30;
	
	public void EnterFrame(){
	driver.switchTo().frame("mainpanel");
	
}
	
	
}
