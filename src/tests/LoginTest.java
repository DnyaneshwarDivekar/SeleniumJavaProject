package tests;


import org.openqa.selenium.WebDriver;

import base.WebDriverFactory;
import pages.LoginPage;
import utils.ConfigReader;


public class LoginTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.out.println("test case 1");
		
		driver = WebDriverFactory.createDriver("edge");
		
				
		LoginPage loginPage = new LoginPage(driver);
		
		String username = ConfigReader.getProperty("username");
		String password = ConfigReader.getProperty("password");
		String url      = ConfigReader.getProperty("url");
		
		System.out.println(username + " " + password + " " + url);
		
		driver.get(url);
		
		loginPage.login(username, password);
		
		
        String alertText = driver.switchTo().alert().getText();
        
 
        if (alertText.contains("Login successful!")) {
        	
        	System.out.println("Test Passed");
        }else
        {
        	
        	System.out.println("Test Failed");
        }
        
        

      

}

}