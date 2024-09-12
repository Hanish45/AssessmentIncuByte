package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.RegistrationPage;
import pageobjects.SigninPage;

public class Steps {

	RegistrationPage page = new RegistrationPage(Hooks.getDriver());
	SigninPage spage = new SigninPage(Hooks.getDriver());

	String email = "hanishp123344@gmail.com";
	String password = "12345@Luma";

	@Given("Navigating to homepage")
	public void Navigating_to_homepage() {
		Hooks.getDriver().get("https://magento.softwaretestingboard.com");
	}

	@Given("Verifies the HomePage and clicks on Create an Account")
	public void Verifies_the_Homepage_and_clicksOn_Create_an_Account() {
		Assert.assertEquals(true, Hooks.getDriver().findElement(By.xpath("//a[@class='logo']")).isDisplayed()); //
		System.out.println("Logo Verified Successfully");
		page.CreateAnAccount();

	}

	@When("User lands on registration page and enters the required details")
	public void FillingtheDetails() {
		page.firstname("Hanish");

		page.lastname("Pinja");

		page.Email(email);

		page.Password(password);

		page.Conpassword(password);

	}

	@Then("Clicking on Create an Account")
	public void clicking_on_create_an_account() {
		page.button();
		System.out.println("Account Created succesfully");
	}

	@And("User should be able to see Thank you Message on Screen")
	public void user_should_be_able_to_see_thank_you_message_on_screen() {

		page.message();
		page.DropDownBtn();
		page.SignOut();

	}

// SECOND SCENARIO METHODS 

	@Given("User clicks on Sign-in")
	public void user_clicks_on_sign_in() {
		System.out.println("User is on Homepage");
		spage.SignIn();
	}

	@When("Entering credentials in the Specified fields")
	public void entering_credentials_in_the_specified_fields() {

		spage.CredEmail(email);
		spage.CredPass(password);
		spage.SigninB();
	}

	@Then("HomePage should be Displayed and should be able to see Welcome Hanish Pinja!")
	public void AfterSigningIn() {
		Hooks.getDriver().findElement(By.xpath("//a[@class='logo']")).isDisplayed();
		System.out.println("Logged in Successfully with the newly created credentials");
		Hooks.getDriver().close();

	}

}
