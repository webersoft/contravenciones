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
public class Infraccion {
    private int catPuntosDescontados;
    private float monto;
    private String observacion;
    private TipoInfraccion infraccionNomenclada;

    public Infraccion() {
    }

    public Infraccion(int catPuntosDescontados, float monto, String observacion, TipoInfraccion infraccionNomenclada) {
        this.catPuntosDescontados = catPuntosDescontados;
        this.monto = monto;
        this.observacion = observacion;
        this.infraccionNomenclada = infraccionNomenclada;
    }

    public int getCatPuntosDescontados() {
        return catPuntosDescontados;
    }

    public void setCatPuntosDescontados(int catPuntosDescontados) {
        this.catPuntosDescontados = catPuntosDescontados;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public TipoInfraccion getInfraccionNomenclada() {
        return infraccionNomenclada;
    }

    public void setTipoInfraccion(TipoInfraccion infraccionNomenclada) {
        this.infraccionNomenclada = infraccionNomenclada;
    }
   public float calcMontoConDescuento(){
       return monto-(monto*this.infraccionNomenclada.getPorcentajeDescuento());
   }
   public void ObtenerDescripcion(){
       
   }
   public String infoInfraccion(){
       return toString();
   }

    @Override
    public String toString() {
        return "Infraccion{" + "catPuntosDescontados=" + catPuntosDescontados + ", monto=" + monto + ", observacion=" + observacion + ", infraccionNomenclada=" + infraccionNomenclada + '}';
    }
   
}
