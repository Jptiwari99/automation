package seleniumclass;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage1 {

	public static void main(String[] args) throws InterruptedException {
       //ChromeDriver driver = new ChromeDriver();
	    ChromeDriver driver = new ChromeDriver();
	    Thread.sleep(5000);
       driver.manage().window().fullscreen();
       driver.manage().window().maximize();
       driver.navigate().to("https://www.instagram.com");
       driver.navigate().refresh();
       driver.navigate().back();
       driver.navigate().wait();
      // driver.close();

       driver.get("https://www.instagram.com");
	}

}
