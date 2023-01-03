package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertRediff1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
		driver.findElement(By.xpath("//input[contains(@onblur,'fieldTrack(this);')]")).sendKeys("neha kumar");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1Qw123456@12345");
		driver.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]")).sendKeys("1Qw123456@12345");
		driver.findElement(By.xpath("//input[contains(@name,'altemail')]")).sendKeys("ahat@gmail.com");
		driver.findElement(By.id("mobno")).sendKeys("888888888");
		
		//enter date of birth
		WebElement Day = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select s = new Select(Day);
		s.selectByIndex(18);
		
		driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]/../select[2]/option[7]")).click();
	
		driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]/../select[3]/option[28]")).click();;
		
		//select gender
		driver.findElement(By.xpath("//input[@value = 'f']")).click();
		
		driver.findElement(By.xpath("//option[text()='Nagpur']")).click();
		
		driver.findElement(By.id("Register")).click();
		
		//switch focus from main screen to alert popup
		Alert alt = driver.switchTo().alert();
		String alterMsg = alt.getText();
		System.out.println(alterMsg);
		alt.accept();
		driver.close();	
	}

}
