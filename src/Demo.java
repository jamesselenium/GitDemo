import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// SELENIUM Code 
		// Driver object:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dave\\Downloads\\ChromeWebdriver\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		dv.get("https://facebook.com"); //hit url in the browser
		System.out.println(dv.getTitle()); //Valdiate Page title is correct
		System.out.println(dv.getCurrentUrl()); // Validate if you are in correct URL
		/*dv.findElement(By.xpath("//*[@type='email']")).sendKeys("ahmed@gmail.com"); *///XPATH FORUMULA
		//dv.findElement(By.cssSelector("input[value='Connexion']")).click();
		/*dv.findElement(By.id("email")).sendKeys("haki@gmail.com");
		dv.findElement(By.cssSelector("#pass")).sendKeys("123456");*/
		//dv.findElement(By.linkText("Informations de compte oubliées ?")).click();
		//dv.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();
		//System.out.println(dv.getPageSource());
		//dv.get("https://yahoo.com");
		
		//dv.navigate().back();
		//dv.close(); //close current drive
		//dv.quit(); // close all drivers opened by selenium
		//int a =5;
		//int b=6;
		//System.out.println(a+b);
		//class1 c1 = new class1();
		//c1.pr();
		
	}

}
