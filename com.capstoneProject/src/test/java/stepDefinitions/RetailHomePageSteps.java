package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPageObject;
import utilities.Utilities;

public class RetailHomePageSteps extends Base{
	
	RetailPageObject retailHomePage = new RetailPageObject();
	
	
	@When ("User click on Currency")
	public void User_click_on_Currency() {
	retailHomePage.clickCurrencyButton();
	logger.info("User Click on Currency Button");
	}
	
	@And ("User Chose Euro from dropdown")
	public void User_Chose_Euro_from_dropdown() {
	retailHomePage.selectEuro();
	logger.info("User slect Euro from drop down");
	}
	
	@Then ("currency value should change to Euro")
	public void currency_value_should_change_to_Euro() throws IOException {
	Assert.assertTrue(retailHomePage.verifyEuroCurrency());
	logger.info("User successfully change currency value");
	Utilities.takeScreenShot("CurrencyChanged");
	}
	
	@When ("User click on shopping cart")
	public void User_click_on_shopping_cart() {
	retailHomePage.clickShoppingCart();	
	logger.info("User click on shopping cart");
	}
	
	@Then ("“Your shopping cart is empty!” message should display")
	public void Your_shopping_cart_is_empty_message_should_display() throws IOException {
	Assert.assertTrue(retailHomePage.verifyEmptyShoppingCart());
	logger.info("User see shopping cart is empty");
	Utilities.takeScreenShot("EmptyShoppingCartMessage");	
	}
}
