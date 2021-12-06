package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public WebDriver driver; //null

	@FindBy(id="radiobutton_0")
	
	private WebElement btn;
	
	@FindBy(id="continue")
	
	private WebElement cont;

	public WebElement getBtn() {
		return btn;
	}
	
	public WebElement getCont() {
		return cont;
	}


	public Select_Hotel(WebDriver driver2) {
	
	this.driver= driver2;
	
	PageFactory.initElements(driver, this);
}

}