import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class mainex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		
		dv.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		dv.findElement(By.xpath("//input[@class='select_CTXT']")).click();
		dv.findElement(By.xpath("//a[@value='AIP']")).click();
		Thread.sleep(1000);
		dv.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
	 if(dv.findElement(By.cssSelector("#Div1")).getAttribute("style").contains("0.5"))
	 {
		 System.out.println("its disabled");
		 Assert.assertTrue(true);
	 }	 
	 else
	 {
		 System.out.println("its NOT disabled");
	 Assert.assertTrue(false);
	 }
	 Thread.sleep(5000);
	dv.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	for(int i=1;i<5;i++)
	{
		dv.findElement(By.id("hrefIncAdt")).click();
	}
	System.out.println(dv.findElement(By.cssSelector("#divpaxinfo")).getText());
	
	Select s = new Select(dv.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	s.selectByIndex(3);
		
	dv.findElement(By.cssSelector("[type='submit']")).click();
	
		

	}

}
