package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumclass.Generalization;

public class MultiSelect extends Generalization {

	public static void main(String[] args) throws InterruptedException {
		preCondition1();
		driver.get("file:///C:/Users/dell/Desktop/demo.html");
		WebElement multi_level = driver.findElement(By.id("multiple_cars"));
		Select ref = new Select(multi_level);
		List<WebElement> car_product = ref.getOptions();
		for(WebElement web:car_product) {
			web.click();
			Thread.sleep(2000);
		

	}

}
}
