package pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hooks.BaseClass;

public class Login extends BaseClass {

	public Login() {
	
		PageFactory.initElements(getdriver(), this);
	}

	@CacheLookup
	@FindBy(how = How.CLASS_NAME, using = "inputLogin")
	List<WebElement> eleUsername;

	// @CacheLookup
	// @FindBy(how=How.ID,using="password") WebElement elepassword;
	// multiple Locators
	// And Condition-->chained method
	/*
	 * @FindBys({
	 * 
	 * @FindBy(how=How.CLASS_NAME,using="decorativeSubmit") ,
	 * 
	 * @FindBy(how=How.XPATH,using ="//input[@type='submit']")
	 * 
	 * }) WebElement eleLogin;
	 */
	// Or condition
	@FindAll({ @FindBy(how = How.CLASS_NAME, using = "decorativeSubmit"),
			@FindBy(how = How.XPATH, using = "//input[@type='submit1']") })
	WebElement eleLogin;

	public Login userName(String userId) {
		// driver.findElement(By.id("username")).sendKeys(userId);
		eleUsername.get(0).sendKeys(userId);
		return this;
	}

	// type password

	public Login passWord(String password) {
		// driver.findElement(By.id("password"));
		eleUsername.get(1).sendKeys(password);
		return this;
	}

	// click login
	public Home logIn() {
		// driver.findElement(By.className("decorativeSubmit"));
		eleLogin.click();
		return new Home();
	}

}
