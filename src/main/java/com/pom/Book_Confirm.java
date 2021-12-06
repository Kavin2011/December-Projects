package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Confirm {
	
	public WebDriver driver; //null

	@FindBy(id="my_itinerary")
	
	private WebElement itinerary;

	public Book_Confirm(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getItinerary() {
		return itinerary;
	}

}
