package utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitHelper  {

	public WebDriver driver;
	
	
	
	public WaitHelper(WebDriver driver) {
		this.driver=driver;
	}
    
	
	
     public void WaitForElement(WebElement element) {
    	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	 wait.until(ExpectedConditions.visibilityOf(element));
     }



	
	
	
}
