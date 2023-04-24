package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection conexion = null;
    private static String host = "localhost";
    private static String port = "3306";
    private static String db = "pronosticos";

    public static Connection getConexion() throws SQLException {
        if(conexion == null) {
           conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db, "root", "admin");
            System.out.println("Conexion establecida con bd: "+db);
        }
        return conexion;
    }

    public static void cerrarConexion() throws SQLException {
        if(conexion != null && !conexion.isClosed()) {
            conexion.close();
            conexion = null;
        }
    }
}
