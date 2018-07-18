/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infracciones.modelos;

/**
 *
 * @author Santos Balbino Cruz
 */
public class EstadoActa {
    private String Descripcion;
    private String nombre;

    public EstadoActa() {
        
    }

    public EstadoActa(String Descripcion, String nombre) {
        this.Descripcion = Descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
