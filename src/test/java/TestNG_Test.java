import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DatabaseUtilty;

public class TestNG_Test {


    @Test
    public void test01(){
        //Derya Soylu database kayıtlı mı?
        DatabaseUtilty.createConnection();
        String sql = "select * from ogrenciler";
        Assert.assertTrue(DatabaseUtilty.getColumnData(sql, "ogrenci_ismi").contains("Derya Soylu"),
                "DATABASE'DE KAYIT BULUNAMADI");
        DatabaseUtilty.closeConnection();
    }

    @Test
    public void test02(){
        //111 numaralı kayıt var mı?
        DatabaseUtilty DatabaseUtility;
        DatabaseUtilty.createConnection();
        Assert.assertTrue(DatabaseUtlity.getColumnData(" select * from ogrenciler",
                "okul_no").contains(111), "DATABASE'DE KAYIT BULUNAMADI");
        DatabaseUtlity.closeConnection();

    }

}
