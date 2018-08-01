package skeleton;

import java.util.concurrent.TimeUnit;

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
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@When("^user enters correct crredentials in newtours$")
	public void user_enters_correct_crredentials_in_newtours() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@class='radius']")).click();
		
	}

	@Then("^user can do sucessful login$")
	public void user_can_do_sucessful_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals("The Internet", driver.getTitle());
		System.out.println("User can able to login the page sucessfully");
	}

}
