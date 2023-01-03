package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTime {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	//enter username as admin
	driver.findElement(By.id("username")).sendKeys("admin");
	
	//enter password as manager
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	//click on login button
	driver.findElement(By.id("loginButton")).click();
	
	String actualTitle = driver.getTitle();
	System.out.println("actual homepage title is :" + actualTitle);
	
	String expTitle = "actiTIME - Enter Time-Track";
	
	if(actualTitle.equals(expTitle))
	{
		System.out.println("login scenario pass");
	}else
	{
		System.out.println("login scenario fail");
	}
	driver.close();
 }	
}