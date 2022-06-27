package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public WebDriver driver;
	By email = By.name("email");
	By password = By.name(" password");
	By login = By.xpath("//input[@type='submit']");
	By fullname = By.xpath("//*[@id=\"content\"]/div/div/h2");

	public Loginpage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getemail() {
		// TODO Auto-generated method stub
		return driver.findElement(email);
	}

	public WebElement clicklogin() {
		return driver.findElement(login);

	}

	

	public WebElement getlogin() {
		// TODO Auto-generated method stub
		return driver.findElement(password);
	}

	public WebElement getpassword() {
		// TODO Auto-generated method stub
		return driver.findElement(password);
	}

	public ForgotPassword forgotPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
