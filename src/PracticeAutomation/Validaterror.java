package PracticeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validaterror {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(1000);
		WebElement errorMsg = driver.findElement(By.xpath("//span[contains(text(),'Password is invalid')]"));
		
		String actualError = errorMsg.getText();
		String expError = "password is invalid";
		if(actualError.contains(expError))
		{
			System.out.println("error validation pass");
		}
		else {
			System.out.println("error validation fail");
		}
		String colorCode = errorMsg.getCssValue("color");
		System.out.println(colorCode);
		driver.close();
		}

	}


