package pages;
import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.regex.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AutoresponderDuplicatePage extends BasePage {
	
	private WebDriver driver;
    String[] Senderid=new String[5];
    
    
	
	@FindBy(xpath="//h1[@class='font-28 font-head breadcrumbs-title']")
	private WebElement Dashbrd;   // driver.findElement(By.xpath())
	
	@FindBy(xpath="//h1[@class='font-28 font-head breadcrumbs-title']")
	private WebElement Campaignpage;
	@FindBy(xpath="//*[@id='app']/div/section/div[2]/div[1]/div/div[1]/form/div[4]/div[1]/div/div[2]")
	private WebElement SendId;  
	
	
	
	@FindBy(xpath="//h1[@class='font-28 font-head breadcrumbs-title']")
	private WebElement Autoresponderpage;
	@FindBy(xpath="//a[text()='Create autoresponder']")
	private WebElement AutoresponderCreatePage;
	
	@FindBy(xpath="//button[@class='btn btn-outline-primary btnw-195 btn-outline-primary']")
	private WebElement chooseCampaignBtn;
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchCampaign;
	@FindBy(xpath="(//*[@class='custom-control-label'])[5]")
	private WebElement campaignOptions;
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continueBtn;
	@FindBy(xpath="//input[@name='maxLimit']")
	private WebElement maxLimit;
	@FindBy(xpath="//input[@name='daterange']")
	private WebElement dateRange;
	@FindBy(xpath="//li[@data-range-key='Today']")
	private WebElement todayDate;
	@FindBy(xpath="//button[@class='btn btnw-170 btn-primary']")
	private WebElement submitBtn;
	@FindBy(xpath="//a[@href='/autoresponder']")
	private WebElement autoresponderLink;
	
	public AutoresponderDuplicatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void DuplicateAutoresponder(String Senderid) throws InterruptedException{

		Thread.sleep(2000);	  
		//Select the dropdown
		BasePage.waitForElement(driver,CampaignElements.Dropdown,50);
		BasePage.ClickElement(driver,CampaignElements.Dropdown);

		//Select duplicate option
		BasePage.waitForElement(driver,CampaignElements.Dup,50);
		BasePage.ClickElement(driver,CampaignElements.Dup);
		//Confimr Duplicate
		BasePage.waitForElement(driver,CampaignElements.DupConfirm1,50);

		BasePage.ClickElement(driver,CampaignElements.DupConfirm1);
		//BasePage.performScrollToElement(driver, CampaignElements.Dupconfirm2);
		BasePage.waitForElement(driver,CampaignElements.Dupconfirm2,50);

		BasePage.ClickElement(driver,CampaignElements.Dupconfirm2);

		Thread.sleep(2000);
		//Click edit from dropdown
		BasePage.waitForElement(driver,CampaignElements.Dropdown,50);
		BasePage.ClickElement(driver,CampaignElements.Dropdown);

		BasePage.waitForElement(driver,CampaignElements.EditDup,50);
		BasePage.ClickElement(driver,CampaignElements.EditDup);
		//Select sender id 
				BasePage.performScrollToElement(driver,SendId);

				Thread.sleep(2000);	
				WebElement sendidselct = driver.findElement(By.xpath("//*[@id='app']/div/section/div[2]/div[1]/div/div[1]/form/div[4]/div[1]/div/div[2]"));
				Actions builder = new Actions(driver);
				System.out.println("Sender Id"+Senderid);
				builder.moveToElement(sendidselct).sendKeys(sendidselct,Senderid).
				sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(2000);
				//Select Choose contact form wizard
				BasePage.waitForElement(driver,CampaignElements.ChooseContactstage,30);
				BasePage.ClickElement(driver,CampaignElements.ChooseContactstage);
				Thread.sleep(1000);

	}
     public void getSenderId(String senderid1,String senderid2,String senderid3,String senderid4,String senderid5) {
	   //  public void getSenderId(String senderid1,String senderid2) { 	
    	Senderid[0]=senderid1;
    	Senderid[1]=senderid2;
    	Senderid[2]=senderid3;
    	Senderid[3]=senderid4;
    	Senderid[4]=senderid5;
    	
    	
    }
	public void AutoResponder_campaign1(String UserCount,String campName) throws IOException, InterruptedException, ParseException, java.text.ParseException{
        
		System.out.println("Entered page");
		Thread.sleep(1000);
		
		//BasePage.waitForElement(driver,Dashbrd,50);
		driver.navigate().to("http://dash.vinmail.io/autoresponder");
		
	   BasePage.waitForElement(driver,Autoresponderpage,50);
		
//		Thread.sleep(1000);
		//BasePage.ClickElement(driver,AutoresponderCreatePage);
		//Thread.sleep(1000);
		System.out.println("End");
		//int userscount=excel.usercount(0);
		int userscount=Integer.parseInt(UserCount);

		//create a loop overall the rows of excel file to read it.
		//for (int i=1;i<=userscount;i++)
		//{
		//Thread.sleep(1000);

		//Enter username and password
		//BasePage.waitForElement(driver,Loginelements.Email,25);

		//BasePage.EnterText(driver,Loginelements.Email,excel.getData(0, i, 0));
		//BasePage.EnterText(driver,Loginelements.password, excel.getData(0, i, 1));
		//BasePage.ClickElement(driver,Loginelements.LoginButton);	
		//System.out.println("client"+excel.getData(0, i, 0));


		//redirect to Campaign list page
		

		//Take campaign duplicate
		AutoresponderDuplicatePage autodup=new AutoresponderDuplicatePage(driver);

		//int Campcount=excel.getnum(0, i, 2);
		System.out.println("No.of campaigns ="+userscount);

	//	String myTime = "10:00";
		/*SimpleDateFormat df = new SimpleDateFormat("HH:mm");

		Date d = df.parse(myTime); 
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);				 
*/
		//this.getSenderId(senderid1, senderid2, senderid3);
		for(int j=0;j<userscount;j++) 
		{
			DuplicateAutoresponder(Senderid[j]);
		//	System.out.println("Campaign"+j+" = "+myTime);
			Thread.sleep(5000);
			BasePage.waitForElement(driver,chooseCampaignBtn,20);
			BasePage.ClickElement(driver,chooseCampaignBtn);
			
			BasePage.waitForElement(driver,searchCampaign,20);
			System.out.println(campName);
			BasePage.setText(driver, searchCampaign,campName);
			//BasePage.waitForElement(driver,campaignOptions,20);
//			BasePage.waitForElement(driver,campaignOptions,30);
			BasePage.javascriptClick(driver, campaignOptions);
//			BasePage.ClickElement(driver,campaignOptions);
			BasePage.waitForElement(driver,continueBtn,20);
			BasePage.ClickElement(driver,continueBtn);
			Thread.sleep(5000);
			autodup.autoresponderSchedule("9000", "today");;

		}
		//System.out.println("Executed Succesfully");
		//LogoutPage LogOut= new LogoutPage(driver);
		//LogOut.peformLogout();

	}


	
		
	
	
	public void autoresponderSchedule(String limit,String dateRangeType) throws IOException, InterruptedException, ParseException, java.text.ParseException {
		Thread.sleep(5000);
		scrollVertical(driver,0,1000);
		BasePage.waitForElement(driver,maxLimit,20);
		BasePage.clear(driver,maxLimit);
		BasePage.setText(driver, maxLimit,limit);
		BasePage.waitForElement(driver,dateRange,20);
		BasePage.ClickElement(driver,dateRange);
		
		if(dateRangeType=="today") {
			BasePage.javascriptClick(driver, todayDate);
//			BasePage.waitForElement(driver,todayDate,30);
//			BasePage.ClickElement(driver,todayDate);
		}
		BasePage.waitForElement(driver,submitBtn,20);
		BasePage.ClickElement(driver,submitBtn);
		BasePage.waitForElement(driver,autoresponderLink,20);
		
		BasePage.ClickElement(driver,autoresponderLink);
		
		
		
	}
}
	