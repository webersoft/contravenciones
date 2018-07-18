/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infracciones.modelos;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Santos Balbino Cruz
 */
public class AutoridadConstatacion {
    private String apellido;
    private int dni;
    private Date fechaNac;
    private int lejago;
    private String nombre;
    private int nroPlaca;
    private String sexo;

    public AutoridadConstatacion() {
    }

    public AutoridadConstatacion(String apellido, int dni, Date fechaNac, int lejago, String nombre, int nroPlaca, String sexo) {
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.lejago = lejago;
        this.nombre = nombre;
        this.nroPlaca = nroPlaca;
        this.sexo = sexo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getLejago() {
        return lejago;
    }

    public void setLejago(int lejago) {
        this.lejago = lejago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroPlaca() {
        return nroPlaca;
    }

    public void setNroPlaca(int nroPlaca) {
        this.nroPlaca = nroPlaca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
public int cuntasInfraccionesLabradasEnPeriodo(){
    return 0;
}
public String infoAutoridadConstatacion(){
    return toString();
}
public void queActasdeConstatacion(List<ActaConstatacion> actasdeconstatcion){
    
}
    @Override
    public String toString() {
        return "AutoridadConstatacion{" + "apellido=" + apellido + ", dni=" + dni + ", fechaNac=" + fechaNac + ", lejago=" + lejago + ", nombre=" + nombre + ", nroPlaca=" + nroPlaca + ", sexo=" + sexo + '}';
    }

   
     
          
}
