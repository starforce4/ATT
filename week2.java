package micro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class week2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chromedriver","C:\\Users\\saipr\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(5000);
		Actions builder=new Actions(driver);
		WebElement customerLogin=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
		builder.moveToElement(customerLogin).perform();
		Thread.sleep(2000);
		WebElement Register=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a"));
		Register.click();
		Thread.sleep(2000);
		WebElement fname=driver.findElement(By.name("first_name"));
		fname.sendKeys("abc");
		Thread.sleep(500);
		WebElement lname=driver.findElement(By.name("last_name"));
		lname.sendKeys("def");
		Thread.sleep(500);
		WebElement email=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/input[1]"));
		email.sendKeys("aaaa@gmail.com");
		Thread.sleep(500);
		WebElement spwd=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/input[2]"));
		spwd.sendKeys("hey123");
		Thread.sleep(500);
		WebElement cpwd=driver.findElement(By.name("passconf"));
		cpwd.sendKeys("hey123");
		Thread.sleep(500);
		WebElement phone=driver.findElement(By.name("mobile_no"));
		phone.sendKeys("1231212123");
		Thread.sleep(500);
		WebElement register=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/button"));
		register.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}