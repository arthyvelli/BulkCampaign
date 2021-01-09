package core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverFactory {
	
	private WebDriver driver;
	
	public WebDriver getDriver(String browserName) throws Exception {
		switch(browserName.toLowerCase()) {  
		  case "chrome" : 
				// WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver");
				 WebDriverManager.chromedriver().setup();
			        //System.setProperty("webdriver.chrome.driver","F:\\Mailer Cloud\\Automation\\TestFramework17\\chromedriver.exe");
		                driver =  new ChromeDriver();
				 Thread.sleep(1000);
				System.out.println("Hello");
				break;
		  case "firefox" : 
				System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
				driver =  new FirefoxDriver();
				break;
		  case "edge" : 	
			  	System.setProperty("webdriver.edge.driver","C:\\drivers\\msedgedriver.exe");
				driver =  new EdgeDriver();
				break;
			default: 
				throw new Exception("Incorrect browser "+ browserName + " provided");	
		}
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(TestConfig.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(TestConfig.getProperty("implicitiWait")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
	

}
