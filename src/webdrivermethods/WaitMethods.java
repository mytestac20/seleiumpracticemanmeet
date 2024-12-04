package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WaitMethods {

    // sometime due to synchronization test script and application or elements are not synching togeter thats coz of the difference in speed of both
    //only two kinds of wait methods are provided in selenium 1. implicit wait 2. explicit wait / subcatory is fluent wait
    //thread.sleep is provided by java

    //sleep command is provided by java and we can use  where is is synch problem

    //most of the exceptions we found is 1. noSuchElementException is when element is not availble on the page
    //2.ElementNotFound when locator is incorrect

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait method..we have to do implicit
        // wait at the method level before code so it will work for every statement
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

      //  Thread.sleep(20);

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

        driver.close();
    }
}
