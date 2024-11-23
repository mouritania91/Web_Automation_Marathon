package mouri.project.com.Web_Automation_Marathon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	WebDriver driver_0;
	
	@BeforeSuite
	public void browserSetup () {
		
		WebDriverManager.chromedriver().setup();
		
		driver_0 = new ChromeDriver();
		
		driver_0.manage().window().maximize();
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver_0.close();
		
	}

}
