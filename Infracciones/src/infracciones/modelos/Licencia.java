/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infracciones.modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Santos Balbino Cruz
 */
public class Licencia {
    private Date fechaOtorgamiento;
    private Date fechaVencimiento;
    private int numero;
    private OrganismoEmisor organismoEmisor;
    private List<ActaConstatacion> actadeConstatacion;

  

    public Licencia() {
        this.organismoEmisor=new OrganismoEmisor();
        this.actadeConstatacion=new ArrayList<>();
    }

    public Licencia(Date fechaOtorgamiento, Date fechaVencimiento, int numero) {
        this.fechaOtorgamiento = fechaOtorgamiento;
        this.fechaVencimiento = fechaVencimiento;
        this.numero = numero;
        this.organismoEmisor=new OrganismoEmisor();
    }

    public Date getFechaOtorgamiento() {
        return fechaOtorgamiento;
    }

    public void setFechaOtorgamiento(Date fechaOtorgamiento) {
        this.fechaOtorgamiento = fechaOtorgamiento;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Licencia{" + "fechaOtorgamiento=" + fechaOtorgamiento + ", fechaVencimiento=" + fechaVencimiento + ", numero=" + numero + '}';
    }

   public int cuantasActasEnPeriodo(Date fechadesde, Date fechaHsta){
    return 0;
   
   }
   public int cuantasInfraccionesEnPeriodo(Date fechadesde, Date fechaHsta){
    return 0;
   
   }
   public float cuantoDebePorInfraccionesNoPagadas(){
    return 0;
   
   }
    public boolean estasEnPeriodo(){
        return false;
    }
    
    public boolean estasVigente(){
        return false;
    }
    
    public boolean estasVencida(){
        return false;
    }
 

    public OrganismoEmisor getOrganismoEmisor() {
        return organismoEmisor;
    }

    public void setOrganismoEmisor(OrganismoEmisor organismoEmisor) {
        this.organismoEmisor = organismoEmisor;
    }
   
   public String infoLivencia(){
       return this.toString();
   }
   public ArrayList<Infraccion> infraccionesEnPeriodo(Date fechadesde, Date fechaHasta){
       return null;
   }
     public void setActadeConstatacion(List<ActaConstatacion> actadeConstatacion) {
        this.actadeConstatacion = actadeConstatacion;
    }
   public float montoInfraccionesEnPeriodo(Date fechadesde, Date fechaHasta){
       return 0;
   }
  

  
    
}
