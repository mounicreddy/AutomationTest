package actionlibrary;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import commonutilities.DriverConfiguration;
import commonutilities.ReportConfiguration;
import elementrepository.DemoRegister;

public class DemoRegisterLib {

	DemoRegister demoregister = PageFactory.initElements(DriverConfiguration.driver, DemoRegister.class);
	public void enterEmail(String Email) throws Exception
	{
		try{
		demoregister.getEmailid().click();
		ReportConfiguration.passCase("User is able to enter email", "Email");
		}
		catch(Exception e){
			ReportConfiguration.failCase(e.getMessage(), "Unable to enter email");
		}
	}
	public void clickArrow() throws Exception
	{
		try{
		demoregister.getArrowbutton().sendKeys();
		ReportConfiguration.passCase("User is able to click arrow", "ARROW BUTTON");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Failed to click enter");
		}
	}
	public void enterFirstName(String firstName) throws Exception
	{
		try{
		demoregister.getFirstname().sendKeys(firstName);
		ReportConfiguration.passCase("User is able to enter first name", "FIRSTNAME");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Failed to enter first name");
		}
	}
	public void enterLastName(String lastName) throws Exception
	{
		try{
		demoregister.getLastname().sendKeys(lastName);
		ReportConfiguration.passCase("User is able to enter last name", "LASTNAME");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Failed to enter last name");
		}
	}
	public void enterAddress(String Address) throws Exception
	{
		try{
		demoregister.getAddress().sendKeys(Address);
		ReportConfiguration.passCase("User is able to enter address", "ADDRESS");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Failed to enter address");
		}
	}
	public void enterEmailId(String emailId) throws Exception
	{
		try{
		demoregister.getEmail().sendKeys(emailId);
		ReportConfiguration.passCase("User is able to enter email", "EMAIL");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Failed to enter email");
		}
	}
	public void enterPhoneNum(String phone) throws Exception
	{
		try{
			demoregister.getPhone().sendKeys(phone);
			ReportConfiguration.passCase("User is able to enter phone number", "PHONE");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Failed to enter phone num");
		}
	}
	public void clickFemale() throws Exception
	{
		try{
			demoregister.getFemale().click();
			ReportConfiguration.passCase("User is able to click female", "FEMALE");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "User is unable to click female");
		}
	}
	public void selectCricket() throws Exception
	{
		try{
			demoregister.getCricket().click();
			ReportConfiguration.passCase("User is able to select cricket", "CRICKET");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Cricket_Not selected");
		}
	}
	public void selectMovies() throws Exception
	{
		try{
			demoregister.getMovies().click();
			ReportConfiguration.passCase("User is able to select movies", "MOVIES");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(),"Movies_Not Selected");
		}
	}
	public void selectHockey() throws Exception
	{
		try{
			demoregister.getHockey().click();
			ReportConfiguration.passCase("User is able to select hockey", "HOCKEY");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Hockey_Not Selected");
		}
	}
	public void clicklanguagetab() throws Exception
	{
		try{
			demoregister.getLanguagetab().click();
			ReportConfiguration.passCase("Language tab clicked", "LANGUAGETAB");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Languatetab_Not clicked");
		}
	}
	public void selectLanguage(String lang) throws Exception
	{
		try{
			demoregister.getLanguage().click();
			ReportConfiguration.passCase("English selected", "ENGLISH");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Language_not selected");
		}
	}
	public void clickSkill() throws Exception
	{
		try{
			demoregister.getSkill().click();
			ReportConfiguration.passCase("SkillBox_Clicked", "SKILLBOX");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Skill_Not Selected");
		}
	}
	public void selectSkill(String skill) throws Exception
	{
		try{
			demoregister.getSkill().click();
			ReportConfiguration.passCase("Skill_Selected", "SKILLS");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Skills_not selected");
		}
	}
	public void selectCountryTab(String cuntry) throws Exception
	{
		try{
			Select sel = new Select(demoregister.getCountrytab());
			sel.selectByVisibleText(cuntry);
			ReportConfiguration.passCase("Country tab clicked", "COUNTRY TAB");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Country tab not clicked");
		}
	}
	public void clickSelCountrytab() throws Exception
	{
		try{
			demoregister.getSelcountrytab().click();
			ReportConfiguration.passCase("SelCountryTab clicked", "SELCOUNTRYTAB");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "SelCountryTab not clicked");
		}
	}
	public void selectCountry1(String cntry) throws Exception
	{
		try{
			demoregister.getCountry1().click();
			ReportConfiguration.passCase("Country1 selected", "COUNTRY1");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Country1 not selected");
		}
	}
	public void selectYearBox(String year) throws Exception
	{
		try{
			Select sel = new Select(demoregister.getYeartab());
			sel.selectByVisibleText(year);
			ReportConfiguration.passCase("YearBox_Clicked", "YEARTAB");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "YearBox_Not Clicked");
		}
	}
	public void selectMonthtab(String month) throws Exception
	{
		try{
			Select sel = new Select(demoregister.getMonthtab());
			sel.selectByVisibleText(month);
			ReportConfiguration.passCase("Month tab clicked", "MONTHTAB");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Month tab not clicked");
		}
	}
	public void selectDayBox(String day) throws Exception
	{
		try{
			Select sel = new Select(demoregister.getDaybox());
			sel.selectByVisibleText(day);
			ReportConfiguration.passCase("Day box clicked", "DAYBOX");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Day box not clicked");
		}
	}
	public void enterPassword(String password) throws Exception
	{
		try{
			demoregister.getPassword().sendKeys(password);
			ReportConfiguration.passCase("User is able to enter password", "PASSWORD");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Password not entered");
		}
	}
	public void confirmPassword(String confirmPwd) throws Exception
	{
		try{
			demoregister.getConfirmpassword().sendKeys(confirmPwd);
			ReportConfiguration.passCase("Both passwords match", "CONFIRM PASSWORD");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Both passwords do not match");
		}
	}
	public void imageUpload(String fileName)throws Exception
	{
		try{
			demoregister.getImageupload().sendKeys(fileName);
			ReportConfiguration.passCase("Image uploaded", "IMAGE");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Image not uploaded");
		}
	}
	public void clickSubmit() throws Exception
	{
		try{
			demoregister.getSubmit().click();
			ReportConfiguration.passCase("Submit button clicked", "SUBMIT BUTTON");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Submit button not clicked");
		}
	}
	public void clickRefresh() throws Exception
	{
		try{
			demoregister.getRefresh().click();
			ReportConfiguration.passCase("Refresh button clicked", "REFRESH BUTTON");
		}
		catch(Exception e)
		{
			ReportConfiguration.failCase(e.getMessage(), "Refresh button not clicked");
		}
	}
}
