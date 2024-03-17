package Register;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream_11 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");  
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("send-sms-iframe");
	    WebElement traget = driver.findElement(By.id("send-sms-iframe"));
	    driver.switchTo().frame(traget);
		
		driver.findElement(By.id("regEmail")).sendKeys("123456789");
		

	}

}

