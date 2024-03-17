package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSendKey {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys("jyoti123@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("jyoti1234");
//		driver.findElement(By.id("RememberMe")).click();
//		driver.findElement(By.id("Log in")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a")).click();

	}

}
