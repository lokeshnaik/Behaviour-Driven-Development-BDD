package stepDefinationLoginScenarioOutline;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginScenarioOutline
{
	ChromeDriver driver=new ChromeDriver();
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable
	{
	   driver.navigate().to("https://adactinhotelapp.com/");
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   Thread.sleep(1000);
	   
	   
	}

	@When("^User enters jack(\\d+) and saikiraN(\\d+)$")
	public void user_enters_jack_and_saikiraN(int arg1, int arg2) throws Throwable 
	{
      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jack0709");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("saikiraN07");
	   Thread.sleep(1000);
	}

	@And("^Click login button$")
	public void click_login_button() throws Throwable
	{
	    driver.findElement(By.xpath("//input[@id='login']")).click();
	    
	}

	@Then("^User lands on hotel home page$")
	public void user_lands_on_hotel_home_page() throws Throwable 
	{
		Thread.sleep(2000);
	    String expected="Search Hotel (Fields marked with Red asterix (*) are mandatory)";
	    
	    String actual=driver.findElement(By.xpath("//td[text()='Search Hotel ']")).getText();
	    System.out.println(actual);
	    Thread.sleep(2000);
	    
	    Assert.assertEquals(expected, actual);
	    
	    driver.close();
	 
	}

	@When("^User enters saikiran(\\d+) and saikiran(\\d+)$")
	public void user_enters_saikiran_and_saikiran(int arg1, int arg2) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("saikiran4061");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("saikiraN07");
		   Thread.sleep(1000);
	  
	}

	@When("^User enters lokeshnaik(\\d+) and saikiran(\\d+)$")
	public void user_enters_lokeshnaik_and_saikiran(int arg1, int arg2) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lokeshnaik09");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("saikiran09");
		   Thread.sleep(1000);
	 
	}

	@When("^User enters lokiloki(\\d+) and lokiloki(\\d+)$")
	public void user_enters_lokiloki_and_lokiloki(int arg1, int arg2) throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lokiloki7");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("lokiloki7");
		   Thread.sleep(1000);
	    
	}


}
