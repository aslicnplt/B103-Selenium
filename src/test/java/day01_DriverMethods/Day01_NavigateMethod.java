package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        //techproeducation sayfasina gidelim.3sn bekleyelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");
        //Tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();
        //Tekrar hepsiburada sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        //son sayfada sayfayi yenileyelim(refresh)
        driver.navigate().refresh();
        //sayfayi kapatalim
        driver.close();
        //ODEV
        // Youtube ana sayfasina gidelim . https://www.youtube.com/
        //Amazon soyfasina gidelim. https://www.amazon.com/
        //Tekrar YouTube’sayfasina donelim
        //Yeniden Amazon sayfasina gidelim
        //Sayfayi Refresh(yenile) yapalim
        //Sayfayi kapatalim / Tum sayfalari kapatalim

    }
}
