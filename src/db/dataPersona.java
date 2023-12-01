package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author antho
 */
public class dataPersona {

    private Conexion con;

    public dataPersona(String db) throws SQLException {
        con = new Conexion(db);
    }

    public void insertarPersona(Persona p) throws SQLException {
        String query = "INSERT INTO personas VALUES('"
                + p.getId() + "','"
                + p.getRut() + "','"
                + p.getNombre() + "','"
                + p.getCorreo() + ")";
        con.ejecutar(query);
    }

    public void actualizarPersona(Persona p) throws SQLException {
        String query = "UPDATE personas SET "
                + "id = '" + p.getId() + "' , "
                + "rut = '" + p.getRut() + "',"
                + "nombre = '" + p.getNombre() + "', "
                + "email = '" + p.getCorreo() + "',"
                + "WHERE patente = '" + p.getId() + "'";
        con.ejecutar(query);
    }

    public void EliminarPersona(String id_persona) throws SQLException {
        String query = "DELETE FROM personas "
                + "WHERE "
                + "ID = '" + id_persona + "'";
        con.ejecutar(query);
    }

    public ArrayList<Persona> getPersonas() throws SQLException {

        String sql = "SELECT * FROM personas;";
        ResultSet rs = con.select(sql);
        ArrayList<Persona> personaList = new ArrayList<>();

        while (rs.next()) {
            Persona p = new Persona();
            p.setId(Integer.parseInt("id"));
            p.setRut(rs.getString("rut"));
            p.setNombre(rs.getString("nombre"));
            p.setCorreo(rs.getString("email"));
            personaList.add(p);
        }
        return null;
    }
    
    public Persona getPersonaByid(String id_personas) throws SQLException {
        String query = "SELECT * FROM personas WHERE id = '" + id_personas + "'";
        ResultSet rs = con.select(query);

        if (rs.next()) {
            Persona p = new Persona();
            p.setId(Integer.parseInt("id"));
            p.setRut(rs.getString("rut"));
            p.setNombre(rs.getString("nombre"));
            p.setCorreo(rs.getString("email"));
            con.cerrarStatement();
            return p;
        } else {
            con.cerrarStatement();
            return null;
        }
    }
}
