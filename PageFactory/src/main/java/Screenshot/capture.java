package Screenshot;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;


import Browser.browser;

public class capture extends browser {
	public static void screenShot(String name) throws Exception { 

		try {

			TakesScreenshot shot = ((TakesScreenshot) driver);

			File source = shot.getScreenshotAs(OutputType.FILE);

			String path = System.getProperty("user.dir") + "\\target\\ScreenShot\\" + name + ".png";

			File destination = new File(path);

			FileUtils.copyFile(source, destination);

		} catch (Exception e) {

			System.out.println("Screenshot");

		}

	}

}
