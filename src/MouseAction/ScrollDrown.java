package MouseAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDrown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.keyUp(Keys.PAGE_DOWN).build().perform();
		act.keyUp(Keys.PAGE_DOWN).build().perform();
		act.keyUp(Keys.PAGE_UP).build().perform();
		act.keyUp(Keys.PAGE_UP).build().perform();
		
	}

}
