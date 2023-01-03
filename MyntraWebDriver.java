package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraWebDriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		//search reebookshoes
		driver.findElement( By.className("desktop-searchBar")).sendKeys("reebok shoes");
		
		//click on search button
		driver.findElement(By.className("desktop-submit")).click();
		
		//Thread.sleep(3000);
		//inventary line 
		String inventaryLine = driver.findElement(By.xpath("//span[contains(@class,'title')]")).getText();
				
		//print inventary line
		System.out.println(inventaryLine);
		driver.close();

	}

}
