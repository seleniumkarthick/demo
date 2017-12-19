package com.product.utility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import jxl.*;

public class BaseTest {
	public WebDriver driver;
	
	@Parameters("brows")
	@BeforeTest
	public void setUp(String browserName){

		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\software\\selenium\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.chrome.driver", "E:\\software\\selenium\\driver\\chromedriver.exe");
		    driver = new FirefoxDriver();
		}
		
		driver.get("http://localhost/product/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
}
