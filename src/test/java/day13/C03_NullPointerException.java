package day13;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class C03_NullPointerException  {
    WebDriver driver;
    Faker faker;//=new Faker(); deyip instantiate etmeliydik nullPointerException almamak için
    @Test
    public void nullPointerExceptionTest() {
        driver.get("https://www.techproeducation.com");//nullPointerException Javadan gelir
    }
    public void nullPointerExceptionTest2() {
        //faker=new Faker(); boyle instantiate edersek nullPointerException vermez
        System.out.println(faker.name().fullName());
    }}
