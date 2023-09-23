package CRMActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static javax.swing.text.html.CSS.getAttribute;

public class Activity2 {

    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("http://alchemy.hguy.co/crm");
        driver.findElements(By.tagName("img"));
        System.out.println(getAttribute("src"));
        //WebElement l =driver.findElement(By.xpath("//div[@img()='SuiteCRM']"));
        //getAttribute() to get src of image
        //System.out.println("Src attribute is: "+ l.getAttribute("src"));
        driver.quit();
    }
}

