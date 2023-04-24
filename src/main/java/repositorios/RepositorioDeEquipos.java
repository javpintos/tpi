package repositorios;

import db.Conexion;
import entidades.Equipo;

import java.sql.*;

public class RepositorioDeEquipos {

    public static void crearTabla() throws SQLException {
        Connection conexion = Conexion.getConexion();
        Statement sentencia = conexion.createStatement();
        String sentenciaCrearTabla = "CREATE TABLE IF NOT EXISTS equipo (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(45), descripcion VARCHAR(55))";
        sentencia.executeUpdate(sentenciaCrearTabla);
    }

    public static void agregar(Equipo equipo) throws SQLException {
        Connection conexion = Conexion.getConexion();
        PreparedStatement sentenciaDeInsert = conexion.prepareStatement("INSERT INTO equipo (nombre, descripcion) VALUES (?, ?)");
        sentenciaDeInsert.setString(1, equipo.getNombre());
        sentenciaDeInsert.setString(2, equipo.getDescripcion());
        sentenciaDeInsert.executeUpdate();
    }

    public static void eliminar(Equipo equipo) throws SQLException {
        Connection conexion = Conexion.getConexion();
        PreparedStatement sentenciaDeEliminacion = conexion.prepareStatement("DELETE FROM equipo WHERE nombre = ?");
        sentenciaDeEliminacion.setString(1, equipo.getNombre());
        sentenciaDeEliminacion.executeUpdate();
        //REALIZAR EL DELETE EN LA TABLA ALUMNO
    }

    public static Equipo buscarPorNombre(String nombre) throws SQLException {
        Connection conexion = Conexion.getConexion();
        PreparedStatement sentenciaDeBusqueda = conexion.prepareStatement("SELECT * FROM equipo WHERE nombre = ? LIMIT 1");
        sentenciaDeBusqueda.setString(1, nombre);
        ResultSet resultado = sentenciaDeBusqueda.executeQuery();
        Equipo equipo = new Equipo(nombre);

        while(resultado.next()) {
            equipo.setNombre(resultado.getString("nombre"));
        }
        return equipo;
    }
}
