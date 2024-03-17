package seleniumclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {
	static 	WebDriver driver;
	public static void preCon1();{
		driver=new ChromeDriver();
		driver.manage().window().maximize();		
	}
	

}
