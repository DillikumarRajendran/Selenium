package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID, using="createLeadForm_companyName")
	private WebElement eleCmpName;
	@And("Enter Company Name as (.*)")
	public CreateLeadPage enterCompanyName(String data) {
		type(eleCmpName, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	private WebElement eleFName;
	@And("Enter First Name as (.*)")
	public CreateLeadPage enterFName(String data) {
		type(eleFName, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	private WebElement eleLName;
	@And("Enter Last Name as (.*)")
	public CreateLeadPage enterLName(String data) {
		type(eleLName, data);
		return this;
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadBtn;
	@When("Click CreateLead Button")
	public ViewLeadPage clickCreateLeadBtn()
	{
		click(eleCreateLeadBtn);
		return new ViewLeadPage();
	}
	
	@Then("Verify creation of Lead is successful")
	public void verifyCreateLead()
	{
		System.out.println("Lead is created successfully");
	}
	
}
