package pages_Actions;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;


public class AddCartPageActions{

    Page page;
    
    private String productpage = "//a[@href='/products']";
    private String clickAddbutn = "(//a[contains(text(),'Add to cart')])[1]";
    private String ViewCartbutn = "//u[text()='View Cart']";
    private String ProductInCart = "//td[@class='cart_description']";




    public AddCartPageActions(Page page) {
        this.page = page;
        
    }

    public void navigateToProductsPage() {
        page.locator(productpage).click();
        page.waitForLoadState(LoadState.NETWORKIDLE);
        
        

    }

    public void clickAddToCart() {
        page.locator(clickAddbutn).click();
    }

    public void clickViewCart() {
        page.locator(ViewCartbutn).click();
    }

    public boolean isProductAddedInCart() {
        return page.locator(ProductInCart).isVisible();
    }

    public String getCurrentUrl() {
        return page.url();
    }
}