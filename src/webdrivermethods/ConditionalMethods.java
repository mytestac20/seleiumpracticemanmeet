package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {


    // conditional methods we can ; get methods can be used on any webpage...access only from the webelement not the driver .
    //get methods will not work on get elements but on webpages.we can access elemts by this .there are three methods
    //. isDiplayed() ..will check if its displayed like to verify
    //2. isEnable()...will check if that element is enable/working or not verify
    //3. isSelected()...spl for radio button and check boxes ....if its already selected then true otherwise false
    // these methods return boolean value ;
     // we can use conditinal method on top of get method and it can be accessed from webelement not driver.



    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        //isDisplayed() we can check display satus f element
        // WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")); // here we
        // find the webElement first and then capture that in variable, find element return the webelement so variable type is webelement and logo is variable name .
        //System.out.println("Display status " + logo.isDisplayed());// here we called mthod with variable

        boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed(); // we captured element in variable and called method
        System.out.println("Display status ; " + status); //


        // isEnable() used for check boxex , radio button etc..can check enable/display status of elemet/operational element
       boolean buttonStatus=   driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println("Check box is enable " + buttonStatus);

        //isSelected() we can use tp check the element is selected or not , radio button , check box , dropdown(with value, index, name )
        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println("Before selection " );
        System.out.println(maleRadioButton.isSelected());
        System.out.println(femaleRadioButton.isSelected());

        // in radio buttonn u can select only one at a time
        
        System.out.println("After selecting male....");
        maleRadioButton.click();

        System.out.println(maleRadioButton.isSelected());

        femaleRadioButton.click();
        System.out.println(femaleRadioButton.isSelected());

        boolean newsLetterCheckBox =driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
        System.out.println(newsLetterCheckBox);

    }
}
