package commonutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfiguration {

	public static WebDriver driver;
	public static String driverPath = System.getProperty("user.dir");
	public static WebDriver openBrowser(){
		if(driver==null){
		System.setProperty("webdriver.chrome.driver", driverPath+"\\driverFiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		ReportConfiguration.initializeObjects();
		}
		return driver;
	}
}
