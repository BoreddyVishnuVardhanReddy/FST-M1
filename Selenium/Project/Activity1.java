package CRMActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("http://alchemy.hguy.co/crm");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        String t = "SuiteCRM";

        if (driver.getPageSource().contains("SuiteCRM")) {
            System.out.println("Text: " + t + " is present. ");
            driver.close();
        } else {
            System.out.println("Text: " + t + " is not present. ");
        }
    }
}

