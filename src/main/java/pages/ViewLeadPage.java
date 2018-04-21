package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using ="viewLead_firstName_sp")
	private WebElement eleFirstName;
	public ViewLeadPage verifyFirstName(String data)
	{
		verifyPartialText(eleFirstName,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleEditBtn;
	public OpentapsCRMPage clickEdit()
	{
		click(eleEditBtn);
		return new OpentapsCRMPage();
	}
	
	@FindBy(how=How.ID,using ="viewLead_companyName_sp")
	private WebElement eleCName;
	public ViewLeadPage getCName(String data)
	{
		verifyPartialText(eleCName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using ="viewLead_firstName_sp")
	private WebElement eleFName;
	public ViewLeadPage getFName(String data)
	{
		verifyExactText(eleFName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using ="viewLead_lastName_sp")
	private WebElement eleLName;
	public ViewLeadPage getLName(String data)
	{
		verifyExactText(eleLName, data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous")
	private WebElement eleDeleteBtn;
	public MyLeadsPage clickDeleteBtn()
	{
		clickWithNoSnap(eleDeleteBtn);
		return new MyLeadsPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadsLink;
	public FindLeadPage clickFindLeadsLink()
	{
		click(eleFindLeadsLink);
		return new FindLeadPage();
	}
}
