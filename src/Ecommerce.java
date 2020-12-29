import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] Tabnames = { "Brocolli", "Beetroot", "Potato" };
		//Thread.sleep(3000);
		AutoPurchase(driver,Tabnames);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div/button")).click();
		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
				
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		/*Ecommerce m1 = new Ecommerce();
		m1.AutoPurchase(driver, Tabnames);*/

	}

	public static void AutoPurchase(WebDriver driver, String[] Tabnames) {

		List<WebElement> productsElement = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < productsElement.size(); i++) {
			String[] longName = productsElement.get(i).getText().split("-");

			String name = longName[0].trim();
			List arrayNames = Arrays.asList(Tabnames);

			if (arrayNames.contains(name)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			if (j == 3)
				break;
		}
	}

}
