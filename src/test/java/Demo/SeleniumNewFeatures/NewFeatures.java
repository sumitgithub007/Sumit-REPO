package Demo.SeleniumNewFeatures;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class NewFeatures {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sumit goyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    // driver.get("https://parsleyjs.org/doc/examples/simple.html");
	
    //driver.findElement(RelativeLocator.withTagName("label").above(By.xpath("//label[@for='textbox']"))).getText();
		
 // driver.findElement(RelativeLocator.withTagName("input").(By.xpath("(//input[@type='radio'])[1]"))).click();
	
     
     //WebElement logo1=driver.Findelement(By.xpath(“//div[@id=’divLogo’]//img”));
		driver.get("https://www.amazon.in/"); 
		WebElement  logo=driver.findElement(By.cssSelector("#nav-logo-sprites"));
		
		System.out.println("Height" +logo.getRect().getDimension().getHeight());
    		 System.out.println("Height" +logo.getRect().getDimension().getWidth());

     
		
	/*
	 * driver.get("https://www.amazon.in/"); WebElement
	 * logo=driver.findElement(By.cssSelector("#nav-logo-sprites")); File
	 * src=logo.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(src,new
	 * File("C:\\Users\\sumit goyal\\Downloads\\logo4.png"));
	 */		
		
	
	
	/*
	 * driver.get("https://www.google.com/");
	 * driver.switchTo().newWindow(WindowType.TAB); Thread.sleep(2000);
	 * driver.get("https://www.crmpro.com/"); System.out.println(driver.getTitle());
	 */
		
	/*
	 * driver.get("https://www.google.com/");
	 * driver.switchTo().newWindow(WindowType.WINDOW);
	 * driver.navigate().to("https://www.crmpro.com/");
	 */ 
		
	
	}
	
	
	

}
