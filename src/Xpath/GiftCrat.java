package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCrat {

			public static void main(String[] args) throws InterruptedException {
				String given_url="https://demowebshop.tricentis.com/25-virtual-gift-card";
				String str[]= {"jp","jp@gmail.com","vicky","v@gmail.com"};
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://demowebshop.tricentis.com/");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
				Thread.sleep(3000);
				String current_url = driver.getCurrentUrl();
				if(given_url.equalsIgnoreCase(current_url)) {
					System.out.println("gift card page is verified");
					List<WebElement> input_values = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
					int i=0;
					for (WebElement webElement : input_values) {
						webElement.sendKeys(str[i++]);
						Thread.sleep(1000);
					}
					Thread.sleep(2000);
					driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("hi cutie");
					String price_of_giftCard = driver.findElement(By.xpath("//span[@itemprop='price']")).getText();
					System.out.println("The value for the gift card added is ==> "+price_of_giftCard);
					Thread.sleep(2000);
					WebElement qty = driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']"));
					qty.clear();
					qty.sendKeys("2");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[@href='/cart']")).click();
					Thread.sleep(2000);
					WebElement verify_product = driver.findElement(By.xpath("//a[@class='product-name']"));
					if(verify_product.isDisplayed()) {
						System.out.println("Product is present");
						WebElement verify_checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
						verify_checkbox.click();
						if(verify_checkbox.isSelected()) {
							System.out.println("checkbox is selected");
							Thread.sleep(2000);
							WebElement button_enabled = driver.findElement(By.xpath("//input[@name='updatecart']"));
							if(button_enabled.isEnabled()) {
								System.out.println("the product is button is enabled");
								Thread.sleep(2000);
								button_enabled.click();
							}
							else
								System.out.println("not enabled button");
						}
						else
							System.out.println("not selected");
						
					
					}
					else
						System.out.println("no product found");
				}
				else
					System.out.println("not verified");
				
			}

		

}


