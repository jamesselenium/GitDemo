import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		/*
		 * dv.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * dv.findElement(By.id("name")).sendKeys("ahmed daoud");
		 * /*dv.findElement(By.id(("alertbtn"))).click();
		 * dv.findElement(By.id("confirmbtn")).click();
		 * System.out.println(dv.switchTo().alert().getText());
		 * dv.switchTo().alert().dismiss();
		 */
		dv.get("http://cleartrip.com");
		dv.findElement(By.id("DepartDate")).click();
		dv.findElement(By.cssSelector("a.ui-state-default.ui-state-active ")).click();
		Select Adult = new Select(dv.findElement(By.id("Adults")));
		Adult.selectByIndex(4);

		Select Children = new Select(dv.findElement(By.id("Childrens")));
		Children.selectByValue("3");

		Select infants = new Select(dv.findElement(By.id("Infants")));
		infants.selectByIndex(1);

		dv.findElement(By.id("MoreOptionsLink")).click();
		dv.findElement(By.id("AirlineAutocomplete")).sendKeys("logna");
		dv.findElement(By.id("SearchBtn")).click();
		System.out.println(dv.findElement(By.id("homeErrorMessage")).getText());
	}

}
