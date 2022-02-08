package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base {
	
	public TabletsPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Tablets']")
	private WebElement tabletsButtonOnHomePage;
	@FindBy (xpath = "//i[@class='fa fa-home']")
	private WebElement homeButton;
	@FindBy (xpath = "//div[@id='product-category']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=57' and text()='Tablets']")
	private WebElement tabletsNearHomeButton;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20' and @class='dropdown-toggle']")
	private WebElement desktopSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18' and @class='dropdown-toggle']")
	private WebElement laptopsNoteBooksSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25' and text()='Components (2)']")
	private WebElement componenetsSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=57' and @class='list-group-item active']")
	private WebElement tabletsSideTable;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=17']")
	private WebElement softwareSideTable;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=24']")
	private WebElement phonePDAsSideTable;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=33']")
	private WebElement camerasSideTable;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=34']")
	private WebElement mp3PlayersSideTable;
	@FindBy (xpath = "//img[@alt='HP Banner']")
	private WebElement destktopPCImage;
	@FindBy (xpath = "//h2[text()='Tablets']")
	private WebElement tabletsText;
	@FindBy (xpath = "//i[@class='fa fa-th-list']")
	private WebElement listButton;
	@FindBy (xpath = "//i[@class='fa fa-th']")
	private WebElement gridButton;
	@FindBy (xpath = "//a[@id='compare-total']")
	private WebElement compareProductLink;
	@FindBy (xpath = "//label[@for='input-sort']")
	private WebElement sortByText;
	@FindBy (xpath = "//select[@id='input-sort']")
	private WebElement sortByDropDown;
	@FindBy (xpath = "//label[@for='input-limit']")
	private WebElement showText;
	@FindBy (xpath = "//select[@id='input-limit']")
	private WebElement showDropDown;
	@FindBy (xpath = "//img[@title='Samsung Galaxy Tab 10.1']")
	private WebElement samsungGalaxyTabImage;
	@FindBy (xpath = "//a[text()='Samsung Galaxy Tab 10.1']")
	private WebElement samsungGalaxyTabButton;
	@FindBy (xpath = "//p[starts-with(text(),'Samsung Galaxy Tab 10.1')]")
	private WebElement samsungGalaxyTabText;
	@FindBy (xpath = "//p[starts-with(text(),'Samsung Galaxy Tab 10.1')]//following-sibling::p")
	private WebElement samsungGalaxyTabPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Samsung Galaxy Tab 10.1')]//following-sibling::p//following-sibling::span")
	private WebElement samsungGalaxyTabEXtax;
	@FindBy (xpath = "//div[@class='button-group']//following-sibling::button[starts-with(@onclick,'cart.add')]")
	private WebElement samsungGalaxyTabAddToCart;
	@FindBy (xpath = "//button[@data-original-title='Add to Wish List']//i[@class='fa fa-heart']")
	private WebElement samsungGalaxyTabAddToWishList;
	@FindBy (xpath = "//i[@class='fa fa-exchange']")
	private WebElement samsungGalaxyTabCompareProduct;
	@FindBy (xpath = "//div[@class='col-sm-6 text-right']")
	private WebElement showingPage;
	@FindBy (xpath = "//h5[text()='Information']")
	private WebElement informtionText;
	@FindBy (xpath = "//a[text()='About Us']")
	private WebElement aboutUsButton;
	@FindBy (xpath = "//a[text()='Delivery Information']")
	private WebElement deliveryInformationButton;
	@FindBy (xpath = "//a[text()='Privacy Policy']")
	private WebElement privacyPolicyButton;
	@FindBy (xpath = "//a[text()='Delivery Information']")
	private WebElement termsConditionsbutton;
	@FindBy (xpath = "//h5[text()='Customer Service']")
	private WebElement customerServiceText;
	@FindBy (xpath = "//a[text()='Contact Us']")
	private WebElement contactUsButton;
	@FindBy (xpath = "//a[text()='Returns']")
	private WebElement returnsButton;
	@FindBy (xpath = "//a[text()='Site Map']")
	private WebElement siteMapButton;
	@FindBy (xpath = "//h5[text()='Extras']")
	private WebElement extrasText;
	@FindBy (xpath = "//a[text()='Brands']")
	private WebElement brandsButton;
	@FindBy (xpath = "//a[text()='Gift Certificates']")
	private WebElement giftCertificatesButton;
	@FindBy (xpath = "//a[text()='Affiliate']")
	private WebElement affiliateButton;
	@FindBy (xpath = "//a[text()='Specials']")
	private WebElement specialButton;
	@FindBy (xpath = "//h5[text()='My Account']")
	private WebElement myAccountText;
	@FindBy (xpath = "//a[text()='My Account']")
	private WebElement myAccountBottomOfThePage;
	@FindBy (xpath = "//a[text()='Order History']")
	private WebElement orderHistoryButton;
	@FindBy (xpath = "//a[text()='Wish List']")
	private WebElement wishListBottomOfThePage;
	@FindBy (xpath = "//a[text()='Newsletter']")
	private WebElement newsLetterButton;
	@FindBy (xpath = "//p[text()='Powered By ']")
	private WebElement poweredByText;
	
	
	
	
	public void clickTabletsHomePage() {
		tabletsButtonOnHomePage.click();
	}
	public void clickHomeButton() {
		homeButton.click();
	}
	public void clickTabletsNearHomeButton() {
		tabletsNearHomeButton.click();
	}
	public void clickDesktopSideTable() {
		desktopSideTable.click();
	}
	public void clickLaptopsNoteBooksSideTable() {
		laptopsNoteBooksSideTable.click();
	}
	public void clickComponenetsSideTable() {
		componenetsSideTable.click();	
	}
	public void clickTabletsSideTable() {
		tabletsSideTable.click();
	}
	public void clickSoftwareSideTable() {
		softwareSideTable.click();
	}
	public void clickPhonePDAsSideTable() {
		phonePDAsSideTable.click();
	}
	public void clickcamerasSideTable() {
		camerasSideTable.click();
	}
	public void clickMp3PlayersSideTable() {
		mp3PlayersSideTable.click();
	}
	public void clickDestktopPCImage() {
		destktopPCImage.click();
	}
	public boolean verifyTabletsText() {
		if(tabletsText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickListButton() {
		listButton.click();
	}
	public void clickGridButton() {
		gridButton.click();
	}
	public void clickCompareProductLink() {
		compareProductLink.click();
	}
	public boolean verifySortByText() {
		if(sortByText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickSortByDropDown() {
		sortByDropDown.click();
	}
	public boolean verifyShowText() {
		if(showText.isDisplayed())
			return true;
			else
				return false;
	}
	public void clickShowDropDown() {
		showDropDown.click();
	}
	public void clickSamsungGalaxyTabImage() {
		samsungGalaxyTabImage.click();
	}
	public void clickSamsungGalaxyTabButton() {
		samsungGalaxyTabButton.click();
	}
	public boolean verifySamsungGalaxyTabText() {
		if(samsungGalaxyTabText.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifySamsungGalaxyTabPrice() {
		if (samsungGalaxyTabPrice.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifysamsungGalaxyTabEXtax() {
		if (samsungGalaxyTabEXtax.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickSamsungGalaxyAddToCart() {
		samsungGalaxyTabAddToCart.click();
	}
	public void clickSamsungGalaxyAddToWishList() {
		samsungGalaxyTabAddToWishList.click();
	}
	public void clicksamsungGalaxyTabCompareProduct() {
		samsungGalaxyTabCompareProduct.click();
	}
	public boolean verifyshowingTabletsPage() {
		if(showingPage.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyInformtionText() {
		if(informtionText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickAboutUsButton() {
		aboutUsButton.click();
	}
	public void verifyDeliveryInformationButton() {
		deliveryInformationButton.click();
	}
	public void clickPrivacyPolicyButton() {
		privacyPolicyButton.click();
	}
	public void clicktermsConditionsbutton() {
		termsConditionsbutton.click();
	}
	public boolean verifyCustomerServiceText() {
		if(customerServiceText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickContactUsButton() {
		contactUsButton.click();
	}
	public void clickReturnsButton() {
		returnsButton.click();
	}
	public void clickSiteMapButton() {
		siteMapButton.click();
	}
	public boolean verifyExtrasText() {
		if (extrasText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickBrandsButton() {
		brandsButton.click();
	}
	public void clickGiftCertificatesButton() {
		giftCertificatesButton.click();
	}
	public void clickAffiliateButton() {
		affiliateButton.click();
	}
	public void clickSpecialButton() {
		specialButton.click();
	}
	public boolean verifyMyAccountText() {
		if(myAccountText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickMyAccountBottomOfThePage() {
		myAccountBottomOfThePage.click();
	}
	public void clickOrderHistoryButton() {
		orderHistoryButton.click();
	}
	public void clickWishListBottomOfThePage() {
		wishListBottomOfThePage.click();
	}
	public void clickNewsLetterButton() {
		newsLetterButton.click();
	}
	public boolean verifyPoweredByText() {
		if(poweredByText.isDisplayed())
			return true;
		else
			return false;
	}

}
