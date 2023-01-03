package PracticeAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");

	Thread.sleep(2000);
	//click on upload resume
	driver.findElement(By.id("wdgt-file-upload")).click();
	
	StringSelection path = new StringSelection("‪‪C:\\Users\\SHEPHALI\\Downloads\\Resume.pdf");
	Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
	
	clip.setContents(path, null);
	
	Thread.sleep(1000);
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	

}
}