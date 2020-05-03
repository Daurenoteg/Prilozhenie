package kz.daurenad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.DatabaseMetaData;

public class GD {
    private static final String driver = "com.mysql.cj.jdbc.Driver" ;
    private static final String url = "jdbc:mysql://localhost:3306/devices?useUnicode=true&serverTimezone=UTC" ;

    static void printSQLException(SQLException se) {
        while(se != null) {

            System.out.print("SQLException: State:   " + se.getSQLState());
            System.out.println("Severity: " + se.getErrorCode());
            System.out.println(se.getMessage());

            se = se.getNextException();
        }
    }
    static void printSQLWarning(SQLWarning sw) {
        while(sw != null) {

            System.out.print("SQLWarning: State=" + sw.getSQLState()) ;
            System.out.println(", Severity = " + sw.getErrorCode()) ;
            System.out.println(sw.getMessage());

            sw = sw.getNextWarning();
        }
    }

    public static void main(String[] args) {
        Connection con = null ;
        DatabaseMetaData dbmd = null ;

        try {
            Class.forName(driver) ;
            con = DriverManager.getConnection(url);

            SQLWarning swarn = con. getWarnings() ;

            if(swarn != null){
                printSQLWarning(swarn) ;
            }

            dbmd = con.getMetaData() ;

            System.out.println("\n----------------------------------------------------") ;
            System.out.println("Database Name    = " + dbmd.getDatabaseProductName()) ;
            System.out.println("Database Version = " + dbmd.getDatabaseProductVersion()) ;
            System.out.println("Driver Name      = " + dbmd.getDriverName()) ;
            System.out.println("Driver Version   = " + dbmd.getDriverVersion()) ;
            System.out.println("Database URL     = " + dbmd.getURL()) ;
            System.out.println("----------------------------------------------------") ;

        } catch (SQLException se) {
            printSQLException(se) ;
        } catch(ClassNotFoundException e){
            System.out.println("JDBC Driver " + driver + " not found in CLASSPATH") ;
        }
        finally {
            if(con != null){
                try{
                    con.close() ;
                } catch(SQLException se){
                    printSQLException(se) ;
                }
            }
        }
    }
}