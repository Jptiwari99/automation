package Bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bullet {
@Test
public void bullet() {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));

	driver.get("https://www.bikewale.com/royalenfield-bikes/");
	driver.close();
}
}




