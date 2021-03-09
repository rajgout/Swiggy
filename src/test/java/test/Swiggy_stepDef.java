package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Swiggy_stepDef 
{
	WebDriver driver;
	@Given("^User has opened swiggy website on Chrome Browser$")
    public void user_has_opened_swiggy_website_on_chrome_browser() throws Throwable 
	{
		 System.setProperty("webdriver.chrome.driver", "chromedriver");
         
	        System.setProperty("webdriver.gecko.driver", "geckodriver");
	       
	        driver = new ChromeDriver();
	       
	        driver.get("https://www.swiggy.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
    }

	 @When("^Click on login button \"([^\"]*)\"$")
	    public void click_on_login_button_something(String mobilenumber)throws Throwable 
    {
        WebElement logBut= driver.findElement(By.xpath("//*[@class=\"x4bK8\"]"));
        logBut.click();
        
        WebElement username= driver.findElement(By.xpath("//*[@class=\"_381fS\"]"));
        username.sendKeys(mobilenumber);
    }
	 
	 @Then("^User should be able to login successfully$")
	    public void user_should_be_able_to_login_successfully() throws Throwable {
	        throw new PendingException();
	 }

}
