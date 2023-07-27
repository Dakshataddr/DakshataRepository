package eCommerce_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void ShoppingAmazon() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	 // Reporter.Log("Openning Amazon", false);
	  driver.get("https://www.amazon.com/");
	  Thread.sleep(7000);
	  driver.close();
	  
  }
}
