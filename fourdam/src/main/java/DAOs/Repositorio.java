/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOs;

import java.util.List;

/**
 *
 * @author DAM124
 */
public interface Repositorio <T> {
    
    public List<T> listar();
    
    public T porId( int id);
    
    public void guardar(T t);
    
    public void eliminar( int  id);
}
