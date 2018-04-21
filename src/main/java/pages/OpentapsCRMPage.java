package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OpentapsCRMPage extends ProjectMethods{
	public OpentapsCRMPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCName;
	public OpentapsCRMPage editCName(String data)
	{
		type(eleCName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleFName;
	public OpentapsCRMPage editFName(String data)
	{
		type(eleFName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement eleLName;
	public OpentapsCRMPage editLName(String data)
	{
		type(eleLName,data);
		return this;
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleUpdateBtn;
	public ViewLeadPage clickUpdate()
	{
		click(eleUpdateBtn);
		return new ViewLeadPage();
		
	}
}
