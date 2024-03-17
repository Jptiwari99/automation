package Bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Royel {
	@Test
	public void royel() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));

		driver.get("https://www.royalenfield.com/");
		driver.close();
	}
}
