package Homework_01_;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_ extends BaseDriver {
    //Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
    //Fake Alerts'e tıklayınız.
    //Show modal dialog buttonuna tıklayınız.
    //Ok'a tıklayınız.
    //Alert kapanmalıdır.
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(1);
        driver.findElement(By.cssSelector("[id='fakealerttest']")).click();
        MyFunc.Bekle(1);
        driver.findElement(By.cssSelector("[id='modaldialog']")).click();
        MyFunc.Bekle(1);
        driver.findElement(By.cssSelector("[id='dialog-ok']")).click();
        MyFunc.Bekle(1);
        WebElement alert= driver.findElement(By.cssSelector("[id='dialog-text']"));
        if (!alert.isDisplayed())
            System.out.println("Alert kapandı!");
        else
            System.out.println("Alert kapanmadı!");
        BekleKapat();
    }
}
