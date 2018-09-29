package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoRegister {
	
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
	
	@FindBy(xpath = "//input[@placeholder = 'First Name']")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(xpath = "//input[@placeholder = 'Last Name']")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(xpath = "//textarea[@ng-model = 'Adress']")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(xpath = "//input[@type = 'email']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(xpath = "//input[@type = 'tel']")
	private WebElement phone;

	public WebElement getPhone() {
		return phone;
	}
	
	@FindBy(xpath = "//input[@value = 'FeMale']")
	private WebElement female;

	public WebElement getFemale() {
		return female;
	}
	
	@FindBy(xpath = "//input[@value = 'Cricket']")
	private WebElement cricket;

	public WebElement getCricket() {
		return cricket;
	}
	
	@FindBy(xpath = "//input[@value = 'Movies']")
	private WebElement movies;

	public WebElement getMovies() {
		return movies;
	}
	
	@FindBy(xpath = "//input[@value = 'Hockey']")
	private WebElement hockey;

	public WebElement getHockey() {
		return hockey;
	}
	
	@FindBy(xpath = "//div[@id = 'msdd']")
	private WebElement languagetab;
	
	public WebElement getLanguagetab() {
		return languagetab;
	}

	@FindBy(xpath = "//a[contains(text(),'English')]")
	private WebElement language;

	public WebElement getLanguage() {
		return language;
	}

	@FindBy(xpath = "//select[@ng-model = 'Skill']")
	private WebElement skillbox;

	public WebElement getSkillbox() {
		return skillbox;
	}

	@FindBy(xpath = "//option[contains(text(),'Java')]")
	private WebElement skill;

	public WebElement getSkill() {
		return skill;
	}

	@FindBy(xpath = "//select[@id = 'countries']")
	private WebElement countrytab;

	public WebElement getCountrytab() {
		return countrytab;
	}
	
	/*@FindBy(xpath = "//option[contains(text(),'India')]")
	private WebElement country;

	public WebElement getCountry() {
		return country;
	}*/

	@FindBy(xpath = "//span[@role = 'combobox']")
	private WebElement selcountrytab;

	public WebElement getSelcountrytab() {
		return selcountrytab;
	}
	
	@FindBy(xpath = "//li[contains(text(),'Hong Kong')]")
	private WebElement Country1;

	public WebElement getCountry1() {
		return Country1;
	}

	@FindBy(xpath = "//select[@placeholder = 'Year']")
	private WebElement yeartab;

	public WebElement getYeartab() {
		return yeartab;
	}	
	
	@FindBy(xpath = "//select[@placeholder = 'Month']")
	private WebElement monthtab;

	public WebElement getMonthtab() {
		return monthtab;
	}	
	
	@FindBy(xpath = "//select[@placeholder = 'Day']")
	private WebElement daybox;

	public WebElement getDaybox() {
		return daybox;
	}
	
	@FindBy(xpath = "//input[@id = 'firstpassword']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//input[@id = 'secondpassword']")
	private WebElement confirmpassword;

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	
	@FindBy(xpath = "//input[@id='imagesrc']")
	private WebElement imageupload;
	
	public WebElement getImageupload() {
		return imageupload;
	}

	@FindBy(xpath = "//button[@id = 'submitbtn']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(xpath = "//button[@id = 'Button1']")
	private WebElement refresh;

	public WebElement getRefresh() {
		return refresh;
	}
}
