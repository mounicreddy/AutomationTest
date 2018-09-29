package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoWebtable {
	
	@FindBy(xpath = "//input[@id = 'email']")
	private WebElement emailid;

	public WebElement getEmailid() {
		return emailid;
	}
	
	@FindBy(xpath = "//img[@id = 'enterimg']")
	private WebElement arrowbutton;

	public WebElement getArrowbutton() {
		return arrowbutton;
	}
	
	@FindBy(xpath = "//a[contains(text(),'WebTable')]")
	private WebElement webtable;

	public WebElement getWebtable() {
		return webtable;
	}
}
