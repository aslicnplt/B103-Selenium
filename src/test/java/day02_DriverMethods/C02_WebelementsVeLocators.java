package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebelementsVeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim
        driver.get("https://amazon.com");
        //Search bolumunu locate edelim
//WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
WebElement aramaKutusu =driver.findElement(By.name("field-keywords"));
        //Search bolumunde iphone aratalim
        aramaKutusu.sendKeys("iphone", Keys.ENTER);
        /* Eger bir webelementi (web sayfasindaki her bir buton ya da textr/yazi)
         locate konum belirleme etmek istersek once manuel oılarak web sayfasini acip
         sayfa uzerinde sag klik yapip inceleye tiklariz karsımıza cıkan html kodlarindan locaterlardan konum belirleyiciler
         eşsiz olani seceriz
         genellikle ıd attribute u kullanir. sectiğimiz attribute degerini findelement() methodu
         içine findelement(By.id("atribute degeri)) seklinde yazariz
         */
        //Amazon sayfasindaki <input> ve <a> taglarinin sayisini yazdirin

        List<WebElement> inputTags=driver.findElements(By.tagName("input"));
        System.out.println("İnput tag Sayis:"+inputTags.size());
        List<WebElement> linklerList=driver.findElements((By.tagName("a")));// a tagı yani link
        System.out.println("Link Sayisi="+linklerList.size());
        for (WebElement w:linklerList){
            System.out.println();
        }
         }
}
