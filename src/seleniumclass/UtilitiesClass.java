package seleniumclass;

import org.openqa.selenium.By;

public class UtilitiesClass extends MyOwnUtilityClass{

	public static void main(String[] args) throws InterruptedException {
		
		precon();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		Thread.sleep(2000);
		//driver.quit();

	}

	
}
