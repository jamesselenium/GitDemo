package training1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1T1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\dave\\\\\\\\Downloads\\\\\\\\ChromeWebdriver\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		WebElement table= driver.findElement(By.xpath("//div[@id='innings_1']/div[1]"));
		int count = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms")).size();
		List<WebElement> rows=table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)"));
		int sum=0;
		
		for(int i=0;i<count-2;i++)
		{
			String textnum=rows.get(i).getText();
			sum=sum+Integer.parseInt(textnum);
			
		}
		System.out.println(sum);
		String lastRow=table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		
		sum=sum+Integer.parseInt(lastRow);
		System.out.println(sum);
		String total = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		if(Integer.parseInt(total)==sum)
			System.out.println("equial");
		
	
	}

}
