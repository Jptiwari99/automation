package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClicktheRegisterButton {

	public static void main(String[] args) {
		String given_url="https://demowebshop.tricentis.com/";

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");;
		if(given_url.equalsIgnoreCase(given_url)) {
			System.out.println(" i am in dws page");
			WebElement element = driver.findElement(By.className("ico-register"));
			
			element.click();
			driver.close();
		}
		else
	        System.out.println("i amnot dws page ");

	}

}
