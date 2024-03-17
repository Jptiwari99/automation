package seleniumclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Generalization {
	public static  WebDriver driver;
	public static void preCondition1()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void preCondition2() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	public static void preCondition3(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	public static void preCondition4() {
		driver=new SafariDriver();
		driver.manage().window().maximize();
		
	}
	

	public static void postConditionclose() {
		driver.close();
		
		
		

	}
	public static void postConditionquit() {
		driver.quit();
	}
	

}
