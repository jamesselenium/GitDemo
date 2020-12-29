import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		//QUESTION1:
		dv.get("https://rahulshettyacademy.com/AutomationPractice/");
		dv.findElement(By.cssSelector("[id='checkBoxOption1']")).click();
		System.out.println(dv.findElement(By.cssSelector("[id='checkBoxOption1']")).isSelected());
		Thread.sleep(6000); 
		dv.findElement(By.cssSelector("[id='checkBoxOption1']")).click();
		System.out.println(dv.findElement(By.cssSelector("[id='checkBoxOption1']")).isSelected());
		
		//QUESTION2:
		System.out.println(dv.findElements(By.cssSelector("[type='checkBox']")).size());
		System.out.println("changes 1");
		System.out.println("changes 2");
		System.out.println("changes 915");
	}

}
