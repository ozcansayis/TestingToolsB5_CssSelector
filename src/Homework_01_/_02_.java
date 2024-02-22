package Homework_01_;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ extends BaseDriver {
    @Test
    public void test1(){
        //1) Bu siteye gidin. -> https://demo.applitools.com/
        //2) Username kısmına "ttechno@gmail.com" girin.
        //3) Password kısmına "techno123." girin.
        //4) "Sign in" buttonunan tıklayınız.
        //5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
        driver.get("https://demo.applitools.com/");
        MyFunc.Bekle(2);
        driver.findElement(By.cssSelector("[id='username']")).sendKeys("ttechno@gmail.com");
        driver.findElement(By.cssSelector("[id='password']")).sendKeys("techno123.");
        driver.findElement(By.cssSelector("[id='log-in']")).click();
        MyFunc.Bekle(2);
        WebElement condition= driver.findElement(By.cssSelector("[id='time']"));
        if (condition.getText().equals("Your nearest branch closes in: 30m 5s"))
            System.out.println("Koşul sağlandı!");
        else
            System.out.println("Koşul sağlanmadı!");
        BekleKapat();
    }
}
