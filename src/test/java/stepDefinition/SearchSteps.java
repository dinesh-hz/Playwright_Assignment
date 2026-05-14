package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import helpers.hookes;
import pages_Actions.SearchPageActions;

public class SearchSteps {

    SearchPageActions search = new SearchPageActions(hookes.getPage());

    @When("User clicks Products page")
    public void user_clicks_products_page() {
        search.clickProductsPage();
    }

    @And("User enters product name")
    public void user_enters_product_name() {
        search.enterProductName("Tshirt");
    }

    @And("User clicks Search button")
    public void user_clicks_search_button() {
        search.clickSearchButton();
    }

    @Then("Search result should display")
    public void search_result_should_display() {

        Assert.assertTrue(search.isSearchResultDisplayed(),
                "Search results not displayed");

        System.out.println("Search results displayed successfully");
    }
}