package day03_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Açılan browser'ı tam ekran yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        Thread.sleep(3000);
//WebElement addButon= driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
 WebElement addButonT =driver.findElement(By.xpath("//*[text()='Add Element']"));
        //3 Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if (deleteButonu.isDisplayed()) {//Bir webelementinin gorunur olup olmadigini isDisplayed ile kontrol ederiz
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        //4 Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();
        //5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveEYazisi=driver.findElement(By.xpath("//h3"));
        if (addRemoveEYazisi.isDisplayed()) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
    }
}
