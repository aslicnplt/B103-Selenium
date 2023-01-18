package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();//Bos bir browser actık
        driver.get("https://www.amazon.com");//ilk olarak gitmek istedigimiz sayfayı belirtiriz
        System.out.println("Sayfa Baslıgı:"+driver.getTitle());
        System.out.println("Sayfa Url'i:"+driver.getCurrentUrl());//sayfanin Url ini aldik
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());//bize o windowa ait Hash degerini verir
        //biz o windowa ait hash degerlerini bir string e atatyıp pencereler arası gecis yapabiliriz

    }
}
