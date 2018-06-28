package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qait.automation.HRIS.Base;

import junit.framework.Assert;

public class Userlogin extends Base {

	public Userlogin(WebDriver driver)
	{
		this.driver = driver;
	}
	By username = By.id("txtUserName");
    By password = By.id("txtPassword");
	By sub = By.name("Submit");
	
	public void action(String User , String Pass) throws InterruptedException
	{
		driver.findElement(By.className("active ")).click();
	    driver.findElement(username).sendKeys(User);
	    driver.findElement(password).sendKeys(Pass);
        driver.findElement(sub).click();
    	Assert.assertEquals(expected, actual);
        //System.out.println("Successfull login");
    	Thread.sleep(2000);
 
}
	public void logout() throws InterruptedException 
	{
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		  WebElement lgtBtn =driver.findElement(By.
		    cssSelector("a[href='https://hris.qainfotech.com:8086/user/logoff']"));
		  js.executeScript("arguments[0].click();", lgtBtn);
			driver.findElement(By.className("active ")).click();
	        
	}
}