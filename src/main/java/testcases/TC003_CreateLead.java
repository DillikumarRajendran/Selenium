package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void getTestData()
	{
		testCaseName="TC003_CreateLead";
		testDescription="Validates the Create Leads functionlity";
		testNodes="CreateLead";
		category="smoke";
		authors="Dilli";
		
		dataSheetName="TC003_CreateLead";
		browserName="chrome";
				
	}
	
	@Test(dataProvider = "fetchData")
	public void createLeadTest(String uName, String pWord, String cName, String fName, String lName)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pWord)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFName(fName)
		.enterLName(lName)
		.clickCreateLeadBtn()
		.verifyFirstName(fName);
		
	}

}
