package PracticeAutomation;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoWebDriverMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//open application
		driver.get("http://www.makemytrip.com/");
		driver.get("http://www.facebook.com/");
		
		Navigation nav = driver.navigate();
		
		//back
		nav.back();
		//driver.navigate().back();
		
		//forward
		nav.forward();
		
		Thread.sleep(1000);
		//refresh
		nav.refresh();
		
		//capture title
		String title = driver.getTitle();
		System.out.println("makemytrip" + title);
		System.out.println("...............");
		
		//capture source code
		String source = driver.getPageSource();
		System.out.println(source);
		System.out.println("..........");
		
		//capture current url
		String latesturl = driver.getCurrentUrl();
		System.out.println("current url :" + latesturl);
		
		//to(string url)
		nav.to("http://www.flipkart.com/");
		
		// to(URL url)
		URL u1 = new URL("http://www.myntra.com/");
		nav.to(u1);
		
		driver.quit();
		
	}
}