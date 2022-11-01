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
public class Ventas {

    private int idVenta;
    private String fecha;
    private double monto;
    private double total;

    public Ventas(int idVenta) {
        this.idVenta = idVenta;
    }

    public Ventas(int idVenta, String fecha, double monto, double total) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.monto = monto;
        this.total = total;
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
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ID Venta = " + idVenta
                + "\nFecha = " + fecha
                + "\nMonto = " + monto
                + "\nTotal = " + total;
    }

}
