package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\dell\\OneDrive\\Documents\\vicky doc\\Image .jpg");
		Thread.sleep(2000);
		driver.findElement(By.id("processTask")).click(); 
		
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
	}

}
