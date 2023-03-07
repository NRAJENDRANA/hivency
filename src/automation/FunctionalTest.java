package automation;


import org.openqa.selenium.By;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




import java.util.Set;


import org.testng.annotations.Test;
@Test
 //Verifying that the virtual landscape is loaded correctly on the screen
 public class FunctionalTest {
	public void testVirtualLandscapeInteractions() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithya\\eclipse-workspace\\hivency\\drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://virtual-landscape.dcbra.in");
		   
		// Wait for the page to load
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		  
		   // Interact with an object(download) in the virtual landscape
	        WebElement element = driver.findElement(By.id("downloadImage"));
	        element.click();

		   driver.quit();
	}
	}



	

		
	


