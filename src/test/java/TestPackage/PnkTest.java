package TestPackage;
import org.junit.Before;
import org.testng.Assert;
//import org.testng.annotations.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.PnkPage;

public class PnkTest {
	public WebDriver driver;
	PnkPage pnk = new PnkPage(driver);
	
	 // 1.Load time test: Verify that the PWA loads within 10 seconds
    @Test
	public void a_verifyPWALoadsWithin10Seconds() {
     pnk.visitLoginPage();
     pnk.quitBrowser();
	} 
	
	// 2.Login/authenticate and logout
    @Test
	public void b_loginAuthenticateAndLogout() throws InterruptedException{
	// We have a bug here while signing out
	 pnk.visitLoginPage();
     pnk.enterUserNameAndPassword();
     pnk.logoutAndVerifyIt();	
     pnk.quitBrowser();
	} 
	
	// 3.User can scroll down and up
    @Test
	public void c_userCanScrollDownAndUp() throws InterruptedException{
	pnk.visitLoginPage();
	pnk.enterUserNameAndPassword();
	pnk.scrollDownAndUp();
    pnk.quitBrowser();
	} 
	
	// 4. User can tap to progress through story
    @Test
	public void d_userCanTapToProgressThroughStory() throws InterruptedException{
	pnk.visitLoginPage();
	pnk.enterUserNameAndPassword();
	pnk.clickOnGame();
    pnk.quitBrowser();
	} 
    
//	 5. Authenticated user can navigate to all pages of the website
    @Test
	public void e_userCanNavigateToAllPages() throws InterruptedException{
	pnk.visitLoginPage();
	pnk.enterUserNameAndPassword();
    pnk.navigateToAllThePages();
    pnk.quitBrowser();
	} 
	
	
}
