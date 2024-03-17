package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nokari_Com {

	public static void main(String[] args) throws InterruptedException {
		String given_url = "https://www.naukri.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		String Current_url = driver.getCurrentUrl();
		if (given_url.equalsIgnoreCase(Current_url)) {
			System.out.println("u r succes enter");
		} else
			System.out.println("u r not enterd");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//input[@='formInput __input'")).sendKeys("vicky");
		

	}

}
