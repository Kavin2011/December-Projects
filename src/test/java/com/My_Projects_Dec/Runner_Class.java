package com.My_Projects_Dec;

import org.openqa.selenium.WebDriver;
import com.pom.Book_Confirm;
import com.pom.Book_Hotel;
import com.pom.Home_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver = getBrowser("Chrome");
	
	public static Home_Page hp= new Home_Page(driver);
	
	public static Search_Hotel sh= new Search_Hotel(driver);
	
	public static Select_Hotel sel= new Select_Hotel(driver);
	
	public static Book_Hotel bh= new Book_Hotel(driver);
	
	public static Book_Confirm bc= new Book_Confirm(driver);
	
	public static void main(String[] args) throws Throwable {

		url("https://adactinhotelapp.com/");
		
		Wait1();
		
		inputValueElement(hp.getUsername(), "Kavinkumar20");
		
		inputValueElement(hp.getPassword(), "Kavin@2011");
		
		clickOnElement(hp.getLogin());
		
		Wait1();
		
		selectValue("index", sh.getLocation(), "5");
		
		selectValue("index", sh.getHotels(), "1");
		
		selectValue("index", sh.getRoom_type(), "1");
		
		selectValue("value", sh.getRoom_nos(), "2");
		
		clear(sh.getDatein());
		
		sleep(2000);
		
		inputValueElement(sh.getDatein(), "11/12/2021");
		
		clear(sh.getDateout());
		
		sleep(2000);
		
		inputValueElement(sh.getDateout(), "12/12/2021");
		
		selectValue("value", sh.getAdult(), "2");
		
		selectValue("value", sh.getChild(), "1");
		
		clickOnElement(sh.getSubmit());

		Wait1();
		
		clickOnElement(sel.getBtn());
		
		clickOnElement(sel.getCont());
		
		Wait1();

		inputValueElement(bh.getFirstname(), "Kavin");

		inputValueElement(bh.getLastname(), "Kumar");

		inputValueElement(bh.getAddress(), "Porur Chennai");

		inputValueElement(bh.getCcnum(), "4231879823127898");

		selectValue("index", bh.getCctype(), "2");

		selectValue("value", bh.getExpmonth(), "7");
		
		selectValue("value", bh.getExpyear(), "2022");
		
		inputValueElement(bh.getCvv(), "921");
		
		clickOnElement(bh.getBooknow());
			
		Wait1();
		
		clickOnElement(bc.getItinerary());
		
		Wait1();
		
		TakeScreenshot();
		
		sleep(3000);
		
	}	
	
}
