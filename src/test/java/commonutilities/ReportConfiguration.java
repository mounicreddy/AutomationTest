package commonutilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportConfiguration {

	public static ExtentReports report;
	public static ExtentTest logger;
	
	static Calendar cal = Calendar.getInstance();
	static SimpleDateFormat sdf = new SimpleDateFormat("HH-MM-SS");
	public static String projectDirectory = System.getProperty("user.dir");
	public static String reportLocation = projectDirectory+"\\Reports\\AutomationExecutionReport"+sdf.format(cal.getTime())+".html";
	
	public static void initializeObjects(){
		report = new ExtentReports(reportLocation, true);
		logger = report.startTest("Automation Learning");
	}
	
	public static String takeScreenshot(WebDriver driver, String imageName) throws Exception{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String des = projectDirectory+"\\Reports\\Screenshots\\"+imageName+".PNG";
		File destination = new File(des);
		FileUtils.copyFile(src, destination);
		return des;
	}
	
	public static void passCase(String logger, String imageName) throws Exception{
		String imagePath = takeScreenshot(DriverConfiguration.driver, imageName);
		String image = ReportConfiguration.logger.addScreenCapture(imagePath);
		ReportConfiguration.logger.log(LogStatus.PASS, logger,image);
	}
	
	public static void failCase(String logger, String imageName) throws Exception{
		String imagePath = takeScreenshot(DriverConfiguration.driver, imageName);
		String image = ReportConfiguration.logger.addScreenCapture(imagePath);
		ReportConfiguration.logger.log(LogStatus.FAIL, logger,image);
	}
}
