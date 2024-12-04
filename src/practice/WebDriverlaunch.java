package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverlaunch {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // we have created drive instance(object)to launch our chrome driver

        driver.get("https://demo.opencart.com/"); // method to call url , it will open small size window
        // to maximise the window we will call this method
        driver.manage().window().maximize();

        // as our driver and our website is ready to be launched so interact with elements we need locators
        // there 8 locator , we are using name locator here
        //name
        // eg on the website in searchbox we want to pass some text so we will inspect it first as we see name attribute
        // is there we can use that , we will double click on attribute it will be selected and can use in our method to call
       //1. driver.findElement(By.name("search")).sendKeys("Mac");//in first part we stored the element and by send
        // keys we are doing action on that web element
        // if id is availble how to do it , inspecting logo element with ID
      //2. boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();// using a conditional method
       // System.out.println(logoDisplayStatus);

        //3.link text and
        //driver.findElement(By.linkText("value")).click();
        // difference in link n partial link text..in partial link text we pass the partial value some part of actual link
 // but we prefer to use link coz partial link can match to n number of elements so will not able to locate element uniquely
        //4.partial linktext

        //all above 4 locators are for single elements
          //tag class we use to locate multiple elements ..div tag
        //tag name locators for elements group of elements
        //class same way for the class or group of elements like search boxes have same class .
        // to find multiple elemts we use find elements
        //List<webElement>headerLinks=driver.findelements(By.className("value"));
        // findelements will return the list of element of webtype
        //to count total number of list collection...to find the size of list use
        // sout(headerLinks.size()); to print the total numbers of link
        //to validate the links and print each is with different method
        //




    }
}
