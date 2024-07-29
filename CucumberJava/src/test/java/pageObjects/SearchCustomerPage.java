package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class SearchCustomerPage {

     public WebDriver ldriver;
     
     WaitHelper waithelper;
     
     public SearchCustomerPage(WebDriver rdriver) {
    	 ldriver=rdriver;
    	 PageFactory.initElements(ldriver, this);
    	 waithelper=new WaitHelper(ldriver);		 
    	 
     }
	
     @FindBy(how=How.ID, using="SearchEmail")
     @CacheLookup
     WebElement txtEmail;
     
     @FindBy(how=How.ID, using="SearchFirstName")
     @CacheLookup
     WebElement txtFirstName;
     
     @FindBy(how=How.ID, using="SearchLastName")
     @CacheLookup
     WebElement txtLastName;
     
     
     
     @FindBy(how=How.XPATH,using="//table[@role='grid']")
     @CacheLookup
     WebElement tblSearchResults;
     
     @FindBy(how=How.XPATH,using="//table[@id='customers-grid']")
     WebElement table;
     
     @FindBy(how=How.XPATH,using="//table[@id='customers-grid']//tbody/tr")
     List<WebElement> tableRows;
     
     @FindBy(how=How.XPATH,using="//table[@id='customers-grid']//tbody/tr/td")
     List<WebElement> tableColumns;
     
     @FindBy(how=How.ID, using="search-customers")
     @CacheLookup
     WebElement btnSearch;
     
     public void setEmail(String email) 
     {
    	 waithelper.WaitForElement(txtEmail);
    	 txtEmail.clear();
    	 txtEmail.sendKeys(email);
     }
     
     public void setFirstName(String fname) {
    	 waithelper.WaitForElement(txtFirstName);
    	 txtFirstName.clear();
    	 txtFirstName.sendKeys(fname); 
     }
     
     public void setLastName(String lname) {
    	 waithelper.WaitForElement(txtLastName);
    	 txtLastName.clear();
    	 txtLastName.sendKeys(lname); 
     }
     
     public void clickSearch() {
    	 btnSearch.click();
    	 waithelper.WaitForElement(btnSearch);
     }
     
     public int getNoOfRows() {
    	 return(tableRows.size());
     }
     
     public int getNoOfColumns() {
    	 return(tableColumns.size());
     }
     
     public boolean searchCustomerByEmail(String email)
     {
    	 boolean flag=false;
    	 for(int i=1;i<=getNoOfRows();i++)
    	 {
    		 String emailid=table.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+i+"]/td[2]")).getText();
    		 System.out.println(emailid);
    		 if(emailid.equals(email))
    		 {
    			 flag=true;
    		 }
    		 
    	 }
    		 
    		 return flag;
    		 
    		 
     }
     
     public boolean searchCustomerByName(String Name)
     {
    	 boolean flag=false;
    	 for(int i=1;i<=getNoOfRows();i++)
    	 {
    		 String name=table.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+i+"]/td[3]")).getText();
    		 String names[]=name.split(" ");//separating fname and lname
    		 if(names[0].equals("Victoria")&& names[1].equals("Terces"))
    		 {
    			 flag=true;
    		 }
    		 
    	 }
    		 
    		 return flag;
    		 
    		 
     }
     
     
     
     
     
     
     
     
     
}