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
public class Cliente {

    private int idCliente;
    private String nombre;
    private String apPat;
    private String apMat;
    private String rfc;
    private String correo;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String apPat, String apMat, String rfc, String correo, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.rfc = rfc;
        this.correo = correo;
        this.telefono = telefono;
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

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apPat
     */
    public String getApPat() {
        return apPat;
    }

    /**
     * @param apPat the apPat to set
     */
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    /**
     * @return the apMat
     */
    public String getApMat() {
        return apMat;
    }

    /**
     * @param apMat the apMat to set
     */
    public void setApMat(String apMat) {
        this.apMat = apMat;
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
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ID Cliente = " + idCliente
                + "\nNombre = " + nombre + " " + apPat + " " + apMat
                + "\nRFC = " + rfc
                + "\nCorreo = " + correo
                + "\nTelefono = " + telefono;
    }

}
