package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IrtcMouseControl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		//mouse handling to holiday
		WebElement HOLIDAYS = driver.findElement(By.xpath("//a[@aria-label ='Menu Holiday']"));
		Actions act = new Actions(driver);
		act.moveToElement(HOLIDAYS).perform();
		
		//mouse handling to special train
		WebElement Trains = driver.findElement(By.xpath("//span[text()='Special Trains']"));
		act.moveToElement(Trains).perform();
		
		//to click on maharaj express
		driver.findElement(By.xpath("//span[text() = 'Maharaja\"s Express']")).click();
		
		
		
	}

}
