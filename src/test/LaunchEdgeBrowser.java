package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchEdgeBrowser {

    public static void main(String[] args) {
        // Set the path of the GeckoDriver executable
//        System.setProperty("webdriver.edge.driver", "C:\\GitHubProjects\\JavaProject\\drivers\\msedgedriver.exe");

        // Launch Firefox browser
        WebDriver driver = new EdgeDriver();

        // Navigate to a URL
        driver.get("https://dd-demo-tau.vercel.app");

        // Perform further actions...
        
        System.out.println("browser launched successfuly !!");

    }
}
