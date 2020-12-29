import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.common.primitives.Ints;

public class streamsMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Stream.of("ahmed", "hicham", "mariam", "Soufian", "Salma", "Saad").filter(s
		 * ->
		 * 
		 * s.startsWith("S")
		 * 
		 * ).forEach(j -> System.out.println(j));
		 */

		// Print unique number from array
		/*
		 * int[] notes = {5,5,3,2,1,3,7,5}; List<Integer> arraynotes
		 * =Ints.asList(notes);
		 * 
		 * arraynotes.stream().distinct().forEach(s->System.out.println(s));
		 */
		/*
		 * String[] names= {"Ahmed","Soufian","AABID","Hicham","Asaad"}; List<String>
		 * listNames =Arrays.asList(names);
		 * List<String>newlist=listNames.stream().sorted().collect(Collectors.toList());
		 * /*for(String s:newlist) { System.out.println(s); } Stream<String>
		 * newbigList=Stream.concat(listNames.stream(), newlist.stream());
		 * newbigList.forEach(s->System.out.println(s));
		 */

		// Sort webElemetn of Tables
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\nwcversion\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on the header
		List<String> BeanPrice;
		do
		{/*
		driver.findElement(By.xpath("//tr/th[1]")).click();*/
		List<WebElement> fruits = driver.findElements(By.xpath("//tr/td[1]"));
		/*List<String> OriginalList = fruits.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> SortedList = OriginalList.stream().sorted().collect(Collectors.toList());
      Assert.assertTrue(SortedList.equals(OriginalList));*/
      
      BeanPrice=fruits.stream().filter(s->s.getText().contains("Apple")).map(s->GetPrice(s))
    		  .collect(Collectors.toList());
      BeanPrice.forEach(s->System.out.println(s));
      if(BeanPrice.size()<1)
      {
    	  driver.findElement(By.cssSelector("[aria-label='Next']")).click();
      }
		}while(BeanPrice.size()<1);
	}
	public static String GetPrice(WebElement w)
	{
		String price;
		price= w.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
