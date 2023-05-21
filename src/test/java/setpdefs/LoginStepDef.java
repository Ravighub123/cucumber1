package setpdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef {
	
	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   
		driver.get("https://www.simplilearn.com/");
	Thread.sleep(2000);
	}

	@Given("I have clicked on Login Link")
	public void i_have_clicked_on_Login_Link() {
	    // Write code here that turns the phrase above into concrete actions
	   
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
	}

	@When("I enter username")
	public void i_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys("abc@xyz.com");
	}

	@When("I enter password")
	public void i_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Abc@12345");
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement loginBtn = driver.findElement(By.name("btn_login"));
		loginBtn.click();
	}

	@Then("I should land on home page")
	public void i_should_land_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I should get the error message")
	public void i_should_get_the_error_message() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement error = driver.findElement(By.className("error_msg"));
		String ActError = error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(ActError, ExpError);;
	}
	
		@When("I enter username as {string}")
	public void i_enter_username_as(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys(UserNameVal);
	   
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String PassVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(PassVal);
	   
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String ExpError) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement error = driver.findElement(By.className("error_msg"));
		String ActError = error.getText();
		
		Assert.assertEquals(ActError, ExpError);  
	}

}








