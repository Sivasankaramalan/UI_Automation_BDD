package Driver.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Driver.PropertyData;
import Driver.desiredCapabilities;
import ObjectRepository.HomePage_OR;
import ObjectRepository.LandingPage_OR;
import PageObjects.CommonMethodsFunctions;
import Utility.Log;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonStepDefinitions extends desiredCapabilities {

	PropertyData data = new PropertyData();
	CommonMethodsFunctions CF = new CommonMethodsFunctions();
	
	String customerName = CF.randomAlphaNumeric(5);
	String customerNumber = CF.randomNumber(10);

	
	/**
	 * Launching the APP under test - First step of Test Cases Execution
	 * @throws Throwable
	 */
	@Given("Launch the App$")
	public void launch_the_app() throws Throwable {

		Log.info("Launching the Application based on the Capabilities from the Driver file");
		System.out.println("Platform Name here is: " + driver.getCapabilities().getCapability("platformName"));

	}
	@And("^Verify \"([^\"]*)\" popup$")
	public void verify_popup(String option) {
		if(option.equals("Allow app to use your contacts")) {
			try {
			wait.until(ExpectedConditions.visibilityOf(HomePage_OR.Allow)).isDisplayed();
			Assert.assertTrue(HomePage_OR.Allow.isDisplayed());
			wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.Allow)).isDisplayed();
			HomePage_OR.Allow.click();
			}
			catch(Exception E) {
				Log.info("Contact Permission Available for the App");
			}
			
		}
	}
	@And("^Hide Keyboard$")
	public void hide_keyboard() {
		driver.hideKeyboard();
	}
	@Then("^User closes the app$")
	public void user_close_the_app() {
		driver.quit();
	}
	@And("^User Navigates back$")
	public void navigate_back() {
		driver.navigate().back();
	}
}
