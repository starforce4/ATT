package micro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class week10 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();
            driver.get("https://gmail.com/");
            
            // Click on "Create account"
            WebElement createAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create account']")));
            createAccount.click();

            // Click on "For myself"
            WebElement mySelf = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='For my personal use']")));
            mySelf.click();

            // Enter first name
            WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
            firstName.sendKeys("abc");

            // Enter last name
            WebElement lastName = driver.findElement(By.id("lastName"));
            lastName.sendKeys("bce");

            // Click Next
            WebElement bn1 = driver.findElement(By.xpath("//span[text()='Next']"));
            bn1.click();

            // Select DOB and Gender
            Select month = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month"))));
            month.selectByValue("10");

            WebElement day = driver.findElement(By.id("day"));
            day.sendKeys("22");

            WebElement year = driver.findElement(By.id("year"));
            year.sendKeys("2005");

            Select gender = new Select(driver.findElement(By.id("gender")));
            gender.selectByValue("2"); // Female

            WebElement bn2 = driver.findElement(By.xpath("//span[text()='Next']"));
            bn2.click();

           
            WebElement uid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Username")));
            uid.sendKeys("SiriErrupala200522");

            WebElement bn3 = driver.findElement(By.xpath("//span[text()='Next']"));
            bn3.click();

            // Enter password
            WebElement pswd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
            pswd.sendKeys("Siri2005@");

            WebElement cpswd = driver.findElement(By.name("ConfirmPasswd"));
            cpswd.sendKeys("Siri2005@");

            WebElement bn4 = driver.findElement(By.xpath("//span[text()='Next']"));
            bn4.click();

            Thread.sleep(2000); // You can replace this with an appropriate wait if needed

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}