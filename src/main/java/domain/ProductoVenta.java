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
public class ProductoVenta {

    private int idPV;
    private int idP;
    private int idV;
    private int idVendedor;

    public ProductoVenta(int idP) {
        this.idP = idP;
    }

    public ProductoVenta(int idPV, int idP, int idV, int idVendedor) {
        this.idPV = idPV;
        this.idP = idP;
        this.idV = idV;
        this.idVendedor = idVendedor;
    }

    /**
     * @return the idPV
     */
    public int getIdPV() {
        return idPV;
    }

    /**
     * @param idPV the idPV to set
     */
    public void setIdPV(int idPV) {
        this.idPV = idPV;
    }

    /**
     * @return the idP
     */
    public int getIdP() {
        return idP;
    }

    /**
     * @param idP the idP to set
     */
    public void setIdP(int idP) {
        this.idP = idP;
    }

    /**
     * @return the idV
     */
    public int getIdV() {
        return idV;
    }

    /**
     * @param idV the idV to set
     */
    public void setIdV(int idV) {
        this.idV = idV;
    }

    /**
     * @return the idVendedor
     */
    public int getIdVendedor() {
        return idVendedor;
    }

    /**
     * @param idVendedor the idVendedor to set
     */
    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    @Override
    public String toString() {
        return "ID PV = " + idPV + "\nID Producto = " + idP
                + "\nID Venta =" + idV + "\nID Vendedor = " + idVendedor;
    }
}
