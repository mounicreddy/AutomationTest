/*package actionlibrary;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import commonutilities.DriverConfiguration;
import commonutilities.ReportConfiguration;
import elementrepository.DemoWebtable;

public class DemoWebtableLib {
	
	DemoWebtable demowebtable = PageFactory.initElements(DriverConfiguration.driver, DemoWebtable.class);
	Actions actions = new Actions(DriverConfiguration.driver);
	public void enterEmail(String Email) throws Exception
	{
		try{
		demowebtable.getEmailid().click();
		ReportConfiguration.passCase("User is able to enter email", "Email");
		}
		catch(Exception e){
			ReportConfiguration.failCase(e.getMessage(), "Unable to enter email");
		}
	}
	public void clickArrow() throws Exception
	{
		try{
		demowebtable.getArrowbutton().sendKeys();
		ReportConfiguration.passCase("User is able to click arrow", "ARROW BUTTON");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Failed to click enter");
		}
	}
	public void movetoWebtable(String webtable)throws Exception
	{
		try{
			demowebtable.getWebtable().sendKeys("webtable");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Failed to click webtable");
		}
	}
}
*/