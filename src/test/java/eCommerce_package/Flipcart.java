package eCommerce_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Flipcart {
  @Test
  public void ShoppingFlipkart() throws InterruptedException 
  {
	  
		  WebDriver driver=new ChromeDriver();
		 // Reporter.Log("Openning Amazon", false);
		  driver.get("https://www.flipkart.com/");
		  Thread.sleep(7000);
		  driver.close();
		  
	  }
 
}
