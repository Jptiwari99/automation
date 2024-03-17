package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement italy = driver.findElement(By.xpath("//div[text()='Italy']"));
		WebElement Madrid = driver.findElement(By.id("box7"));
		WebElement Spain = driver.findElement(By.xpath("//div[text()='Spain']"));
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement SouthKorea = driver.findElement(By.xpath("//div[text()='South Korea']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(rome, italy).build().perform();
		act.dragAndDrop(Madrid, Spain).build().perform();
		act.dragAndDrop(Seoul ,SouthKorea).build().perform();
		
		

	}

}
