package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
 * Project-5 - ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */
public class Login {

    static String baseUrl = "https://courses.ultimateqa.com/";

    public static void main(String[] args) throws InterruptedException {
        //setup Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);//open the url into browser
        //maximise browser
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //print the title of the page
        System.out.println(driver.getTitle());
        //print the current url
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());
        Thread.sleep(4000);

        //click on sign in link
        //WebElement signInLink = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();
        Thread.sleep(4000);

        //print the current url
        System.out.println(driver.getCurrentUrl());

        //enter the email to email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("Shopping@gmail.com");
        Thread.sleep(4000);

        //enter password to the password field
        WebElement pswdField = driver.findElement(By.name("user[password]"));
        pswdField.sendKeys("shoP12547");
        Thread.sleep(4000);

        //click on to login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(4000);

        //navigate to base url
        driver.navigate().to(baseUrl);
        Thread.sleep(4000);

        //navigate forward to homepage
        driver.navigate().forward();

        //navigate back to base URL
        driver.navigate().back();

        //refresh the page
        driver.navigate().refresh();

        //close the browser
        driver.quit();

    }
}
