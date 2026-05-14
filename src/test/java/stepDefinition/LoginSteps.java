package stepDefinition;

import org.testng.Assert;

import helpers.hookes;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages_Actions.LoginPageActions;
import utilities.ExcelReader;

public class LoginSteps {

    LoginPageActions login = new LoginPageActions(hookes.getPage());

    @When("User clicks Signup Login button")
    public void user_clicks_signup_login_button() {
        login.clickSignupLoginButton();
    }

    @And("User enters valid email")
    public void user_enters_valid_email() {
    	
    	String user = ExcelReader.getCellDataByColumnName(1, "Username");
        login.enterEmail(user);
    }

    @And("User enters valid password")
    public void user_enters_valid_password() {
    	String pass = ExcelReader.getCellDataByColumnName(1, "Password");

        login.enterPassword(pass);
    }

    @And("User clicks Login button")
    public void user_clicks_login_button() {
        login.clickLoginButton();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        
        boolean loginSuccessful = login.isLoginSuccessful();
        
        Assert.assertTrue(loginSuccessful, "username is displyed");

        
    }


    @And("User enters invalid email")
    public void user_enters_invalid_email() {
        login.enterEmail("wrong@gmail.com");
    }

    @And("User enters invalid password")
    public void user_enters_invalid_password() {
        login.enterPassword("Wrong123");
    }

    @Then("Error message should display")
    public void error_message_should_display() {
    	login.getErrorMessage();
    }
}