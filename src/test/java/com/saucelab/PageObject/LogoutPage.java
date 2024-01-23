package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogoutPage {

	WebDriver driver;

	public LogoutPage(WebDriver driver){

		this.driver= driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="react-burger-menu-btn")
	WebElement hambergerIcon;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logout;

	public void clickOnBugerIcon(){

		hambergerIcon.click();
	}
	
	public void clickOnLogoutBtn(){

		logout.click();
	}
}
