package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {
	
	public Mp3PlayersPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='MP3 Players']")
	private WebElement mp3PlayersButtonMainPage;
	@FindBy (xpath = "//a[text()='test 11 (0)']")
	private WebElement test11MP3Players;
	@FindBy (xpath = "//a[text()='test 12 (0)']")
	private WebElement test12MP3Players;
	@FindBy (xpath = "//a[text()='test 15 (0)']")
	private WebElement test15MP3Players;
	@FindBy (xpath = "//a[text()='test 16 (0)']")
	private WebElement test16MP3Players;
	@FindBy (xpath = "//a[text()='test 17 (0)']")
	private WebElement test17MP3Players;
	@FindBy (xpath = "//a[text()='test 18 (0)']")
	private WebElement test18MP3Players;
	@FindBy (xpath = "//a[text()='test 19 (0)']")
	private WebElement test19MP3Players;
	@FindBy (xpath = "//a[text()='test 20 (0)']")
	private WebElement test20MP3Players;
	@FindBy (xpath = "//a[text()='test 21 (0)']")
	private WebElement test21MP3Players;
	@FindBy (xpath = "//a[text()='test 22 (0)']")
	private WebElement test22MP3Players;
	@FindBy (xpath = "//a[text()='test 23 (0)']")
	private WebElement test23MP3Players;
	@FindBy (xpath = "//a[text()='test 24 (0)']")
	private WebElement test24MP3Players;
	@FindBy (xpath = "//a[text()='test 4 (0)']")
	private WebElement test4MP3Players;
	@FindBy (xpath = "//a[text()='test 5 (0)']")
	private WebElement test5MP3Players;
	@FindBy (xpath = "//a[text()='test 6 (0)']")
	private WebElement test6MP3Players;
	@FindBy (xpath = "//a[text()='test 7 (0)']")
	private WebElement test7MP3Players;
	@FindBy (xpath = "//a[text()='test 8 (0)']")
	private WebElement test8MP3Players;
	@FindBy (xpath = "//a[text()='test 9 (0)']")
	private WebElement test9MP3Players;
	@FindBy (xpath = "//a[text()='Show All MP3 Players']")
	private WebElement showAllMP3Players;
	@FindBy (xpath = "//i[@class='fa fa-home']")
	private WebElement homeButtonSoftwarePage;
	@FindBy (xpath = "//ul[@class='breadcrumb']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=34' and text()='MP3 Players']")
	private WebElement mp3PlayersNextToHomeButton;
	@FindBy (xpath = "//div[@class='list-group']//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20']")
	private WebElement MP3Players;
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
	@FindBy (xpath = "//a[contains(text(),' test 11')]")
	private WebElement test11Table;
	@FindBy (xpath = "//a[contains(text(),' test 12')]")
	private WebElement test12Table;
	@FindBy (xpath = "//a[contains(text(),' test 15')]")
	private WebElement test15Table;
	@FindBy (xpath = "//a[contains(text(),' test 16')]")
	private WebElement test16Table;
	@FindBy (xpath = "//a[contains(text(),' test 17')]")
	private WebElement test17Table;
	@FindBy (xpath = "//a[contains(text(),' test 18')]")
	private WebElement test18Table;
	@FindBy (xpath = "//a[contains(text(),' test 19')]")
	private WebElement test19Table;
	@FindBy (xpath = "//a[contains(text(),' test 20')]")
	private WebElement test20Table;
	@FindBy (xpath = "//a[contains(text(),' test 21')]")
	private WebElement test21Table;
	@FindBy (xpath = "//a[contains(text(),' test 22')]")
	private WebElement test22Table;
	@FindBy (xpath = "//a[contains(text(),' test 23')]")
	private WebElement test23Table;
	@FindBy (xpath = "//a[contains(text(),' test 24')]")
	private WebElement test24Table;
	@FindBy (xpath = "//a[contains(text(),' test 4')]")
	private WebElement test4Table;
	@FindBy (xpath = "//a[contains(text(),' test 5')]")
	private WebElement test5Table;
	@FindBy (xpath = "//a[contains(text(),' test 6')]")
	private WebElement test6Table;
	@FindBy (xpath = "//a[contains(text(),' test 7')]")
	private WebElement test7Table;
	@FindBy (xpath = "//a[contains(text(),' test 8')]")
	private WebElement test8Table;
	@FindBy (xpath = "//a[contains(text(),' test 9')]")
	private WebElement test9Table;
	@FindBy (xpath = "//img[@src='http://tek-school.com/retail/image/cache/catalog/demo/compaq_presario-182x182.jpg']")
	private WebElement desktopPCImageLink;
	@FindBy (xpath = "//h2[text()='MP3 Players']")
	private WebElement mp3PlayersTextCenterPage;
	@FindBy (xpath = "//img[@title='MP3 Players']")
	private WebElement mp3PlayersImageCenterPage;
	@FindBy (xpath = "//p[contains(text(),'Shop Laptop feature only')]")
	private WebElement textCenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearchTextCenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 11 (0)']")
	private WebElement test11CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 12 (0)']")
	private WebElement test12CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 15 (0)']")
	private WebElement test15CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 16 (0)']")
	private WebElement test16CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 17 (0)']")
	private WebElement test17CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 18 (0)']")
	private WebElement test18CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 19 (0)']")
	private WebElement test19CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 20 (0)']")
	private WebElement test20CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 21 (0)']")
	private WebElement test21CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 22 (0)']")
	private WebElement test22CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 23 (0)']")
	private WebElement test23CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 24 (0)']")
	private WebElement test24CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 4 (0)']")
	private WebElement test4CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 5 (0)']")
	private WebElement test5CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 6 (0)']")
	private WebElement test6CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 7 (0)']")
	private WebElement test7CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 8 (0)']")
	private WebElement test8CenterPage;
	@FindBy (xpath = "//h3[text()='Refine Search']//following-sibling::div//following-sibling::div//following-sibling::li//a[text()='test 9 (0)']")
	private WebElement test9CenterPage;
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
	@FindBy (xpath = "//img[@title='iPod Classic']")
	private WebElement iPodClassicImage;
	@FindBy (xpath = "//a[text()='iPod Classic']")
	private WebElement iPodClassicLink;
	@FindBy (xpath = "//p[starts-with(text(),'More room')]")
	private WebElement iPodClassicText;
	@FindBy (xpath = "//p[starts-with(text(),'More room')]//following-sibling::p[@class='price']")
	private WebElement iPodClassicPrice;
	@FindBy (xpath = "//p[starts-with(text(),'More room')]//following-sibling::p[@class='price']//following-sibling::span")
	private WebElement iPodClassicEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[1]/div/div[2]/div[2]/button[1]")
	private WebElement iPodClassicAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[1]/div/div[2]/div[2]/button[2]/i")
	private WebElement iPodClassicAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[1]/div/div[2]/div[2]/button[3]/i")
	private WebElement iPodClassicCompareProduct;
	@FindBy (xpath = "//img[@title='iPod Nano']")
	private WebElement iPodNanoImage;
	@FindBy (xpath = "//a[text()='iPod Nano']")
	private WebElement iPodNanoLink;
	@FindBy (xpath = "//p[starts-with(text(),'Video')]")
	private WebElement iPodNanoText;
	@FindBy (xpath = "//p[starts-with(text(),'Video')]//following-sibling::p[@class='price']")
	private WebElement iPodNanoPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Video')]//following-sibling::p[@class='price']//following-sibling::span")
	private WebElement iPodNanoEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement iPodNanoAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[2]/div/div[2]/div[2]/button[2]/i")
	private WebElement iPodNanoAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[2]/div/div[2]/div[2]/button[3]/i")
	private WebElement iPodNanoCompareProduct;
	@FindBy (xpath = "//img[@title='iPod Shuffle']")
	private WebElement iPodShuffleImage;
	@FindBy (xpath = "//a[text()='iPod Shuffle']")
	private WebElement iPodShuffleLink;
	@FindBy (xpath = "//p[starts-with(text(),'Born to be worn')]")
	private WebElement iPodShuffleText;
	@FindBy (xpath = "//p[starts-with(text(),'Born to be worn')]//following-sibling::p[@class='price']")
	private WebElement iPodShufflePrice;
	@FindBy (xpath = "//p[starts-with(text(),'Born to be worn')]//following-sibling::p[@class='price']//following-sibling::span")
	private WebElement iPodShuffleEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[3]/div/div[2]/div[2]/button[1]/span")
	private WebElement iPodShuffleAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[3]/div/div[2]/div[2]/button[2]/i")
	private WebElement iPodShuffleAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[3]/div/div[2]/div[2]/button[3]/i")
	private WebElement iPodShuffleCompareProduct;
	@FindBy (xpath = "//img[@title='iPod Touch']")
	private WebElement iPodTouchImage;
	@FindBy (xpath = "//a[text()='iPod Touch']")
	private WebElement iPodTouchLink;
	@FindBy (xpath = "//p[starts-with(text(),'Revolutionary multi-touch')]")
	private WebElement iPodTouchText;
	@FindBy (xpath = "//p[starts-with(text(),'Revolutionary multi-touch')]//following-sibling::p[@class='price']")
	private WebElement iPodTouchPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Revolutionary multi-touch')]//following-sibling::p[@class='price']//following-sibling::span")
	private WebElement iPodTouchEXTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[4]/div/div[2]/div[2]/button[1]/span")
	private WebElement iPodTouchAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[4]/div/div[2]/div[2]/button[2]/i")
	private WebElement iPodTouchAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[4]/div[4]/div/div[2]/div[2]/button[3]/i")
	private WebElement iPodTouchCompareProduct;
	@FindBy (xpath = "//div[starts-with(text(),'Showing')]")
	private WebElement ShowPageText;
	
	
	
	
	public void clickmp3PlayersButtonMainPage() {
		mp3PlayersButtonMainPage.click();
	}
	
	public void clickTest11() {
		test11MP3Players.click();
	}
	public void clickTest12() {
		test12MP3Players.click();
	}
	public void clickTest15() {
		test15MP3Players.click();
	}
	public void clickTest16() {
		test16MP3Players.click();
	}
	public void clickTest17() {
		test17MP3Players.click();
	}
	public void clickTest18() {
		test18MP3Players.click();
	}
	public void clickTest19() {
		test19MP3Players.click();
	}
	public void clickTest20() {
		test20MP3Players.click();
	}
	public void clickTest21() {
		test21MP3Players.click();
	}
	public void clickTest22() {
		test22MP3Players.click();
	}
	public void clickTest23() {
		test23MP3Players.click();
	}
	public void clickTest24() {
		test24MP3Players.click();
	}
	public void clickTest4() {
		test4MP3Players.click();
	}
	public void clickTest5() {
		test5MP3Players.click();
	}
	public void clickTest6() {
		test6MP3Players.click();
	}
	public void clickTest7() {
		test7MP3Players.click();
	}
	public void clickTest8() {
		test8MP3Players.click();
	}
	public void clickTest9() {
		test9MP3Players.click();
	}
	public void clickShowAllMP3Players() {
		showAllMP3Players.click();
	}
	
}
