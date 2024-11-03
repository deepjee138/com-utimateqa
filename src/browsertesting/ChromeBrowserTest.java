package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * https://courses.ultimateqa.com/
 * . Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Click on the ‘Sign In’ link
 * 7. Print the current URL
 * 8. Enter the email in the email field.
 * 9. Enter the password in the password field.
 * 10. Click on the Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to the Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */

public class ChromeBrowserTest {

    static String baseUrl = "https://courses.ultimateqa.com";

    public static void main(String[] args) {
        //1. Set up Chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. Open URL.
        driver.get(baseUrl);

        // maximise
        driver.manage().window().maximize();


        ////We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the page.
        System.out.println("This is the title of the page " + driver.getTitle());

        // 4. Print the current URL.
        System.out.println("This is the current URL" + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("This is the page source:" + driver.getPageSource());


        //6. Click on the ‘Sign In’ link
        WebElement signIn = driver.findElement(By.className("header__nav-sign-in"));
        signIn.click();


        //7. Print the current URL

        System.out.println(" This is current URL:" + driver.getCurrentUrl());


        //8. Enter the email in the email field.
        WebElement searchBox = driver.findElement(By.name("user[email]"));
        searchBox.sendKeys("ram@gamail1234");


        // * 9. Enter the password in the password field.
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("ram1234");


        // * 10. Click on the Login Button.


        // * 11. Navigate to baseUrl.
        driver.navigate().back();


        // * 12. Navigate forward to the Homepage.
        driver.navigate().to(driver.getCurrentUrl());


        // * 13. Navigate back to baseUrl.
        driver.navigate().back();


        // * 14. Refresh the page.
        driver.navigate().refresh();


        // * 15. Close the browser.
        driver.close();

    }
}
