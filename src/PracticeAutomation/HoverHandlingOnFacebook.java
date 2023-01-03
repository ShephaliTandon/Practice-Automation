package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HoverHandlingOnFacebook {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	//click on creat account
	driver.findElement(By.xpath("//a[text()= 'Create New Account']")).click();
	//singup page display clic on ? mark odf date of birth
	WebElement chk = driver.findElement(By.id("birthday-help"));
	
	String checkHoverMsg = chk.getAttribute("title");
	System.out.println(checkHoverMsg);
	driver.close();
	}

}
