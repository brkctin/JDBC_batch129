import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query05 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("org.postgresql.Driver");


        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "B.cetin19");


        Statement st = con.createStatement();

        //tekli ya da çoklu datayı nasıl göndeririz -> Executeupdate


        //SORU 1: Öğrenciler tablosuna yen bir kayıt ekleyin (300, ‘Sena Can’, 12, ‘K’)

        //String sql01= "insert into ogrenciler values (301, 'Sena Can', 12, 'K')";
        //st.executeUpdate(sql01);


        //SORU 2: Öğrenciler tablosuna birden fazla veri ekleyin. (400, 'Sena Can', 12, 'K'), (401, 'Sena Can', 12, 'K'), (402, 'Sena Can', 12, 'K')

        String [] veri = {"insert into ogrenciler values (510, 'Sena Can', 12, 'K')",
                          "insert into ogrenciler values (511, 'Sena Can', 12, 'K')",
                          "insert into ogrenciler values (522, 'Sena Can', 12, 'K')"};

        int count=0;
        for(String each:veri){
            count = count+ st.executeUpdate(each);
        }
        System.out.println(count + " satir eklendi");


        st.close();






    }
}
