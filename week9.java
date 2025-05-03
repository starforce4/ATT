package micro;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class week9 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com/hyderabad/bakeries");
        List<WebElement> m=driver.findElements(By.xpath("//h4[@class='sc-1hp8d8a-0 sc-Ehqfj bxOQva']"));
        for(int i=0;i<m.size();i++) {
        	String s=m.get(i).getText();
        	System.out.println("Text is:"+s);
        }
        driver.quit();
	}

}