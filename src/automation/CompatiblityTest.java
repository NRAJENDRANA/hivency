package automation;


import org.openqa.selenium.By;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.Set;


import org.testng.annotations.Test;
@Test

public class CompatiblityTest {


	public void testVirtualLandscapeInteractions() {
	    	
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithya\\eclipse-workspace\\hivency\\drivers\\chromedriver.exe");
	        
	        // Launch Chrome browser
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://virtual-landscape.dcbra.in");
	        
	        driver.quit();
	        
	     // Wait 
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        // geckodriver
	    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\nithya\\eclipse-workspace\\hivency\\drivers\\geckodriver.exe");
	        
	        // Launch Firefox browser
	        WebDriver firefoxDriver = new FirefoxDriver();
	        firefoxDriver.get("https://virtual-landscape.dcbra.in");
	        firefoxDriver.quit();
	    }
	}

