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
public class Ruta {
    private int numero;
    private String nombre;

    public Ruta() {
    }

    public Ruta(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
