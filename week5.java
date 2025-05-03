package micro;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class week5 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cmrithyderabad.edu.in/");
		Thread.sleep(500);
		WebElement Examination=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div/div/div/nav[1]/ul/li[5]/a"));
		Examination.click();
		Thread.sleep(500);
		WebElement Result=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div/div/div/nav[1]/ul/li[5]/ul/li[4]/a"));
		Result.click();
		Thread.sleep(500);
		WebElement btech=driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[3]/ul/li[2]/input"));
		btech.click();
		Thread.sleep(500);
		WebElement r22=driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[4]/ul/li[3]/input"));
		r22.click();
		Thread.sleep(500);
		WebElement sem=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[1]/div/div[1]"));
		sem.click();
		Thread.sleep(500);
		WebElement ht=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/form/input"));
		ht.sendKeys("23r01a05tt");
		Thread.sleep(500);
		driver.quit();
		
	}

}