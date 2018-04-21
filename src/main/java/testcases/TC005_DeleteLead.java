package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	
	@BeforeTest
	public void getTestData()
	{
		testCaseName="TC005_DeleteLead";
		testDescription="Deleting the created Lead details";
		testNodes="DeleteLead";
		category="smoke";
		authors="Dilli";
		
		dataSheetName="TC005_DeleteLead";
		browserName="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void editLeadTest(String uName, String pWord, String searchKey)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pWord)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.findLeadsPage()
		.searchfName(searchKey)
		.findLeadsBtn()
		.clickSearchResult()
		.clickDeleteBtn()
		.findLeadsPage()
		.searchfName(searchKey)
		.findLeadsBtn()
		.verifyNoRecordsFound();
	
		
	}

}

