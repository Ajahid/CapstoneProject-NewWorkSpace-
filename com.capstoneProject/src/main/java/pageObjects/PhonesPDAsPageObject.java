package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base {
	
	public PhonesPDAsPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Phones & PDAs']")
	private WebElement phonesPDAsMainPage;
	@FindBy (xpath = "//i[@class='fa fa-home']")
	private WebElement homeButtonSoftwarePage;
	@FindBy (xpath = "//ul[@class='breadcrumb']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=24' and text()='Phones & PDAs']")
	private WebElement phonesPDAsNextToHomeButton;
	@FindBy (xpath = "//div[@class='list-group']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20']")
	private WebElement desktopsSideTable;
	@FindBy (xpath = "//div[@class='list-group']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18']")
	private WebElement laptopsNoteBooksSideTable;
	@FindBy (xpath = "//div[@class='list-group']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25']")
	private WebElement componentsSideTable;
	@FindBy (xpath = "//div[@class='list-group']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=57']")
	private WebElement tabletsSideTable;
	@FindBy (xpath = "//div[@class='list-group']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=17']")
	private WebElement softwareSideTable;
	@FindBy (xpath = "//div[@class='list-group']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=24']")
	private WebElement phonesPDAsSideTable;
	@FindBy (xpath = "//div[@class='list-group']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=33']")
	private WebElement camerasSideTable;
	@FindBy (xpath = "//div[@class='list-group']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=34']")
	private WebElement mp3PlayersSideTable;
	@FindBy (xpath = "//img[@src='http://tek-school.com/retail/image/cache/catalog/demo/compaq_presario-182x182.jpg']")
	private WebElement desktopPCImageLink;
	@FindBy (xpath = "//h2[text()='Phones & PDAs']")
	private WebElement phonesPDAsTextCenterPage;
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
	@FindBy (xpath = "//button[contains(@onclick,'28')]//i[starts-with(@class,'fa')]//following-sibling::span[@class='hidden-xs hidden-sm hidden-md' and text()='Add to Cart']")
	private WebElement htcAddToCart;
	@FindBy (xpath = "//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[2]")
	private WebElement htcWishList;
	@FindBy (xpath = "//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[3]")
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
	@FindBy (xpath = "//*[@id='content']/div[2]/div[2]/div/div[2]/div[2]/button[1]/span")
	private WebElement iPhoneAddToCart;
	@FindBy (xpath = "//*[@id='content']/div[2]/div[2]/div/div[2]/div[2]/button[2]")
	private WebElement iPhoneWishList;
	@FindBy (xpath = "//*[@id='content']/div[2]/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement iPhoneCompareProduct;
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
	@FindBy (xpath = "//*[@id='content']/div[2]/div[3]/div/div[2]/div[2]/button[1]/span")
	private WebElement palmTreoAddToCart;
	@FindBy (xpath = "//*[@id='content']/div[2]/div[3]/div/div[2]/div[2]/button[2]")
	private WebElement palmTreoWishList;
	@FindBy (xpath = "//*[@id='content']/div[2]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement palmTreoCompareProduct;
	@FindBy (xpath = "//div[@class='col-sm-6 text-right']")
	private WebElement showingPageNumber;
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
	
	
	public void clickphonesPDAsMainPage() {
		phonesPDAsMainPage.click();
	}
	public void clickHomeButtonSoftwarePage() {
		homeButtonSoftwarePage.click();
	}
	public void clickPhonesPDAsNextToHomeButton() {
		phonesPDAsNextToHomeButton.click();
	}
	public void clickDesktopsSideTable() {
		desktopsSideTable.click();
	}
	public void clickLaptopsNoteBooksSideTable() {
		laptopsNoteBooksSideTable.click();
	}
	public void clickComponentsSideTable() {
		componentsSideTable.click();
	}
	public void clickTabletsSideTable() {
		tabletsSideTable.click();
	}
	public void clickSoftwareSideTable() {
		softwareSideTable.click();
	}
	public void clickPhonesPDAsSideTable() {
		phonesPDAsSideTable.click();
	}
	public void clickCamerasSideTable() {
		camerasSideTable.click();
	}
	public void clickMp3PlayersSideTable() {
		mp3PlayersSideTable.click();
	}
	public void clickDesktopPCImage() {
		desktopPCImageLink.click();
	}
	public boolean verifyPhonesPDAsTextCenterPage() {
		if(phonesPDAsTextCenterPage.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickListView() {
		listViewbutton.click();	
	}
	public void clickGridView() {
		gridViewButton.click();
	}
	public void clickcompareProduct() {
		compareProductLink.click();
	}
	public boolean verifySortByText() {
		if (sortByText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickSortByTab() {
		sortByTab.click();
	}
	public boolean verifyShowText() {
		if(showText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickshowTab() {
		showTab.click();
	}
	

}
