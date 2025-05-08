/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import reto.fourdam.AccesoBaseDatos;
import reto.fourdam.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import reto.fourdam.Ruta;

/**
 *
 * @author DAM124
 */
public class RutaDAOImp{
    
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    public List<Ruta> listar() {
        List<Ruta> productos = new ArrayList<>();
        try ( Statement stmt = getConnection().createStatement();  ResultSet rs = stmt.executeQuery("SELECT id_rutas,id_usuario, nombre, fecha, punto_ini_id, punto_fin_id, distancia_total, duracion, desnivel, alt_max, alt_min, clasificacion, nivel_riesgo, nivel_esfuerzo, tipo_terreno, indicaciones, tipo_actividad, temporada, accesibilidad, familiar, url, estado, recomendaciones, zona_geografica, puntos_intermedios FROM ruta");) {
            while (rs.next()) {
                Ruta ruta = crearRuta(rs);
               if (!productos.add(ruta)) {
                    throw new Exception("error no se ha insertado el objeto en la colección");
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return productos;
    }
    private Ruta crearRuta(final ResultSet rs) throws SQLException {
        return new Ruta(
//    rs.getInt("id"),
//    usuarioDAO.buscarPorId(rs.getInt("autor_id")), // si autor es un objeto
//    rs.getStrusuarioDAO.buscarPorIding("nombre"),
//    rs.getDate("fecha_creacion").toLocalDate(),
//    puntoDAO.buscarPorId(rs.getInt("punto_ini_id")),
//    puntoDAO.buscarPorId(rs.getInt("punto_fin_id")),
//    rs.getFloat("distancia_total"),
//    rs.getTime("duracion").toLocalTime(),
//    rs.getFloat("desnivel"),
//    rs.getFloat("alt_max"),
//    rs.getFloat("alt_min"),
//    ClasificacionRuta.valueOf(rs.getString("clasificacion")),
//    rs.getInt("nivel_riesgo"),
//    rs.getInt("nivel_esfuerzo"),
//    rs.getInt("tipo_terreno"),
//    rs.getInt("indicaciones"),
//    rs.getString("tipo_actividad"),
//    new HashSet<>(Arrays.asList(rs.getString("temporada").split(","))), // suponiendo CSV en DB
//    rs.getBoolean("accesibilidad"),
//    rs.getBoolean("familiar"),
//    rs.getString("url"),
//    Estado.valueOf(rs.getString("estado")),
//    rs.getString("recomendaciones"),
//    rs.getString("zona_geografica"),
//    new File(rs.getString("puntos_intermedios")
        );     
}
}
