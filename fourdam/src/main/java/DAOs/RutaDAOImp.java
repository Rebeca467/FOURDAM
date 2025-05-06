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
public class RutaDAOImp implements Repositorio<Ruta> {
    
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    @Override
    public List<Ruta> listar() {
        List<Ruta> productos = new ArrayList<>();
        try ( Statement stmt = getConnection().createStatement();  ResultSet rs = stmt.executeQuery("SELECT id,nombre,cantidad FROM productos");) {
            while (rs.next()) {
                Ruta ruta = null;//crearRuta(rs);
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

    @Override
    public Ruta porId(int id) {
        return null;
    }

    @Override
    public void guardar(Ruta t) {
    }

    @Override
    public void eliminar(int id) {
    }
    
    /*private Ruta crearRuta(final ResultSet rs) throws SQLException {
        return new Ruta( rs.getInt("id"),rs.getObject("id_usuario", Usuario),rs.getInt("cantidad"));
    }*/
}
