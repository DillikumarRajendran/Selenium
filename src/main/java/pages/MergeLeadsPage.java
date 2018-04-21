package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	public MergeLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}

	//To select FROM LEAD
	@FindBy(how=How.XPATH,using="//span[text()='From Lead']/following::img[1]")
	private WebElement eleFromLeadIcon;
	public MergeLeadsPage clickFromLeadIcon()
	{
		click(eleFromLeadIcon);
		switchToWindow(1);
		return this;
	}

	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleFromLead;
	public MergeLeadsPage enterFromLead(String data)
	{
		type(eleFromLead,data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elemergeFromFindLeadbtn; 
	public MergeLeadsPage mergeFromFindLeadsBtn()
	{
		click(elemergeFromFindLeadbtn);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement elemergeFromSearchResult;
	public MergeLeadsPage clickFromSearchResult()
	{
		clickWithNoSnap(elemergeFromSearchResult);	
		switchToWindow(0);
		return this;
	}
	
	//To select TO LEAD
	@FindBy(how=How.XPATH,using="//span[text()='To Lead']/following::img[1]")
	private WebElement eleToLeadIcon;
	public MergeLeadsPage clickToLeadIcon()
	{
		click(eleToLeadIcon);
		switchToWindow(1);
		return this;
	}

	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleToLead;
	public MergeLeadsPage enterToLead(String data)
	{
		type(eleToLead,data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elemergeToFindLeadbtn; 
	public MergeLeadsPage mergeToFindLeadsBtn()
	{
		click(elemergeToFindLeadbtn);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement elemergeToSearchResult;
	public MergeLeadsPage clickToSearchResult()
	{
		clickWithNoSnap(elemergeToSearchResult);	
		switchToWindow(0);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="buttonDangerous")
	private WebElement eleMergeBtn; 
	public ViewLeadPage clickMergeBtn()
	{
		clickWithNoSnap(eleMergeBtn);
		acceptAlert();
		return new ViewLeadPage();
	}

	
}
