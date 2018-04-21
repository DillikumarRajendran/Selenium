package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	
	@BeforeTest
	public void getTestData()
	{
		testCaseName="TC004_EditLead";
		testDescription="Updating the Company, First and Last Name of the User";
		testNodes="EditLead";
		category="smoke";
		authors="Dilli";
		
		dataSheetName="TC004_EditLead";
		browserName="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void editLeadTest(String uName, String pWord, String searchKey, String cName, String fName, String lName)
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
		.clickEdit()
		.editCName(cName)
		.editFName(fName)
		.editLName(lName)
		.clickUpdate()
		.getCName(cName)
		.getFName(fName)
		.getLName(lName);
		
	}

}
