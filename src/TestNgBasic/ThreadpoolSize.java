package TestNgBasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThreadpoolSize {
	@Test(priority = 2,invocationCount=2,threadPoolSize=3)
	public void easemytrip() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.close();
		Reporter.log("easemytrip",true);
	}
	@Test(priority = 1)
	public void redbus() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.close();
		Reporter.log("redbus",true);
	}
	@Test(priority = 0)
	public void indiamart() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indiamart.com/");
		driver.close();
		Reporter.log("indiamart",true);
	}

}
