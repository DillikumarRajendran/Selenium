package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods{
	
	@BeforeTest
	public void getTestData()
	{
		testCaseName="TC006_MergeLead";
		testDescription="Merging two of the leads to a single Lead";
		testNodes="MergeLead";
		category="smoke";
		authors="Dilli";
		
		dataSheetName="TC006_MergeLead";
		browserName="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void editLeadTest(String uName, String pWord, String fromLeadID, String toLeadID)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pWord)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeadsLink()
		.clickFromLeadIcon()
		.enterFromLead(fromLeadID)
		.mergeFromFindLeadsBtn()
		.clickFromSearchResult()
		.clickToLeadIcon()
		.enterToLead(toLeadID)
		.mergeToFindLeadsBtn()
		.clickToSearchResult()
		.clickMergeBtn()
		.clickFindLeadsLink()
		.searchFromLeadID(fromLeadID)
		.findLeadsBtn()
		.verifyNoRecordsFound();
	}

}
