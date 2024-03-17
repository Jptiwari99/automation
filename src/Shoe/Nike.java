package Shoe;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nike {
	@Test
	public void nike() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));

		driver.get("https://www.nike.com/in/w/womens-shoes-5e1x6zy7ok");
		driver.close();
	}
}
