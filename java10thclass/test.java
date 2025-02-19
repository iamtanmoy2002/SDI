import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class test {
    public static void main(String[] args) {
        try {

            String url = "jdbc:mysql://localhost:3306/sdibsr";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);
            // PreparedStatement pstmt = con.prepareStatement("select * from employee where
            // sal>2000");
            // ResultSet ps = pstmt.executeQuery();
            Statement stmp = con.createStatement();
            stmp.addBatch("insert into employee values(301,'sai',8000)");
            stmp.addBatch("insert into employee values(302,'rai',9000)");
            stmp.executeBatch();

            // while (stmp.next()) {
            // System.out.println(String.format("%20s %20s %20s", ps.getInt(1),
            // ps.getString(2), ps.getInt(3)));
            // }
            // ps.close();

            CallableStatement cstmt = con.prepareCall("{call show_emp()}");
            ResultSet rs = cstmt.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println(rsmd.getColumnCount());
            System.out.println(rsmd.getColumnName(1));
            System.out.println(rsmd.getColumnTypeName(1));
            while (rs.next()) {
                System.out.println(rs.getInt(1));
            }
            stmp.close();
            con.close();
            // System.out.println("success");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}