package Pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class PnkPage {
	 public WebDriver driver;

	    public PnkPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    // Selectors
	    public static String loginBtn = "//div[contains(@class, 'navbar-item') and contains(@class, 'item-inbox')]";
	    public static String googleBtn = "//button[text()='Google']";
	    public static String emailField = "//input[@id='identifierId']";
	    public static String passwordField = "//input[@type='password']";
	    public static String nextBtn = "//span[text()='Next']";
	    public static String diamondIconSelector = "//div[@class='topbar-currency-container diamond show']";
	    public static String profileBtn = "//div[contains(@class, 'navbar-item-icon') and contains(@style, 'profile_inactive')]";
	    public static String signOut = "//div[@class='desktop-settings-item']//div[@class='desktop-settings-item-icon' and contains(@style, 'signout')]";
	    public static String wanderingHatSelector = "//div[@class='description' and text()='Wandering Hat']";
	    public static String crackedAcornSelector = "//div[@class='description' and text()='Cracked Acorn']";
	    public static String shareBtnSelector = "//div[@class='profile-user-btns']//button[@class='share-btn btn-inverse']";
	    public static String profileBtnInMenuSelector = "//div[@class='desktop-settings-item-label'][text()='Profile']";
	    public static String leaderBoardBtn = "//div[@class='desktop-settings-item-label'][text()='Leaderboard']";
	    public static String getETHBtn= "//div[@class='desktop-settings-item-label'][text()='Get ETH']";
	    public static String settingsBtn= "//div[@class='desktop-settings-item-label'][text()='Settings']";
	    public static String helpAndSupoortBtn= "//div[@class='desktop-settings-item-label'][text()='Help & Support']";
	    public static String leaderBoardPageSelector= "//div[@class='leaderboard-title']";
	    public static String connectWalletField = "//div[@class='subtitle undefined'][text()='Connect Wallet']";
	    public static String  accountCurrencyFieldsSelector= "//div[@class='account-section currency']//div[@class='account-currency-container'][2]//div[@class='account-currency-button coins']";
	    public static String  createGameBtn= "//div[contains(@class, 'navbar-item') and contains(@class, 'item-create')]";
	    public static String  messagesBtn= "//div[contains(@class, 'navbar-item') and contains(@class, 'item-room')]";
	    public static String  notificationsBtn= "//div[contains(@class, 'navbar-item') and contains(@class, 'item-inbox')]";
	    public static String  saySomethingField= "//textarea[@class='ai-assistant-textarea']";
	    public static String  messagesPageSelector= "//div[@class='message-rooms-page']";
	    public static String  notificationsPageSelector= "//div[@class='list-layout']/div[@class='list-layout-title'][text()='Activity']";
//	    public static String  = "";

	  
	    // Constants
	    public static String email = "gemztest";
	    public static String password = "P@ssword2468";
	    
	    // URL
	    public static String pnkPageURL = "https://pnk.one";
	    public static String profilePageURL = "https://pnk.one/profile";
	    public static String leaderBoardPageURL = "https://pnk.one/leaderboard";
	    public static String getETHPageURL = "https://pnk.one/deposit";
	    public static String settingsPageURL = "https://pnk.one/account";
	    public static String helpAndSupportPageURL= "https://discord.com/invite/gemz";

	    	   
	    
	    
	    public static void elementShouldNotExist(WebDriver driver, String element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
	    }

	    public static void I_AmWait(WebDriver driver, String element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
	    }

	    public static void scrollIntoElementView(WebDriver driver, String selector) {
	        JavascriptExecutor executor = (JavascriptExecutor) driver;

	    	 WebElement Element = driver.findElement(By.xpath(selector));
	         executor.executeScript("arguments[0].scrollIntoView(true);", Element);
	    }

	    public static void forceClickAnElement(WebDriver driver, String selector) {
	        JavascriptExecutor executor = (JavascriptExecutor) driver;

	    	 WebElement Element = driver.findElement(By.xpath(selector));
	         executor.executeScript("arguments[0].click();",Element );
	    }
	    
	    public static void clickOnAnElement(WebDriver driver, String selector) {
	    	 WebElement Element = driver.findElement(By.xpath(selector));
	         Element.click();
	    }
	    
	    public static void enterValueInAField(WebDriver driver, String selector, String value) {
	    	 WebElement Element = driver.findElement(By.xpath(selector));
	         Element.sendKeys(value);
	    }
	    
	    public void switchToANewTab(WebDriver driver){
	    	// Get all window handles
	    	Set<String> windowHandles = driver.getWindowHandles();

	    	// Switch to the new tab (assuming it's the last tab opened)
	    	for (String windowHandle : windowHandles) {
	    	    driver.switchTo().window(windowHandle);
	    	}
	    }
	    
	    public void switchToOriginalTab(WebDriver driver, String originalWindowHandle) {
	        // Switch back to the original tab
	        driver.switchTo().window(originalWindowHandle);
	    }
	    
	    public void quitBrowser() {
	    	driver.quit();
	    }
	  // ======================================================================  
	    // Main Commands
	    public void visitLoginPage()  {
	    	ChromeOptions options = new ChromeOptions();
	        // Disable browser notifications
//	        options.addArguments("--disable-notifications");
	        driver = new ChromeDriver(options);
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();

	    	driver.get(pnkPageURL);
	    	I_AmWait(driver,loginBtn);
	    }
	    
	    public void enterUserNameAndPassword() {
	    	// Click on Login button
	    	clickOnAnElement(driver,loginBtn);
	    	I_AmWait(driver,googleBtn);
	    	
	    	// Click on Google button
	    	clickOnAnElement(driver,googleBtn);
	    	
	    	// Enter Email
	    	I_AmWait(driver,emailField);
	    	enterValueInAField(driver,emailField,email);
	    	
	    	// Click on Next button
	    	clickOnAnElement(driver,nextBtn);
	    	
	    	// Enter Password
	    	I_AmWait(driver,passwordField);
	    	enterValueInAField(driver,passwordField,password);
	    	
	    	// Click on Next button
	    	clickOnAnElement(driver,nextBtn);
	    	
	    	// Verify that the User is logged in
	    	I_AmWait(driver,diamondIconSelector);
	    }
	    
	    public void logoutAndVerifyIt() throws InterruptedException {
	    	// Click on Profile button
	    	clickOnAnElement(driver,profileBtn);
	    	
	    	// Click on Sign out button
	    	I_AmWait(driver,signOut);
	    	Thread.sleep(1000);
	    	clickOnAnElement(driver,signOut);
	    	Thread.sleep(1000);
	    	clickOnAnElement(driver,profileBtn);
	    	Thread.sleep(1000);
	    	forceClickAnElement(driver,signOut);
	    	// User should Logout
	    	I_AmWait(driver,"//div[@id='privy-modal-content']");
	    }
	    
	    public void scrollDownAndUp() throws InterruptedException  {
	    	// Make sure that the crackedAcornSelector should appear
	    	I_AmWait(driver,crackedAcornSelector);
	    	
	    	// Create an instance of Actions class
	    	Actions actions = new Actions(driver);
	    	clickOnAnElement(driver,diamondIconSelector);
	    	Thread.sleep(2000);
	    	driver.navigate().back();
	    	
	    	// Scroll Down
	    	actions.sendKeys(Keys.DOWN).perform();
	    	
	    	// Make sure cracked Acorn should appear
	    	I_AmWait(driver,"//div[@class='description' and text()='Phantom Microscope']");
	    	
	    	// Scroll Up
	    	actions.sendKeys(Keys.UP).perform();
	    	
	    	// Make sure that the crackedAcornSelector should appear again
	    	I_AmWait(driver,crackedAcornSelector);
	    }
	    
	    public void clickOnGame() throws InterruptedException {
	    	clickOnAnElement(driver,diamondIconSelector);
	    	Thread.sleep(1000);
	    	driver.navigate().back();
	    	I_AmWait(driver,crackedAcornSelector);
	    	Thread.sleep(1000);
	    	// Click on the screen
	    	clickOnAnElement(driver,"//div[@id='story-game']");
	    }
	    
	    public void navigateToAllThePages() throws InterruptedException{
	    	// Get the original window handle
	    	String originalWindowHandle = driver.getWindowHandle();
	    	
	    	// Verify Profile Page Navigation
	    	navigateToAPage(profileBtnInMenuSelector,shareBtnSelector,profilePageURL);
	    	driver.navigate().back();
	    	
	    	// Verify Leaderboard Page Navigation
	    	navigateToAPage(leaderBoardBtn,leaderBoardPageSelector,leaderBoardPageURL);
	    	driver.navigate().back();

	    	// Verify Get ETH Page Navigation
	    	navigateToAPage(getETHBtn,connectWalletField,getETHPageURL);
	    	driver.navigate().back();
    	
	    	// Verify Settings Page Navigation
	    	navigateToAPage(settingsBtn,accountCurrencyFieldsSelector,settingsPageURL);
	    	driver.navigate().back();
    	
	    	// Verify Help & Support Page Navigation
	    	I_AmWait(driver,diamondIconSelector);
	    	
	    	// Click on Profile button
	    	clickOnAnElement(driver,profileBtn);
	    	I_AmWait(driver,helpAndSupoortBtn);
	    	clickOnAnElement(driver,helpAndSupoortBtn);
	    	switchToANewTab(driver);
	    	
	    	// Get the URL of Help & Support Page
	        String currentURL = driver.getCurrentUrl();
	    	Assert.assertEquals(currentURL, helpAndSupportPageURL); 
	    	
	    	switchToOriginalTab(driver, originalWindowHandle);
	    	I_AmWait(driver,diamondIconSelector);
	    	
	    	// Verify create Game Page Navigation
	    	clickOnAnElement(driver,createGameBtn);
	    	I_AmWait(driver,saySomethingField);
	    	
	    	// Verify create Messages Page Navigation
	    	clickOnAnElement(driver,messagesBtn);
	    	I_AmWait(driver,messagesPageSelector);
	    	
	    	// Verify Notification Page Navigation
	    	clickOnAnElement(driver,notificationsBtn);
	    	I_AmWait(driver,notificationsPageSelector);

	    	// Logout 
	    	logoutAndVerifyIt();
	    		
	    }
	    
	    public void navigateToAPage(String btnSelector1,String btnSelector2,String expectedURL){
	    	I_AmWait(driver,diamondIconSelector);
	    	// Click on Profile button
	    	clickOnAnElement(driver,profileBtn);
	    	I_AmWait(driver,btnSelector1);

	    	clickOnAnElement(driver,btnSelector1);
	    	I_AmWait(driver,btnSelector2);
	    	
	    	// Get the current URL
	        String currentURL = driver.getCurrentUrl();

	        Assert.assertEquals(currentURL, expectedURL);
	    }

}
