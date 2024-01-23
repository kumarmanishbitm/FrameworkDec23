package com.saucelab.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucelab.PageObject.AddToCartPage;
import com.saucelab.PageObject.CompletePage;
import com.saucelab.PageObject.InformationPage;
import com.saucelab.PageObject.LoginPage;
import com.saucelab.PageObject.LogoutPage;
import com.saucelab.PageObject.OverviewPage;
import com.saucelab.PageObject.ProductPage;

public class RegressionTestCases extends BaseClass {
	
	@Test
	public void testcases() throws IOException, InterruptedException{
		
		driver.get(url);
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterUsername();
		loginPage.enterPassword();
		loginPage.clickOnLoginBtn();
		
		String title = driver.getTitle();
		System.out.println("Login page title is : "+ title);
		if(title.equals("Swag Labs")){
			logger.info("Login title verification passed.");
			Assert.assertTrue(true);
		}
		else {
			logger.info("Login title verification failed.");
			captureScreenShot(driver,"verify Login title");
			Assert.assertTrue(false);
		}
		// Code for Product page to add item in cart
		
		ProductPage ProductPage = new ProductPage(driver);
		
		ProductPage.clickOnItemLink();
		
		ProductPage.clickOnAddToCartBtn();
		
		String ProductPageUrl = driver.getCurrentUrl();
		System.out.println("Login page title is : "+ ProductPageUrl);
		
		if(ProductPageUrl.equals("https://www.saucedemo.com/inventory-item.html?id=4")){
			logger.info("Product page URL verification passed.");
			Assert.assertTrue(true);
		}
		else {
			logger.info("Product page URL verification failed.");
			captureScreenShot(driver,"verify Product page URL");
			Assert.assertTrue(false);
		}
		
		// code for cart page to a see the description and perform checkut operation
		AddToCartPage cartPage = new AddToCartPage(driver);
		
		cartPage.clickOnCartbtn();
		cartPage.clickOnCheckoutBtn();
		
		String cartPageUrl = driver.getCurrentUrl();
		System.out.println("Cart page title is : "+ cartPageUrl);
		
		if(cartPageUrl.equals("https://www.saucedemo.com/checkout-step-one.html")){
			logger.info("Cart page URL verification passed.");
			Assert.assertTrue(true);
		}
		else {
			logger.info("Cart page URL verification failed.");
			captureScreenShot(driver,"verify Cart page URL");
			Assert.assertTrue(false);
		}
		
		// code for Information details
		
		InformationPage info = new InformationPage(driver);
		
		info.enterFirstName();
		
		info.enterLastName();

		info.enterPostalCode();
		
		info.clickOnContinueBtn();
		
		String overviewPageUrl = driver.getCurrentUrl();
		System.out.println("Overview page title is : "+ overviewPageUrl);
		
		if(overviewPageUrl.equals("https://www.saucedemo.com/checkout-step-two.html")){
			logger.info("Overview page URL verification passed.");
			Assert.assertTrue(true);
		}
		else {
			logger.info("Overview page URL verification failed.");
			captureScreenShot(driver,"verify Information page URL");
			Assert.assertTrue(false);
		}
		
		// Code for Overview page
		
		OverviewPage overview = new OverviewPage(driver);
		
		overview.clickOnFinishBtn();
		
		String completePageUrl = driver.getCurrentUrl();
		System.out.println("Complete page title is : "+ completePageUrl);
		
		if(completePageUrl.equals("https://www.saucedemo.com/checkout-complete.html")){
			logger.info("Complete page URL verification passed.");
			Assert.assertTrue(true);
		}
		else {
			logger.info("Complete page URL verification failed.");
			captureScreenShot(driver,"verify Overview page URL");
			Assert.assertTrue(false);
		}
		
		// code for complete page
		CompletePage completePage = new CompletePage(driver);
		
		completePage.getSuccessMessage();
		
		// code for Logout 
		
		LogoutPage logOut = new LogoutPage(driver);
		
		logOut.clickOnBugerIcon();
		
		logOut.clickOnLogoutBtn();
	}

}
