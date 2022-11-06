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
public class Vendedor {

    private int idVend;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    public Vendedor(int idVend) {
        this.idVend = idVend;
    }

    public Vendedor(int idVend, String nombre, String apellido, String telefono, String correo) {
        this.idVend = idVend;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    /**
     * @return the idVend
     */
    public int getIdVend() {
        return idVend;
    }

    /**
     * @param idVend the idVend to set
     */
    public void setIdVend(int idVend) {
        this.idVend = idVend;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String desp() {
        return "ID Vendedor: " + idVend + "\n"
                + "Nombre: " + nombre + " " + apellido + "\n"
                + "-----------------------------------\n";
    }

    @Override
    public String toString() {
        return "ID Vendedor: " + idVend + "\nNombre: " + nombre
                + "\nApellido: " + apellido + "\nTeléfono: " + telefono
                + "\nCorreo: " + correo;
    }
}
