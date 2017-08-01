package Drupal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Groupten\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://drupalhope.dd:8083/");
		driver.wait(5000);
		driver.findElement(By.xpath(".//*[@id='block-bartik-account-menu']/div/ul/li/a")).click();

	}

}
