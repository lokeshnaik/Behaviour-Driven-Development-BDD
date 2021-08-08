package stepDefinationLoginScenarioOutline;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NopCommerceLogin 
{
	ChromeDriver driver=new ChromeDriver();
	
	@Given("^User is on login page of website$")
	public void user_is_on_login_page_of_website() throws Throwable
	{
	   driver.navigate().to("https://www.nopcommerce.com/en/login");
	   Thread.sleep(1000);
	   driver.manage().window().maximize();
	}

	@When("^User enter the username and password$")
	public void user_enter_the_username_and_password() throws Throwable 
	{
	   driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("lokeshnaik");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("saikiraN@0709");
	   Thread.sleep(1000);
	}

	@And("^Clicks on login button$")
	public void clicks_on_login_button() throws Throwable
	{
	 driver.findElement(By.xpath("(//input[@class='btn blue-button'])[2]")).click();
	 Thread.sleep(1000);
	    
	}

	@Then("^user is on home page of nope commerence website$")
	public void user_is_on_home_page_of_nope_commerence_website() throws Throwable 
	{
		String expected=driver.getTitle();
		Thread.sleep(1000);
		String actual="Free and open-source eCommerce platform. ASP.NET based shopping cart. - nopCommerce"; 
		
		Assert.assertEquals(expected, actual);
		
	   driver.close();
	}

}
