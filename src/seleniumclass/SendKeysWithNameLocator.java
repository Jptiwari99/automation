package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithNameLocator {

	public static void main(String[] args) {
		// String given_url="https://demowebshop.tricentis.com/";

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.name("q")).sendKeys("vicky");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("vicky");
		driver.findElement(By.id("LastName")).sendKeys("tiwari");
		driver.findElement(By.id("Email")).sendKeys("jyoti123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("jyoti1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("jyoti1234");
		driver.findElement(By.id("register-button")).click();
		// driver.findElement(By.partialLinkText("Shopping cart")).click();
		// driver.findElement(By.tagName("input")).sendKeys("vicky");
		// driver.findElement(By.cssSelector("input [type='submit']")).click();

		// driver.close();

	}

}
