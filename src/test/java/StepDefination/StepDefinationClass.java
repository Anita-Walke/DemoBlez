package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinationClass extends BaseClass {

	LoginPage loginPage = new LoginPage();

	@Given("user is on home page")
	public void user_is_on_home_page() {
		BaseClass.initialization();
	}

	@When("user click on login Link")
	public void user_click_on_login_link() throws InterruptedException {
		
		loginPage.clickOnLoginLink();
	}

	@When("user enter valid credentials")
	public void user_enter_valid_credentials() {
		
		String uname=prop.getProperty("userName");
		String pass=prop.getProperty("password");
		loginPage.enterUnamAndPass(uname, pass);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickonLoginButton();
	}

}
