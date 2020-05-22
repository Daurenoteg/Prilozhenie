package kz.daurenad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JavaToMySQL {
    private static final String url = "jdbc:mysql://localhost:3306/devices";
    private static final String user = "root";
    private static final String password = " ";
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    public static void main(String args[]) {
        String query = "select count(*) from devices";
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Total number of devices in the table : " + count);
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            try { con.close(); } catch(SQLException se) {  }
            try { stmt.close(); } catch(SQLException se) {  }
            try { rs.close(); } catch(SQLException se) {  }
        }
    }
}
