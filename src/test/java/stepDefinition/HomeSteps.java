package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import helpers.hookes;
import pages_Actions.HomePageActions;

public class HomeSteps {

    HomePageActions home = new HomePageActions(hookes.getPage());


    @When("User clicks Products menu")
    public void user_clicks_products_menu() {
        home.clickProductsMenu();
    }

    @Then("User should navigate to Products page")
    public void user_should_navigate_to_products_page() {

        Assert.assertTrue(home.getCurrentUrl().contains("products"));

        System.out.println("Navigated to Products Page");
    }


    @When("User clicks Cart menu")
    public void user_clicks_cart_menu() {
        home.clickCartMenu();
    }

    @Then("User should navigate to Cart page")
    public void user_should_navigate_to_cart_page() {

        Assert.assertTrue(home.getCurrentUrl().contains("view_cart"));

        System.out.println("Navigated to Cart Page");
    }


    @When("User clicks Signup Login menu")
    public void user_clicks_signup_login_menu() {
        home.clickSignupLoginMenu();
    }

    @Then("User should navigate to Login page")
    public void user_should_navigate_to_login_page() {

        Assert.assertTrue(home.getCurrentUrl().contains("login"));

        System.out.println("Navigated to Login Page");
    }
}