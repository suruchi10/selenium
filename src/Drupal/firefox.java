package Drupal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class firefox {
	public static WebDriver driver; 
	
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Groupten\\Downloads\\chromedriver\\chromedriver.exe");
	@BeforeMethod	
	public void main() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://drupalhope.dd:8083/");
		}
		@Test
		public void Login() {
		String URL="http://drupalhope.dd:8083/resume/myform";
		
		driver.findElement(By.xpath(".//*[@id='block-bartik-account-menu']/div/ul/li/a")).click();
		driver.findElement(By.xpath(".//*[@id='edit-name']")).sendKeys("hope");
		driver.findElement(By.xpath(".//*[@id='edit-pass']")).sendKeys("hope");
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		String login = driver.findElement(By.xpath(".//*[@id='block-bartik-account-menu']/div[2]/ul/li[2]/a")).getText();
		Assert.assertEquals(login,"Log out");
		
		driver.findElement(By.xpath(".//*[@id='block-bartik-main-menu']/div[2]/ul/li[2]/a")).click();
		String str1=driver.getCurrentUrl();
		Assert.assertEquals(URL,str1);
	}
		
		
		
		
		
		

}
