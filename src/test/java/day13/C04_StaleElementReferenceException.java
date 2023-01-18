package day13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04_StaleElementReferenceException extends TestBase {
    @Test
    public void staleElementReferenceExceptionTest1() {
        driver.get("https://www.techproeducation.com");
        //LMS LOGIN linkine tıkla ve o sayfanin URL inin lms icerdigini test et
        WebElement lmsLoginLink=driver.findElement(By.linkText("LMS LOGIN"));
        lmsLoginLink.click();// LMS e git
        Assert.assertTrue(driver.getCurrentUrl().contains("lms"));;//URL inin lms icerdigini test et
        //Tekrar anasayfaya git
        driver.navigate().back();//tekrar anasayfaya git
        waitFor(5);
        lmsLoginLink.click();//LMSe git. Burda StaleElementReferenceException vermeli
    }

    @Test
    public void staleElementReferenceExceptionTest2() {
        driver.get("https://www.techproeducation.com");
        waitFor(5);
        WebElement lmsLoginlink=driver.findElement(By.linkText("LMS LOGIN"));
        waitFor(5);
        driver.navigate().refresh();
        waitFor(5);
        lmsLoginlink.click();// sayfa yenilemeden once buldugum elementı,
        // sayfa yenilendikten sonra kullanmak istedim.
        // org.openqa.selenium.StaleElementReferenceException aldım


//        COZUM ESKI(SLATE ELEMENT) ELEMENTI TEKRAR LOCATE ET
//        driver.findElement(By.linkText("LMS LOGIN")).click();

    }
}
