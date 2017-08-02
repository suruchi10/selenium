package Drupal;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HttpResponseCode {
	
	private WebDriver driver;
	private int invalidLinksCount;
	String linkUrl ="http://drupalhope.dd:8083/resume/myform";

	@BeforeClass
	public void setUp() {

		driver = new FirefoxDriver();
		//driver.get("http://drupalhope.dd:8083");
	}

	 //for checking particular link url
	
	@Test
	
	public void checklink() throws IOException {
	
	URL url = new URL(linkUrl);

	   HttpURLConnection httpURLConnect = (HttpURLConnection) url
	     .openConnection();

	   httpURLConnect.setConnectTimeout(3000);

	   httpURLConnect.connect();

	   if (httpURLConnect.getResponseCode() == 200) {

	    
	    System.out.println(linkUrl + " - "+httpURLConnect.getResponseMessage());
	   
	    }

	else{
	System.out.println("Link is not working");
	}
	}

}