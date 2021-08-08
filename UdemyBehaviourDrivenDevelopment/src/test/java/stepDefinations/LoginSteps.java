package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps 
{
	ChromeDriver driver=new ChromeDriver();

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable
	{
		Thread.sleep(1000);
		System.out.println("Am in the login page");   
		driver.navigate().to("http://adactinhotelapp.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable
	{
		System.out.println("An the password page");   

		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("saikiran0709");

		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("saikiran07");  
		Thread.sleep(2000);
	}

	@And("^Clicks on submit button$")
	public void clicks_on_submit_button() throws Throwable
	{

		System.out.println("Am in the submit button page");   

		driver.findElement(By.xpath("//*[@id='login']")).click();
		Thread.sleep(2000);
	}

	@Then("^User is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() throws Throwable
	{
		System.out.println("Am back to home  page");   

		System.out.println("User logged in succesfully");

		driver.close();

	}

}
