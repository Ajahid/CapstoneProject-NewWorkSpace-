package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPageObject;
import utilities.Utilities;

public class RetailPageSteps extends Base {

	
	RetailPageObject Retail = new RetailPageObject();
	
	
	@Given("^User is on Retail website$")
	public void  User_is_on_Retail_website() throws IOException {
		Retail.verifyHomePage();
		logger.info("User on Retail Website");
		Utilities.takeScreenShot("Homepage");
	}
	
	@When ("User click on MyAccount")
	public void user_click_on_myaccount_button() throws IOException {
		Retail.clickMyAccount();
		logger.info("My account button was clicked successfully");
		Utilities.takeScreenShot("ClickMyAccount");
	}

	@And ("User click on Login")
	public void user_click_on_login() throws IOException {
		Retail.clickLoginButton();
		logger.info("Login button was clicked successfully");
		Utilities.takeScreenShot("LoginButton");
	}

	@Then("User enter username and password")
	public void User_enter_username_and_password() throws IOException {
		Retail.enterUserEmail();
		Retail.enterUserPassword();
		logger.info("User enter username and password successfully");
		Utilities.takeScreenShot("EnterUsernamePassword");
		
	}
	
	@And("User click on Login button")
	public void User_click_on_Login_button() throws IOException {
		Retail.clickLoginButtonOnLoginPage();
		logger.info("Login button was clicked successfully");
		Utilities.takeScreenShot("LoginPage");
	}
	
	@Then ("User should be logged in to MyAccount dashboard")
	public void User_should_be_logged_in_to_MyAccount_dashboard() throws IOException {
		Assert.assertTrue(Retail.validateloginPageConfirmation());
		logger.info("User scucessfully loged in to login page");
		Utilities.takeScreenShot("UserLoginPage");
	}
	
	
	@When ("User click on Register for an Affiliate Account link") 
	public void User_click_on_Register_for_an_Affiliate_Account_link() throws IOException {
		Retail.clickRegisterAffiliateAccount();
		logger.info("User calick on register Affiliate Account");
		Utilities.takeScreenShot("ClickAffiliateAccount");
		
	}
	
	@And ("User fill affiliate form with below information")
	public void User_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		Retail.enterCompanyDetails(data.get(0).get("company"));
		Retail.enterwebsiteDetails(data.get(0).get("website"));
		Retail.entertaxIdDetails(data.get(0).get("taxID"));
		Retail.clickChequeCheckBox();
		Retail.enterChequePayeeName(data.get(0).get("chequePayeeName"));
		logger.info("User data entered successfully");
		
	}
	
	
	@And ("User check on About us check box")
	public void User_check_on_About_us_check_box() {
		Retail.clickAboutUsCheckBox();
		logger.info("User check about us check box");
		
	}
	
	@And ("User click on Continue button")
	public void User_click_on_Continue_button() {
		Retail.clickcontinueButtonAffiliateAccount();
		logger.info("User click on continue button");
		
	}
	
	@Then ("User should see a success message")
	public void User_should_see_a_success_message() throws IOException {
		Assert.assertTrue(Retail.verifySucessMessageAffiliateAccount());
		logger.info("User see message Account successfully Updated");
		Utilities.takeScreenShot("AffiliateAccountSuccessMessage");
		
	}
	
	@When ("User click on ‘Edit your affiliate information link")
	public void User_click_on_Edit_your_affiliate_information_link() {
		Retail.clickEditAffiliateAccount();
		logger.info("User click on Edit Affiliate Account");
		
	}
	
	@And ("User click on Bank Transfer radio button")
	public void User_click_on_Bank_Transfer_radio_button() {
		Retail.clickBankTransferCheckBox();
		logger.info("User Click on Bank Transfer Radio Button");
		
	}
	
	@And ("User fill Bank information with below information")
	public void User_fill_Bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		Retail.enterBankName(data1.get(0).get("bankName"));
		Retail.enterBankABANumber(data1.get(0).get("abaNumber"));
		Retail.enterSwiftAccountNumber(data1.get(0).get("swiftCode"));
		Retail.enterAccountName(data1.get(0).get("accountName"));
		Retail.enterAccountNumber(data1.get(0).get("accountNumber"));
		logger.info("User successfully enter Bank Details");
		
		
	}
	
	@When ("User click on ‘Edit your account information’ link") 
	public void User_click_on_Edit_your_account_information_link() {
		Retail.clickContinueButtonBankAccountPage();
		
		
	}
	
	@And ("User modify below information")
	public void User_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> data2 = dataTable.asMaps(String.class, String.class);
		Retail.enterFirstName(data2.get(0).get("abdul"));
		Retail.enterlastName(data2.get(0).get("majeed"));
		Retail.enterEmail(data2.get(0).get("abdulmajeed1@gmail.com"));
		Retail.enterTelephone(data2.get(0).get("571-599-2178"));
		logger.info("User modify account information");
		
	}
	
	
	@Then ("User should see a message ‘Success: Your account has been successfully updated.’")
	public void User_should_see_a_message_Success_Your_account_has_been_successfully_updated() throws IOException {
		Assert.assertTrue(Retail.verifyEditUserPageSuccessMessage());
		logger.info("User See Message Your account has been successfully updated");
		Utilities.takeScreenShot("EditAccountSuccessMessage");
		
		
	}
	
}
