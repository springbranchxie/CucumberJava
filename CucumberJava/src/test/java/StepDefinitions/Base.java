package StepDefinitions;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;


public class Base {

	public WebDriver driver;
	public LoginPage lp;
	public AddcustomerPage addCust;
	public SearchCustomerPage searchCust;
	public static Logger logger;
	public Properties configProp;
	
	
	//Created for generating random String for unique email
	public static String randomstring()
	{
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	
	
	
}
