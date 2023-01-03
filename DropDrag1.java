package PracticeAutomation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDrag1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//don't use id by number use by visible text
		WebElement dragEle = driver.findElement(By.xpath("//div[text()='Oslo']"));
		WebElement dropEle = driver.findElement(By.xpath("//div[text()='Norway']"));
		
		WebElement dragEle1 =driver.findElement(By.xpath("//div[text()='Oslo']"));
		WebElement dropEle1 =driver.findElement(By.xpath("//div[text()='Sweden']"));
		
		WebElement dragEle2 =driver.findElement(By.xpath("//div[text()='Washington']"));;
		WebElement dropEle2 =driver.findElement(By.xpath("//div[text()='United States']"));
		
		WebElement dragEle3 =driver.findElement(By.xpath("//div[text()='Copenhagen']"));
		WebElement dropEle3 =driver.findElement(By.xpath("//div[text()='Denmark']"));
		
		WebElement dragEle4 =driver.findElement(By.xpath("//div[text()='Seoul']"));
		WebElement dropEle4 =driver.findElement(By.xpath("//div[text()='South Korea']"));
		
		WebElement dragEle5 =driver.findElement(By.xpath("//div[text()='Rome']"));
		WebElement dropEle5 =driver.findElement(By.xpath("//div[text()='Italy']"));
		
		WebElement dragEle6 =driver.findElement(By.xpath("//div[text()='Madrid']"));
		WebElement dropEle6 =driver.findElement(By.xpath("//div[text()='Spain']"));
		
		Actions act =new Actions(driver);
		act.clickAndHold(dragEle).release(dropEle).build().perform();
		act.clickAndHold(dragEle1).release(dropEle1).build().perform();
		act.clickAndHold(dragEle2).release(dropEle2).build().perform();
		act.clickAndHold(dragEle3).release(dropEle3).build().perform();
		act.clickAndHold(dragEle4).release(dropEle4).build().perform();
		act.clickAndHold(dragEle5).release(dropEle5).build().perform();
		act.clickAndHold(dragEle6).release(dropEle6).build().perform();
		
		}
	}


