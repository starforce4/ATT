package micro;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class week11{
	public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        Actions actions=new Actions(driver);
		WebElement profile=driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/div/div[1]/span[2]"));
		actions .moveToElement(profile).build().perform();
		WebElement signup=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a"));
		signup.click();
		Thread.sleep(1000);
       
		        WebElement MobileNum=driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input"));
		        MobileNum.sendKeys("9686548597");
		        Thread.sleep(1000);
		        		        
		        WebElement registerbtn=driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]"));
		        registerbtn.click();
		        Thread.sleep(30000);
		        registerbtn.click();
		        
		        WebElement otp1=driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div[2]/div[1]/input[1]"));
		        otp1.sendKeys("5"); 	
		        Thread.sleep(100);
		        
		        WebElement otp2=driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div[2]/div[1]/input[2]"));
		        otp2.sendKeys("5"); 	
		        Thread.sleep(100);
		        
		        WebElement otp3=driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div[2]/div[1]/input[3]"));
		        otp3.sendKeys("4"); 	
		        Thread.sleep(100);	        
		        WebElement otp4=driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div[2]/div[1]/input[4]"));
		        otp4.sendKeys("8"); 	
		        Thread.sleep(100);
		        
		        
		        
		        }
	}