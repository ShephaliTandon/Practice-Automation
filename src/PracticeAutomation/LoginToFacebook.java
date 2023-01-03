package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//enter email as abcd@gmail.com
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		
		//enter password as abcd1234
		driver.findElement(By.name("pass")).sendKeys("abcd1234");
		
		//click on login button
		driver.findElement(By.id("u_0_b")).click();
		
		//Thread.sleep(500);
		String actualTitle = driver.getTitle();
		System.out.println("actual homepage title is :" + actualTitle);
		
		
		//Thread.sleep(3500);
		String expTitle = "Log in to Facebook";
		if(actualTitle.equals(expTitle))
		{
			System.out.println("login scenario pass");
		}
		else
		{
			System.out.println("login scenario fail");
		}
		driver.close();
	}

}
