package PracticeAutomation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartWindowPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		//open flipkart
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//close all child 
		//for(String id : allId)
		//{
			//if(!mainId.equals(id))
		//	{
			//	driver.switchTo().window(id);
			//	driver.close();
			//}
		//}
		//switch to main window()
		//driver.switchTo().window(mainId);
		
		//popup remove
		driver.findElement(By.xpath("//button[text() ='✕']")).click();
		
		//search iphone x
		driver.findElement(By.name("q")).sendKeys("iphone x");
		
		//click on search
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//click on iphone x
		driver.findElement(By.xpath("//div[text()='Apple iPhone 11 (Purple, 64 GB)']")).click();
		
		//switch to 1st new tab 
		String mainId = driver.getWindowHandle();
		Set<String>allId1 = driver.getWindowHandles();
		for(String id : allId1)
		{
			if(!mainId.equals(id))
			{
				driver.switchTo().window(id);
			}
		}
	//click on add to cart
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("Shopping Cart"));
		
		String price = driver.findElement(By.xpath("//a[text()='Apple iPhone 11 (Purple, 64 GB)']/../../span")).getText();
		
		System.out.println(price);
		driver.quit();
			}
		}
