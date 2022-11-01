/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import static datos.Conexion.*;
import domain.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author rafael
 */
public class FerreteriaDAO {

    private Connection conn = null;
    private PreparedStatement smtm = null;
    private ResultSet rs = null;

    private Connection conexionTransaccional;

    private static final String SELECT_VENTAS = "select idVenta, fecha, monto, total from ventas";
    private static final String SELECT_PRODUCTOS = "select * from productos";
    private static final String SELECT_PROD_IDP = "select productos_idProductos from producto_venta";
    private static final String SELECT_PRODUCTOS_WHERE = "select * from productos where idProductos = ?";
    private static final String SELECT_PRODUCTOS_CANT = "select cantidad from productos where idProductos = ?";
    private static final String SELECT_VENDEDOR_ID = "select idVendedor from vendedor order by idVendedor asc";
    private static final String SELECT_VENDEDOR_WHERE = "select * from vendedor where idVendedor = ?";

    private static final String SELECT_FACNOTA_IS_NULL = "select idFactura_Nota from facturanota where descuento is null";
    private static final String SELECT_FACNOTA_IS_NOT_NULL = "select idFactura_Nota from facturanota where descuento is not null";
    private static final String SELECT_FACNOTA_WHERE = "select * from facturanota where idFactura_Nota = ?";
    private static final String SELECT_JOIN_VEND = "select v.idVenta, v.fecha, v.monto, v.total from facturanota f "
            + "join producto_venta p on (f.Producto_Venta_idPV = p.idPV) "
            + "join ventas v on(p.Ventas_idVenta = v.idVenta) "
            + "where f.idFactura_Nota = ?";

    private static final String UPDATE_PROD = "update productos set nombre = ?, precioU = ?, cantidad = ? where idProductos = ?";
    private static final String UDPATE_PROD_CANT = "update productos set cantidad = ? where idProductos = ?";

    private static final String DELETE_PROD_WHERE = "delete from productos where idProductos=?";

    private static final String INSERT_PROD = "insert into productos values (?,?,?,?)";
    private static final String INSERT_FAC = "insert into facturanota values (?,?,?,null,?,?,?)";
    private static final String INSERT_PROD_VENT = "insert into producto_venta values (?,?,?,?)";
    private static final String INSERT_VENTAS = "insert into ventas values (?,sysdate(),?,?)";
    private static final String INSERT_NOT = "insert into facturanota values (?,?,?,?,null,null,?)";

    public FerreteriaDAO() {

    }

    public FerreteriaDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Productos> listaP() {
        List<Productos> listaP = new ArrayList<>();
        try {
            int idP, cantidad;
            String nombre;
            double precio;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_PRODUCTOS);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idP = rs.getInt("idProductos");
                nombre = rs.getString("nombre");
                precio = rs.getDouble("precioU");
                cantidad = rs.getInt("cantidad");
                listaP.add(new Productos(idP, nombre, precio, cantidad));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return listaP;
    }

    public int cantidadP(int idProd) {
        int cant = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_PRODUCTOS_CANT);
            smtm.setInt(1, idProd);
            rs = smtm.executeQuery();
            while (rs.next()) {
                cant = rs.getInt("cantidad");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return cant;
    }

    public List<Integer> listaIdP() {
        List<Integer> listaP = new ArrayList<>();
        try {
            int idP;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_PRODUCTOS);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idP = rs.getInt("idProductos");
                listaP.add(idP);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return listaP;
    }

    public List<Integer> listaProdIdP() {
        List<Integer> listaPV = new ArrayList<>();
        try {
            int idP;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_PROD_IDP);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idP = rs.getInt("Productos_idProductos");
                listaPV.add(idP);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return listaPV;
    }

    public List<Integer> listaVendId() {
        List<Integer> listaPV = new ArrayList<>();
        try {
            int idVend;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_VENDEDOR_ID);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idVend = rs.getInt("idVendedor");
                listaPV.add(idVend);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return listaPV;
    }

    public Productos listaPWhere(int ID) {
        Productos p = null;
        try {
            int idP, cantidad;
            String nombre;
            double precio;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_PRODUCTOS_WHERE);
            smtm.setInt(1, ID);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idP = rs.getInt("idProductos");
                nombre = rs.getString("nombre");
                precio = rs.getDouble("precioU");
                cantidad = rs.getInt("cantidad");
                p = new Productos(idP, nombre, precio, cantidad);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return p;
    }

