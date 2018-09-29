package test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import actionlibrary.DemoRegisterLib;
import commonutilities.DriverConfiguration;
import commonutilities.ReportConfiguration;

public class DemoRegisterTest {

	DemoRegisterLib demoregisterlib;
	@BeforeClass
	public void openingChromeBrowser(){
		DriverConfiguration.openBrowser();
		demoregisterlib = new DemoRegisterLib();
	}
	
	@BeforeMethod
	public void enterUrl(Method m)
	{
		DriverConfiguration.driver.get("http://demo.automationtesting.in/Index.html");
		ReportConfiguration.report.startTest(m.getName());
	}
	
	@Test
	public void testRegisterPage() throws Exception
	{
		demoregisterlib.enterEmailId("mounicacreddy@gmail.com");
		demoregisterlib.clickArrow();
		demoregisterlib.enterFirstName("Mounica");
		demoregisterlib.enterLastName("Kogili");
		demoregisterlib.enterAddress("Bengaluru");
		demoregisterlib.enterEmailId("abc@gmail.com");
		demoregisterlib.enterPhoneNum("9344010000");
		demoregisterlib.clickFemale();
		demoregisterlib.selectCricket();
		demoregisterlib.selectMovies();
		demoregisterlib.selectHockey();
		demoregisterlib.clicklanguagetab();
		demoregisterlib.selectLanguage("English");
		demoregisterlib.clickSkill();
		demoregisterlib.selectSkill("Java");
		demoregisterlib.selectCountryTab("India");
		demoregisterlib.clickSelCountrytab();
		demoregisterlib.selectCountry1("India");
		demoregisterlib.selectYearBox("1994");
		demoregisterlib.selectMonthtab("June");
		demoregisterlib.selectDayBox("16");
		demoregisterlib.enterPassword("abc12345");
		demoregisterlib.confirmPassword("abc12345");
		demoregisterlib.imageUpload("C:\\test\\abc.txt");
		demoregisterlib.clickSubmit();
		demoregisterlib.clickRefresh();
	}
	@AfterClass
	public void opentestreport()
	{
		ReportConfiguration.logger.log(LogStatus.INFO, "TEST END");
		ReportConfiguration.report.endTest(ReportConfiguration.logger);
		ReportConfiguration.report.flush();//flush method commits the report and logger object things to the file.
		DriverConfiguration.driver.get(ReportConfiguration.reportLocation);
	}
}
