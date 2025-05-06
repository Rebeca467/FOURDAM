/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto.fourdam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAM106
 */
public class Fichero {

    public static String rutaToCsv(Ruta ruta) {
        String linea = "";
        linea += ruta.getNombre() + ";" + ruta.getAutor().getNombre() + ";" + ruta.getUrl() + "\n";
        linea += "Tipo;Latitud;Longitud;Elevación;Tiempo;Nombre\n";
        if (ruta.getPunto_ini() != null) {
            PuntoInteres ini = ruta.getPunto_ini();
            linea += "waypoint;" + ini.getLatitud() + ";" + ini.getLongitud() + ";" + ini.getElevacion() + ";-;" + ini.getNombre() + "\n";
        }
        
        
        
        if (ruta.getPunto_fin() != null) {
            PuntoInteres fin = ruta.getPunto_fin();
            linea += "waypoint;" + fin.getLatitud() + ";" + fin.getLongitud() + ";" + fin.getElevacion() + ";-;" + fin.getNombre() + "\n";
        }
        
        return linea;
    }

    public static Ruta csvToRuta(File file) {
        Ruta ruta = new Ruta();
        List<PuntoInteres> waypoints = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea = br.readLine();
            if (linea != null) {
                String parts[] = linea.split(";");
                ruta.setNombre(parts[0]);
                //ruta.setAutor(autor);
                ruta.setUrl(parts[2]);
                ruta.setFecha_creacion(LocalDate.now());
                ruta.setDuracion(LocalTime.of(0, 0));
                ruta.setPuntosIntermedios(file);

                br.readLine();//ignorar cabecera

                //puntos
                String puntoLinea;
                while ((puntoLinea = br.readLine()) != null) {
                    double lat = Double.parseDouble(parts[1]);
                    double lon = Double.parseDouble(parts[2]);
                    float ele = Float.parseFloat(parts[3]);
                    String nombre = parts[5];
                    PuntoInteres p = new PuntoInteres(nombre, lat, lon, ele);
                    waypoints.add(p);
                }

                if (!waypoints.isEmpty()) {
                    ruta.setPunto_ini(waypoints.get(0));
                    ruta.setPunto_fin(waypoints.get(waypoints.size() - 1));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ruta;
    }
}
