package csslocator;
//by using css selector we can locate elemts , we can use exsisting elements with combination.because css cant be create directly ,
// mostly we can locate it with by combining tagName and other attribbute of that elements, we have 4 main combinations in css
//1. tag id =           tag#id
//2. tag class =        tag.className
//3..tag attribute =    if id and class not availble then  .... tag[attribute = "value"]
//4.tag class attribute =tag.className[attribute ="value"]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //3.tag attribute =    if id and class not availble then  .... tag[attribute = "value"]
      //  driver.findElement(By.cssSelector("input[placeholder= \"Search store\"]")).sendKeys("Mann");
        //css selector will go in "" but in java "" not allowed within the "" but if have to use then have to use / and need a bracket or you can just write value in ''0
        //tag in optional but bracket should be there
       // driver.findElement(By.cssSelector("[placeholder= \"Search store\"]")).sendKeys("Mann");

        //4.tag class attribute =tag.className[attribute ="value"]...tag and class locating more than 1 element but it will select the first element . to give the proper locator for
        //spefich elemet then we can use tag and class with attribut
        driver.findElement(By.cssSelector("input.search-box-text[name ='q']")).sendKeys("Mann");




    }
}