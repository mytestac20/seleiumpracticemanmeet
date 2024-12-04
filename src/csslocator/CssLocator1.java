package csslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator1 {

    //by using css selector we can locate elemts , we can use exsisting elements with combination.because css cant be create directly ,
    // mostly we can locate it with by combining tagName and other attribbute of that elements, we have 4 main combinations in css
    //1. tag id =           tag#id
    //2. tag class =        tag.className
    //3..tag attribute =    if id and class not availble then  .... tag[attribute = "value"]
    //4.tag class attribute =tag.className[attribute ="value"]

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


        //1.tag and id  syntax tag#id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("shirts");
        // we can write css without tag name too
        // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Shirts");

        //2.tag and class syntax   tag.className
        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Manmeet");
    }

}
