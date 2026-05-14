package helpers;

import java.util.Arrays;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import io.cucumber.java.Before;

public class hookes {
	
	
	private Playwright playwright;
	private Browser browser;
	private BrowserContext context;
	private static Page page;

	

	public static Page getPage() {
		return page;
	}



	@Before
	public void BeforeRun() {

	    playwright = Playwright.create();

	    browser = playwright.chromium().launch(
	        new BrowserType.LaunchOptions()
	            .setHeadless(false)
	            .setSlowMo(500)
	            .setArgs(Arrays.asList("--start-maximized"))
	    );

	    context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

	    page = context.newPage();

	    page.navigate("https://automationexercise.com/");
	    page.waitForLoadState();
	}
	
	/*
	 * @After private void teardown() {
	 * 
	 * if (page != null) { page.close(); }
	 * 
	 * if (browser != null) { browser.close(); }
	 * 
	 *   page.close();
        browser.close();
        playwright.close();
	 * 
	 * }
	 */

}
