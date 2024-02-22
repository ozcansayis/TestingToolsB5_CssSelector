package Homework_01_;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _01_ extends BaseDriver {
    @Test
    public void test1(){
        // 1) Bu siteye gidin. -> http://demoqa.com/text-box
        driver.get("http://demoqa.com/text-box");
        MyFunc.Bekle(2);
        // 2) Full Name kısmına "Automation" girin.
        //  3) Email kısmına "Testing@gmail.com" girin.
        WebElement fullName= driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        fullName.sendKeys("Automation");
        MyFunc.Bekle(1);

        WebElement email= driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(1);
        //4) Current Address kısmına "Testing Current Address" girin.
        //5) Permanent Address kısmına "Testing Permanent Address" girin.
        //6) Submit butonuna tıklayınız.

        WebElement currentAddress= driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        currentAddress.sendKeys("Testing Current Address");
        MyFunc.Bekle(1);

        WebElement permanentAddress = driver.findElement(By.cssSelector("[id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(1);

        WebElement submit = driver.findElement(By.cssSelector("[id='submit']"));
        submit.click();
        MyFunc.Bekle(2);

        // 7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
        //  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
        WebElement name= driver.findElement(By.cssSelector("[id='name']"));
        WebElement email2= driver.findElement(By.cssSelector("[id='email']"));
        Assert.assertTrue("Name kısmı Automation değil!", name.getText().contains("Automation"));
        Assert.assertTrue("Email kısmı Testing değil!", email2.getText().contains("Testing@gmail.com"));
        BekleKapat();
    }
}
