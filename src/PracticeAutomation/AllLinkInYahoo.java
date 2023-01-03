package PracticeAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllLinkInYahoo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/?p=us&guccounter=1");
		
		driver.findElement(By.id("header-search-input")).sendKeys("selenium");
		
		//wait for all suggestion to be loaded
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li[@role='option']")));
		
		List<WebElement> allSuggestion =driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='option']"));
		for(WebElement wb : allSuggestion)
		{
			System.out.println(wb.getText());
		}
		//Thread.sleep(1000);
		System.out.println("total suggestion are :" + allSuggestion.size());
		
		//click to required items from suggestion 
		for(WebElement wb : allSuggestion)
		{
			String data = wb.getText();
			if(data.contains("tutorials"))
			{
				wb.click();
				break;
			}
		}
		driver.close();
	}

}
