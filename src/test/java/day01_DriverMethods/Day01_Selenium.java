package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Selenium {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        /*En temel haliyle otomasyon yapmak icin class ımıza otomasyon icin gerekli olan
        webdriver in yerini gostermek gerekir.Bunun icin java kutuphanesinden System.setProperty() methodunu
        icine ilk olarak driver i yazarız. ikinci olarak driver ın fiziki yolunu kopyalarız
         */
    }
    }

