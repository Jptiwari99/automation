package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement rome = driver.findElement(By.id("box6"));
       WebElement italy = driver.findElement(By.xpath("//div[text()='Italy']"));
       Actions act=new Actions(driver);
       act.click(rome).release(italy).build().perform();
       

	}

}
