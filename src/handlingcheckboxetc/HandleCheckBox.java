package handlingcheckboxetc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckBox {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1.select specific checkbox
        //driver.findElement(By.xpath("//input[@id='monday']")).click();

        // if want to select all checkboxes instead of doing every single we can do loop statement and we can select.
        //how to capture all checkbox we have find one locator for an element which will be for all that list
       List<WebElement>checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));

       //1.1st way of doing it
//       for (int i = 0;i<checkBoxes.size();i++)
//       {
//           checkBoxes.get(i).click();
//       }

        //2.second way of doing above action is enchanced fo loop

//        for (WebElement checkbox: checkBoxes)
//        {
//            checkbox.click();
//        }

        //3. lets select last 2-3 checkboxes..we cant use enchanced for loop
         // we will use this ... total number of checkboxes-number of checkboxes we want to select=starting index
//        for(int i = 4; i<checkBoxes.size();i++)
//        {
//            checkBoxes.get(i).click();
//
//        }

        //4. select first 3 checkboxes
      //  for (int i=0;i<3;i++){
       //     checkBoxes.get(i).click();
      //  }

        //5. unselect checkboxes and verify the already selected checkboxes
        for (int i=0;i<checkBoxes.size();i++){
                 if(checkBoxes.get(i).isSelected())
                 {
                     checkBoxes.get(i).click();
                 }
              }

    }
}
