package com.saucelab.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CompletePage {

	WebDriver driver;

	public CompletePage(WebDriver driver){

		this.driver= driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	WebElement successMessage;

	public void getSuccessMessage(){
	
		String msg = successMessage.getText();

		System.out.println("Overview page text is :" + msg);

		if(msg.equals("Thank you for your order!"))
		{

			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Success message not displaying.");
		}
	}

}
