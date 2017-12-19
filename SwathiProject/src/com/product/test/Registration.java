package com.product.test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.product.utility.BaseTest;
import com.product.utility.CommonFunctions;

import jxl.*;

public class Registration extends BaseTest {
	
	CommonFunctions CommonFunctionsObj;
	
	@DataProvider(name = "DP1")
    public Object[][] createData1() throws Exception{
        Object[][] retObjArr=CommonFunctionsObj.getTableArray("testData.xls",
                "Sheet1", "Registration");
        return(retObjArr);
    }
	
	@DataProvider(name = "DP2")
    public Object[][] createData2() throws Exception{
        Object[][] retObjArr=CommonFunctionsObj.getTableArray("testData.xls",
                "Sheet1", "Login");
        return(retObjArr);
    }
	
	@Test(dataProvider="DP1")
	public void addUser(String user,String email,String pass,String mob){

		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.id("name")).sendKeys(user);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("mobile")).sendKeys(mob);
		driver.findElement(By.name("submit")).click();
		String actualSucessMsg=driver.findElement(By.xpath("//form[@id='formn']/div/span[3]")).getText();
		String expectedSucessMsg="Thanks for Registering. Use your Email id and password to Login and post your Deals!!";
		Assert.assertEquals(actualSucessMsg, expectedSucessMsg,"Message is not as expected");
		
	}
	
	
    
	
	
	
	
	
	
	
	
}
