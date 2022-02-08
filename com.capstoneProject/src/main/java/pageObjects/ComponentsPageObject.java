package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {
	
	public ComponentsPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Components' and @aria-expanded='true']")
	private WebElement componentsHomePage;
	@FindBy (xpath = "//a[starts-with(text(),'Mice and Trackballs (')]")
	private WebElement miceTrackballsButton;
	@FindBy (xpath = "//a[starts-with(text(),'Monitors')]")
	private WebElement monitorsButton;
	@FindBy (xpath = "//a[starts-with(text(),'Printers')]")
	private WebElement printersButton;
	@FindBy (xpath = "//a[starts-with(text(),'Scanners')]")
	private WebElement scannersButton;
	@FindBy (xpath = "//a[starts-with(text(),'Web Cameras')]")
	private WebElement webCamerasButton;
	@FindBy (xpath = "//a[starts-with(text(),'Show All Components')]")
	private WebElement showAllComponenetsButton;
	@FindBy (xpath = "//i[@class='fa fa-home']")
	private WebElement homeButton;
	@FindBy (xpath = "//div[@id='product-category']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25' and text()='Components']")
	private WebElement componentsNextToHomeButton;
	@FindBy (xpath = "//a[starts-with(text(),'Desktops ')]")
	private WebElement desktopSideTable;
	@FindBy (xpath = "//a[starts-with(text(),'Laptops & Notebooks ')]")
	private WebElement laptopsNoteBooksSideTable;
	@FindBy (xpath = "//a[starts-with(text(),'Components ')]")
	private WebElement componentsSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_29' and @class='list-group-item']")
	private WebElement miceTrackballsSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_28' and @class='list-group-item']")
	private WebElement monitorsSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_30' and @class='list-group-item']")
	private WebElement printersSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_31' and @class='list-group-item']")
	private WebElement scannersSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_32' and @class='list-group-item']")
	private WebElement webCamersSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=57' and @class='list-group-item']")
	private WebElement tabletsSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=17' and @class='list-group-item']")
	private WebElement softwareSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=24' and @class='list-group-item']")
	private WebElement phonesPDAsSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=33' and @class='list-group-item']")
	private WebElement camerasSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=34' and @class='list-group-item']")
	private WebElement mp3PlayersSideTable;
	@FindBy (xpath = "//img[@alt='HP Banner']")
	private WebElement destktopPcImage;
	@FindBy (xpath = "//h2[text()='Components']")
	private WebElement componentsText;
	@FindBy (xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearchText;
	@FindBy (xpath = "//div[@class='col-sm-3']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_29']")
	private WebElement miceTrackballsLink;
	@FindBy (xpath = "//div[@class='col-sm-3']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_28']")
	private WebElement monitorsLink;
	@FindBy (xpath = "//div[@class='col-sm-3']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_30']")
	private WebElement printersLink;
	@FindBy (xpath = "//div[@class='col-sm-3']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_31']")
	private WebElement scannersLink;
	@FindBy (xpath = "//div[@class='col-sm-3']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_32']")
	private WebElement webCamerasLinks;
	

}


