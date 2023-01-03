package PracticeAutomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseControls {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			//mousehandling on electronics
			WebElement Electronics = driver.findElement(By.xpath("//div[text() = 'Electronics']"));
			Actions act = new Actions(driver);
			act.moveToElement(Electronics).perform();
			
			//mousehandling on mobile accessories
			WebElement Accessories = driver.findElement(By.xpath("//a[text()= 'MobileAccessory']"));
			// or  WebElement Accessories = driver.findElement(By.linkText("MobileAccessory"));
			//Actions act1 = new Actions(driver);(no need to add again again new object)
			act.moveToElement(Accessories).perform();
			
			//mousehandling on mobile cable
			driver.findElement(By.xpath("//a[text() = 'MobileCable']")).click();
			
		}
	}

