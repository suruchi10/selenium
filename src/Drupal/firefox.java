package Drupal;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class firefox {
	
	public static WebDriver driver; 
	
		// TODO Auto-generated method stub
		
		
	@BeforeClass	
	public void FFLaunch() {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Firefox Launched ");
		
		}
	
		
		@Test
		public void Login() {
			
	    driver.get("http://drupalhope.dd:8083/");
		driver.findElement(By.xpath(".//*[@id='block-bartik-account-menu']/div/ul/li/a")).click();
		driver.findElement(By.xpath(".//*[@id='edit-name']")).sendKeys("hope");
		driver.findElement(By.xpath(".//*[@id='edit-pass']")).sendKeys("hope");
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		boolean LogOut = driver.findElement(By.xpath(".//*[@id='block-bartik-account-menu']/div[2]/ul/li[2]/a")).isDisplayed();
		Assert.assertEquals(LogOut,true,"User failed to login");
		}
		
		@Test
		public void ResumeUI() {
		driver.get("http://drupalhope.dd:8083/resume/myform");
		driver.findElement(By.xpath(".//*[@id='edit-candidate-name']")).sendKeys("Naina");
		driver.findElement(By.xpath(".//*[@id='edit-candidate-mail']")).sendKeys("Naina@gmail.com");
		driver.findElement(By.xpath(".//*[@id='edit-candidate-number']")).sendKeys("9876543210");
		driver.findElement(By.xpath(".//*[@id='edit-candidate-dob']")).sendKeys("2017-08-23");
		driver.findElement(By.xpath(".//*[@id='edit-candidate-dob']")).sendKeys("Female");
		driver.findElement(By.xpath(".//*[@id='edit-candidate-confirmation-yes']")).click();
		driver.findElement(By.xpath(".//*[@id='edit-candidate-copy']")).click();
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		
		
		String CurrentUrl = driver.getCurrentUrl();
		String ExpectedUrl = "http://drupalhope.dd:8083/user/1";
		
		Assert.assertEquals(CurrentUrl, ExpectedUrl,"Error in submitting Form ");
		//succesful form submition 
		String Message=driver.findElement(By.xpath(".//*[@id='page']/div[1]/aside/div/div/div")).getText();
		System.out.println(Message);
			
		 }
		 
		@AfterClass	
		public void CloseBrowser() {
			
			driver.quit();
			System.out.println("Firefox Closed");
			}
		
		
		
}
