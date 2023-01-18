package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Actions1 extends
        TestBase {
    //1.Adım: Actions class’ta bir object oluşturulur.
    //Actions actions= new Actions(driver);
    //2. Adım: Üzerinde çalışmak istediğiniz WebElement
    //öğesini bulunur.
    //WebElement element = driver.findElement(locator);
    //3.Adim : perform() kullanarak bu webelement üzerinde action gerçekleştirilir.
    @Test
    public void rightClick() {
        //https://the-internet.herokuapp.com/context_menu  sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //1. ACTİONS OBJESİ OLUSTUR
        Actions actions=new Actions(driver);
        //2.elementi locate edelim
        WebElement kutu=driver.findElement(By.id("hot_spot"));
        //Class: Actions1
        //Method: rightClick

        //Kutuya sag tıklayın
        //TUM ACTİONSLAR actions  OBJESİYLE BASLAR perform() ILE BİTER
        actions.contextClick(kutu).perform();
        //Alert’te cikan yazinin “You selected a context menu” oldugunu
        //Object olusturmak wait gerektiren durumlarda makul
        Assert.assertEquals("You selected a context menu", driver.switchTo().alert().getText(), driver);
        //test edin
        //Tamam diyerek alert’i kapatın
        driver.switchTo().alert().accept();;


    }
}
