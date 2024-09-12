package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooks;

public class SigninPage {

	public WebDriver driver;

	public SigninPage(WebDriver driver) {
		this.driver = Hooks.getDriver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class=\"panel header\"]/ul/li/a[contains(text(),'Sign In')]")
	WebElement SignIn;

	@FindBy(id = "email")
	WebElement EmailID;

	@FindBy(xpath = "//input[@name='login[password]']")
	WebElement pword;

	@FindBy(xpath = "//div/button/span[text()=\"Sign In\"]")
	WebElement SigninButton;

	public void SignIn() {
		SignIn.click();
	}

	public void CredEmail(String stremail) {
		EmailID.sendKeys(stremail);
	}

	public void CredPass(String strpword) {
		pword.sendKeys(strpword);
	}

	public void SigninB() {
		SigninButton.click();
	}
}
