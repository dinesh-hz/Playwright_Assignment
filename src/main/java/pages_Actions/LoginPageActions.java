package pages_Actions;

import com.microsoft.playwright.Page;

public class LoginPageActions {

	Page page;

	private String Signupbutn = "a[href='/login']";
	private String emailbox = "input[data-qa='login-email']";
	private String passwordbox = "input[data-qa='login-password']";
	private String loginbutn = "button[data-qa='login-button']";
	private String errormesg = "//p[text()='Your email or password is incorrect!']";
	private String Loginverify = "//a[contains(text(),'Logged in as')]";
	private String acutualusername = "//b[text()=\"Dinesh Murugan\"]";

	public LoginPageActions(Page page) {
		this.page = page;
	}

	public void clickSignupLoginButton() {
		page.locator(Signupbutn).click();
	}

	public void enterEmail(String email) {
		page.locator(emailbox).fill(email);
	}

	public void enterPassword(String password) {
		page.locator(passwordbox).fill(password);
	}

	public void clickLoginButton() {
		page.locator(loginbutn).click();
	}

	public String getErrorMessage() {
		return page.locator(errormesg).textContent();
	}

	public boolean isLoginSuccessful() {


		boolean visible = page.locator(acutualusername).isVisible();
		String text = page.locator(acutualusername).innerText();
		System.err.println("current username is :"+text);
		return visible;
	}
}