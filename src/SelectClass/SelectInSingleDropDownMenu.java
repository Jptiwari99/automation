package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumclass.Generalization;

public class SelectInSingleDropDownMenu extends Generalization {
	public static void main(String[] args) throws InterruptedException {
		preCondition1();
		driver.get("file:///C:/Users/dell/Desktop/demo.html");
		WebElement single_level = driver.findElement(By.id("standard_cars"));
		Select ref = new Select(single_level);
		//Thread.sleep(2000);
		//ref.selectByValue("lr");
		//Thread.sleep(2000);
		//ref.selectByIndex(1); // indexing start from 0
		//Thread.sleep(2000);
		for(int i = 1; i<=11; i++)
		{
			ref.selectByIndex(i);
			Thread.sleep(2000);
			
		}
		postConditionclose();

	}

}
