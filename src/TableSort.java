import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<WebElement> WebList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		int count = driver.findElements(By.cssSelector("tr td:nth-child(2)")).size();
		ArrayList<String> OriginalList = new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			OriginalList.add(WebList.get(i).getText());
		}
		ArrayList<String> ComparedList = new ArrayList<String>();
		for(String s:OriginalList)
		{
			ComparedList.add(s);
		}
		Collections.sort(ComparedList);
		System.out.println("************original Llist");
		for(String s:OriginalList)
		{
			System.out.println(s);
		}
		
		System.out.println("************Sorted List");
		for(String s:ComparedList)
		{
			System.out.println(s);
		}
		Assert.assertTrue(ComparedList.equals(OriginalList));
		
	}

}
