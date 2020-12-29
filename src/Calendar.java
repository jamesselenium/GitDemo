import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(4000);
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("September")) {
			driver.findElement(By.cssSelector("[class=' table-condensed'] th[class='next']")).click();
		}
		List<WebElement> Days=driver.findElements(By.cssSelector(".day"));
		int count=Days.size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
		if(text.equalsIgnoreCase("25"))
		{
			driver.findElements(By.cssSelector(".day")).get(i).click();
			break;
		}
		}
		
		
	}

}
