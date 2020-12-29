package training2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testecommerce {
	public static List<String> vegies = Arrays.asList("Cucumber", "Beans", "Brinjal");
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\nwcversion\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> Allvegies = driver.findElements(By.cssSelector("[class='product-name']"));
		
		List<WebElement> w;
		
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		int j=0;
		for(int i=0;i<Allvegies.size();i++)
		{
			if(Allvegies.get(i).getText().contains(vegies.get(j)))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
			}
			if(j>=3)
				break;
		}
		

	}
	public static String getVegiename(int j)
	{
		return vegies.get(j);
	}
	public static WebElement getbutton(WebElement j)
	{
		WebElement s =j.findElement(By.xpath("//div[@class='product-action']/button"));
		return s;
	}

}
