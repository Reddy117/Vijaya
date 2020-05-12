package com.kart.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.kart.util.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	public WebElement womenTab;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
	public WebElement tshirtLink;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	public WebElement tshirtImg;
	
	@FindBy(xpath="//*[@id=\"quantity_wanted\"]")
	public WebElement qtyTxt;
	
	@FindBy(xpath="//*[@id=\"group_1\"]")
	public WebElement sizedrop;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	public WebElement addKartbtn;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void addProductToKart(String size,String qty,String expMsg){
		try{
			mouseHover(womenTab);
			tshirtLink.click();
			tshirtImg.click();
			driver.switchTo().frame(0);
			qtyTxt.clear();
			qtyTxt.sendKeys(qty);
			new Select(sizedrop).selectByVisibleText(size);
			Thread.sleep(2000);
			//addKartbtn.click();
		}catch(Exception e){
			
		}
	}
	
}
