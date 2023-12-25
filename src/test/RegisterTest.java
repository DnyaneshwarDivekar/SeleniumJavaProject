package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class RegisterTest {
	
	public static void main(String[] args) {

        // Launch Firefox browser
        WebDriver driver = new EdgeDriver();

        // Navigate to a URL
        driver.get("https://dd-demo-tau.vercel.app");
        
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("DDUser1");
        
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("DDUser1@gmail.com");
        
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@123");
        
        driver.findElement(By.xpath("//button[@type='button']")).click();
        
        String alertText = driver.switchTo().alert().getText();
        
 
        if (alertText.contains("User Registered")) {
        	
        	System.out.println("Test Passed");
        }else
        {
        	
        	System.out.println("Test Failed");
        }
        
        

      

}

}