package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;

public class C04_BeforeClassAfterClass {
    /*

     */
    @BeforeClass
    public static void setUp() {
        System.out.println("Butun testlerden once calisti");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("Butun testlerden sonra calisti");
    }
    @Before
    public void setUp01() {
        System.out.println("Her testten once calisir");
    }
    @After
    public void tearDown02() {
        System.out.println("Her testten sonra calisir");
    }
    @Test
    public void test01(){
        System.out.println("Ilk test");
    }
     @Test
    public void test02(){
         System.out.println("Ikınci test");
     }
     @Test
     @Ignore//Eger bir testi calistirmak istemezsek bununla calıstırbiliriz
    public void test03(){
         System.out.println("Ucuncu Test");
     }


}
