package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5") WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]") WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']") WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='city']") WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='state']") WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']") WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']") WebElement SUBMIT_ELEMENT;
	
	
	public void verifyAddContactPage(String addContactHeaderText) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ADD_CONTACT_HEADER_ELEMENT));
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), addContactHeaderText, "Wrong Page!");
	}
	
	public void insertFullName(String fullName) {
		FULL_NAME_ELEMENT.sendKeys(fullName + generateRandomNum(9999));
	}
	
	public void selectCompany(String company) {
		selectFromDrowdown(COMPANY_ELEMENT, company);
	}
	
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNum(9999) + email);
	}
	
	public void insertPhone(String phoneNum) {
		PHONE_ELEMENT.sendKeys(phoneNum + generateRandomNum(999));
	}
	
	public void selectCountry(String country) {
		selectFromDrowdown(COUNTRY_ELEMENT, country);
	}
	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(generateRandomNum(9999)+ address);
	}
	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(generateRandomNum(9999)+ city);
	}
	public void insertState(String state) {
		STATE_ELEMENT.sendKeys(generateRandomNum(9999)+ state);
	}
	public void insertZip(String zip) {
		ZIP_ELEMENT.sendKeys(generateRandomNum(9999)+ zip);
	}
	public void clickOnSubmit() {
		SUBMIT_ELEMENT.click();
	}

}


