package Demo.SeleniumNewFeatures;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sumit goyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/search?q=html+color+picker&rlz=1C1CHBF_enIN913IN913&oq=html+color+&aqs=chrome.1.0i433l2j69i57j0i433j0j69i60l3.6981j1j4&sourceid=chrome&ie=UTF-8");
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='kdPwrb']"));
		System.out.println("changed");
		Actions builder = new Actions(driver);   
		builder.moveToElement(ele, 569, 268).click().build().perform();
	}

}
