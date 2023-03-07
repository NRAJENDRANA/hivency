package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
@Test
public class PerformanceTest {
	public void testVirtualLandscapeInteractions() {
        // Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithya\\eclipse-workspace\\hivency\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		   driver.get("https://virtual-landscape.dcbra.in");
		   
		// Wait for the page to load
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

            // Measure the load time
            long startLoadTime = System.currentTimeMillis();
            new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("downloadImage")));
            long endLoadTime = System.currentTimeMillis();
            
         // Wait for the page to load
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
            // Measure the response time
            long startResponseTime = System.currentTimeMillis();
            driver.findElement(By.id("downloadImage")).click();
            long endResponseTime = System.currentTimeMillis();

            // Output the load time and response time
            System.out.println("Load time: " + (endLoadTime - startLoadTime) + "ms");
            System.out.println("Response time: " + (endResponseTime - startResponseTime) + "ms");

            driver.quit();
        }
    }
