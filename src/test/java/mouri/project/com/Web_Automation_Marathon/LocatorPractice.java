package mouri.project.com.Web_Automation_Marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorPractice extends Steps{
	
	@Test (priority = 0)
	public void urlOpen() throws InterruptedException {
		
		driver_0.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
		Thread.sleep(300);
	}
	
	@Test (priority = 1)
	public void name() throws InterruptedException {
		
		WebElement name = driver_0.findElement(By.name("name"));
		name.sendKeys("Mouri Tania Sarker");
		Thread.sleep(300);
		
	}
	
	@Test (priority = 2)
	public void email() throws InterruptedException {
		
		WebElement email = driver_0.findElement(By.id("inputEmail4"));
		email.sendKeys("mtsarker23@gmail.com");
		Thread.sleep(300);
	}
	
	@Test (priority = 3)
	public void password() throws InterruptedException {
		
		WebElement password = driver_0.findElement(By.id("inputPassword4"));
		password.sendKeys("Java@2020@2024@");
		Thread.sleep(300);
	}
	
	@Test (priority = 4)
	public void company() throws InterruptedException {
		
		WebElement company = driver_0.findElement(By.id("company"));
		company.sendKeys("MouriIntoTech");
		Thread.sleep(300);
	}
	
	@Test (priority = 5)
	public void website() throws InterruptedException {
		
		WebElement website = driver_0.findElement(By.id("websitename"));
		website.sendKeys("www.mouriIntoTech.com");
		Thread.sleep(300);
	}

	
	

}
