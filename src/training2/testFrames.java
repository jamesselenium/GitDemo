package training2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\nwcversion\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
WebDriverWait w = new WebDriverWait(driver,5);
w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#courses-iframe")));

WebElement frameLocation=driver.findElement(By.cssSelector("#courses-iframe"));

driver.switchTo().frame(frameLocation);
driver.findElement(By.xpath("a[text*='Articles']")).click();

	}

}
