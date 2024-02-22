package Homework_01_;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_ extends BaseDriver {
    @Test
    public void test01(){
        // Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        // Calculate'e tıklayınız.
        //    İlk input'a herhangi bir sayı giriniz.
        //    İkinci input'a herhangi bir sayı giriniz.
        // Calculate button'una tıklayınız.
        // Sonucu alınız.
        // Sonucu yazdırınız.
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);
        driver.findElement(By.cssSelector("[id='calculatetest']")).click();
        MyFunc.Bekle(1);
        driver.findElement(By.cssSelector("[id='number1']")).sendKeys("25");
        driver.findElement(By.cssSelector("[id='number2']")).sendKeys("20");
        driver.findElement(By.cssSelector("[id='calculate']")).click();
        WebElement sonuc= driver.findElement(By.cssSelector("[class='centered'] span"));
        System.out.println("Sonuç: "+sonuc.getText());
        BekleKapat();
    }
}
