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
public class TipoInfraccion {
    private int cantPutnosDto;
    private int codigo;
    private String descripcion;
    private float importe;
    private String observacion;
    private float porcentajeDescuento;

    public TipoInfraccion() {
    }

    public TipoInfraccion(int cantPutnosDto, int codigo, String descripcion, float importe, String observacion, float porcentajeDescuento) {
        this.cantPutnosDto = cantPutnosDto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.observacion = observacion;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getCantPutnosDto() {
        return cantPutnosDto;
    }

    public void setCantPutnosDto(int cantPutnosDto) {
        this.cantPutnosDto = cantPutnosDto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    public void decuantapuntos(){
      
    }
    public String infoTipoInfraccion(){
        return toString();
    }
    public boolean tieneDtoPagoVoluntario(){
        return false;
    }

    @Override
    public String toString() {
        return "TipoInfraccion{" + "cantPutnosDto=" + cantPutnosDto + ", codigo=" + codigo + ", descripcion=" + descripcion + ", importe=" + importe + ", observacion=" + observacion + ", porcentajeDescuento=" + porcentajeDescuento + '}';
    }
   
    
}
