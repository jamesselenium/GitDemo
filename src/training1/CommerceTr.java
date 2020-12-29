package training1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommerceTr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\dave\\\\\\\\Downloads\\\\\\\\ChromeWebdriver\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] products = {"Beetroot","Cucumber","Tomato","Beans"};
		CommerceTr c1 = new CommerceTr();
		c1.autopurchase(driver, products);
		driver.findElement(By.cssSelector(".cart-icon")).click();
		driver.findElement(By.cssSelector(".action-block button")).click();

	}
	public void autopurchase(WebDriver driver,String[] products)
	{
		List<WebElement>listproduct=driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		for(int i=0;i<listproduct.size();i++)
		{
		  String[] splitP=listproduct.get(i).getText().split("-");
		  String TrimP=splitP[0].trim();
		  List arrayProducts=Arrays.asList(products);
		  if(arrayProducts.contains(TrimP))
		  {
			  driver.findElements(By.cssSelector(".product-action button")).get(i).click();
			  j++;
		  }
		  if(j==products.length)
			  break;
		}
	}

}
