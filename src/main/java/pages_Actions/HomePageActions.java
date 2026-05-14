package pages_Actions;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

public class HomePageActions  {

    Page page;
    
    
    
    private String productsbutn = "//a[@href='/products']";
    private String clickcartbutn = "//a[@href='/view_cart']";
    private String Signupbutn = "//a[@href='/login']";



    public HomePageActions(Page page) {
        this.page = page;
    }

    public void launchHomePage() {
        page.navigate("https://automationexercise.com/");
        page.waitForLoadState();
        
        
    }

    public void clickProductsMenu() {
        page.locator(productsbutn).click();
        page.waitForLoadState(LoadState.NETWORKIDLE);
    }

    public void clickCartMenu() {
        page.locator(clickcartbutn).click();
    }

    public void clickSignupLoginMenu() {
        page.locator(Signupbutn).click();
    }

    public String getCurrentUrl() {
        return page.url();
    }

    public String getPageTitle() {
        return page.title();
    }
}