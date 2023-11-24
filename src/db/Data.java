package db;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.Auto;

/**
 *
 * @author antho
 */
public class Data {

    private Conexion con;

    public Data(String db) throws SQLException {
        con = new Conexion(db);
    }

    public void insertarProducto(Auto a) throws SQLException {
        String query = "INSERT INTO auto VALUES('"
                + a.getPatente() + "','"
                + a.getMarca() + "','"
                + a.getModelo() + "','"
                + a.getAñoAuto() + "',"
                + a.getDescripcionAuto() + ")";
        con.ejecutar(query);
    }

    public void ActualizarProducto(Auto a) throws SQLException {
        String query = "UPDATE auto SET "
                + "patente = '" + a.getPatente() + "' , "
                + "marca = '" + a.getMarca() + "',"
                + "modelo = '" + a.getModelo() + "', "
                + "año auto = '" + a.getAñoAuto() + "',"
                + "descripcion = '" + a.getAñoAuto() + "',"
                + "WHERE patente = '" + a.getPatente() + "'";
        con.ejecutar(query);
    }

    public void EliminarProducto(String patente) throws SQLException {
        String query = "DELETE FROM auto "
                + "WHERE "
                + "patente = '" + patente + "'";
        con.ejecutar(query);
    }

    public ArrayList<Auto> getProducto() throws SQLException {

        String sql = "SELECT * FROM auto;";
        ResultSet rs = con.select(sql);
        ArrayList<Auto> productoList = new ArrayList<>();

        while (rs.next()) {
            Auto a = new Auto();
            a.setPatente(rs.getString("patente"));
            a.setMarca(rs.getString("marca"));
            a.setModelo(rs.getString("modelo"));
            a.setAñoAuto(LocalDate.parse(rs.getDate("año_auto").toString()));
            a.setDescripcionAuto(rs.getString("descripcion"));
            productoList.add(a);
        }
        return null;
    }

    public Auto getProductoByid(String patente) throws SQLException {
        String query = "SELECT * FROM producto WHERE id = '" + patente + "'";
        ResultSet rs = con.select(query);

        if (rs.next()) {
            Auto a = new Auto();
            a.setPatente(rs.getString("patente"));
            a.setMarca(rs.getString("marca"));
            a.setModelo(rs.getString("modelo"));
            a.setAñoAuto(LocalDate.parse(rs.getDate("año_auto").toString()));
            a.setDescripcionAuto(rs.getString("descripcion"));
            con.cerrarStatement();
            return a;
        } else {
            con.cerrarStatement();
            return null;
        }
    }
}
