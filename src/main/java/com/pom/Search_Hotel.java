package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {


	public WebDriver driver; //null

	@FindBy(id="location")
	
	private WebElement location;
	
	@FindBy(id="hotels")
	
	private WebElement hotels;

	@FindBy(id="room_type")

	private WebElement room_type;
	
	@FindBy(id="room_nos")
	
	private WebElement room_nos;
	
	@FindBy(xpath="//*[@id='datepick_in']")
	
	private WebElement datein;
	
	@FindBy(xpath="//*[@id='datepick_out']")
	
	private WebElement dateout;
	
	@FindBy(id="adult_room")
	
	private WebElement adult;
	
	@FindBy(id="child_room")
	
	private WebElement child;
	
	@FindBy(id="Submit")
	
	private WebElement submit;
		
	public Search_Hotel(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
