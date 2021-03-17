package tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.xmlbeans.impl.regex.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import core.TestConfig;
import core.TestReports;
import pages.Automation;
import pages.AutoresponderCreatePage;
import pages.AutoresponderDuplicatePage;
import pages.CampaignGeneratePage;
import pages.CampaignPage;

import pages.LoginPage;

import pages.LogoutPage;
import pages.TimeBaseCampaignPage;

public class BulkCampaign extends TestBase{
	LoginPage login;
	CampaignGeneratePage CampGen;
	CampaignPage campaign;
	TimeBaseCampaignPage  tbcampaign;
	AutoresponderDuplicatePage autoresponder;
	Automation  automation;
	@BeforeMethod
	public void Login_To_App() {
	
		
		driver().get(TestConfig.getProperty("APP_URL"));
	}

/*
	@Test(dataProvider="extractData",priority=1)
	public void Verify_Bulk_Campaign(HashMap<String,String> data) throws ParseException, IOException, InterruptedException, Exception {
		System.out.println("Hello");
		 Thread.sleep(1000);
		login = new LoginPage(driver());
		report().logReport(LogStatus.INFO, "Application Launched", "Application launch successfull");
		
		login.peformLogin(data.get("username"),data.get("password"));
		report().logReport(LogStatus.INFO, "Username", data.get("username"));
		report().logReport(LogStatus.INFO, "Password", data.get("password"));
		
		report().logReport(LogStatus.INFO, "Login Successfull", "Login successfull");
		
		System.out.println("Launched driver Successufflu");
		
		campaign = new CampaignPage(driver());
		campaign.getSenderId(data.get("senderid1"),data.get("senderid2"),data.get("senderid3"),data.get("senderid4"),data.get("senderid5"));
		campaign.Bulk_campaign1(data.get("usercount"),data.get("listname"));
		
		
		
		
		
}
	
*/
/*
	@Test(dataProvider="extractData",priority=1)
	public void Verify_AutoResponder(HashMap<String,String> data) throws ParseException, IOException, InterruptedException, Exception {
		System.out.println("Hello");
		 Thread.sleep(1000);
		login = new LoginPage(driver());
		report().logReport(LogStatus.INFO, "Application Launched", "Application launch successfull");
		
		login.peformLogin(data.get("username"),data.get("password"));
		report().logReport(LogStatus.INFO, "Username", data.get("username"));
		report().logReport(LogStatus.INFO, "Password", data.get("password"));
		
		report().logReport(LogStatus.INFO, "Login Successfull", "Login successfull");
		
		System.out.println("Launched driver Successfully");
		
		//CampGen =  new CampaignGeneratePage(driver());
		//autoresponder = new AutoresponderCreatePage(driver());
		
		autoresponder=new  AutoresponderDuplicatePage(driver());
		
//		CampGen.createCampaign();
		autoresponder.getSenderId(data.get("senderid1"),data.get("senderid2"),data.get("senderid3"),data.get("senderid4"),data.get("senderid5"));
		
		autoresponder.AutoResponder_campaign1(data.get("usercount"),data.get("campname"));
		//String listName = CampGen.createNewCampaign(data.get("campname"),data.get("subject"),data.get("templatename"));

//		String listName = CampGen.createNewCampaign("Automation AutoresponderTest","Auto Test subject","Automation Testing Template");
		Thread.sleep(1000);
		//autoresponder.chooseCampaign(data.get("autorespondercampname"));
//		autoresponder.chooseCampaign("Autoresponder campaign");
		//autoresponder.autoresponderSchedule("1", "today");
		Thread.sleep(1000);
	

	}
*/

	@Test(dataProvider="extractData",priority=2)
    public void Verify_DupliAutomation(HashMap<String,String> data) throws ParseException, IOException, InterruptedException, Exception {
        System.out.println("Test for Verify Automation susing duplicate");
        Thread.sleep(1000);
        login = new LoginPage(driver());
        report().logReport(LogStatus.INFO, "Application Launched", "Application launch successfully");
        login.peformLogin(data.get("username"),data.get("password"));
        report().logReport(LogStatus.INFO, "Username", data.get("username"));
        report().logReport(LogStatus.INFO, "Password", data.get("password"));
        report().logReport(LogStatus.INFO, "Login Successfully", "Login successfully");
        System.out.println("Launched driver successfully");
        automation = new Automation(driver());
        automation.getautomationname(data.get("automationname1"),data.get("automationname2"),data.get("automationname3"),data.get("automationname4"),data.get("automationname5"));
        for(int i=0;i<=4;i++) {
        automation.generatDupliAutomation(i);
        }
        //System.out.println("Actual count"+ Integer.toString(results[0]));
     //   System.out.println("Expected count "+ Integer.toString(results[1]));
       // assertEquals(Integer.toString(results[0]), Integer.toString(results[1]));
    }
	/*
	@Test(dataProvider="extractData",priority=1)
	public void Verify_TimeBasedBulk_Campaign(HashMap<String,String> data) throws ParseException, IOException, InterruptedException, Exception {
		System.out.println("Hello");
		 Thread.sleep(1000);
		login = new LoginPage(driver());
		report().logReport(LogStatus.INFO, "Application Launched", "Application launch successfull");
		
		login.peformLogin(data.get("username"),data.get("password"));
		report().logReport(LogStatus.INFO, "Username", data.get("username"));
		report().logReport(LogStatus.INFO, "Password", data.get("password"));
		
		report().logReport(LogStatus.INFO, "Login Successfull", "Login successfull");
		
		System.out.println("Launched driver Successufflu");
		
		tbcampaign = new TimeBaseCampaignPage(driver());
		tbcampaign.getSenderId(data.get("senderid1"),data.get("senderid2"),data.get("senderid3"),data.get("senderid4"),data.get("senderid5"));
		tbcampaign.Bulk_TBcampaign1(data.get("usercount"),(data.get("listname")));
	}
		/*
		if(campaign.Verify_Bulk_campaign(data.get("UserCount")) == true) {
			report().logReport(LogStatus.PASS, "View No  Error status", 
					"View No Error status displayed successfully");
		}else {
			report().logReport(LogStatus.FAIL, "View No  Error status", 
					"View No Error status didnt displayed");
		}
	}      
	*/
		
		
		
		
		
}

