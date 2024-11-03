package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser= "Chrome";
    static String baseUrl= "https://courses.ultimateqa.com";
    static WebDriver driver;


    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println(" Wrong Browser");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("This is the page source:" +driver.getPageSource());
        WebElement signIn= driver.findElement(By.className("header__nav-sign-in"));
        signIn.click();
        WebElement searchBox= driver.findElement(By.name("user[email]"));
        searchBox.sendKeys("ram@gamail1234");
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("ram1234");
        driver.navigate().back();
        driver.navigate().to(driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().refresh();


    }
}




