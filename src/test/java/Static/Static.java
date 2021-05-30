package Static;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Static
{
WebDriver driver;


By Previous_Company_Name = By.xpath("//input[@placeholder='Previous Company Name']");
By Current_Company_Name = By.xpath("//input[@placeholder='Current Company Name']");
By Bday_year = By.xpath("//input[@name='bday']");
By Previous_Join_Date = By.xpath("//input[@name='bday']");
By Previous_Company_End_Date = By.xpath("//input[@name='bday']");
By Current_Company_Join_Date = By.xpath("//input[@name='bday']");
By Experience_CLICK = By.xpath("//input[@id='exp-2']");
By QA_Web_Manual = By.xpath("//input[@id='profession-0']");
By QA_submit = By.xpath("//a[@class='kc_button primary_button']");

public Static(WebDriver driver) {
	 this.driver = driver;
}

	//Parameterizing the void functions
	

	public void Previous_Company_Name(String previous_Company_Name) 

	{
		driver.findElement(Previous_Company_Name).sendKeys(previous_Company_Name);
	}

	public  void Current_Company_Name(String current_Company_Name) throws InterruptedException

	{
		driver.findElement(Current_Company_Name).sendKeys(current_Company_Name);


	}

	public  void Bday_year(String bday_year)

	{
	
		driver.findElements(Bday_year).get(0).sendKeys(bday_year);
   
		
	}
		public  void Previous_Join_Date(String previous_Join_Date) throws InterruptedException
		{
			
			driver.findElements(Previous_Join_Date).get(1).sendKeys(previous_Join_Date);
			   
			    }
		public  void Previous_Company_End_Date(String previous_Company_End_Date) throws InterruptedException

		{
			driver.findElements(Previous_Company_End_Date).get(2).sendKeys(previous_Company_End_Date);

			
		}			
    			
		public  void Current_Company_Join_Date(String current_Company_Join_Date) throws InterruptedException

		{
			driver.findElements(Current_Company_Join_Date).get(3).sendKeys(current_Company_Join_Date);

			
		}
		

		public  void Experience_CLICK(String experience_CLICK) throws InterruptedException

		{
			driver.findElement(Experience_CLICK).click();


		}
		public  void QA_Web_Manual  (String qa_Web_Manual) throws InterruptedException

		{

			driver.findElement(QA_Web_Manual).click();

		}
		
		
		public  void QA_submit (String qa_submit) throws InterruptedException

		{

			driver.findElements(QA_submit).get(0).click();


		}
		
			
            }


		


