package micro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class week3 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		WebElement C_account=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		C_account.click();
		Thread.sleep(500);
		WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys("bca");
		Thread.sleep(500);
		WebElement lname=driver.findElement(By.name("lastname"));
		lname.sendKeys("abd");
		Thread.sleep(500);
		Select day=new Select(driver.findElement(By.name("birthday_day")));
		day.selectByValue("2");
		Select month=new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue("11");
		Select year=new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("2005");
		WebElement gender=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[1]/label/input"));
		gender.click();
		Thread.sleep(500);
		WebElement phone=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[6]/div/div[1]/input"));
		phone.sendKeys("9898989898");
		Thread.sleep(500);
		WebElement pwd=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[8]/div/div[1]/input"));
		pwd.sendKeys("heyy123");
		Thread.sleep(500);
		WebElement signup=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button"));
		signup.click();
		Thread.sleep(500);
		driver.quit();

	}

}