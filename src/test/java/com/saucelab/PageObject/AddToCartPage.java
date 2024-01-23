package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	WebDriver driver;

	public AddToCartPage(WebDriver driver){

		this.driver= driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="shopping_cart_container")
	WebElement cartIcon;

	@FindBy(id="checkout")
	WebElement checkout;


	public void clickOnCartbtn(){

		cartIcon.click();
	}
	public void clickOnCheckoutBtn(){

		checkout.click();
	}

}
