package MouseAction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {

	public static void main(String[] args) {
		ChromeOptions ch_option = new ChromeOptions();
		ch_option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch_option);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		

	}

}
