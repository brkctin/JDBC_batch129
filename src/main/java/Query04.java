import java.sql.*;

public class Query04 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("org.postgresql.Driver");


        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "B.cetin19");


        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from ogrenciler");

        ResultSetMetaData rmsd = rs.getMetaData();
        System.out.println("1. sütun ismi: " + rmsd.getColumnName(1));
        System.out.println("2. sütun ismi: " + rmsd.getColumnName(2));
        System.out.println("3. sütun ismi: " + rmsd.getColumnName(3));
        System.out.println("4. sütun ismi: " + rmsd.getColumnName(4));

        System.out.println("Tablo ismi: " + rmsd.getTableName(3));

        System.out.println(rmsd.getColumnTypeName(1));








    }
}
