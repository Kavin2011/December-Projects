package com.My_Projects_Dec;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String type) {
		
		if (type.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

			driver=new ChromeDriver();
			
		}
		
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");

			driver=new ChromeDriver();
			
			}
		driver.manage().window().maximize();
		
		return driver;
				
	}
	
	public static void clickOnElement(WebElement element) {
		
		element.click();
	}
	
	public static void inputValueElement(WebElement element,String value) {
		
		element.sendKeys(value);
		
	}
	
	public static void url(String url) {
		
		driver.get(url);
		
	}
	
	public static void sleep(long mills) throws InterruptedException {
		
		Thread.sleep(mills);
	}
	
	public static void clear(WebElement element) {
		
		element.clear();
	}
	
	public static void close() {
		
		driver.close();
	}
	
	public static void quit() {
		
		driver.quit();
	}
	
	
	public static void Wait1() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public static void selectValue(String type, WebElement element, String value) {
		
		Select s=new Select(element);
		
		if (type.equalsIgnoreCase("index")) {
			
			int index= Integer.parseInt(value);
			
			s.selectByIndex(index);
			
		}
		
		else if (type.equalsIgnoreCase("value")) {
			
			s.selectByValue(value);
			
		}
		
		else if (type.equalsIgnoreCase("text")) {
			
			s.selectByVisibleText(value);
		}
			
		}
	
	public static void TakeScreenshot() throws IOException {
		
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File c = t.getScreenshotAs(OutputType.FILE);
			
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\My_Projects_Dec\\Screenshot\\adactin_hotel1.png");
			
		FileUtils.copyFile(c, d);
	}
	
	
}
