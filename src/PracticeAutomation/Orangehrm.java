package PracticeAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orangehrm {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.xpath("//a[text()='FREE 30 Day Trial']")).click();
		// or driver.findElement(By.partialalllinktext("Day Trial")).click();
		
		
		
		// name lastname email job title companyname mobile number
	    //driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("abced");
	    //driver.findElement(By.name("LastName")).sendKeys("xyzh");
	    //driver.findElement(By.name("Email")).sendKeys("xyzh@gmail.com");
	    //driver.findElement(By.name("JobTitle")).sendKeys("HCL");
	    //driver.findElement(By.name("CompanyName")).sendKeys("HCL1");
	    //driver.findElement(By.name("Contact")).sendKeys("99999999999");
	    
	    //select employees
	    WebElement employeeList = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
	    Select s = new Select(employeeList);
		s.selectByIndex(5);
	
		List<WebElement>allOpt = s.getOptions();
		for(WebElement wb: allOpt)
		{
			System.out.println(wb.getText());
		}
		System.out.println("Total number option: " + allOpt.size());
		System.out.println("..............................................");
		
	    
	    //select industry
	    WebElement industryList = driver.findElement(By.id("Form_submitForm_Industry"));
	    Select s1 = new Select(industryList);
		s.selectByIndex(5);
	
		List<WebElement>allOpt1 = s.getOptions();
		for(WebElement wb: allOpt1)
		{
			System.out.println(wb.getText());
		}
		System.out.println("Total number option: " + allOpt1.size());
		System.out.println("..............................................");
		
	   
			//select country
		WebElement countryList = driver.findElement(By.id("Form_submitForm_Country"));
		Select s2 = new Select(countryList);
		s1.selectByIndex(5);
		
		
		List<WebElement>allOpt2 = s2.getOptions();
		for(WebElement wb: allOpt2)
		{
			System.out.println(wb.getText());
		}
		System.out.println("Total number option: " + allOpt2.size());
		System.out.println("..............................................");
		driver.quit();
	}

}
