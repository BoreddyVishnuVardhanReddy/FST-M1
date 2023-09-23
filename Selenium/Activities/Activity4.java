package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("The title of the page:" +driver.getTitle());
        String ThirdHeaderText = driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
        System.out.println(ThirdHeaderText);
        String FifthHeaderText = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getText();
        System.out.println(FifthHeaderText);
        String violetButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println(violetButtonClass);
        String greyButtonText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println(greyButtonText);
        driver.close();
    }
}
