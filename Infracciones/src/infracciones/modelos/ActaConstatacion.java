/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infracciones.modelos;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Santos Balbino Cruz
 */
public class ActaConstatacion {
   private Date fechageneracion;
   private Date fechaVencimientoPagoVoluntario;
   private Time horaGeneracion;
   private String luhgarConstatacion;
   private int numero;
   private String observaciones;
   private EstadoActa estadodeActa;
   private Vehiculo vehiculo;
   private Licencia licencia;
   private AutoridadConstatacion autoridadConstatacion;
   private ArrayList<Infraccion> infracciones;

    public ActaConstatacion(Date fechageneracion, Date fechaVencimientoPagoVoluntario, Time horaGeneracion, String luhgarConstatacion, int numero, String observaciones) {
        this.fechageneracion = fechageneracion;
        this.fechaVencimientoPagoVoluntario = fechaVencimientoPagoVoluntario;
        this.horaGeneracion = horaGeneracion;
        this.luhgarConstatacion = luhgarConstatacion;
        this.numero = numero;
        this.observaciones = observaciones;
    }

    public Date getFechageneracion() {
        return fechageneracion;
    }

    public void setFechageneracion(Date fechageneracion) {
        this.fechageneracion = fechageneracion;
    }

    public Date getFechaVencimientoPagoVoluntario() {
        return fechaVencimientoPagoVoluntario;
    }

    public void setFechaVencimientoPagoVoluntario(Date fechaVencimientoPagoVoluntario) {
        this.fechaVencimientoPagoVoluntario = fechaVencimientoPagoVoluntario;
    }

    public Time getHoraGeneracion() {
        return horaGeneracion;
    }

    public void setHoraGeneracion(Time horaGeneracion) {
        this.horaGeneracion = horaGeneracion;
    }

    public String getLuhgarConstatacion() {
        return luhgarConstatacion;
    }

    public void setLuhgarConstatacion(String luhgarConstatacion) {
        this.luhgarConstatacion = luhgarConstatacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public float calcularTotalInfracciones(){
        return 0;
    }
    public int contarInfracciones(){
    return 0;
}
    public int cunatasinfracionestiene(){
        return contarInfracciones();
    }
    public boolean estaenFechaPagoVoluntario(){
        return false;
    }
    public boolean estaPagada(){
        return false;
    }
    public boolean fuelabradaenPeriodo(Date fechadesde, Date fechaHasta){
        return false;
    }
    public String infoActaConstatacion(){
        return toString();
    }
    public ArrayList<Infraccion> queInfracionesContiene(){
        return infracciones;
    }
    public void sumarMontodeInfraciones(){
        
    }

    @Override
    public String toString() {
        return "ActaConstatacion{" + "fechageneracion=" + fechageneracion + ", fechaVencimientoPagoVoluntario=" + fechaVencimientoPagoVoluntario + ", horaGeneracion=" + horaGeneracion + ", luhgarConstatacion=" + luhgarConstatacion + ", numero=" + numero + ", observaciones=" + observaciones + '}';
    }
   
      
}
