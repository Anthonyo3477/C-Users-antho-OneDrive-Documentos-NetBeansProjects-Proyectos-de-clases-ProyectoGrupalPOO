
package db;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author antho
 */
public class Conexion {
    
    private Connection con;
    private Statement sen;
    
    public Conexion(String db) throws SQLException {
        String url = "jdbc:mysql://localhost/" + db + "?user=root&password=";
        System.out.println("[*] " + url);
        con = DriverManager.getConnection(url);
    }
    
    public Connection getConnection(){
        return con;
    }
    
    public void ejecutar(String query)throws SQLException{
        sen = con.createStatement();
        sen.executeUpdate(query);
        sen.close();
    }
    
    public ResultSet select (String query)throws SQLException{
        sen = con.createStatement();
        ResultSet rs = sen.executeQuery(query);
        return rs;
    }
    public void cerrarStatement()throws SQLException{
        sen.close();
    }
}
