package MAVEN_PROJ.PROJECT1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.ForgotPassword;
import PageObject.Landingpage;
import PageObject.Loginpage;
import Resources.Base;

public class homePage extends Base {
	public WebDriver driver;

	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test(dataProvider = "getData")

	public void basePageNavigation(String Username, String Password) throws IOException {

		// one is inheritance

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		Landingpage l = new Landingpage(driver);
		Loginpage lp = l.getLogin(); // driver.findElement(By.css()
		lp.getemail().sendKeys(Username);
		lp.getpassword().sendKeys(Password);
		lp.getlogin().click();
		

	}

	@AfterTest
	public void teardown() {

		driver.quit();

	}

	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data = new Object[2][2];
		// 0th row
		data[0][0] = "nonrestricteduser@qw.com";
		data[0][1] = "123456";

		// 1st row
		data[1][0] = "restricteduser@qw.com";
		data[1][1] = "456788";

		return data;

	}

}
