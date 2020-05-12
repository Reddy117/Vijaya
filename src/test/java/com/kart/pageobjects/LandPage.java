package com.kart.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kart.util.BaseClass;

public class LandPage extends BaseClass{

	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	public WebElement signInLink;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	public WebElement emailTxt;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	public WebElement passwordTxt;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]")
	public WebElement loginbtn;
	
	public LandPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void doLogin(String uName,String passWrod){
		try{
			signInLink.click();
			emailTxt.sendKeys(uName);
			passwordTxt.sendKeys(passWrod);
			loginbtn.click();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
}
