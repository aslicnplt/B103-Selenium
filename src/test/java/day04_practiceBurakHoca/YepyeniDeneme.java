package day04_practiceBurakHoca;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YepyeniDeneme {
    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver","C:\\Users\\Asus\\Documents\\Selenium Dependencies\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com.tr");
    }
}

