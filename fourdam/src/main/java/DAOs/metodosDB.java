package DAOs;

import ENUMs.TipoUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import reto.fourdam.AccesoBaseDatos;
import reto.fourdam.Punto;
import reto.fourdam.Ruta;
import reto.fourdam.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM120
 */
public class metodosDB {
    private static Connection getConnection(){
        return AccesoBaseDatos.getInstance().getConn();
    }
    public List<Ruta> listarRutas() {
        List<Ruta> rutas = new ArrayList<>();
        try ( Statement stmt = getConnection().createStatement();  ResultSet rs = stmt.executeQuery("SELECT id_rutas, id_usuario, nombre, fecha, latitud_inicial, longitud_inicial, latitud_final, longitud_final, distancia, desnivel, desnivel_positivo, desnivel_negativo, altitud_minima, altitud_maxima, estado, url, familiar, temporada, indicaciones, terreno, esfuerzo, riesgo, zona, recomendaciones, clasificacion, nombre_inicial, nombre_final, media_valoraciones FROM rutas;");) {
            while (rs.next()) {
                Ruta ruta;
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rutas;
    }
   public Usuario porId(int id) {
        Usuario usuario = null;
        String sql = "SELECT id_usuario,nombre,apellidos,correo,contraseña,rol FROM usuarios WHERE id=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    usuario = crearUsuario(rs);
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return usuario;
    }
    
     private Ruta crearRuta(final ResultSet rs) throws SQLException {
//        return new Ruta(rs.getInt(1),porId(rs.getInt(2)),rs.getString(3),rs.getDate(4).toLocalDate(),new Punto(rs.getInt(7),rs.getInt(8)),new Punto(rs.getInt(9),rs.getInt(10)),rs.getDouble(11),null,rs.getDouble(12));
    return null;
     }
     private Usuario crearUsuario(final ResultSet rs) throws SQLException {
        return new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),TipoUsuario.valueOf(rs.getString(6)));
    }
}
