/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validaciones;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DAM104
 */
public class Teclado {

    public static String texto(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        boolean exito=false;
        String texto = "";
        try {
            while(!exito){
            System.out.println(mensaje);
            texto = teclado.nextLine();
            if (!texto.matches("[A-Z a-z 0-9]*")) {
                throw new Exception("No has introducido correctamente el texto");
            }
            exito=true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return texto;
    }

    public static int intervalos(String mensaje, int inicio, int fin) {
        Scanner teclado = new Scanner(System.in);
        boolean exito = false;
        int num = 0;
        try{
            while(!exito){
                System.out.println(mensaje);
                num= teclado.nextInt();
                if(num<inicio||num>fin){
                    throw new Exception("Introduce un numero válido");
                }
                exito=true;
            }
        } catch (InputMismatchException e){
            System.out.println("Debes meter un numero ");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return num;
    }
    
    public static int numeros (String mensaje){
         Scanner teclado = new Scanner(System.in);
        boolean exito = false;
        int num = 0;
        try{
            while(!exito){
                System.out.println(mensaje);
                num= teclado.nextInt();
                exito=true;
            }
        } catch (InputMismatchException e){
            System.out.println("Debes meter un numero ");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return num;
    }
    
    public static String formatoFecha (LocalDate fecha){
        String fech = "";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fech = fecha.format(f);
        return fech;
    }
    
    public static String formatoTiempo (LocalTime tiempo){
        String tiem = "";
        DateTimeFormatter t = DateTimeFormatter.ofPattern("hh:mm:ss");
        tiem = tiempo.format(t);
        return tiem;
    }
    
    public static Set<String> validarTemporada(String texto) {
        List<String> temporadasValidas = List.of("primavera", "verano", "otoño", "invierno");
        boolean valido = false;
        Set<String> temporadas = new LinkedHashSet<>();
        System.out.println(texto);
        do {
            String temp = new Scanner(System.in).nextLine();
            temporadas.clear();
            String[] partes = temp.split(",");
            for (String parte : partes) {
                temporadas.add(parte.trim().toLowerCase());
            }
            
            Set<String> noValidas = new LinkedHashSet<>(temporadas);
            noValidas.removeAll(temporadasValidas);
            
            if (noValidas.isEmpty()) {
                
                if (comprobarOrden(temporadas, temporadasValidas)) {
                    valido = true;
                } else {
                    System.out.println("ERROR: debes introducir las temporadas en orden");
                }
            } else {
                System.out.println("ERROR: temporada no valida (primavera,verano,otono,invierno)");
            }
        } while (!valido);
        return temporadas;
    }
 
    private static boolean comprobarOrden(Set<String> temporadas, List<String> ordenCorrecto) {
        int posicionAnterior = -1;
        boolean ordenado = true;
        for (String temporada : temporadas) {
            int posicionActual = ordenCorrecto.indexOf(temporada);
            if (posicionActual < posicionAnterior) {
                ordenado = false;
            }
            posicionAnterior = posicionActual;
        }
        return ordenado;
    }
    
    //fetch
}
