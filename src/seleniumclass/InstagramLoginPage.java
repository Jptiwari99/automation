package seleniumclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.findElement(By.name("username")).sendKeys("jp_tiwari06");
		driver.findElement(By.name("password")).sendKeys("0711!");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		driver.findElement(By.className("Home")).click();
		Thread.sleep(3000);

	}

}
