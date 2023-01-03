package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWebDriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//search for iphone x
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x");
		
		//click on search
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// showing result inventary line 
		String inventaryLine = driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		
		//print inventary line
		System.out.println(inventaryLine +" iphone x");
		driver.close();
	}

}
