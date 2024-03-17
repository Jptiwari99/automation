package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumclass.Generalization;

public class FacebookDropDown extends Generalization {

	public static void main(String[] args) throws InterruptedException {
		preCondition1();
		driver.get("https://www.facebook.com/reg/");
		WebElement multi_level = driver.findElement(By.id("day"));
		Select ref = new Select(multi_level);
		List<WebElement> fb_product = ref.getOptions();
		for (WebElement web : fb_product) {
			web.click();
			Thread.sleep(100);
		}
		WebElement multi_level1 = driver.findElement(By.id("month"));
		Select ref1 = new Select(multi_level1);
		List<WebElement> fb_product1 = ref1.getOptions();
		for (WebElement web : fb_product1) {
			web.click();
			Thread.sleep(100);
		}
		WebElement multi_level2 = driver.findElement(By.id("year"));
		Select ref2 = new Select(multi_level2);
		List<WebElement> fb_product2 = ref2.getOptions();
		for (WebElement web : fb_product2) {
			web.click();
			Thread.sleep(100);
		}


	}
}
