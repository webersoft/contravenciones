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
public class Vehiculo {
    private int añopatentamiento;
    private String Color;
    private String dominio;
    private Modelo modelo;

    public Vehiculo() {
        this.modelo=new Modelo();
       
    }

    public Vehiculo(int añopatentamiento, String Color, String dominio) {
        this.añopatentamiento = añopatentamiento;
        this.Color = Color;
        this.dominio = dominio;
        this.modelo=new Modelo();
    }

    public int getAñopatentamiento() {
        return añopatentamiento;
    }

    public void setAñopatentamiento(int añopatentamiento) {
        this.añopatentamiento = añopatentamiento;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }
    public boolean esPagada(){
        return false;
    }

    @Override
    public String toString() {
        return this.dominio; //To change body of generated methods, choose Tools | Templates.
    }
  
}
