package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginNewToursStepDefs {
	private WebDriver driver;
	
	@Given("^user is on the login page of newtours$")
	public void user_is_on_the_login_page_of_newtours() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^user enters correct crredentials in newtours$")
	public void user_enters_correct_crredentials_in_newtours() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys("invalidUN");
		driver.findElement(By.name("password")).sendKeys("invalidPW");
		driver.findElement(By.name("login")).click();
		
	}

	@Then("^user can do sucessful login$")
	public void user_can_do_sucessful_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
		System.out.println("User can able to login the page sucessfully");
	}

}
