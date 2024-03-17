   package seleniumclass;

   import org.openqa.selenium.chrome.ChromeDriver;

    public class Chrome {
	public static String given_url = "https://www.flipkart.com/";

	 public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String current_url = driver.getCurrentUrl();
		if (given_url.equalsIgnoreCase(current_url)) {
			System.out.println("my page is load");

		} else {
			System.out.println("site is not load");
		}
		driver.close();
		{

			driver.get("https://www.google.com/");
			driver.get("https://www.facebook.com/");
			driver.get("https://www.instagram.com/");
			driver.get("https://web.whatsapp.com/");
			driver.get("https://www.microsoft edge.com/");
		}
	}

}
