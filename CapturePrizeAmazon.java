package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*open amazon
 * search for product
 * give any product name prize
 */
public class CapturePrizeAmazon {

	public static void main(String[] args) throws InterruptedException {
	
		String productName = "Apple iPhone Xs (512GB) - Space Grey";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//search for iphone x
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x");
				
		//click on search
		driver.findElement(By.id("nav-search-submit-button")).click();
				
		// price of iphone x 
		String price = driver.findElement(By.xpath(getPriceXpath(productName))).getText();
		
		System.out.println("Price of " + productName + " is : " + price);
		driver.quit();
	}

	private static String getPriceXpath(String productName) {
		{
			String xpath="//span[text()='"+productName+"']/../../../following::div[9]/a/span[1]/span[2]/span[2]";
			
		   return xpath;
		}
	
}
}