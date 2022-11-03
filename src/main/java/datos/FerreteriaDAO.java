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

    private static final String SELECT_PRODUCTOS = "select * from productos";
    private static final String SELECT_CLIENTE = "select * from cliente";
    private static final String SELECT_PRODUCTOS_MAX = "select max(idProductos) from productos";
    private static final String SELECT_CLIENTE_MAX = "select max(idCliente) from cliente";
    private static final String SELECT_PROD_IDP = "select Productos_idProductos from producto_venta";
    private static final String SELECT_PROD_IDVent_WHERE = "select Ventas_idVenta from producto_venta where Ventas_idVenta = ?";
    private static final String SELECT_CLIENTE_ID = "select cliente_idCliente from FacturaNota";
    private static final String SELECT_PRODUCTOS_WHERE = "select * from productos where idProductos = ?";
    private static final String SELECT_CLIENTE_WHERE = "select * from cliente where idCliente = ?";
    private static final String SELECT_CLIENTE_WHERE_RFC = "select * from cliente where rfc = ?";
    private static final String SELECT_CLIENTE_WHERE_LIKE = "select rfc from cliente where rfc like ?";

    private static final String SELECT_PRODUCTOS_CANT = "select cantidad from productos where idProductos = ?";
    private static final String SELECT_VENDEDOR_ID = "select idVendedor from vendedor order by idVendedor asc";
    private static final String SELECT_VENDEDOR_WHERE = "select * from vendedor where idVendedor = ?";

    private static final String SELECT_FACNOTA_IS_NULL = "select idFactura_Nota from facturanota where descuento is null";
    private static final String SELECT_FACNOTA_IS_NOT_NULL = "select idFactura_Nota from facturanota where descuento is not null";
    private static final String SELECT_FACNOTA_WHERE = "select * from facturanota where idFactura_Nota = ?";

    private static final String UPDATE_PROD = "update productos set nombre = ?, precioU = ?, cantidad = ? where idProductos = ?";
    private static final String UDPATE_PROD_CANT = "update productos set cantidad = ? where idProductos = ?";

    private static final String DELETE_PROD_WHERE = "delete from productos where idProductos=?";
    private static final String DELETE_CLIENTE_WHERE = "delete from cliente where idCliente=?";

    private static final String INSERT_CLIENTE = "insert into cliente values(?,?,?,?,?,?,?)";
    private static final String INSERT_PROD = "insert into productos values (?,?,?,?)";
    private static final String INSERT_FAC = "insert into facturanota values (?,null,?,?,?,?)";
    private static final String INSERT_PROD_VENT = "insert into producto_venta values (?,?,?)";
    private static final String INSERT_VENTAS = "insert into ventas values (?,sysdate(),?,?,?)";
    private static final String INSERT_NOT = "insert into facturanota values (?,?,null,null,?,?)";

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

    public List<Cliente> listaCliente() {
        List<Cliente> listaCliente = new ArrayList<>();
        try {
            int idCliente;
            String nombre, apPat, apMat, rfc, correo, tel;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_CLIENTE);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idCliente = rs.getInt("idCliente");
                nombre = rs.getString("nombre");
                apPat = rs.getString("apellidoPat");
                apMat = rs.getString("apellidoMat");
                rfc = rs.getString("RFC");
                correo = rs.getString("correo");
                tel = rs.getString("telefono");
                listaCliente.add(new Cliente(idCliente, nombre, apPat, apMat, rfc, correo, tel));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return listaCliente;
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

    public List<Integer> listaIdCliente() {
        List<Integer> listaC = new ArrayList<>();
        try {
            int idCliente;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_CLIENTE);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idCliente = rs.getInt("idCliente");
                listaC.add(idCliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return listaC;
    }

    public List<String> listaRFCliente() {
        List<String> listaC = new ArrayList<>();
        try {
            String rfc;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_CLIENTE);
            rs = smtm.executeQuery();
            while (rs.next()) {
                rfc = rs.getString("rfc");
                listaC.add(rfc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return listaC;
    }

    public int listaIdMax() {
        int idP = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_PRODUCTOS_MAX);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idP = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return idP;
    }

    public int listaIdMaxCliente() {
        int idClienteMax = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_CLIENTE_MAX);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idClienteMax = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return idClienteMax;
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

    public int listaProdIdWhere(int idVenta) {
        int idV = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_PROD_IDVent_WHERE);
            smtm.setInt(1, idVenta);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idV = rs.getInt("Ventas_idVenta");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return idV;
    }

    public List<Integer> listaClienteFN() {
        List<Integer> listClienteFN = new ArrayList<>();
        try {
            int idCliente;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_CLIENTE_ID);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idCliente = rs.getInt("Cliente_idCliente");
                listClienteFN.add(idCliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return listClienteFN;
    }

    public List<String> listaClienteLikeRFC(String cliente_rfc) {
        List<String> listClienteRFC = new ArrayList<>();
        try {
            String rfc;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_CLIENTE_WHERE_LIKE);
            smtm.setString(1, cliente_rfc + "%");
            rs = smtm.executeQuery();
            while (rs.next()) {
                rfc = rs.getString("rfc");
                listClienteRFC.add(rfc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return listClienteRFC;
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

    public int listaCantidadP(int idProducto) {
        int cantidad = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_PRODUCTOS_WHERE);
            smtm.setInt(1, idProducto);
            rs = smtm.executeQuery();
            while (rs.next()) {
                cantidad = rs.getInt("cantidad");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return cantidad;
    }

    public Cliente listaClienteWhere(int ID) {
        Cliente c = null;
        try {
            int idCliente;
            String nombre, apPat, apMat, rfc, correo, tel;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_CLIENTE_WHERE);
            smtm.setInt(1, ID);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idCliente = rs.getInt("idCliente");
                nombre = rs.getString("nombre");
                apPat = rs.getString("apellidoPat");
                apMat = rs.getString("apellidoMat");
                rfc = rs.getString("RFC");
                correo = rs.getString("correo");
                tel = rs.getString("telefono");
                c = new Cliente(idCliente, nombre, apPat, apMat, rfc, correo, tel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return c;
    }

    public Cliente listaClienteWhereRFC(String cliente_rfc) {
        Cliente c = null;
        try {
            int idCliente;
            String nombre, apPat, apMat, rfc, correo, tel;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_CLIENTE_WHERE_RFC);
            smtm.setString(1, cliente_rfc);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idCliente = rs.getInt("idCliente");
                nombre = rs.getString("nombre");
                apPat = rs.getString("apellidoPat");
                apMat = rs.getString("apellidoMat");
                rfc = rs.getString("RFC");
                correo = rs.getString("correo");
                tel = rs.getString("telefono");
                c = new Cliente(idCliente, nombre, apPat, apMat, rfc, correo, tel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return c;
    }

    public int selectIdClienteRfc(String cliente_rfc) {
        int idCliente = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_CLIENTE_WHERE_RFC);
            smtm.setString(1, cliente_rfc);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idCliente = rs.getInt("idCliente");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return idCliente;
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

    public int listaVendWhereID(int ID) {
        int idVend = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_VENDEDOR_WHERE);
            smtm.setInt(1, ID);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idVend = rs.getInt("idVendedor");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(smtm);
            close(conn);
        }
        return idVend;
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
            int idFacturaNota, descuento, idVenta, idCliente;
            String rfc;
            double iva;
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_FACNOTA_WHERE);
            smtm.setInt(1, idFacNot);
            rs = smtm.executeQuery();
            while (rs.next()) {
                idFacturaNota = rs.getInt("idFactura_Nota");
                descuento = rs.getInt("descuento");
                rfc = rs.getString("rfc");
                iva = rs.getDouble("iva");
                idVenta = rs.getInt("Ventas_idVenta");
                idCliente = rs.getInt("Cliente_idCliente");
                fn = new FacturaNota(idFacturaNota, descuento, rfc, iva, idVenta, idCliente);
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

    public int listaFacturaNotaWhereID(int idFacNot) {
        int fn = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(SELECT_FACNOTA_WHERE);
            smtm.setInt(1, idFacNot);
            rs = smtm.executeQuery();
            while (rs.next()) {
                fn = rs.getInt("idFactura_Nota");
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

    public int deleteCW(int IdP) {
        int registros = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(DELETE_CLIENTE_WHERE);
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

    public int insertCliente(int idCliente, String nombre, String apPat,
            String apMat, String rfc, String correo, String tel) {
        int registros = 0;
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(INSERT_CLIENTE);
            smtm.setInt(1, idCliente);
            smtm.setString(2, nombre);
            smtm.setString(3, apPat);
            smtm.setString(4, apMat);
            smtm.setString(5, rfc);
            smtm.setString(6, correo);
            smtm.setString(7, tel);
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

    public int insertNota(int idNota, int desc, int idVenta, int idCliente) {
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            smtm = conn.prepareStatement(INSERT_NOT);
            smtm.setInt(1, idNota);
            smtm.setInt(2, desc);
            smtm.setInt(3, idVenta);
            smtm.setInt(4, idCliente);
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

    public int insertFacturaN(int idFact, String rfc, double iva, int idVenta, int idCliente) {
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            smtm = conn.prepareStatement(INSERT_FAC);
            smtm.setInt(1, idFact);
            smtm.setString(2, rfc);
            smtm.setDouble(3, iva);
            smtm.setInt(4, idVenta);
            smtm.setInt(5, idCliente);
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

    public int insertProductoVen(int idProd, int idVenta, int cantidad) {
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            smtm = conn.prepareStatement(INSERT_PROD_VENT);
            smtm.setInt(1, idProd);
            smtm.setInt(2, idVenta);
            smtm.setInt(3, cantidad);
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

    public int insertVent(int idVenta, double monto, double total, int idVendedor) {
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            smtm = conn.prepareStatement(INSERT_VENTAS);
            smtm.setInt(1, idVenta);
            smtm.setDouble(2, monto);
            smtm.setDouble(3, total);
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

}
