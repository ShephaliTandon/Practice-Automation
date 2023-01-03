package PracticeAutomation;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutosuggestionFlipkart {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
	
	driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]")).sendKeys("iphone");
	
	//wait for all suggestion to be loaded
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[contains(@class,'MRYA')]//div[contains(@data-tkid,'iphone ')]")));

    List<WebElement> allsugge=driver.findElements(By.xpath("//ul[contains(@class,'MRYA')]//div[contains(@data-tkid,'iphone ')]"));
	for(WebElement wb: allsugge)
	{
		System.out.println(wb.getText());
	}
	System.out.println(allsugge.size());

}
}
