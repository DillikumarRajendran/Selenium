package steps;

import org.testng.annotations.BeforeTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hook extends ProjectMethods {
	
	@Before
	public void before(Scenario sc)
	{
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		test = startTestCase("testNodes");
		test.assignCategory("category");
		test.assignAuthor("authors");
		startApp("chrome");
		
				
	}
	
	@After
	public void after()
	{
		endResult();
		closeAllBrowsers();
	}

}
