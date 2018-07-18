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
public class OrganismoEmisor {
    private String nombre;
    private Localidad localidad;

    public OrganismoEmisor() {
        localidad=new Localidad();
   
    }

    public OrganismoEmisor(String nombre) {
        this.nombre = nombre;
        this.localidad = new Localidad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
   
}
