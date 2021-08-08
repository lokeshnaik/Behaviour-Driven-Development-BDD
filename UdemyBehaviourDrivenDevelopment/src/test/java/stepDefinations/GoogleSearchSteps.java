package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xpath.internal.operations.Equals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.EqualsMethod;

public class GoogleSearchSteps
{
	ChromeDriver  driver=new ChromeDriver();
	@Given("^Browser is open$")
	public void browser_is_open() throws Throwable
	{

		System.out.println("Am in browser page");  
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@And("^User is on google page$")
	public void user_is_on_google_page() throws Throwable 
	{
		String text=driver.getTitle();
		System.out.println("Am in google page");
		Assert.assertEquals("Google",text);
	}

	@When("^User enters a text in serach box$")
	public void user_enters_a_text_in_serach_box() throws Throwable
	{
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("google");
		System.out.println("Am in text enter page");  
	//	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='gNO89b']")).click();
	}

	@And("^hits enter$")
	public void hits_enter() throws Throwable 
	{
		System.out.println("Am in enter hitting page");     
	}

	@Then("^User is navigated to the serach result page$")
	public void user_is_navigated_to_the_serach_result_page() throws Throwable
	{
		System.out.println("Am in  serach result page");   
		driver.close();
	}

}
