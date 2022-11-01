/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author rafael
 */
public class FacturaNota {

    private int idFacturaNota;
    private String producto;
    private int cantidad;
    private int descuento;
    private String rfc;
    private double iva;
    private int Prod_VentIdPV;

    public FacturaNota(int idFacturaNota) {
        this.idFacturaNota = idFacturaNota;
    }

    public FacturaNota(int idFacturaNota, String producto, int cantidad, int descuento, String rfc, double iva, int Prod_VentIdPV) {
        this.idFacturaNota = idFacturaNota;
        this.producto = producto;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.rfc = rfc;
        this.iva = iva;
        this.Prod_VentIdPV = Prod_VentIdPV;
    }

    public FacturaNota(int idFacturaNota, String producto, int cantidad, String rfc, double iva, int Prod_VentIdPV) {
        this.idFacturaNota = idFacturaNota;
        this.producto = producto;
        this.cantidad = cantidad;
        this.rfc = rfc;
        this.iva = iva;
        this.Prod_VentIdPV = Prod_VentIdPV;
    }

    public FacturaNota(int idFacturaNota, String producto, int cantidad, int descuento, int Prod_VentIdPV) {
        this.idFacturaNota = idFacturaNota;
        this.producto = producto;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.rfc = rfc;
        this.iva = iva;
        this.Prod_VentIdPV = Prod_VentIdPV;
    }

    /**
     * @return the idFacturaNota
     */
    public int getIdFacturaNota() {
        return idFacturaNota;
    }

    /**
     * @param idFacturaNota the idFacturaNota to set
     */
    public void setIdFacturaNota(int idFacturaNota) {
        this.idFacturaNota = idFacturaNota;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the descuento
     */
    public int getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the Prod_VentIdPV
     */
    public int getProd_VentIdPV() {
        return Prod_VentIdPV;
    }

    /**
     * @param Prod_VentIdPV the Prod_VentIdPV to set
     */
    public void setProd_VentIdPV(int Prod_VentIdPV) {
        this.Prod_VentIdPV = Prod_VentIdPV;
    }

    public String despFactura() {
        return "ID Factura  = " + idFacturaNota
                + "\nProducto = " + producto
                + "\nCantidad = " + cantidad
                + "\nRFC = " + rfc
                + "\nIVA = " + iva;
    }

    public String despNota() {
        return "ID Nota = " + idFacturaNota
                + "\nProducto = " + producto
                + "\nCantidad = " + cantidad
                + "\nDescuento = " + descuento + "%";
    }

    @Override
    public String toString() {
        return "ID Factura_Nota = " + idFacturaNota
                + "\nProducto = " + producto
                + "\nCantidad = " + cantidad
                + "\nDescuento = " + descuento
                + "\nRFC = " + rfc
                + "\nIVA = " + iva
                + "\nID PV = " + Prod_VentIdPV;
    }

}
