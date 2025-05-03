package micro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;
import java.util.HashMap;
import java.util.Map;
public class week4 {

	public static void main(String[] args) throws InterruptedException {
		try {
			Map <String,Object> pref=new HashMap <String,Object>();
			pref.put("profile.default_content_setting_values,notifications",2);
			ChromeOptions opt=new ChromeOptions();
			opt.setExperimentalOption("pref", pref);
			opt.addArguments("__disable_notifications");
			System.setProperty("webdriver.chromedriver","C:\\\\Users\\\\saipr\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.axisbank.com/");
			Thread.sleep(2000);
			driver.quit();
		}
		catch(Exception e) {
			System.out.println("An error occured;" +e.getMessage());
		}
		
	}

}