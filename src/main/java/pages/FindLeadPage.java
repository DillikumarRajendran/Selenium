package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods {

	public FindLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH, using="//label[text()='Lead ID:']/following::input[2]")
	private WebElement elefNameSearchKey;
	public FindLeadPage searchfName(String data)
	{
		type(elefNameSearchKey,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadbtn; 
	public FindLeadPage findLeadsBtn()
	{
		click(eleFindLeadbtn);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement eleSearchResult;
	public ViewLeadPage clickSearchResult()
	{
		click(eleSearchResult);
		return new ViewLeadPage();
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement elesearchResult;
	public FindLeadPage verifyNoRecordsFound()
	{
		getText(elesearchResult);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleSearchKey;
	public FindLeadPage searchFromLeadID(String data)
	{
		type(eleSearchKey,data);
		return this;
	}
}
