package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;


public class DesktopsPageObject extends Base {

	
	public DesktopsPageObject () {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement desktopMainPageText;
	@FindBy (xpath = "//a[text()='Desktops']")
	private WebElement desktopsButton;
	@FindBy (xpath = "//div[@class='dropdown-menu']//child::div//following-sibling:: ul//following-sibling::li//a[text()='PC (0)']")
	private WebElement pcDesktopsDropDown;
	@FindBy (xpath = "//div[@class='dropdown-menu']//child::div//following-sibling:: ul//following-sibling::li//a[text()='Mac (1)']")
	private WebElement macDesktopsDropDown;
	@FindBy (xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktpButton;
	@FindBy (xpath = "//i[@class='fa fa-home']")
	private WebElement homeButton;
	@FindBy (xpath = "//div[@id='product-category']//ul[@class='breadcrumb']//following-sibling::li//following-sibling::li//child::a[text()='Desktops']")
	private WebElement desktopsHomeButton;
	@FindBy (xpath = "//a[contains(text(),'Desktops (13')]")
	private WebElement desktopsSideTable;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20_26']")
	private  WebElement pcButtonSideTable;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20_26']")
	private WebElement macButtonSideTable;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18']")
	private WebElement laptopsNoteBooksSideTable;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25']")
	private WebElement componentsSideTable;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=57']")
	private WebElement tabletsSideTable;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=17']")
	private WebElement softwareSideTable;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=24']")
	private WebElement phonePDAsSideTable;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=33']")
	private WebElement camerasSideTable;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=34']")
	private WebElement mp3PlayersSideTable;
	@FindBy (xpath = "//img[@src='http://tek-school.com/retail/image/cache/catalog/demo/compaq_presario-182x182.jpg']")
	private WebElement desktopPcImage;
	@FindBy (xpath = "//h2[text()='Desktops']")
	private WebElement desktopText;
	@FindBy (xpath = "Desktops")
	private WebElement desktopImageCenter;
	@FindBy (xpath = "//div[@class='col-sm-10']//child::p")
	private WebElement centerText;
	@FindBy (xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearchText;
	@FindBy (xpath = "//div[@class='dropdown-menu']//child::div//child::ul//child::li//child::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20_26']")
	private WebElement pcLinkUnderRefineSearch;
	@FindBy (xpath = "//div[@class='dropdown-menu']//child::div//child::ul//child::li//child::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20_27']")
	private WebElement macLinkUnderRefineSearch;
	@FindBy (xpath = "//i[@class='fa fa-th-list']")
	private WebElement listButton;
	@FindBy (xpath = "//i[@class='fa fa-th']")
	private WebElement gridButton;
	@FindBy (id = "//a[text()='Product Compare (0)']")
	private WebElement productCompareButton;
	@FindBy (xpath = "//label[@for='input-sort']")
	private WebElement SortByText;
	@FindBy (xpath = "//select[@id='input-sort']")
	private WebElement sortByDropDown;
	@FindBy (xpath = "//label[text()='Show:']")
	private WebElement showText;
	@FindBy (xpath = "//select[@id='input-limit']")
	private WebElement showDropDown;
	@FindBy (xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement appleCienama30Image;
	@FindBy (xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinemaLink;
	@FindBy (xpath = "//p[starts-with(text(),'The 30-inch')]")
	private WebElement appleCinemaText;
	@FindBy (xpath = "//p[starts-with(text(),'The 30-inch')]//following-sibling::p//following-sibling::span[@class='price-new']")
	private WebElement appleCinemaNewPrice;
	@FindBy (xpath = "//p[starts-with(text(),'The 30-inch')]//following-sibling::p//following-sibling::span[@class='price-old']")
	private WebElement appleCinemaOldPrice;
	@FindBy (xpath = "//p[starts-with(text(),'The 30-inch')]//following-sibling::p//following-sibling::span[@class='price-tax']")
	private WebElement appleCinemaEXTaxPrice;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[1]/div/div[2]/div[2]/button[1]/span")
	private WebElement appleCinemaAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[1]/div/div[2]/div[2]/button[2]")
	private WebElement appleCinemaAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[1]/div/div[2]/div[2]/button[3]")
	private WebElement appleCinemaCompareProduct;
	@FindBy (xpath = "//img[@title='Canon EOS 5D']")
	private WebElement canonEOSImage;
	@FindBy (xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOSIButton;
	@FindBy (xpath = "//p[starts-with(text(),'Canon')]")
	private WebElement canonEOSIText;
	@FindBy (xpath = "//p[starts-with(text(),'Canon')]//following-sibling::p//following-sibling::span[@class='price-new']")
	private WebElement canonEOSINewPrince;
	@FindBy (xpath = "//p[starts-with(text(),'Canon')]//following-sibling::p//following-sibling::span[@class='price-old']")
	private WebElement canonEOSIOldPrince;
	@FindBy (xpath = "//p[starts-with(text(),'Canon')]//following-sibling::p//following-sibling::span[@class='price-tax']")
	private WebElement canonEOSIEXTaxPrice;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[2]/div/div[2]/div[2]/button[1]/span")
	private WebElement canonEOSIAddToCart;
	@FindBy (xpath = "//select[@id='input-option226']")
	private WebElement CanonColor;
	@FindBy (xpath = "//a[text()='Write a review']")
	private WebElement canonReview;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[2]/div/div[2]/div[2]/button[2]")
	private WebElement canonEOSIAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement canonEOSICompareProduct;
	@FindBy (xpath = "//img[@title='HP LP3065']")
	private WebElement hpLP3065Image;
	@FindBy (xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065Button;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your')]")
	private WebElement hpLP3065Text;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your')]//following-sibling::p")
	private WebElement hpLP3065Price;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your')]//following-sibling::p//following-sibling::span")
	private WebElement hpLP3065EXTaxPrice;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[3]/div/div[2]/div[2]/button[1]/span")
	private WebElement hpLP3065AddToCart;
	@FindBy (xpath = "//input[@id='input-quantity']")
	private WebElement selectQuantity;
	@FindBy (xpath = "//button[@id='button-cart']")
	private WebElement addtoCartHpLpPage;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[3]/div/div[2]/div[2]/button[2]")
	private WebElement hpLP3065AddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement hpLP3065CompareProduct;
	@FindBy (xpath = "//img[@title='HTC Touch HD']")
	private WebElement htcImage;
	@FindBy (xpath = "//a[text()='HTC Touch HD']")
	private WebElement htcButton;
	@FindBy (xpath = "//p[starts-with(text(),'HTC Touch')]")
	private WebElement htcText;
	@FindBy (xpath = "//p[starts-with(text(),'HTC Touch')]//following-sibling::p")
	private WebElement htcPrice;
	@FindBy (xpath = "//p[starts-with(text(),'HTC Touch')]//following-sibling::p//child::span")
	private WebElement htcEXTaxPrice;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[4]/div/div[2]/div[2]/button[1]/span")
	private WebElement htcAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[4]/div/div[2]/div[2]/button[2]")
	private WebElement htcAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[4]/div/div[2]/div[2]/button[3]")
	private WebElement htcCompareProduct;
	@FindBy (xpath = "//img[@title='iPhone']")
	private WebElement iPhoneImage;
	@FindBy (xpath = "//a[text()='iPhone']")
	private WebElement iPhoneButton;
	@FindBy (xpath = "//p[starts-with(text(),'iPhone')]")
	private WebElement iPhoneText;
	@FindBy (xpath = "//p[starts-with(text(),'iPhone')]//following-sibling::p")
	private WebElement iPhonePrice;
	@FindBy (xpath = "//p[starts-with(text(),'iPhone')]//following-sibling::p//child::span")
	private WebElement iPhoneEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[5]/div/div[2]/div[2]/button[1]/span")
	private WebElement iPhoneAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement iPhoneAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[5]/div/div[2]/div[2]/button[3]")
	private WebElement iPhoneCompareProduct;
	@FindBy (xpath = "//img[@title='iPod Classic']")
	private WebElement iPodImage;
	@FindBy (xpath = "//a[text()='iPod Classic']")
	private WebElement iPodButton;
	@FindBy (xpath = "//p[starts-with(text(),'More room to move')]")
	private WebElement iPodText;
	@FindBy (xpath = "//p[starts-with(text(),'More room to move')]//following-sibling::p")
	private WebElement iPodPrice;
	@FindBy (xpath = "//p[starts-with(text(),'More room to move')]//following-sibling::p//following-sibling::span")
	private WebElement iPodEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[6]/div/div[2]/div[2]/button[1]/span")
	private WebElement iPodAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[6]/div/div[2]/div[2]/button[2]")
	private WebElement iPodAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[6]/div/div[2]/div[2]/button[3]")
	private WebElement iPodCompareProduct;
	@FindBy (xpath = "//img[@title='MacBook']")
	private WebElement macBookImage;
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement macBookButton;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo processor')]")
	private WebElement macBookText;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo processor')]//following-sibling::p")
	private WebElement macBookPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo processor')]//following-sibling::p//following-sibling::span")
	private WebElement macBookEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[7]/div/div[2]/div[2]/button[1]/span")
	private WebElement macBookAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[7]/div/div[2]/div[2]/button[2]")
	private WebElement macBookAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[7]/div/div[2]/div[2]/button[3]")
	private WebElement macBookCompareProduct;
	@FindBy (xpath = "//img[@title='MacBook Air']")
	private WebElement macBookAirImage;
	@FindBy (xpath = "//a[text()='MacBook Air]")
	private WebElement macBookAirButton;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air')]")
	private WebElement macBookAirText;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air')]//following-sibling::p")
	private WebElement macBookAirPrice;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air')]//following-sibling::p//following-sibling::span")
	private WebElement macBookAirExTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[8]/div/div[2]/div[2]/button[1]/span")
	private WebElement macBookAirAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[8]/div/div[2]/div[2]/button[2]")
	private WebElement macBookAirAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[8]/div/div[2]/div[2]/button[3]")
	private WebElement macBookAirCompareProduct;
	@FindBy (xpath = "//img[@title='Palm Treo Pro']")
	private WebElement palmTreoProImage;
	@FindBy (xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palmTreoProButton;
	@FindBy (xpath = "//p[starts-with(text(),'Redefine your workday')]")
	private WebElement palmTreoProText;
	@FindBy (xpath = "//p[starts-with(text(),'Redefine your workday')]//following-sibling::p")
	private WebElement palmTreoProPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Redefine your workday')]//following-sibling::p//following-sibling::span")
	private WebElement palmTreoProEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[9]/div/div[2]/div[2]/button[1]/span")
	private WebElement palmTreoProAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[9]/div/div[2]/div[2]/button[2]")
	private WebElement palmTreoProAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[9]/div/div[2]/div[2]/button[3]")
	private WebElement palmTreoProCompareProduct;
	@FindBy (xpath = "//img[@title='Product 8']")
	private WebElement product8Image;
	@FindBy (xpath = "//a[text()='Product 8']")
	private WebElement product8Button;
	@FindBy (xpath = "//p[text()='Product 8..']")
	private WebElement product8Text;
	@FindBy (xpath = "//p[text()='Product 8..']//following-sibling::p")
	private WebElement product8Price;
	@FindBy (xpath = "//p[text()='Product 8..']//following-sibling::p//following-sibling::span")
	private WebElement product8EXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[10]/div/div[2]/div[2]/button[1]/span")
	private WebElement product8AddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[10]/div/div[2]/div[2]/button[2]")
	private WebElement product8AddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[10]/div/div[2]/div[2]/button[3]")
	private WebElement product8CompareProduct;
	@FindBy (xpath = "//img[@title='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMasterImage;
	@FindBy (xpath = "//a[text()='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMasterButton;
	@FindBy (xpath = "//p[starts-with(text(),'Imagine the')]")
	private WebElement samsungSyncMasterText;
	@FindBy (xpath = "//p[starts-with(text(),'Imagine the')]//following-sibling::p")
	private WebElement samsungSyncMasterPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Imagine the')]//following-sibling::p//following-sibling::span")
	private WebElement samsungSyncMasterEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[11]/div/div[2]/div[2]/button[1]/span")
	private WebElement samsungSyncMasterAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[11]/div/div[2]/div[2]/button[2]")
	private WebElement samsungSyncMasterAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[11]/div/div[2]/div[2]/button[3]")
	private WebElement samsungSyncMasterCompareProduct;
	@FindBy (xpath = "//img[@title='Sony VAIO']")
	private WebElement sonyVAIOImage;
	@FindBy (xpath = "//a[text()='Sony VAIO']")
	private WebElement sonyVAIOButton;
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]")
	private WebElement sonyVAIOText;
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]//following-sibling::p")
	private WebElement sonyVAIOPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]//following-sibling::p//following-sibling::span")
	private WebElement sonyVAIOEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[12]/div/div[2]/div[2]/button[1]/span")
	private WebElement sonyVAIOAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[12]/div/div[2]/div[2]/button[2]")
	private WebElement sonyVAIOAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[12]/div/div[2]/div[2]/button[3]")
	private WebElement sonyVAIOCompareProduct;
	@FindBy (xpath = "//h5[text()='Information']")
	private WebElement informtionText;
	@FindBy (xpath = "//a[text()='About Us']")
	private WebElement aboutUsButton;
	@FindBy (xpath = "//a[text()='Delivery Information']")
	private WebElement deliveryInformationButton;
	@FindBy (xpath = "Privacy Policy")
	private WebElement privacyPolicyButton;
	@FindBy (xpath = "Terms & Conditions")
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
	private WebElement myAccountTextBottomPage;
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
	@FindBy (xpath = "//input[@id='input-name']")
	private WebElement yourName;
	@FindBy (xpath = "//textarea[@id='input-review']")
	private WebElement textArea;
	@FindBy (xpath = "//input[@name='rating' and @value='5']")
	private WebElement selectRatingCheckBox;
	@FindBy (xpath = "//button[text()='Continue']")
	private WebElement reviewPageContinueButton;
	@FindBy (xpath = "//div[starts-with(@class,'alert alert')]")
	private WebElement reviewMessage;
	@FindBy (tagName = "a")
	private List <WebElement> deskTopUIElementsTagA;  
	
	
	
	
	public boolean verifyUIElementsDeskTopPage() {
		
		List <WebElement> deskTopUI = deskTopUIElementsTagA;
		System.out.println(deskTopUI.size() + " Sive of elements in UI is present");
		for(WebElement element:deskTopUI) {
			logger.info(element.getText() + " Text Name of each element");
	
		}
		return false;
	}
	
	public void clickDesktopsButton() {
		
		desktopsButton.click();
	}
	
	public void clickShowAllDesktpButton() {
		
		showAllDesktpButton.click();
	}
	
	public void clickHpLP3065AddToCart() {
		
		hpLP3065AddToCart.click();
	}
	
	public void selectQuantity() {
		selectQuantity.sendKeys("1");
	}
	
	public void clickAddtoCartHpLpPage() {
		addtoCartHpLpPage.click();
		
	}
	public boolean verifySuccessMessage() {
		
		if(successMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickCanonEOSIAddToCart() {
		canonEOSIAddToCart.click();
	}
	
	public void selectCanonColor() {
		
		WebElement color = driver.findElement(By.xpath("//select[@id='input-option226']"));
		Select select = new Select(color);
		select.selectByVisibleText("Red");
		
	}
	
	public void clickCanonEOSIButton() {
		canonEOSIButton.click();
		
	}
	
	public void clickCanonReview() {
		canonReview.click();
	}
	
	public void yourNameField(String name) {
		yourName.sendKeys(name);
	}
	
	public void textAreaField(String text) {
		textArea.sendKeys(text);
		
	}
	public void selectRatingCheckBox() {
		selectRatingCheckBox.click();
	}
	
	public void clickContinue() {
		reviewPageContinueButton.click();
		
	}
	
	public boolean verifyreviewMessage() {
		if(reviewMessage.isDisplayed())
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
