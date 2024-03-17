package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeGoogle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		driver.get("file:///C:/Users/dell/AppData/Local/Microsoft/Windows/INetCache/IE/U6ZP1LAY/iframe[1].html"); 
		driver.findElement(By.xpath("//a[text()='Google']")).click();
	}

}
