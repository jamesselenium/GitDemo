package training2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dave\\Downloads\\ChromeWebdriver\\nwcversion\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.cssSelector("[name='courses']"));
		List<WebElement> rows = table.findElements(By.cssSelector("tbody tr td:nth-child(3)"));
		for (int i = 0; i < rows.size(); i++) {
			System.out.println(rows.get(i).getText());
			Thread.sleep(3000);

		}
		
		

	}

}
