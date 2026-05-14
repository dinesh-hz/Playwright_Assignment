package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages_Actions.AddCartPageActions;

import org.testng.Assert;

import helpers.hookes;

public class AddToCartSteps {

    AddCartPageActions cart = new AddCartPageActions(hookes.getPage());

    @When("User navigates to products page")
    public void user_navigates_to_products_page() {
        cart.navigateToProductsPage();
    }

    @And("User clicks Add to cart button")
    public void user_clicks_add_to_cart_button() {
        cart.clickAddToCart();
    }

    @And("User clicks View Cart button")
    public void user_clicks_view_cart_button() {
        cart.clickViewCart();
    }

    @Then("Product should add into cart successfully")
    public void product_should_add_successfully() {

        Assert.assertTrue(cart.isProductAddedInCart(),
                "Product not added to cart");

        System.out.println("Product added to cart successfully");
    }
}