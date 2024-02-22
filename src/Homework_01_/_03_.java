package Homework_01_;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_ extends BaseDriver {
    //1) Bu siteye gidin. -> https://www.snapdeal.com/
    //2) "teddy bear" aratın ve Search butonuna tıklayın.
    //3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
    //Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
    @Test
    public void test1(){
        driver.get("https://www.snapdeal.com/");
        MyFunc.Bekle(2);
        driver.findElement(By.cssSelector("[id='inputValEnter']")).sendKeys("teddy bear");
        driver.findElement(By.cssSelector("[class='searchformButton col-xs-4 rippleGrey']")).click();
        MyFunc.Bekle(2);
        WebElement wegot= driver.findElement(By.cssSelector("[id='searchMessageContainer'] span"));
        if (wegot.getText().contains("We've got"))
            System.out.println("İstenen yazı gözüküyor!");
        else
            System.out.println("İstenen yazı gözükmüyor!");
        BekleKapat();
    }
}
