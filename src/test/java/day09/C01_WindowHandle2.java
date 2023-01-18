package day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C01_WindowHandle2 extends TestBase {
    @Test
    public void windowHandleTest() {

    //https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        String window1Handle=driver.getWindowHandle();//Bunu kulanma sebebim 2.pencerenin

    //Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
       String actualWindow1Text= driver.findElement(By.xpath("//*[.='Opening a new window']")).getText();
        String  expectedWindow1Text="Opening a new window";
        Assert.assertEquals(expectedWindow1Text,actualWindow1Text);

    //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
       String actualWindow1Title= driver.getTitle();
       String expectedWindow1Title="The Internet";
       Assert.assertEquals(expectedWindow1Title,actualWindow1Title);


    //Click Here butonuna basın.
        driver.findElement(By.linkText("Click Here")).click();

        //IKINCI PENCERE ACILIR VE ıkıncı pencerede islem yapmak istedigimden o pencereye switch(gecis) yapmak
        switchToWindow(1); //2.windowa gecis yaptik
        //switchToWindow("New Window");//ustteki yerine bu da kullanilabilir.testbasede bu method da tanımlı(içi string olan)

    //Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        String actualWindow2Title=driver.getTitle();
        String expectedWindow2Title="New Window";
        Assert.assertEquals(expectedWindow2Title,actualWindow2Title);



}}
