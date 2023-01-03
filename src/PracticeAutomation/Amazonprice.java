package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonprice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x");

		//click on search
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String str=driver.findElement(By.xpath("//span[text()='Apple iPhone Xs (512GB) - Space Grey']/../../../following::div[9]/a/span[1]/span[2]/span[2]")).getText();
		
		System.out.println("product price is: " + str);
		driver.quit();
	}
}
