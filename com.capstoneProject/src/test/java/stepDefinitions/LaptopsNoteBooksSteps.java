package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class LaptopsNoteBooksSteps extends Base {
	
	LaptopsNoteBooksPageObject laptopsNoteBooks = new LaptopsNoteBooksPageObject();
	
	@When("User click on Laptop & NoteBook tab")
    public void user_click_on_laptop_notebook_tab() {
		laptopsNoteBooks.clicklaptopsNoteBooksOnMainPage();
		logger.info("User can click on Laptops & NoteBooks on MainPage");
    	}
	
	 @And("User click on Show all Laptop & NoteBook option")
	    public void user_click_on_show_all_laptop_notebook_option() {
		 laptopsNoteBooks.clickShowAllLatptopsNoteBooksMainPage();
			logger.info("User click on Show all laptops & NoteBooks");	
	   }

	 @And("User click on MacBook  item")
	    public void user_click_on_macbook_item() {
		 laptopsNoteBooks.clickMacBookImage();
			logger.info("User click on MackBook");
			
	    }
	 
	 @And("User click add to Cart button")
	    public void user_click_add_to_cart_button() {
		 laptopsNoteBooks.clickMacBookCart();
			logger.info("User click on Add to Cart");	
	    }


	 @Then("User should see a message Success: You have added MacBook to your shopping cart")
	    public void user_should_see_a_message_success_you_have_added_macbook_to_your_shopping_cart() throws IOException  {
		 laptopsNoteBooks.verfiySuccessMessage();
			logger.info("User see sucess Message");
			Utilities.takeScreenShot("MacBookMessage"); 
	    }

	 @Then("User should see 1 item showed to the cart")
	    public void user_should_see_1_items_602_showed_to_the_cart() {
		 laptopsNoteBooks.clickCartItems();
		 laptopsNoteBooks.verifycartTotal();
			logger.info("User see cart Total");	
	    }
	 

	    @And("User click on cart option")
	    public void user_click_on_cart_option() throws InterruptedException  {
	    	laptopsNoteBooks.clickCartItems();
	    	Thread.sleep(2000);
	    	logger.info("User click on cart optons button");	
	    }
	    
	    @And("^user click on red X button to remove the item from cart$")
	    public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws Throwable {
			laptopsNoteBooks.clickCancelCartItem();
			Thread.sleep(2000);
			logger.info("User click on Cart Items and Then click on cancel cart Item");
	    }


	    @Then("item should be removed and cart should show {int} item\\(s)")
	    public void item_should_be_removed_and_cart_should_show_0_items() throws IOException  {
		Assert.assertTrue(laptopsNoteBooks.verifyCartAmount());
		logger.info("User click on Cart Items and Then can see empty shopping cart message");
		Utilities.takeScreenShot("Emptyshoppingcart");
    }

	

	@And("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() throws IOException {
		laptopsNoteBooks.clickMacBookCompareProduct();
		logger.info("User can click on MacBook Compare Product");
	}

	@And("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws IOException {
		laptopsNoteBooks.clickMacBookAirCompareProduct();
		logger.info("User can click on MacBookAir Compare Product");
	}
	
	 @Then("User should see a message Success: You have added MacBook Air to your product comparison")
	    public void user_should_see_a_message_success_you_have_added_macbook_air_to_your_product_comparison() throws IOException {
		 laptopsNoteBooks.verifySuccessMessageCompareProduct();
			logger.info("User can see success message for product comparison");	
			Utilities.takeScreenShot("MacBookAirCompareSucessMessage");
	 }

	
	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws IOException {
		laptopsNoteBooks.clickProductComparisonLink();
		logger.info("User click on Product Comparison Link");	
	}
	
	@Then("^User should see Product Comparison Chart$")
    public void user_should_see_product_comparison_chart() throws IOException {
		Assert.assertTrue(laptopsNoteBooks.verifyProductComparisonChart());
		logger.info("User see product compariosn chart");
		Utilities.takeScreenShot("ProductComparisonChart");
    }


	@And("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() throws IOException {
		laptopsNoteBooks.clickSonyVaioAddToWishList();
		logger.info("User click on Sony VaIO Heart Icon");
		}
	
	 @Then("^User should get a message You must login or create an account to save Sony VAIO to your wish list")
	    public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws IOException {
		 Assert.assertTrue(laptopsNoteBooks.verifySonyWishListMessage());
			logger.info("User see message you must login to create an account so save Sony VAIO to your wish list");
			Utilities.takeScreenShot("SonyWishListMessage");
	    }

	

	@And("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() throws IOException {
		laptopsNoteBooks.clickMacBookProImage();
		logger.info("User click on MacBook pro Item");
	}
	
	  @Then("User should see $2,000.00 price tag is present on UI.")
	    public void user_should_see_20000_price_tag_is_present_on_ui() throws IOException  {
		  Assert.assertTrue(laptopsNoteBooks.verifyMacBookProPriceTag());
			logger.info("User can see MacBook Pro Price $2,000.00");
			Utilities.takeScreenShot("MacBookPrice");
	    }




}
