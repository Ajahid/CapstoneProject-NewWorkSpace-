package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;



	public class LaptopsNoteBooksPageObject extends Base {

	
		
		public LaptopsNoteBooksPageObject () {
			
			PageFactory.initElements(driver, this);
		}
	

	@FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement desktopMainPageText;
	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNoteBooksbuttonMainPage;
	@FindBy (xpath = "//a[text()='Macs (0)']")
	private WebElement macsButtonMainPage;
	@FindBy (xpath = "//a[text()='Windows (0)']")
	private WebElement windowsButtonMainPage;
	@FindBy (xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsNoteBooksMainPage;
	@FindBy (xpath = "//i[@class='fa fa-home']")
	private WebElement homeButton;
	@FindBy (xpath = "//div[@id='product-category']//ul//li//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNoteBooksNearHomeButton;
	@FindBy (xpath = "//a[text()='Desktops (13)']")
	private WebElement desktopsButtonSideTable;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18']")
	private WebElement laptopsNoteBooksSideTableButton;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18_46']")
	private WebElement macsButtonSideTable;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18_45']")
	private WebElement windowsButtonSideTable;
	@FindBy (xpath = "http://tek-school.com/retail/index.php?route=product/category&path=25")
	private WebElement componentsButtonSideTable;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=57']")
	private WebElement tabletsButtonSideTable;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=17']")
	private WebElement softwareButtonSideTable;
	@FindBy (xpath = "http://tek-school.com/retail/index.php?route=product/category&path=24")
	private WebElement phonesPDAsButtonSideTable;
	@FindBy (xpath = "http://tek-school.com/retail/index.php?route=product/category&path=33")
	private WebElement camerasButtonSideTable;
	@FindBy (xpath = "http://tek-school.com/retail/index.php?route=product/category&path=34")
	private WebElement mp3PlayersButtonSideTable;
	@FindBy (xpath = "//img[@src='http://tek-school.com/retail/image/cache/catalog/demo/compaq_presario-182x182.jpg']")
	private WebElement desktopPCImageCenterPage;
	@FindBy (xpath = "//h2[text()='Laptops & Notebooks']")
	private WebElement laptopNoteBookText;
	@FindBy (xpath = "//img[@src='http://tek-school.com/retail/image/cache/catalog/demo/hp_2-80x80.jpg']")
	private WebElement laptopImageUnderText;
	@FindBy (xpath = "//*[@id='content']/div[1]/div[2]/p")
	private WebElement laptopParagraphText; 
	@FindBy (xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearchText;
	@FindBy (xpath = "//div/div//div//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18_46']")
	private WebElement macsUnderRefineSearch;
	@FindBy (xpath = "//div/div//div//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18_45']")
	private WebElement windowsUnderRefineSearch;
	@FindBy (xpath = "//i[@class='fa fa-th-list']")
	private WebElement listViewbutton;
	@FindBy (xpath = "//button[@id='grid-view']")
	private WebElement gridViewButton;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/compare']")
	private WebElement compareProductLink;
	@FindBy (xpath = "//label[@for='input-sort']")
	private WebElement sortByText;
	@FindBy (xpath = "//select[@id='input-sort']")
	private WebElement sortByTab;
	@FindBy (xpath = "//label[@for='input-limit']")
	private WebElement showText;
	@FindBy (xpath = "//select[@id='input-limit']")
	private WebElement showTab;
	@FindBy (xpath = "//img[@title='HP LP3065']")
	private WebElement hpLP3065Image;
	@FindBy (xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065Link;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your co')]")
	private WebElement hpLP3065Text;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your co')]//following-sibling::p")
	private WebElement hpLP3065Price;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your co')]//following-sibling::p//following-sibling::span")
	private WebElement hpLP3065EXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[1]/div/div[2]/div[2]/button[1]/span")
	private WebElement hpLP3065AddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[1]/div/div[2]/div[2]/button[2]")
	private WebElement hpLP3065AddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[1]/div/div[2]/div[2]/button[3]")
	private WebElement hpLP3065CompareProduct; 
	@FindBy (xpath = "//img[@title='MacBook']")
	private WebElement macBookImage;
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement macBookLink;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo')]")
	private WebElement macBookText;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo')]//following-sibling::p")
	private WebElement macBookPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo')]//following-sibling::p//following-sibling::span")
	private WebElement macBookEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement macBookAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[2]/div/div[2]/div[2]/button[2]")
	private WebElement macBookAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement macBookCompareProduct; 
	@FindBy (xpath = "//img[@title='MacBook Air']")
	private WebElement macBookAirImage;
	@FindBy (xpath = "//a[text()='MacBook Air']")
	private WebElement macBookAirLink;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air ')]")
	private WebElement macBookAirText;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air ')]//following-sibling::p")
	private WebElement macBookAirPrice;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air ')]//following-sibling::p//following-sibling::span")
	private WebElement macBookAirEXTax; 
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[3]/div/div[2]/div[2]/button[1]/span")
	private WebElement macBookAirAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[3]/div/div[2]/div[2]/button[2]")
	private WebElement macBookAirAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement macBookAirCompareProduct; 
	@FindBy (xpath = "//img[@title='MacBook Pro']")
	private WebElement macBookProImage;
	@FindBy (xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProLink; 
	@FindBy (xpath = "//p[starts-with(text(),'Latest Intel mobile')]")
	private WebElement macBookProText; 
	@FindBy (xpath = "//p[starts-with(text(),'Latest Intel mobile')]//following-sibling::p")
	private WebElement macBookProPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Latest Intel mobile')]//following-sibling::p//following-sibling::span")
	private WebElement macBookProEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[4]/div/div[2]/div[2]/button[1]/span")
	private WebElement macBookProAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[4]/div/div[2]/div[2]/button[2]")
	private WebElement macBookProAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[4]/div/div[2]/div[2]/button[3]")
	private WebElement macBookProCompareProduct; 
	@FindBy (xpath = "//img[@title='Sony VAIO']")
	private WebElement sonyVaioImage;
	@FindBy (xpath = "//a[text()='Sony VAIO']")
	private WebElement sonyVaioLink; 
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]")
	private WebElement sonyVaioText;
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]//following-sibling::p")
	private WebElement sonyVaioPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]//following-sibling::p//following-sibling::span")
	private WebElement sonyVaioEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[5]/div/div[2]/div[2]/button[1]/span")
	private WebElement sonyVaioAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement sonyVaioAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[5]/div/div[2]/div[2]/button[3]")
	private WebElement sonyVaioCompareProduct; 
	@FindBy (xpath = "//div[@class='col-sm-6 text-right']")
	private WebElement showingPageText;
	@FindBy (xpath = "//button[@id='button-cart']")
	private WebElement macBookCart;
	@FindBy (xpath = "//div[starts-with(@class,'alert alert')]")
	private WebElement successMessage;
	@FindBy (xpath = "//span[@id='cart-total']//i[@class='fa fa-shopping-cart']")
	private WebElement cartItemsButton;
	@FindBy (xpath = "//table[@class='table table-striped']//following-sibling::td//following-sibling::td[text()='$602.00']")
	private WebElement cartTotalPrice;
	@FindBy (xpath = "//i[@class='fa fa-times']")
	private WebElement cancelCartItem;
	@FindBy (xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement emptyCart;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageCompareProduct;
	@FindBy (xpath = "//a[text()='product comparison']")
	private WebElement productComparisonLink;
	@FindBy (xpath = "//h1[text()='Product Comparison']")
	private WebElement productComparisonChart;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement sonyWishListMessage;
	@FindBy (xpath = "//h2[text()='$2,000.00']")
	private WebElement macBookProPriceTag;
	@FindBy (xpath = "//span[@id='cart-total']//text()")
	private WebElement cartAmount;
	
	
	public boolean verifyCartAmount() {
		
		if(cartAmount.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clicklaptopsNoteBooksOnMainPage() {
		laptopsNoteBooksbuttonMainPage.click();
	}
	public void clickMacsOnMainPage() {
		macsButtonMainPage.click();
	}
	public void clickWindowsOnMainPage() {
		windowsButtonMainPage.click();
	}
	public void clickShowAllLatptopsNoteBooksMainPage() {
		showAllLaptopsNoteBooksMainPage.click();
	}
	public void clickHomeButtonLaptopsNoteBooksPage() {
		homeButton.click();
	}

	public void AddToCarthpLP3065() {
		hpLP3065AddToCart.click();
	}
	public void AddToWishListhpLP3065() {
		hpLP3065AddToWishList.click();
	}
	public void compareProducthpLP3065() {
		hpLP3065CompareProduct.click();
	}
	public void clickMacBookImage() {
		macBookImage.click();
	}
	public void clickMacBookLink() {
		macBookLink.click();
	}
	public boolean verifyMaBookText() {
		if(macBookText.isDisplayed())
			return true;
			else
				return false;
	}
	public boolean verifyMacBookPrice() {
		if(macBookPrice.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyMacBookEXTax() {
		if(macBookEXTax.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickMacBookAirImage() {
		macBookAirImage.click();
	}
	public void clickMacBookAirLink() {
		macBookAirLink.click();
	}
	public boolean verifyMacBookAirText() {
		if(macBookAirText.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyMacBookAirPrice() {
		if(macBookAirPrice.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyMacBookAirEXTax() {
		if(macBookAirEXTax.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickMacBookProLink() {
		macBookProLink.click();
	}
	public boolean verifyMacBookProText() {
		if(macBookProText.isDisplayed())
			return true;
			else
				return false;
	}
	public boolean verifyMacBookProPrice() {
		if(macBookProPrice.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyMacBookProEXTax() {
		if(macBookProEXTax.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickSonyVaioImage() {
		sonyVaioImage.click();
	}
	public void clickSonyVaioLink() {
		sonyVaioLink.click();
	}
	public boolean verifySonyVaioText() {
		if(sonyVaioText.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifySonyVaioPrice() {
		if (sonyVaioPrice.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifySonyVaioEXTax() {
		if (sonyVaioEXTax.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyShowingPageText() {
		if (showingPageText.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickMacBookCart() {
		macBookCart.click();
		
	}
	
	public boolean verfiySuccessMessage() {
		if(successMessage.isDisplayed())
			return true;
			else
				return false;
		
	}
	
	
	
	public void clickCartItems() {
		
		cartItemsButton.click();
	}
	
	public boolean verifycartTotal() {
		
		if(cartTotalPrice.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickCancelCartItem() {
		cancelCartItem.click();
	}
	
	public boolean verifyEmptyCart() {
		
		if(emptyCart.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickMacBookCompareProduct() {
		
		macBookCompareProduct.click();
	}
	
	public void clickMacBookAirCompareProduct() {
		
		macBookAirCompareProduct.click();
	}
	
	public boolean verifySuccessMessageCompareProduct() {
		
		if (successMessageCompareProduct.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickProductComparisonLink() {
		productComparisonLink.click();
	}
	
	public boolean verifyProductComparisonChart() {
		
		if(productComparisonChart.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickSonyVaioAddToWishList() {
		
		sonyVaioAddToWishList.click();
	}
	
	public boolean verifySonyWishListMessage() {
		
		if(sonyWishListMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickMacBookProImage() {
		macBookProImage.click();
	}
	
	public boolean verifyMacBookProPriceTag() {
		
		if(macBookProPriceTag.isDisplayed())
			return true;
		else
			return false;
		
	}
	
	public boolean verifyDesktopMainPageText() {
		
		if(desktopMainPageText.isDisplayed())
			return true;
			else
				return false;
	
	
}
}
