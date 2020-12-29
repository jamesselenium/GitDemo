import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class firefx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\dave\\Downloads\\FirefoxDriver\\geckodriver.exe");
		WebDriver dv = new FirefoxDriver();
		dv.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(dv.getCurrentUrl());
		Select s = new Select(dv.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			s.selectByIndex(0);
			System.out.println(dv.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
			dv.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).click();
			
			System.out.println(dv.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
			System.out.println(dv.findElements(By.cssSelector("[type='checkbox']")).size());
			
			/*dv.findElement(By.cssSelector("input[id*='rbtnl_Trip_1']")).click();*/
			/*dv.findElement(By.id("divpaxinfo")).click();
			
			Thread.sleep(2000L);
			for(int i=1;i<5;i++)
			{dv.findElement(By.id("hrefIncAdt")).click();
				
			}
			
			
			System.out.println(dv.findElement(By.id("divpaxinfo")).getText());
			dv.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
			dv.findElement(By.xpath("//a[@text='Adampur (AIP)']")).click();
			dv.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click();
			
			*/
	}

}
