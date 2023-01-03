package PracticeAutomation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickCurrentDateFromDesktop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// url of clear trip
		driver.get("https://www.cleartrip.com/?dxid=CjwKCAiAsOmABhAwEiwAEBR0Zh0oRz62i91ySRjZoarMVzZIHDxa1a6Z5f6TqE8ew5GNgVn3TWUhVxoCXjQQAvD_BwE&gclid=CjwKCAiAsOmABhAwEiwAEBR0Zh0oRz62i91ySRjZoarMVzZIHDxa1a6Z5f6TqE8ew5GNgVn3TWUhVxoCXjQQAvD_BwE");
		
		//click on depart date icon
		driver.findElement(By.id("DepartDate")).click();
		
		//handle current date
		driver.findElement(By.xpath("//a[contains(@class, 'highlight')] ")).click();	
		WebElement Date = driver.findElement(By.className("dateField"));
		String s = Date.getAttribute("value");
		System.out.println(s);
		driver.close();
	}
}
