package mouri.project.com.Web_Automation_Marathon;

import org.testng.annotations.BeforeTest;

public class OpenUrl extends Steps{
	
	@BeforeTest
	public void open() throws InterruptedException{
		
		driver_0.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
	}

}
