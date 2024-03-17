package RummyXl;

import org.openqa.selenium.chrome.ChromeDriver;

public class RummyTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rummyxl.com/");
		Thread.sleep(2000);
	}

}
