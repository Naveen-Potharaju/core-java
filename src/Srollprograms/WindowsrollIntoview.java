package Srollprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsrollIntoview {

	public static void main(String[] args) {
		
		
		 WebDriver driver = new ChromeDriver();
		   
		   
		   driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapp.skillrary.com/");
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			
			WebElement b1 = driver.findElement(By.xpath("//a[text()='Blogs']"));
			
			
			
			
			   js.executeScript("arguments[0].scrollIntoView(true)", b1);
			
			
			
			
		
		

	}

}
