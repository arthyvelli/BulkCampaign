package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class logout extends BasePage {

    private WebDriver driver;
	
	public logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void SignOut() {
		System.out.println("Entering Logout");
		BasePage.waitForElement(driver,LogOutElements.accntSettings,25);
		BasePage.moveToElement(driver,LogOutElements.accntSettings);
		BasePage.ClickElement(driver,LogOutElements.accntSettings);
  	    
		BasePage.waitForElement(driver,LogOutElements.LogoutOption,25);
		BasePage.ClickElement(driver,LogOutElements.LogoutOption);
  	    
		BasePage.waitForElement(driver,LogOutElements.LoginRedirected,25);
  	  
  	    driver.navigate().to("http://dash.vinmail.io/autologin");
	}

	
	

	
	
}
