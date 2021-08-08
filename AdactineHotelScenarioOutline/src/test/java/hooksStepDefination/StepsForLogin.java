package hooksStepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsForLogin
{
	ChromeDriver driver=null;
	
	@Before
	public void browserSetUp()  throws Throwable
	{
		System.out.println("Am in browserSetUp method");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);	
	}
	
	@After
	public void browserteardown()
	{
		System.out.println("Am in the browserteardown method");
		driver.close();
		driver.quit();
	}
	
	@Given("^User is on login page of the website$")
	public void user_is_on_login_page_of_the_website() throws Throwable 
	{
		driver.navigate().to("https://www.nopcommerce.com/en/login");
	    Thread.sleep(1000);
	    driver.manage().window().maximize(); 
	}
	
		@When("^User enters valid username and  password$")
	public void user_enters_valid_username_and_password() throws Throwable 
	{
		  driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("lokeshnaik");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("saikiraN@0709");
		   Thread.sleep(1000);
		
	}

	@And("^User enter login buutton$")
	public void user_enter_login_buutton() throws Throwable 
	{
		driver.findElement(By.xpath("(//input[@class='btn blue-button'])[2]")).click();
		 Thread.sleep(1000);
		
	}

	@Then("^User lands on home page$")
	public void user_lands_on_home_page() throws Throwable
	{
		String expected=driver.getTitle();
		Thread.sleep(1000);
		String actual="Free and open-source eCommerce platform. ASP.NET based shopping cart. - nopCommerce"; 
		
		Assert.assertEquals(expected, actual);
		
	}


}
