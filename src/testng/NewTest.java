package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  	  
	  public WebDriver driver = new FirefoxDriver();
	  
	  @Test
	  public void f() {
		  
		  driver.get("http://google.co.in");
	  
  }
	  
}
