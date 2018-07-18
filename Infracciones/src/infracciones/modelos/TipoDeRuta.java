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
public class TipoDeRuta {
    private String descripcion;
    private String nombre;

    public TipoDeRuta() {
    }

    public TipoDeRuta(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        public boolean esRutaInternacional(){
        return false;
    }
     public boolean esRutaNacional(){
        return false;
    }
      public boolean esRutaProvincial(){
        return false;
    }
}
