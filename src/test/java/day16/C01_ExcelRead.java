package day16;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C01_ExcelRead {
    @Test
    public void readExcelTest() throws Exception {
//    WORKBOOK (EXCEL DOSYASI) > WORKSHEET/SHEET(SAYFA) >ROW (SATIR)> CELL(VERI HUCRESI)...BU DEGİSİKLİGİ GİTHUBDA YAPTIM
        //String path ="./src/test/java/resources/Capitals.xlsx"; (MAC).

     String path =".\\src\\test\\java\\resources\\Capitals.xlsx";//WINDOWS.
//        DOSYAYI AC
        FileInputStream fileInputStream = new FileInputStream(path);
//        EXCEL DOSYASINI AC /WORKBOOK AC
        Workbook workbook= WorkbookFactory.create(fileInputStream);
//        SAYFAYI AC / Sheet1
     //   Sheet sheet1=workbook.getSheetAt(0);//index 0 dan baslar.ilk sayfayı ac
        Sheet sheet1=workbook.getSheet("Sheet1");//Sheet1 isimli objeyi ac
//        ILK SATIRA GIT / Row

        Row row1 = sheet1.getRow(0);//ILK SATIRA GIT
//        INK SATIRDAKI ILK VERIYI AL
        Cell cell1 = row1.getCell(0);//ILK HUCREDEKI DATAYI VER
//        O VERIYI YAZDIR
        System.out.println(cell1);
        //1.SATIR 2.SUTUN
        sheet1.getRow(0).getCell(1);
        System.out.println(cell1);
        //3.satır 1.sutun
        String cell31=sheet1.getRow(2).getCell(0).toString();
        System.out.println(cell31);
        Assert.assertEquals("France",cell31);
    //Excell deki tooplam satır sayısını bul
       int toplamSatirSayisi= sheet1.getLastRowNum()+1;//son satır numarası
        System.out.println(toplamSatirSayisi);//İndex sayisi 0dan basladigi icin son satir numarasi

        //Kullanilan toplam satir sayisi
        int kullanilanToplamSatirSayisi=sheet1.getPhysicalNumberOfRows();
        System.out.println(kullanilanToplamSatirSayisi);//1den baslıyor
        //COUNTRY,CAPITALS key ve valueları map e alıp print et
        //{{USA, D.C},{FRANCE,PARIS},...}
        //Variable olusturalim..Bu variable exceldeki country,capital verilerini tutacak
        Map<String,String> ulkeBaskentleri=new HashMap<>();
        for (int satirSayisi=1; satirSayisi<kullanilanToplamSatirSayisi;satirSayisi++){
            String country=sheet1.getRow(satirSayisi).getCell(0).toString();
            String capital=sheet1.getRow(satirSayisi).getCell(1).toString();
            ulkeBaskentleri.put(country,capital);

        }
        System.out.println(ulkeBaskentleri);
    }}
