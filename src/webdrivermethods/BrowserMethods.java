package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        // there is only 2 close and quit methods
        //close()
        //Quit()

        driver.close();


    }
}