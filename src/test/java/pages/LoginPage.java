package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage()

	{
		this.driver = driver;

	}

	@FindBy(how = How.ID, using = "username")
	WebElement user_name;

	@FindBy(id = "password")
	WebElement user_password;

	// FindAll ..uses OR - any condition satisfied it will find the element
	@FindAll({ @FindBy(id = "login"), @FindBy(name = "login_1") })

	WebElement login_btn;

//method to enter the login details

	public void loginAction(String uName, String pwd) {
		user_name.sendKeys(uName);
		user_password.sendKeys(pwd);
		login_btn.click();
	}

}
