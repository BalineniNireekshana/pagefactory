package Browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class browser {
public static WebDriver driver;
public static WebDriverWait wait;
public static Actions act;


public static void openBrowser() throws Exception {

	try {

		String choice = Utility.properties("browser"); 

		if (choice.equalsIgnoreCase("Chrome"))
			
			driver = new ChromeDriver();

	} catch (Exception e) {

		//e.printStackTrace();

		System.out.println("Browser - openBrowser");

	}

}



public static void navigateToUrl() throws Exception {

	try {
		String str=Utility.properties("url");

		driver.get(str); 

		//driver.manage().window().maximize();

		act = new Actions(driver);

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.titleIs("OrangeHRM"));

	} catch (Exception e) {

		System.out.println("Browser - geturl");

	}

}


public static void closeBrowser() {

	try {
        
		driver.quit();

	} catch (Exception e) {

		System.out.println("Browser - closeBrowser");

	}

}



}
