package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions2 extends TestBase {

    //Method : hoverOver() and test the following scenario:
    //MANUAL
    //Amazon a gidelim https://www.amazon.com/
    //Sag ust bolumde bulunan “Account & Lists” menüsüne git
    //“Account” secenegine tikka
    //Acilan sayfanin Title in “Your Account” icerdigini dogrula


    @Test
    public void hoverOverTest() {
        driver.get("https://www.amazon.com/");
        //ACTİONS OBJESİ
        Actions actions=new Actions(driver);
        //ELEMANI BUL
        WebElement accountList=driver.findElement(By.id("nav-link-accountList"));
        waitFor(1);
        //2.UYGUN ACTİONS METHODUNU KULLA. EN SONRA PERFORM KULLANMAYI UNUTMA
        actions.moveToElement(accountList).perform();
        waitFor(3);
        //Acilan pencerede Account linkini tıkla
        driver.findElement(By.linkText("Account")).click();
        //Acilan sayfanin title inin Your Account icerdigini dogrula
        Assert.assertTrue(driver.getTitle().contains("Your Account"));

    }
}
