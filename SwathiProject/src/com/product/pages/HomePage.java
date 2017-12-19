package com.product.pages;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(id="txtArea")
    WebElement area;
	
	@FindBy(xpath="//div[@id='divAllArea']/span")
	List<WebElement> listOFArea;


    public HomePage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    

    //Set user name in textbox
    public void search(String area1){
    	
    	int numArea=listOFArea.size();
    	
    	area.click();
    	for(int i=0;i<numArea;i++){
    		if((listOFArea.get(i).getText()).equals(area1)){
    			listOFArea.get(i).click();
    		}
    		
    	}
    }

    public String getSelectedArea(){
    	return area.getAttribute("value");
    }
    
}
