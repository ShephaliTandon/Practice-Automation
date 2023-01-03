package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTime1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		//enter username as admin
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		
		//enter password as manager
		driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
		
		//click on login button
		driver.findElement(By.id("loginButton")).click();
	     
		//click on user button
		driver.findElement(By.id("container_users")).click();
	
		//click on new user
		driver.findElement(By.className("components_button_label")).click();
		
		Thread.sleep(5000);
		// enter name and last name and email id
		driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("abcd");
		driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("efg");
		driver.findElement(By.id("createUserPanel_emailField")).sendKeys("abcd@gmail.com");
		
		//click on save and invitation button
		driver.findElement(By.className("buttonsBox")).click();
		
	}
}
