package ar.utn.ap.pronosticos;

import db.Conexion;
import entidades.Equipo;
import repositorios.RepositorioDeEquipos;

import java.sql.SQLException;

public class MainDB {

    public static void main(String[] args) throws SQLException {
        RepositorioDeEquipos.crearTabla();

        Equipo equipo = new Equipo("Argentina");
        equipo.setDescripcion("Selección de Argentina");

        RepositorioDeEquipos.agregar(equipo);
        System.out.println("Equipo agregado a BD");

        //RepositorioDeEquipos.eliminar(equipo);
        //System.out.println("Equipo eliminado de la BD");

        Conexion.cerrarConexion();
    }
}