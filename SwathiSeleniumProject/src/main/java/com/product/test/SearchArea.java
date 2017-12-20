package com.product.test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.product.pages.HomePage;
import com.product.utility.BaseTest;
import com.product.utility.CommonFunctions;

import jxl.*;

public class SearchArea extends BaseTest{
	
	CommonFunctions CommonFunctionsObj;
	HomePage homePageObj;
	 
	@Test
	public void searchProduct(){
		String areaToSelect="T Nagar";
		homePageObj=new HomePage(driver);
		homePageObj.search(areaToSelect);
		String actualSelectedArea=homePageObj.getSelectedArea();
		Assert.assertEquals(areaToSelect, actualSelectedArea);
	}
	
	
    
	
	
	
	
	
	
	
	
}
