package PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebDriverMethods1 {

	private static final org.openqa.selenium.Dimension Dimension = null;

	public static void main(String[] args) throws InterruptedException {
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//open browser
		driver.get("http://www.myntra.com/");
		
		//maximize browser
		driver.manage().window().maximize();

		//resize browser
		driver.manage().window().setSize(new Dimension(500,700));
		
		//reposition Browser
		driver.manage().window().setPosition(new Point(500,300));
		
		driver.quit();
	}

}
