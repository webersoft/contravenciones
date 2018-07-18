/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infracciones.modelos;

import java.util.List;

/**
 *
 * @author Santos Balbino Cruz
 */
public class Modelo {
    private String nombre;

    public Modelo() {
    }

    public Modelo(String nombre) {
        this.nombre = nombre;
    }

    public void queMarca(List<Marca> marcas ){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
}
