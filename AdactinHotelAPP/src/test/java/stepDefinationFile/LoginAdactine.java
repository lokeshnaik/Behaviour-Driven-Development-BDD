package stepDefinationFile;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginAdactine 
{
	ChromeDriver driver=new ChromeDriver();
	@Given("^User is on login page of hotel$")
	public void user_is_on_login_page_of_hotel() throws Throwable
	{
		Thread.sleep(1000);
	    driver.navigate().to("https://adactinhotelapp.com/");

	}

	@When("^User enters the username and password$")
	public void user_enters_the_username_and_password() throws Throwable 
	{
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("lokiloki7");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("lokiloki7");
	    
	}

	@And("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable 
	{
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='login']")).click();
	  
	}

	@Then("^User is on hotel home page$")
	public void user_is_on_hotel_home_page() throws Throwable
	{
		Thread.sleep(2000);
	    String expected="Search Hotel (Fields marked with Red asterix (*) are mandatory)";
	    
	    String actual=driver.findElement(By.xpath("//td[text()='Search Hotel ']")).getText();
	    System.out.println(actual);
	    Thread.sleep(2000);
	    
	    Assert.assertEquals(expected, actual);
	    
	    driver.close();
	   driver.quit();
	}
	

}
