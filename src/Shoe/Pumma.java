package Shoe;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pumma {
	@Test
	public void pumma() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));

		driver.get("https://in.puma.com/");
		driver.close();
	}
}
