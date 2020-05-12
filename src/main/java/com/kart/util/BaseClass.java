package com.kart.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;
	public static FileInputStream f;
	public static Properties p;
	public static Actions a;
	
	public static void initialize(String browser){
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equals("ff")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/");
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		a=new Actions(driver);
		driver.get(p.getProperty("url"));
		
	}
	
	public BaseClass(){
		try{
			f=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.property");
			p=new Properties();
			p.load(f);
		}catch(Exception e){
			
		}
	}
	
	public void mouseHover(WebElement ele){
		try{
			a.moveToElement(ele).perform();
		}catch(Exception e){
			
		}
	}
}
