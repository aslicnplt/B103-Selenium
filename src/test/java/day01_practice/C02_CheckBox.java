package day01_practice;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class C02_CheckBox {
    // https://demo.guru99.com/test/radio.html adresine gidin
    // checkbox elementlerini locate edin
    // checkbox1 ve checkbox3  secili degil ise secin
    // checkbox1 ve checkbox3 elementlerinin secili oldugunu Test edin
    // checkbox2 elementinin secili olmadıgını test edin
    WebDriver driver;

    @After
    public void tearDown() throws Exception {
        //1)Dropdown locate edilir
        WebElement ddm=driver.findElement(By.xpath("//select[@id='dropdown]"));

        //2)Select objesi olusturulur
        Select select=new Select(ddm);
        //3)Option secilir
        select.selectByIndex(1);

    }

}
