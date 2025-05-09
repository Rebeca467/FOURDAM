package DAOs;

import ENUMs.ClasificacionRuta;
import ENUMs.Estado;
import ENUMs.TipoUsuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import reto.fourdam.AccesoBaseDatos;
import reto.fourdam.Punto;
import reto.fourdam.Resenna;
import reto.fourdam.Ruta;
import reto.fourdam.SWING.Calendario;
import reto.fourdam.Usuario;
import reto.fourdam.Valoracion;
import reto.fourdam.ValoracionTec;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DAM120
 */
public class metodosDB {

    private static Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    public List<Ruta> listarRutas() {
        List<Ruta> rutas = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT id_rutas, id_usuario, nombre, fecha, latitud_inicial, longitud_inicial, latitud_final, longitud_final, distancia, desnivel, desnivel_positivo, desnivel_negativo, altitud_minima, altitud_maxima, estado, url, familiar, temporada, indicaciones, terreno, esfuerzo, riesgo, zona, recomendaciones, clasificacion, nombre_inicial, nombre_final, media_valoraciones FROM rutas;");) {
            while (rs.next()) {
                Ruta ruta = crearRuta(rs);
                rutas.add(ruta);
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rutas;
    }

    public List<Punto> listarPuntos() {
        return null;
    }

    public List<Valoracion> listarValoraciones() {
        return null;
    }

    public List<Resenna> listarResaennas() {
        return null;
    }

    //PREGUNTAR
    public List<ValoracionTec> listarValoracionesTecnicas() {
        return null;
    }

    public void agregarRuta() {
    }

    public void agregarCalendario() {
    }

    public void agregarValoracion() {
    }

    public void agregarResenna() {
    }

    public void agregarValoracionTecnica() {
    }

    public Ruta rutaPorId(int id) {
        return null;
    }

    public Usuario usuPorId(int id) {
        Usuario usuario = null;
        String sql = "SELECT id_usuario,nombre,apellidos,correo,contraseña,rol FROM usuarios WHERE id=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery();) {
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

    //PENSE QUE SI LA RUTA GUARDA EN AUTOR EL CORREO DEL USUARIO SOLO NECESITARIAMOS ESTE METODO
    public Usuario usuPorCorreo(String correo) {
        return null;
    }

    public void eliminarRuta() {
    }

    public void eliminarResenna() {
    }

    public void modificarRuta() {
    }

    public void modificarPunto() {
    }

    private Ruta crearRuta(final ResultSet rs) throws SQLException {
        return new Ruta(
                rs.getInt("id_rutas"),
                usuPorId(rs.getInt("id_usuario")),
                rs.getString("nombre"),
                rs.getDate("fecha").toLocalDate(),
                new Punto(
                        rs.getDouble("latitud_inicial"),
                        rs.getDouble("longitud_inicial"),
                        null),
                new Punto(rs.getDouble("latitud_final"),
                        rs.getDouble("longitud_final"),
                        null),
                rs.getDouble("distancia"),
                null,
                rs.getDouble("desnivel"),
                rs.getDouble("altitud_maxima"),
                rs.getDouble("altitud_minima"),
                ClasificacionRuta.valueOf(rs.getString("clasificacion")),
                rs.getInt("riesgo"),
                rs.getInt("esfuerzo"),
                rs.getInt("terreno"),
                rs.getInt("indicaciones"),
                rs.getString("actividad"),
                Set.of(rs.getString("temporada").split(",")),
                rs.getBoolean("accesibilidad"),
                rs.getBoolean("familiar"),
                rs.getString("url"),
                Estado.valueOf(rs.getString("estado")),
                rs.getString("recomendaciones"),
                rs.getString("zona"),
                null
        );
    }

    private Usuario crearUsuario(final ResultSet rs) throws SQLException {
        return new Usuario(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                TipoUsuario.valueOf(rs.getString(6)));
    }

    public void insertarValoracion(Valoracion v) {

        String sql = "insert into valoraciones(id_usuario,Rutas_id_rutas,fecha,dificultad,belleza,interés,texto_tecnico,texto_reseña) values (?,?,?,?,?,?,?,?);";

        try (PreparedStatement ps = getConnection().prepareStatement(sql);) {

            ps.setObject(1, v.getUsuario());

            ps.setObject(2, v.getRuta());

            ps.setDate(3, Date.valueOf(v.getFecha()));

            ps.setInt(4, v.getDificultad());

            ps.setInt(5, v.getBelleza());

            ps.setInt(6, v.getInteresCultural());

            // texto_tecnico
            // texto_reseña
        } catch (SQLException e) {

        }
    }
    
    

    private Calendario crearCalendario(final ResultSet rs) throws SQLException {
        return null;
    }
    
    //USAR EN 'CREARRUTA'
    private Punto crearPunto(final ResultSet rs) throws SQLException {
        return null;
    }

    private Valoracion crearValoracion(final ResultSet rs) throws SQLException {
        return null;
    }

    private Resenna crearResenna(final ResultSet rs) throws SQLException {
        return null;
    }

    private ValoracionTec crearValoracionTecnica(final ResultSet rs) throws SQLException {
        return null;
    }
}
