package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartRatingReview {
/*
 * rating and review of iphone x
 */
	public static void main(String[] args) throws InterruptedException {
		// open application
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	//popup remove
	driver.findElement(By.xpath("//button[text() ='✕']")).click();
	
	//search iphone x
	driver.findElement(By.name("q")).sendKeys("iphone x");
	
	//click on search
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	// rating and review of iphone x
	String str= driver.findElement(By.xpath("//div[text()='Apple iPhone X (Silver, 64 GB)']/../../div[1]/div[2]/span[2]")).getText();

	
	System.out.println("rating and review of iphone x is:" + str);
	driver.quit();
	}

}
