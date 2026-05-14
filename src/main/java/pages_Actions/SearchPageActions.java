package pages_Actions;

import com.microsoft.playwright.Page;

public class SearchPageActions {

    Page page;
    
    private String ProductsPage = "//a[@href='/products']";
    private String Productlocter = "#search_product";
    private String Searchbutn = "#submit_search";
    private String SearchResultDisplaye = ".features_items";



    public SearchPageActions(Page page) {
        this.page = page;
    }

    public void clickProductsPage() {
        page.locator(ProductsPage).click();
    }

    public void enterProductName(String productName) {
        page.locator(Productlocter).fill(productName);
    }

    public void clickSearchButton() {
        page.locator(Searchbutn).click();
    }

    public boolean isSearchResultDisplayed() {
        return page.locator(SearchResultDisplaye).isVisible();
    }

    public String getCurrentUrl() {
        return page.url();
    }
}