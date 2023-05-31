import org.junit.Assert;
import org.junit.Test;

import static utilities.DatabaseUtilty.*;

public class JUint_Test {

    @Test
    public void test01(){
        //Nil Naz ve Ali Can isimli öğrencilerin DataBase'de kayıtlı olduğunu doğrula
        createConnection();

        String sql="select * from ogrenciler";
        System.out.println("Ogrenci isimleri: "+ getColumnData(sql, "ogrenci_ismi"));
        Assert.assertTrue("DATABASE'DE KAYIT BULUNAMADI",
                getColumnData(sql, "ogrenci_ismi").contains("Nil Naz"));

        Assert.assertTrue("DATABASE'DE KAYIT BULUNAMADI",
                getColumnData(sql, "ogrenci_ismi").contains("Ali Can"));

        //getColumnData(sql, "ogrenci_ismi") tablodaki öğrenci isimlerini veriri

        closeConnection();
    }
}