    public Vendedor listaVendWhere(int ID) {
        Vendedor v = null;
        try {
            int idVend;
            String nombre, apellido, telefono, correo;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_VENDEDOR_WHERE);
            smtm.setInt(1, ID);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idVend = rs.getInt("idVendedor");
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
                telefono = rs.getString("telefono");
                correo = rs.getString("correo");
                v = new Vendedor(idVend, nombre, apellido, telefono, correo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return v;
    }

    public List<Integer> listaFacNotIsNull() {
        List<Integer> listaFNin = new ArrayList<>();
        try {
            int idFacNot;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_FACNOTA_IS_NULL);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idFacNot = rs.getInt("idFactura_Nota");
                listaFNin.add(idFacNot);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return listaFNin;
    }

    public List<Integer> listaFacNotIsNotNull() {
        List<Integer> listaFNinn = new ArrayList<>();
        try {
            int idFacNot;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_FACNOTA_IS_NOT_NULL);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idFacNot = rs.getInt("idFactura_Nota");
                listaFNinn.add(idFacNot);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return listaFNinn;
    }

    public FacturaNota listaFacturaNotaWhere(int idFacNot) {
        FacturaNota fn = null;
        try {
            int idFacturaNota, cantidad, descuento, prod_VentIdPV;
            String producto, rfc;
            double iva;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_FACNOTA_WHERE);
            smtm.setInt(1, idFacNot);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idFacturaNota = rs.getInt("idFactura_Nota");
                producto = rs.getString("producto");
                cantidad = rs.getInt("cantidad");
                descuento = rs.getInt("descuento");
                rfc = rs.getString("rfc");
                iva = rs.getDouble("iva");
                prod_VentIdPV = rs.getInt("Producto_Venta_idPV");
                fn = new FacturaNota(idFacturaNota, producto, cantidad, descuento, rfc, iva, prod_VentIdPV);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return fn;
    }

    public Ventas listaVentasWhere(int idFacNot) {
        Ventas v = null;
        try {
            int idVenta;
            String fecha;
            double monto, total;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_JOIN_VEND);
            smtm.setInt(1, idFacNot);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idVenta = rs.getInt("idVenta");
                fecha = String.valueOf(rs.getDate("fecha"));
                monto = rs.getDouble("monto");
                total = rs.getDouble("total");
                v = new Ventas(idVenta, fecha, monto, total);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return v;
    }

    public int actualizarP(String nombre, double precio, int cantidad, int IdP) {
        int registros = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(UPDATE_PROD);
            smtm.setString(1, nombre);
            smtm.setDouble(2, precio);
            smtm.setInt(3, cantidad);
            smtm.setInt(4, IdP);
            registros = smtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(smtm);
            close(conn);
        }
        return registros;
    }

    public int actualizarPcant(int cantidad, int IdP) {
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            smtm = conn.prepareStatement(UDPATE_PROD_CANT);
            smtm.setInt(1, cantidad);
            smtm.setInt(2, IdP);
            registros = smtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(smtm);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return registros;
    }

    public int deletePW(int IdP) {
        int registros = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(DELETE_PROD_WHERE);
            smtm.setInt(1, IdP);
            registros = smtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(smtm);
            close(conn);
        }
        return registros;
    }

    public int insertP(int idP, String nombre, double precio, int cantidad) {
        int registros = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(INSERT_PROD);
            smtm.setInt(1, idP);
            smtm.setString(2, nombre);
            smtm.setDouble(3, precio);
            smtm.setInt(4, cantidad);
            registros = smtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(smtm);
            close(conn);
        }
        return registros;
    }

    public int insertNota(int idNota, String prod, int cant, int desc, int idProd) {
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            smtm = conn.prepareStatement(INSERT_NOT);
            smtm.setInt(1, idNota);
            smtm.setString(2, prod);
            smtm.setInt(3, cant);
            smtm.setInt(4, desc);
            smtm.setInt(5, idProd);
            registros = smtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(smtm);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return registros;
    }

    public int insertFacturaN(int idFactN, String prod, int cant, String rfc,
            double iva, int idProd) {
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            smtm = conn.prepareStatement(INSERT_FAC);
            smtm.setInt(1, idFactN);
            smtm.setString(2, prod);
            smtm.setInt(3, cant);
            smtm.setString(4, rfc);
            smtm.setDouble(5, iva);
            smtm.setInt(6, idProd);
            registros = smtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(smtm);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return registros;
    }

    public int insertProductoVen(int idPV, int idProd, int idVenta, int idVendedor) {
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            smtm = conn.prepareStatement(INSERT_PROD_VENT);
            smtm.setInt(1, idPV);
            smtm.setInt(2, idProd);
            smtm.setInt(3, idVenta);
            smtm.setInt(4, idVendedor);
            registros = smtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(smtm);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return registros;
    }

    public int insertVent(int idVenta, double monto, double total) {
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            smtm = conn.prepareStatement(INSERT_VENTAS);
            smtm.setInt(1, idVenta);
            smtm.setDouble(2, monto);
            smtm.setDouble(3, total);
            registros = smtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(smtm);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return registros;
    }

}
