package Homework_01_;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_ extends BaseDriver {
    //Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
    //Fake Alerts' tıklayınız.
    //Show Alert Box'a tıklayınız.
    //Ok'a tıklayınız.
    //Alert kapanmalıdır.
    @Test
    public void test01(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);
        driver.findElement(By.cssSelector("[id='fakealerttest']")).click();
        MyFunc.Bekle(1);
        driver.findElement(By.cssSelector("[id='fakealert']")).click();
        MyFunc.Bekle(1);
        driver.findElement(By.cssSelector("[id='dialog-ok']")).click();
        MyFunc.Bekle(1);
        WebElement alertBox= driver.findElement(By.cssSelector("[id='dialog-text']"));
        if (!alertBox.isDisplayed())
            System.out.println("Alert kapandı!");
        else
            System.out.println("Alert kapanmadı!");
        BekleKapat();
    }
}
