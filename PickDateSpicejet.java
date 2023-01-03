package PracticeAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickDateSpicejet {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	
	driver.findElement(By.className("ui-datepicker-trigger")).click();
	
	String cd = "//a[contains(@class, 'highlight')] ";
	String allDay = cd +"/../following-sibling::td";
	List<WebElement>allDays = driver.findElements(By.xpath(allDay));
	
	if(allDays.size() == 0)
	{
		//navigate to next weeek
		String nextWeek = cd + "/../../following-sibling::tr";
		List<WebElement>nextWeeks= driver.findElements(By.xpath(nextWeek));
		
		if(nextWeeks.size() == 0)
		{
			//navigate to next month
			String nextMonthTomorrow = cd + "/../../../../../following-sibling::div[1]//a[text()='1']";
			driver.findElement(By.xpath("nextMonthTomorrow")).click();
		}
		else {
			//pick tomorrows date in next week
			String nextWeekTomorrow = cd + "/../../following-sibling::tr[1]/td[1]";
			driver.findElement(By.xpath(nextWeekTomorrow)).click();
		}
	}
	else {
		//pick tomorrows date in same week
		String sameWeekTomorrow = cd +"/../following-sibling::td[1]";
		driver.findElement(By.xpath(sameWeekTomorrow)).click();
		driver.close();
		}
		driver.close();
	
	}
}
