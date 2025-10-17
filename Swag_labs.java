package test;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import io.cucumber.java.en.And; 
import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When; 
  
public class Swag_labs {  
WebDriver driver;  
  @Given("I Launch chrome browser") 
  public void i_launch_chrome_browser() {  
   System.setProperty("WebDriver.chrome.driver","C:\\Users\\arora\\Downloads\\chrlauncher-win64-stable-ungoogled");    
   driver=new ChromeDriver();  
    }  
  @When("I open SwagLabs login page")  
  public void i_open_orange_hrm_homepage() {   
  driver.get("https://www.saucedemo.com/v1/");  
   //driver.manage().window().maximize();  
  }  
    
  @Then("Enter username and password")  
  public void i_verify_that_the_logo_present_on_page() {   
   driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
   driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
   driver.findElement(By.id("login-button")).click(); 
   }  
   
  @And("close browser") 
  public void close_browser() {  
   driver.quit(); 
   }  
}


