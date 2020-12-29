import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class redif {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		
		dv.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		WebElement source= dv.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity inactiveWidget')]"));
				Thread.sleep(4000);
				source.click();
				WebElement sr2 = dv.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
				Thread.sleep(4000);
		sr2.sendKeys(Keys.ARROW_DOWN);
		sr2.sendKeys(Keys.ARROW_DOWN);
		
		/*driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.cssSelector("[id='login1']")).sendKeys("ahmed@gmail.com");
		driver.findElement(By.cssSelector("[name='passwd']")).sendKeys("123456");*/
		//driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("heyy");
	//driver.findElement(By.xpath("//div[text()='21:00']")).click();
	}

}
