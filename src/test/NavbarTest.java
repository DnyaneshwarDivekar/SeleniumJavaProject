package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NavbarTest {
	
	public static void main(String[] args) {
		
		  // Launch Firefox browser
        WebDriver driver = new EdgeDriver();

        // Navigate to a URL
        driver.get("https://dd-demo-tau.vercel.app");
        
       List<WebElement> webLinks = driver.findElements(By.xpath("//nav/a"));
       
       // Print the links
       for (WebElement link : webLinks) {
           System.out.println(link.getAttribute("href"));
       }

       
	}

}
