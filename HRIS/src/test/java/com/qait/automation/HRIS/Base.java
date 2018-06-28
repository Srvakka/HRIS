package com.qait.automation.HRIS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

public WebDriver driver = null;
public WebDriver getdriver()
{
   System.setProperty("webdriver.chrome.driver","C:\\Users\\abhisheksrivastava\\Downloads\\chromedriver.exe");
   driver = new ChromeDriver();
   return driver;
}
}
