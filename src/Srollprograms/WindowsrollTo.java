package Srollprograms;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsrollTo {

	public static void main(String[] args) throws InterruptedException {
		
		   WebDriver driver = new ChromeDriver();
		   
		   
		   driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.yatra.com/");
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			
			Thread.sleep(2000);
			
             js.executeScript("window. scrollTo(0,500)");
             Thread.sleep(2000);
             
            
             js.executeScript("window. scrollTo(0,-500)");
             Thread.sleep(2000);
             
	}

}
