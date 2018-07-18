/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infracciones.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santos Balbino Cruz
 */
public class Marca {
    private String nombre;
    private List<Modelo> modelos;

    public Marca() {
        this.modelos=new ArrayList<>();
    }

    public Marca(String nombre) {
        this.nombre = nombre;
        this.modelos =new ArrayList<>();
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }
public void addModelo(Modelo modelo){
    this.modelos.add(modelo);
}
    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
