import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataGridCricketex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		/*
		int Sum=0;
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		WebElement table= driver.findElement(By.cssSelector(".cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"
				+ " div:nth-child(3)")).size();
	//	WebElement rows=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
	for(int i=0;i<rowcount-2;i++)
	{
	String RowsValue=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"
				+ " div:nth-child(3)")).get(i).getText();
		Sum=Sum+Integer.parseInt(RowsValue);
	}
	System.out.println(Sum);
	String LastRowValue=table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	String TotValue=table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	Sum=Sum+Integer.parseInt(LastRowValue);
	System.out.println(Sum);
	if(Sum==Integer.parseInt(TotValue))
	{
		System.out.println("it does");
	}
	*/
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement Table=driver.findElement(By.id("product"));
		int TotalRows=Table.findElements(By.tagName("tr")).size();
		int TotalColoms=Table.findElements(By.cssSelector("tr th")).size();
		System.out.println(TotalRows);
		System.out.println(TotalColoms);
		int RowCount=Table.findElements(By.cssSelector("tbody tr:nth-child(3) td")).size();
		for(int i=0;i<RowCount;i++)
		{
			System.out.println(Table.findElements(By.cssSelector("tbody tr:nth-child(3) td")).get(i).getText());
		}
		/*List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		 * System.out.println(secondrow.get(0).getText());
		 * System.out.println(secondrow.get(1).getText());
		 * System.out.println(secondrow.get(2).getText());*/
		
	}

}
