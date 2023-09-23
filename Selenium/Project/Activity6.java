package CRMActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

public class Activity6 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("http://alchemy.hguy.co/crm");
        System.out.println("Home page title: " + driver.getTitle());

        // Find the username and password fields
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@name, 'user_name')]"));
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@name, 'username_password')]"));
        // Enter the credentials
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        // Find and click the submit button
        driver.findElement(By.xpath("//input[@type='submit']")).click();
       // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("grouptab_3")));
        //System.out.println(grouptab_3.isDisplayed());

}
