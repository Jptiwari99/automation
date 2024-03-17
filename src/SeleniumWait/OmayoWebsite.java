package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoWebsite {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Dropdown']")));
		dropdown .click();
		WebElement flipkart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']")));
		 flipkart.click();


	}

}
