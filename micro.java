package micro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Scanner;

public class micro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipr\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new EdgeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();

        try {
            // ✅ Navigate to Amazon
            driver.get("https://www.amazon.com/");
            
            // ✅ Ensure the Sign-in button exists and click it
            WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList")));
            signInButton.click();
            
            // ✅ Debugging: Ensure the correct page is loaded before searching for ap_email
            wait.until(ExpectedConditions.urlContains("signin"));
            System.out.println("Redirected to Sign-in page. URL: " + driver.getCurrentUrl());

            // ✅ Debugging: Check if the email field exists before interacting
            System.out.println("Waiting for email input field...");
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
            System.out.println("Email field found!");

            emailField.sendKeys("podilitrinath112@gmail.com");
            driver.findElement(By.id("continue")).click();

            // ✅ Debugging: Check if the password field exists before interacting
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password")));
            passwordField.sendKeys("tris@2004");
            driver.findElement(By.id("signInSubmit")).click();

            // ✅ Debugging: Confirm user input works
            System.out.println("Enter the number of products you want to buy:");
            int n = sc.nextInt();
            sc.nextLine(); // Consume newline

            String[] products = new String[n];
            System.out.println("Enter " + n + " product names:");
            for (int i = 0; i < n; i++) {
                products[i] = sc.nextLine();
            }

            // ✅ Debugging: Search and add products to cart
            for (String product : products) {
                WebElement searchBar = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
                searchBar.clear();
                searchBar.sendKeys(product, Keys.ENTER);

                // ✅ Debugging: Wait for search results to load
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.a-size-medium")));

                // ✅ Debugging: Click on first search result
                WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-component-type='s-search-result'] a")));
                firstProduct.click();

                // ✅ Debugging: Ensure "Add to Cart" button is available
                try {
                    WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Add to Cart']")));
                    addToCartButton.click();
                } catch (Exception e) {
                    System.out.println("Error adding " + product + " to cart: " + e.getMessage());
                }
            }

            // ✅ Debugging: Navigate to Cart successfully
            driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");

        } finally {
            sc.close();
            driver.quit();
        }
    }
}