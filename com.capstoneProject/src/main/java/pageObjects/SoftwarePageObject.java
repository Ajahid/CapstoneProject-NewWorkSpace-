package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base {
	
	public SoftwarePageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Software']")
	private WebElement softwareButtonMainPage;
	@FindBy (xpath = "//i[@class='fa fa-home']")
	private WebElement homeButtonSoftwarePage;
	@FindBy (xpath = "//ul[@class='breadcrumb']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=17' and text()='Software']")
	private WebElement softwareNextToHomeButton;
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
	@FindBy (xpath = "//h2[text()='Software']")
	private WebElement softwareTextPageCenter;
	@FindBy (xpath = "//p[text()='There are no products to list in this category.']")
	private WebElement noProductscenterPageText;
	@FindBy (xpath = "//a[text()='Continue']")
	private WebElement continueButton;
	@FindBy (xpath = "//img[@alt='HP Banner']")
	private WebElement hpDesktopImage;
	
	
	public void clickSoftwareButtonMainPage() {
		softwareButtonMainPage.click();
	}
	public void clickHomeButtonSoftwarePage() {
		homeButtonSoftwarePage.click();
	}
	public void clickSoftwareNextToHomeButton() {
		softwareNextToHomeButton.click();
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
	public boolean verifySoftwareTextPageCenter() {
		if(softwareTextPageCenter.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyNoProductscenterPageText() {
		if(noProductscenterPageText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickcontinueButton() {
		continueButton.click();
	}
	public void clickhpDesktopImage() {
		hpDesktopImage.click();
	}
	

}
