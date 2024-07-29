package StepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;
import utilities.WaitHelper;

public class Steps extends Base {
	
	@Before
	public  void setup() throws IOException
	{

		logger=Logger.getLogger("nopComemerce");//Added logger
		PropertyConfigurator.configure("log4j.properties");//add logger
		
		//Reading properties
		configProp=new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		String br=configProp.getProperty("browser");
		
		if(br.equals("chrome")) {
	    System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
	    WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		logger.info("**********Launching URL************");	}
		else if(br.equals("edge")) {
			System.setProperty("webdriver.edge.driver", configProp.getProperty("edgepath"));
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			logger.info("**********Launching URL************");
		}
	}
	

	@Given("user launch Chrome browser")
	public void user_launch_Chrome_browser() {
		logger.info("********Launching browser***********");
	    lp=new LoginPage(driver);
	}

	@When("user opens URL {string}")
	public void user_opens_URL(String url) {
		logger.info("**********Opening URL************");
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("user enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
		logger.info("**********Providing login details************");
		lp.setUserName(email);
	    lp.setPassword(password);
	}

	@When("click on Login")
	public void click_on_Login() {
		logger.info("**********started login************");
	    lp.clickLogin();
	}

	@SuppressWarnings("deprecation")
	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
	    if(driver.getPageSource().contains("Login was unsuccessful.")) {
	       driver.close();
	       logger.info("**********Login passed************");
	       Assert.assertTrue(false);
	    	
	    }else {
	    	System.out.println(driver.getTitle());
	    	logger.info("**********Login failed************");
	    	Assert.assertEquals(title, driver.getTitle());
	    }
		
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {
		Thread.sleep(5000);
		logger.info("**********click on logout link************");
	    lp.clickLogout();
	    
	    
	}

	@Then("close browser")
	public void close_browser() {
		logger.info("**********close browser************");
		driver.quit();
		
	}

	//customer feature step definitions..............
	
	@Then("user can view Dashboard")
	public void user_can_view_Dashboard() {
	    addCust=new AddcustomerPage(driver);
	    Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
	}

	@When("user click on customers Menu")
	public void user_click_on_customers_Menu() throws InterruptedException {
	   Thread.sleep(3000);
	   addCust.clickOnCustomerMenu(); 
	}

	@When("click on customers Menu Item")
	public void click_on_customers_Menu_Item() throws InterruptedException {
		Thread.sleep(3000);
	    addCust.clickOnCustomerMenuItem();
	    }

	@When("click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {
	    addCust.clickOnAddnew();
	    Thread.sleep(2000);
		
	}

	@Then("user can view Add new customer page")
	public void user_can_view_Add_new_customer_page() {
	   
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		logger.info("**********Adding new customer************");
		logger.info("**********providing customer details ************");
	    String email=randomstring()+"@gmail.com";
		addCust.setEmail(email);
		addCust.setPassword("test123");
		//Registered-default
		//The customer cannot be in both 'Guests' and 'Registered' customer roles
		//Add the customer to 'Guests' or 'Registered' customer role
		addCust.setCustomerRoles("Guests");
		Thread.sleep(5000);
		
		addCust.setManagerOfVendor("Vendor 2");
		addCust.setGender("Male");
		addCust.setFirstName("Paven");
		addCust.setLastName("Kumar");
		addCust.setDob("01/05/1984");//Format:D/MM/YYYY
		addCust.setCompanyName("busyQA");
		addCust.setAdmincontent("This is for testing......");	
		Thread.sleep(5000);
	}

	@When("click on Save button")
	public void click_on_Save_button() throws InterruptedException {
		logger.info("**********Saving customer data************");
	    addCust.clickOnSave();
	    Thread.sleep(2000);
	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));	   
	}
	
	//Steps for Searching a customer using Email ID..............

	@When("Enter customer Email")
	public void enter_customer_Email() {
		
		logger.info("**********Searching customer by email id************");
		searchCust=new SearchCustomerPage(driver);
		searchCust.setEmail("victoria_victoria@nopCommerce.com");
	    
	}

	@When("click on search button")
	public void click_on_search_button() throws InterruptedException {
		searchCust.clickSearch();
		Thread.sleep(3000);
	}

	@Then("user should found Email in the search table")
	public void user_should_found_Email_in_the_search_table() {
	   
		
		boolean status=searchCust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
		Assert.assertEquals(true, status);
		
	}
	
	//steps for searching a customer by firstname and lastname
	@When("Enter customer FirstName")
	public void enter_customer_FirstName() {
		logger.info("**********Searching customer by Name************");
		searchCust=new SearchCustomerPage(driver);
		searchCust.setFirstName("Victoria");
	    
	}

	@When("Enter customer LastName")
	public void enter_customer_LastName() {
		searchCust.setLastName("Terces");
	}

	@Then("User should found Name in the Search table")
	public void user_should_found_Name_in_the_Search_table() {
	    boolean status=searchCust.searchCustomerByName("Victoria Terces");
	    Assert.assertEquals(true, status);
	}

	
}
