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
    private int descuento;
    private String rfc;
    private double iva;
    private int idVenta;
    private int idCliente;

    public FacturaNota(int idFacturaNota) {
        this.idFacturaNota = idFacturaNota;
    }

    public FacturaNota(int idFacturaNota, int descuento, String rfc, double iva, int idVenta, int idCliente) {
        this.idFacturaNota = idFacturaNota;
        this.descuento = descuento;
        this.rfc = rfc;
        this.iva = iva;
        this.idVenta = idVenta;
        this.idCliente = idCliente;
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
     * @return the idVenta
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * @param idVenta the idVenta to set
     */
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String despFactura() {
        return "ID FacturaNota: " + idFacturaNota
                + "\nRFC: " + rfc
                + "\nIVA: " + iva
                + "\nID Venta: " + idVenta
                + "\nID Cliente: " + idCliente;
    }

    public String despNota() {
        return "ID FacturaNota: " + idFacturaNota
                + "\nDescuento: " + descuento
                + "\nID Venta: " + idVenta
                + "\nID Cliente: " + idCliente;
    }

    @Override
    public String toString() {
        return "ID FacturaNota: " + idFacturaNota
                + "\nDescuento: " + descuento
                + "\nRFC: " + rfc
                + "\nIVA: " + iva
                + "\nID Venta: " + idVenta
                + "\nID Cliente: " + idCliente;
    }

}
