package seleniumclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyOwnUtilityClass {
	static WebDriver driver;

	public static void chrome() {
		driver = new ChromeDriver();
	}

	public static void edge() {
		driver = new EdgeDriver();
	}

	public static void fire() {
		driver = new FirefoxDriver();
	}
	public static void iE() {
		driver=new InternetExplorerDriver();
	}
	public static void precon() {
		chrome();
		driver.manage().window().maximize();
	}
	public static void postcon() {
		driver.close();
	}

}
