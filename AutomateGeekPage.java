package PracticeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateGeekPage {

	public static void main(String []args)
	{
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://topgeek.io/");
		driver.findElement(By.xpath("//div[@class='css-5j8aew']")).click();
		driver.findElement(By.xpath("//button[text()='Explore openings']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search jobs...']")).sendKeys("React");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
	}
}
