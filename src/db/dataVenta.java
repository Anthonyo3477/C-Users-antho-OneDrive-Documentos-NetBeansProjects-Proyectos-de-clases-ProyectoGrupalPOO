package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.Ventas;

/**
 *
 * @author antho
 */
public class dataVenta {

    private Conexion con;

    public dataVenta(String db) throws SQLException {
        con = new Conexion(db);
    }

    public void insertarVentas(Ventas v) throws SQLException {
        String query = "INSERT INTO ventas VALUES('"
                + v.getId_ventas() + "','"
                + v.getId_persona() + "','"
                + v.getId_vehiculo() + "','"
                + v.getCantidad() + "',"
                + v.getFecha_venta() + ")";
        con.ejecutar(query);
    }

    public void ActualizarVentas(Ventas v) throws SQLException {
        String query = "UPDATE ventas SET "
                + "ID = '" + v.getId_ventas() + "' , "
                + "persona id = '" + v.getId_persona() + "',"
                + "vehiculo id = '" + v.getId_vehiculo() + "', "
                + "cantidad = '" + v.getCantidad() + "',"
                + "fecha venta = '" + v.getFecha_venta() + "',"
                + "WHERE patente = '" + v.getId_ventas() + "'";
        con.ejecutar(query);
    }

    public void EliminarVentas(String id_ventas) throws SQLException {
        String query = "DELETE FROM ventas "
                + "WHERE "
                + "ID = '" + id_ventas + "'";
        con.ejecutar(query);
    }

    public ArrayList<Ventas> getVentas() throws SQLException {

        String sql = "SELECT * FROM ventas;";
        ResultSet rs = con.select(sql);
        ArrayList<Ventas> ventasList = new ArrayList<>();

        while (rs.next()) {
            Ventas v = new Ventas();
            v.setId_ventas(Integer.parseInt("ID"));
            v.setId_persona(Integer.parseInt("persona_id_fk"));
            v.setId_vehiculo(Integer.parseInt("vehiculo_id_fk"));
            v.setCantidad(Integer.parseInt("cantidad"));
            v.setFecha_venta(LocalDate.parse(rs.getDate("fecha_venta").toString()));
            ventasList.add(v);
        }
        return null;
    }

    public Ventas getVentasByid(String id_ventas) throws SQLException {
        String query = "SELECT * FROM ventas WHERE id = '" + id_ventas + "'";
        ResultSet rs = con.select(query);

        if (rs.next()) {
            Ventas v = new Ventas();
            v.setId_ventas(Integer.parseInt("ID"));
            v.setId_persona(Integer.parseInt("persona_id_fk"));
            v.setId_vehiculo(Integer.parseInt("vehiculo_id_fk"));
            v.setCantidad(Integer.parseInt("cantidad"));
            v.setFecha_venta(LocalDate.parse(rs.getDate("fecha_venta").toString()));
            con.cerrarStatement();
            return v;
        } else {
            con.cerrarStatement();
            return null;
        }
    }
}
