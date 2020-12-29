import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AlotOfEXERC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		/*
		 * WebElement Footer= driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		 * System.out.println(Footer.findElements(By.tagName("a")).size());
		 * 
		 * WebElement FooterColumn =
		 * driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		 * Actions Builder=new Actions(driver);
		 * 
		 * for(int i=0;i<FooterColumn.findElements(By.tagName("a")).size();i++) { String
		 * columnkey = Keys.chord(Keys.CONTROL,Keys.ENTER);
		 * FooterColumn.findElements(By.tagName("a")).get(i).sendKeys(columnkey);
		 * Thread.sleep(3000);
		 * //Builder.moveToElement(FooterColumn.findElements(By.tagName("a")).get(i)).
		 * keyDown(Keys.CONTROL).click().build().perform(); }
		 * 
		 * Set<String> Ids = driver.getWindowHandles(); Iterator<String>
		 * it=Ids.iterator(); /*for(int i=0;i<Ids.size();i++ ) { String Page=it.next();
		 * System.out.println(driver.switchTo().window(Page).getTitle()); }
		 */
		/*
		 * while(it.hasNext()) {
		 * 
		 * driver.switchTo().window(it.next()); System.out.println(driver.getTitle()); }
		 */

		// Assignment :

		// to get the checkbox value
		driver.findElement(By.id("checkBoxOption2")).click();
		// store it in a string variable
		String checkBoxText = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		Select S = new Select(driver.findElement(By.id("dropdown-class-example")));
		// select thevalue checked
		S.selectByValue(checkBoxText);
		// get the value of selected option in the dropdown
		WebElement selectedValue = S.getFirstSelectedOption();
		driver.findElement(By.id("name")).sendKeys(selectedValue.getText());
		driver.findElement(By.id("alertbtn")).click();
		// verify id the value typed in the textbox exist in message alert
		if (driver.switchTo().alert().getText().contains(checkBoxText));
		System.out.println("it does");

	}

}
