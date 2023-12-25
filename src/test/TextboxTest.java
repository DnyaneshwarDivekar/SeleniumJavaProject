package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TextboxTest {
	
	public static void main(String[] args) {
		
		 // Launch Firefox browser
        WebDriver driver = new EdgeDriver();

        // Navigate to a URL
        driver.get("https://dd-demo-tau.vercel.app");
        
        driver.findElement(By.xpath("//a[normalize-space()='Textbox Test']")).click();
        
        String currentURL = driver.getCurrentUrl();
        
        if(currentURL.contains("https://dd-demo-tau.vercel.app/textbox.html")) {
        	
        	System.out.println("Test Case Passed");
        }else
        {
        	System.out.println("Test Case Failed");
        }
	}

}
