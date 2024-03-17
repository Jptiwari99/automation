package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementCategories {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
		    List<WebElement> products = driver.findElements(By.xpath("//ul[@class='list'][1]/li/a"));
		    Thread.sleep(2000);
		    for(WebElement w:products) {
		    	w.click();
		    	Thread.sleep(2000);
		    	driver.navigate().back();
		    	
		    }
 
	}

}
