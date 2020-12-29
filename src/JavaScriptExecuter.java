import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//JavascriptExecutor
		/*
		JavascriptExecutor js= (JavascriptExecutor)driver;

		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i =0;
		//BENGALURU INTERNATION AIPORT
		while(!text.equalsIgnoreCase("BENGALURU INTATION AIPORT"))
		{
		i++;
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

		text=(String) js.executeScript(script);
		System.out.println(text);
		if(i>10)
		{
		break;
		}

		}

		if(i>10)
		{
		System.out.println("Element not found");
		}
		else
		{
		System.out.println("Element  found");
		}
		*/
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		WebElement dropDownBox=driver.findElement(By.id("autocomplete"));
				dropDownBox.click();
		dropDownBox.sendKeys("united");
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		String Keyword="United States (USA)";
		String ChekedText= "return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(ChekedText);
		System.out.println(text);
		
		while(!Keyword.equalsIgnoreCase(text))
		{
			dropDownBox.sendKeys(Keys.ARROW_DOWN);
		text=(String) js.executeScript(ChekedText);
		if(Keyword.equalsIgnoreCase(text))
			dropDownBox.sendKeys(Keys.ENTER);
		}
		
		
		

	}

}
