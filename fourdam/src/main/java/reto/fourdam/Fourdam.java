/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package reto.fourdam;

import java.sql.Connection;
import reto.fourdam.SWING.LogIn;

/**
 *
 * @author DAM124
 */
public class Fourdam {

    public static void main(String[] args) {
        new LogIn().setVisible(true);
        Connection conn = AccesoBaseDatos.getInstance().getConn();
        System.out.println("hola");
    }
    
}
