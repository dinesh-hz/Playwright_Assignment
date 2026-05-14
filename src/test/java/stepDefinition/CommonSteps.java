package stepDefinition;

import helpers.hookes;
import io.cucumber.java.en.Given;

public class CommonSteps {
	
	@Given("User launches application url of Loginpagemodule")
    public void user_launches_application_url_of_loginpagemodule() {

        hookes.getPage().navigate("https://automationexercise.com/");
        hookes.getPage().waitForLoadState();

    }
	
	
	@Given("User launches application url of HomeModule")
    public void user_launches_application_url_of_HomeModule() {

        hookes.getPage().navigate("https://automationexercise.com/");
        hookes.getPage().waitForLoadState();

    }
	
	@Given("User launches application url of Searchmodule")
    public void user_launches_application_url_of_Searchmodule() {

        hookes.getPage().navigate("https://automationexercise.com/");
        hookes.getPage().waitForLoadState();

    }
	
	
	@Given("User launches application url of AddTocardmodule")
    public void user_launches_application_url_of_AddTocardmodule() {

        hookes.getPage().navigate("https://automationexercise.com/");
        hookes.getPage().waitForLoadState();

    }
	
	


}
