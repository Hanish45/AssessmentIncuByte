package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;

public class RegistrationPage {

	public WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = Hooks.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='logo']")
	WebElement logo;

	@FindBy(xpath = "//a[contains(text(),'Create an')]")
	WebElement ClickCreate;

	@FindBy(id = "firstname")
	WebElement fname;

	@FindBy(id = "lastname")
	WebElement lname;

	@FindBy(xpath = "//input[@name='email']")
	WebElement Email;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "password-confirmation")
	WebElement Conpassword;

	@FindBy(xpath = "//button/span[contains(text(),'Create an')]")
	WebElement Button;

	@FindBy(xpath = "//div[contains(text(),'Thank you')]")
	WebElement Message;

	@FindBy(xpath = "(//button[@type='button'])[1]")
	WebElement dropdownbtn;

	@FindBy(xpath = "(//a[contains(text(),'Sign Out')])[1]")
	WebElement SignOut;

	public void Logo() {
		logo.isDisplayed();
	}

	public void CreateAnAccount() {
		ClickCreate.click();
	}

	public void firstname(String strfname) {
		fname.sendKeys(strfname);
	}

	public void lastname(String strLname) {
		lname.sendKeys(strLname);
	}

	public void Email(String stremail) {
		Email.sendKeys(stremail);
	}

	public void Password(String strpword) {
		password.sendKeys(strpword);
	}

	public void Conpassword(String strcword) {
		Conpassword.sendKeys(strcword);
	}

	public void button() {
		Button.click();
	}

	public void message() {
		WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(10));
		WebElement messagee = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Thank you')]")));
		boolean Message = messagee.isDisplayed();
		if (Message) {
			System.out.println("Account Registration Successfull");
		} else {
			System.out.println("Account registration failed");
		}
//	Message.isDisplayed();
	}

	public void DropDownBtn() {
		dropdownbtn.click();
	}

	public void SignOut() {
		SignOut.click();
	}
//	//  Second Scenario Objects
//
//	@FindBy(xpath="//div[@class=\"panel header\"]/ul/li/a[contains(text(),'Sign In')]")
//	WebElement SignIn;
//
//	@FindBy(id="email")
//	WebElement EmailID;
//	
//	@FindBy(xpath="//input[@name='login[password]']")
//	WebElement pword;
//	
//	@FindBy(xpath="//div/button/span[text()=\"Sign In\"]")
//	WebElement SigninButton;
//	
//	public void SignIn() {
//		SignIn.click();
//	}
//	
//	public void CredEmail(String stremail) {
//		EmailID.sendKeys(stremail);
//	}
//
//	public void CredPass(String strpword) {
//		pword.sendKeys(strpword);
//	}
//
//	public void SigninB() {
//		SigninButton.click();
//	}

}