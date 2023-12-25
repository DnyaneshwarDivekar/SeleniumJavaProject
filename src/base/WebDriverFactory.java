package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver createDriver(String browser) {
        WebDriver driver = null;
        switch (browser.toLowerCase()) {
            case "chrome":
                
                driver = new ChromeDriver();
                break;
                
            case "firefox":
               
                driver = new FirefoxDriver();
                break;

            case "edge":
            	
            	driver = new EdgeDriver();
            	
        }
        
        return driver;
    }
}
