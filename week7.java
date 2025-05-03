package micro;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "C:\\\\Users\\\\saipr\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("CMRIT hyderabad");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.quit();
		

	}

}
