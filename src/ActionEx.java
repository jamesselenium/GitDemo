import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dave\\\\Downloads\\\\ChromeWebdriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Actions
		/*driver.get("https://amazon.com");
		WebElement move=driver.findElement(By.id("nav-link-accountList"));
		Actions builder = new Actions(driver);
		
	    builder.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).
	    click().keyDown(Keys.SHIFT).sendKeys("computer").doubleClick().build().perform(); 
		builder.moveToElement(move).contextClick().build().perform();*/
		
		//Handling parent child Windows 
       /*  driver.get("https://accounts.google.com/signup?hl=en");
         //driver.findElement(By.xpath("//ul[@class='Bgzgmd']/li/a")).click();
         driver.findElement(By.cssSelector("[class='Bgzgmd'] a")).click();
         Set<String>ids=driver.getWindowHandles();
        Iterator<String> it= ids.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        
        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());*/
		
		//Assignment 
	/*	driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
	//driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.cssSelector("[class='example'] a")).click();
        Set<String> ids=driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        WebElement print1= driver.findElement(By.cssSelector("[class='example'] h3"));
      //  System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
        System.out.println(print1.getText());
        
        driver.switchTo().window(parent);
        WebElement print2= driver.findElement(By.cssSelector("[class='example'] h3"));
        System.out.println(print2.getText());
        */
        
        //Assignment FRAMES
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Frames")).click();
		
        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
        System.out.println(driver.findElement(By.id("content")).getText());
    
        
	}

}
