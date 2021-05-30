package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Static.Static;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class Pages  
{
	WebDriver driver;
	
	@Given("First start page")
	
	public void i_am_on_start_page() throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		driver.get("https://testzenlabs.ie/job-details-form/");
				
	}

	@Given("I enter the name a Previous_Company_Name {string}")
	public void i_enter_the_name_a_Previous_Company_Name(String previous_Company_Name) throws InterruptedException {
		
		Static login = new Static(driver);
		login.Previous_Company_Name(previous_Company_Name);
		
	    
		
	}

	@Given("I enter the name a Current_Company_Name {string}")
	public void i_enter_the_name_a_Current_Company_Name(String current_Company_Name) throws InterruptedException{
       
		Static login = new Static(driver);
		login.Current_Company_Name(current_Company_Name);
	    
	    
		
	}

	@Given("I enter the name a bday_year {string}")
	public void i_enter_the_name_a_bday_Name(String bday_year) throws InterruptedException {
		Static login = new Static(driver);
		login.Bday_year(bday_year);
		
	    
		
	}

	@When("I enter the name a previous_Join_Date {string}")
	public void i_enter_the_name_a_previous_Join_Date(String previous_Join_Date) throws InterruptedException {
        
		Static login = new Static(driver);
		login.Previous_Join_Date(previous_Join_Date);
			
	}

	@When("I enter the name a Previous_Company_End_Date {string}")
	public void i_enter_the_name_a_Previous_Company_End_Date(String previous_Company_End_Date) throws InterruptedException {
		Static login = new Static(driver);
		login.Previous_Company_End_Date(previous_Company_End_Date);
		
	    
	}

	@When("I enter the current_Company_Join_Date {string}")
	public void i_enter_the_current_Company_Join_Date(String current_Company_Join_Date) throws InterruptedException {
		
		Static login = new Static(driver);
		login.Current_Company_Join_Date(current_Company_Join_Date);
		
	    
	}	

	@When("I click on Experience {string}")
	public void i_click_on_Experience(String experience_CLICK) throws InterruptedException {
		Static login = new Static(driver);
		login.Experience_CLICK(experience_CLICK);
		
	    
	
	}
	@When("I click on QA_Web_Manual {string}")
	public void i_click_on_QA_Web_Manual(String qa_Web_Manual) throws InterruptedException {
		Static login = new Static(driver);
		login.QA_Web_Manual(qa_Web_Manual);
		
	    
	
	}
	@When("I click on QA_submit {string}")
	public void i_click_on_QA_submit(String qa_submit) throws InterruptedException {
		Static login = new Static(driver);
		login.QA_submit(qa_submit);
	
	}

	@When("browser quit")
	public void browser() throws InterruptedException {
		
		driver.quit();
	
	}


}
