package mouri.project.com.Web_Automation_Marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LandingPage_Locator_practice extends OpenUrl{
	
	@Test (priority = 0)
	public void userName() throws InterruptedException {
		
		WebElement userName = driver_0.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");;
		Thread.sleep(500);
	}
	
	@Test (priority = 1)
	public void Password() throws InterruptedException {
		
		WebElement password = driver_0.findElement(By.id("password"));
		password.sendKeys("secret_sauce");;
		Thread.sleep(500);
	}
	
	@Test (priority = 2)
	public void signin() throws InterruptedException {
		
		WebElement signin_button = driver_0.findElement(By.name("login-button"));
		signin_button.click();
		Thread.sleep(500);
	}
	
	@Test (priority = 3)
	public void menu() throws InterruptedException {
		
		WebElement menu = driver_0.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		Thread.sleep(5000);
	}
	
	@Test (priority = 4)
	public void logout() throws InterruptedException {
		
		WebElement logout = driver_0.findElement(By.id("logout_sidebar_link"));
		logout.click();
		Thread.sleep(500);
	}
	

}
