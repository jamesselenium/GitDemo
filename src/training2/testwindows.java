package training2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\nwcversion\\\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		/*
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		List<WebElement> links=footer.findElements(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul/li/a"));
		
		Actions builder = new Actions(driver);
		for(int i=0;i<links.size();i++)
		{
			builder.moveToElement(links.get(i)).keyDown(Keys.CONTROL).click().build().perform();
		}
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it =id.iterator();
		while(it.hasNext())
		{
			
			System.out.println(driver.switchTo().window(it.next()).getTitle());
			
		}*/
		 
List<String> a=new ArrayList<String>();
a.add("ahmed");
a.add("daoud");
for(String s:a)
{
	System.out.println(s);
}

	}

}
