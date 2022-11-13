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
 * @author Equipo1
 */
public class FerreteriaDAO {

    private static Connection conn = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    private Connection conexionTransaccional;

    private static final String SELECT_PRODUCTOS = "select * from productos";
    private static final String SELECT_CLIENTE = "select * from cliente where idCliente <> 0";
    private static final String SELECT_CLIENTE_RFC_NOT_NULL = "select * from cliente where rfc <> 'NULL'";
    private static final String SELECT_CLIENTE_WHERE_CORREO = "select * from cliente where correo = ?";
    private static final String SELECT_PRODUCTOS_MAX = "select max(idProductos) from productos";
    private static final String SELECT_CLIENTE_MAX = "select max(idCliente) from cliente where idCliente <> 0";
    private static final String SELECT_PROD_IDP = "select Productos_idProductos from producto_venta";
    private static final String SELECT_CLIENTE_ID = "select cliente_idCliente from FacturaNota";
    private static final String SELECT_PRODUCTOS_WHERE = "select * from productos where idProductos = ?";
    private static final String SELECT_PRODUCTOS_WHERE_NOMBRE = "select * from productos where nombre = ?";
    private static final String SELECT_CLIENTE_WHERE = "select * from cliente where idCliente = ?";
    private static final String SELECT_CLIENTE_WHERE_RFC = "select * from cliente where rfc = ?";
    private static final String SELECT_CLIENTE_WHERE_LIKE = "select rfc from cliente where rfc like ? and rfc <> 'NULL'";
    private static final String SELECT_CLIENTE_WHERE_LIKE_CORREO = "select correo from cliente where correo like ? and idCliente <> 0";
    private static final String SELECT_CLIENTE_CORREO = "select correo from cliente where idCliente <> 0";

    private static final String SELECT_PRODUCTOS_CANT = "select cantidad from productos where idProductos = ?";
    private static final String SELECT_VENDEDOR_ID = "select idVendedor from vendedor order by idVendedor asc";
    private static final String SELECT_VENDEDOR_WHERE = "select * from vendedor where idVendedor = ?";

    private static final String SELECT_FACNOTA_IS_NULL = "select idFactura_Nota from facturanota where descuento is null";
    private static final String SELECT_FACNOTA_IS_NOT_NULL = "select idFactura_Nota from facturanota where descuento is not null";
    private static final String SELECT_FACNOTA_WHERE = "select * from facturanota where idFactura_Nota = ?";
    private static final String SELECT_PRODVENTA_CANTIDAD = "select cantidad from producto_venta "
            + "where Ventas_idVenta = ? and Productos_idProductos = ?";
    private static final String SELECT_FACNOTA_WHERE_PROD_IDFACT = "select p.idProductos, p.nombre, p.precioU, p.cantidad "
            + "from facturanota f join ventas v on (f.Ventas_idVenta = v.idVenta) "
            + "join producto_venta pv on (v.idVenta = pv.Ventas_idVenta) "
            + "join productos p on (pv.Productos_idProductos = p.idProductos) "
            + "where idFactura_Nota = ?";
    private static final String SELECT_FACNOTA_WHERE_VENT_IDFACT = "select v.idVenta, date_format(v.fecha, \"%d-%m-%Y\"), v.monto, v.total, v.Vendedor_idVendedor "
            + "from facturanota f join ventas v on (f.Ventas_idVenta = v.idVenta) where idFactura_Nota = ?";
    private static final String SELECT_FACNOTA_WHERE_VEND_IDFACT = "select vend.idVendedor, vend.nombre, vend.apellido, vend.telefono, "
            + "vend.correo from facturanota f join ventas v on (f.Ventas_idVenta = v.idVenta) "
            + "join vendedor vend on (v.Vendedor_idVendedor = vend.idVendedor) where idFactura_Nota = ?";
    private static final String SELECT_FACNOTA_WHERE_CLIEN_FACT = "select c.idCliente, c.nombre, c.apellidoPat, c.apellidoMat, c.RFC, c.correo "
            + "from facturanota f join cliente c on (f.cliente_idCliente = c.idCliente) where idFactura_Nota = ?";
    private static final String SELECT_FACNOTA_WHERE_CLIEN_NOTA = "select c.idCliente, c.nombre, c.apellidoPat, c.apellidoMat, c.correo "
            + "from facturanota f join cliente c on (f.cliente_idCliente = c.idCliente) where idFactura_Nota =  ?";

    private static final String UPDATE_PROD = "update productos set nombre = ?, precioU = ?, cantidad = ? where idProductos = ?";
    private static final String UPDATE_PROD_CANT = "update productos set cantidad = ? where idProductos = ?";
    private static final String UPDATE_CLIENTE = "update cliente set nombre = ?, apellidoPat = ?, apellidoMat = ?, "
            + "RFC = ?, correo = ?, telefono = ? where idCliente = ?";
    private static final String UPDATE_CLIENTE_2 = "update cliente set RFC = ?, correo = ?, telefono = ? where idCliente = ?";

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

    private static List select(String tabla, String[] atributos, String[] whereAtributos) {
        List list = new ArrayList();
        try {
            conn = getConnection();
            int comas = atributos.length - 1;;
            String s = "select ";
            for (int i = 0; i < atributos.length; i++) {
                if (atributos.length == 1) {
                    s += atributos[i];
                } else {
                    s += atributos[i];
                    if (i < comas) {
                        s += ", ";
                    }
                }
            }
            s += " from " + tabla;
            ps = conn.prepareStatement(s);
            rs = ps.executeQuery();

            if (whereAtributos != null) {
                s += " where ";
                for (int i = 0; i < whereAtributos.length; i++) {
                    if (whereAtributos.length == 1) {
                        s += whereAtributos[i] + " = ?";
                    } else {
                        s += whereAtributos[i] + " = ?";
                        if (i < comas) {
                            s += ", ";
                        }
                    }
                }
            }

            int num;
            if (tabla.equalsIgnoreCase("cliente where idCliente <> 0")) {
                list = new ArrayList<Cliente>();
                num = 1;
            } else if (tabla.equalsIgnoreCase("facturanota")) {
                list = new ArrayList<FacturaNota>();
                num = 2;
            } else if (tabla.equalsIgnoreCase("productos")) {
                list = new ArrayList<Productos>();
                num = 3;
            } else if (tabla.equalsIgnoreCase("vendedor")) {
                list = new ArrayList<Vendedor>();
                num = 4;
            } else {
                list = new ArrayList<Ventas>();
                num = 5;
            }

            switch (num) {
                case 1:
                    int idCliente;
                    String nombre,
                     apPat,
                     apMat,
                     rfc,
                     correo,
                     tel;
                    while (rs.next()) {
                        idCliente = rs.getInt("idCliente");
                        nombre = rs.getString("nombre");
                        apPat = rs.getString("apellidoPat");
                        apMat = rs.getString("apellidoMat");
                        rfc = rs.getString("RFC");
                        correo = rs.getString("correo");
                        tel = rs.getString("telefono");
                        list.add(new Cliente(idCliente, nombre, apPat, apMat, rfc, correo, tel));
                    }
                    break;
                case 2:

                    break;
                case 3:
                    int idP = -1,
                     cantidad = -1;
                    nombre = "";
                    double precio = -1.0;
                    if (atributos.length == 1 && atributos[0].equals("*")) {
                        while (rs.next()) {
                            idP = rs.getInt("idProductos");
                            nombre = rs.getString("nombre");
                            precio = rs.getDouble("precioU");
                            cantidad = rs.getInt("cantidad");
                            list.add(new Productos(idP, nombre, precio, cantidad));
                        }
                    } else {
                        for (int i = 0; i < atributos.length; i++) {
                            if (atributos[i].equalsIgnoreCase("idProductos")) {
                                idP = 1;
                            } else if (atributos[i].equalsIgnoreCase("nombre")) {
                                nombre = "nombre";
                            } else if (atributos[i].equalsIgnoreCase("precioU")) {
                                precio = 1.0;
                            } else if (atributos[i].equalsIgnoreCase("cantidad")) {
                                cantidad = 1;
                            }
                        }
                        while (rs.next()) {
                            if (idP != -1) {
                                idP = rs.getInt("idProductos");
                            }
                            if (nombre != "") {
                                nombre = rs.getString("nombre");
                            }
                            if (precio != -1.0) {
                                precio = rs.getDouble("precioU");
                            }
                            if (cantidad != -1) {
                                cantidad = rs.getInt("cantidad");
                            }
                            list.add(new Productos(idP, nombre, precio, cantidad));
                        }
                    }
                    break;
                case 4:

                    break;
                case 5:

                    break;
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return list;
    }

    public static List<Productos> selectProductos() {
        List list = select("productos", new String[]{"nombre", "precioU"}, null);
        return list;
    }

    public static List<Cliente> selectCliente() {
        List list = select("cliente where idCliente <> 0", new String[]{"*"}, null);
        return list;
    }

    public static void main(String[] args) {
        List list = selectProductos();
        list.forEach(object -> {
            System.out.println(object);
        });
    }

    public List<Productos> listaP() {
        List<Productos> listaP = new ArrayList<>();
        try {
            int idP, cantidad;
            String nombre;
            double precio;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_PRODUCTOS);
            rs = ps.executeQuery();
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
            close(ps);
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
            ps = conn.prepareStatement(SELECT_CLIENTE);
            rs = ps.executeQuery();
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
            close(ps);
            close(conn);
        }
        return listaCliente;
    }

    public int cantidadP(int idProd) {
        int cant = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_PRODUCTOS_CANT);
            ps.setInt(1, idProd);
            rs = ps.executeQuery();
            while (rs.next()) {
                cant = rs.getInt("cantidad");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return cant;
    }

    public List<Integer> listaIdP() {
        List<Integer> listaP = new ArrayList<>();
        try {
            int idP;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_PRODUCTOS);
            rs = ps.executeQuery();
            while (rs.next()) {
                idP = rs.getInt("idProductos");
                listaP.add(idP);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return listaP;
    }

    public List<String> listaProductos() {
        List<String> listaP = new ArrayList<>();
        try {
            String productos;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_PRODUCTOS);
            rs = ps.executeQuery();
            while (rs.next()) {
                productos = rs.getString("nombre");
                listaP.add(productos);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return listaP;
    }

    public List<Integer> listaIdCliente() {
        List<Integer> listaC = new ArrayList<>();
        try {
            int idCliente;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_CLIENTE);
            rs = ps.executeQuery();
            while (rs.next()) {
                idCliente = rs.getInt("idCliente");
                listaC.add(idCliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return listaC;
    }

    public List<String> listaRFCliente() {
        List<String> listaC = new ArrayList<>();
        try {
            String rfc;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_CLIENTE_RFC_NOT_NULL);
            rs = ps.executeQuery();
            while (rs.next()) {
                rfc = rs.getString("rfc");
                listaC.add(rfc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return listaC;
    }

    public List<String> listaCorreoCliente() {
        List<String> listaC = new ArrayList<>();
        try {
            String correo;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_CLIENTE_CORREO);
            rs = ps.executeQuery();
            while (rs.next()) {
                correo = rs.getString("correo");
                listaC.add(correo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return listaC;
    }

    public Cliente listaClienteWhereCorreo(String cliente_correo) {
        Cliente c = null;
        try {
            int idCliente;
            String nombre, apPat, apMat, rfc, correo, tel;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_CLIENTE_WHERE_CORREO);
            ps.setString(1, cliente_correo);
            rs = ps.executeQuery();
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
            close(ps);
            close(conn);
        }
        return c;
    }

    public int listaIdMax() {
        int idP = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_PRODUCTOS_MAX);
            rs = ps.executeQuery();
            while (rs.next()) {
                idP = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return idP;
    }

    public int listaIdMaxCliente() {
        int idClienteMax = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_CLIENTE_MAX);
            rs = ps.executeQuery();
            while (rs.next()) {
                idClienteMax = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return idClienteMax;
    }

    public List<Integer> listaProdIdP() {
        List<Integer> listaPV = new ArrayList<>();
        try {
            int idP;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_PROD_IDP);
            rs = ps.executeQuery();
            while (rs.next()) {
                idP = rs.getInt("Productos_idProductos");
                listaPV.add(idP);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return listaPV;
    }

    public List<Integer> listaClienteFN() {
        List<Integer> listClienteFN = new ArrayList<>();
        try {
            int idCliente;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_CLIENTE_ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                idCliente = rs.getInt("Cliente_idCliente");
                listClienteFN.add(idCliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return listClienteFN;
    }

    public List<String> listaClienteLikeRFC(String cliente_rfc) {
        List<String> listClienteRFC = new ArrayList<>();
        try {
            String rfc;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_CLIENTE_WHERE_LIKE);
            ps.setString(1, cliente_rfc + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                rfc = rs.getString("rfc");
                listClienteRFC.add(rfc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return listClienteRFC;
    }

    public List<String> listaClienteLikeCorreo(String correo) {
        List<String> listClienteCorreo = new ArrayList<>();
        try {
            String c;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_CLIENTE_WHERE_LIKE_CORREO);
            ps.setString(1, correo + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                c = rs.getString("correo");
                listClienteCorreo.add(c);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return listClienteCorreo;
    }

    public List<Integer> listaVendId() {
        List<Integer> listaPV = new ArrayList<>();
        try {
            int idVend;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_VENDEDOR_ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                idVend = rs.getInt("idVendedor");
                listaPV.add(idVend);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
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
            ps = conn.prepareStatement(SELECT_PRODUCTOS_WHERE);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
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
            close(ps);
            close(conn);
        }
        return p;
    }

    public Productos listaPWhere(String nomProducto) {
        Productos p = null;
        try {
            int idP, cantidad;
            String nombre;
            double precio;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_PRODUCTOS_WHERE_NOMBRE);
            ps.setString(1, nomProducto);
            rs = ps.executeQuery();
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
            close(ps);
            close(conn);
        }
        return p;
    }

    public int listaCantidadP(int idProducto) {
        int cantidad = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_PRODUCTOS_WHERE);
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            while (rs.next()) {
                cantidad = rs.getInt("cantidad");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
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
            ps = conn.prepareStatement(SELECT_CLIENTE_WHERE);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
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
            close(ps);
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
            ps = conn.prepareStatement(SELECT_CLIENTE_WHERE_RFC);
            ps.setString(1, cliente_rfc);
            rs = ps.executeQuery();
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
            close(ps);
            close(conn);
        }
        return c;
    }

    public int selectIdClienteRfc(String cliente_rfc) {
        int idCliente = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_CLIENTE_WHERE_RFC);
            ps.setString(1, cliente_rfc);
            rs = ps.executeQuery();
            while (rs.next()) {
                idCliente = rs.getInt("idCliente");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
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
            ps = conn.prepareStatement(SELECT_VENDEDOR_WHERE);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
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
            close(ps);
            close(conn);
        }
        return v;
    }

    public int listaVendWhereID(int ID) {
        int idVend = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_VENDEDOR_WHERE);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                idVend = rs.getInt("idVendedor");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return idVend;
    }

    public List<Integer> listaFacNotIsNull() {
        List<Integer> listaFNin = new ArrayList<>();
        try {
            int idFacNot;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_FACNOTA_IS_NULL);
            rs = ps.executeQuery();
            while (rs.next()) {
                idFacNot = rs.getInt("idFactura_Nota");
                listaFNin.add(idFacNot);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return listaFNin;
    }

    public List<Integer> listaFacNotIsNotNull() {
        List<Integer> listaFNinn = new ArrayList<>();
        try {
            int idFacNot;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_FACNOTA_IS_NOT_NULL);
            rs = ps.executeQuery();
            while (rs.next()) {
                idFacNot = rs.getInt("idFactura_Nota");
                listaFNinn.add(idFacNot);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
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
            ps = conn.prepareStatement(SELECT_FACNOTA_WHERE);
            ps.setInt(1, idFacNot);
            rs = ps.executeQuery();
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
            close(ps);
            close(conn);
        }
        return fn;
    }

    public int listaFacturaNotaWhereID(int idFacNot) {
        int fn = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_FACNOTA_WHERE);
            ps.setInt(1, idFacNot);
            rs = ps.executeQuery();
            while (rs.next()) {
                fn = rs.getInt("idFactura_Nota");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return fn;
    }

    public int listaProdVentCant(int idVenta, int idProd) {
        int cantidad = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_PRODVENTA_CANTIDAD);
            ps.setInt(1, idVenta);
            ps.setInt(2, idProd);
            rs = ps.executeQuery();
            while (rs.next()) {
                cantidad = rs.getInt("cantidad");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return cantidad;
    }

    public List<Productos> listaFNotaWhereP(int idFacNot) {
        List<Productos> p = new ArrayList<>();
        try {
            int idProd, cantidad;
            String nombre;
            double precio;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_FACNOTA_WHERE_PROD_IDFACT);
            ps.setInt(1, idFacNot);
            rs = ps.executeQuery();
            while (rs.next()) {
                idProd = rs.getInt("p.idProductos");
                nombre = rs.getString("p.nombre");
                precio = rs.getDouble("p.precioU");
                cantidad = rs.getInt("p.cantidad");
                p.add(new Productos(idProd, nombre, precio, cantidad));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return p;
    }

    public Ventas listaFNotaWhereVent(int idFacNot) {
        Ventas v = null;
        try {
            int idVenta, Vendedor_idVend;
            String fecha;
            double monto, total;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_FACNOTA_WHERE_VENT_IDFACT);
            ps.setInt(1, idFacNot);
            rs = ps.executeQuery();
            while (rs.next()) {
                idVenta = rs.getInt("v.idVenta");
                fecha = rs.getString("date_format(v.fecha, \"%d-%m-%Y\")");
                monto = rs.getDouble("v.monto");
                total = rs.getDouble("v.total");
                Vendedor_idVend = rs.getInt("v.Vendedor_idVendedor");
                v = new Ventas(idVenta, fecha, monto, total, Vendedor_idVend);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return v;
    }

    public Vendedor listaFNotaWhereVend(int idFacNot) {
        Vendedor vendedor = null;
        try {
            int idVenta;
            String nombre, apellido, telefono, correo;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_FACNOTA_WHERE_VEND_IDFACT);
            ps.setInt(1, idFacNot);
            rs = ps.executeQuery();
            while (rs.next()) {
                idVenta = rs.getInt("vend.idVendedor");
                nombre = rs.getString("vend.nombre");
                apellido = rs.getString("vend.apellido");
                telefono = rs.getString("vend.telefono");
                correo = rs.getString("vend.correo");
                vendedor = new Vendedor(idVenta, nombre, apellido, telefono, correo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return vendedor;
    }

    public Cliente listaFNotaWhereClienteFact(int idFacNot) {
        Cliente c = null;
        try {
            int idCliente;
            String nombre, apPat, apMat, rfc, correo;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_FACNOTA_WHERE_CLIEN_FACT);
            ps.setInt(1, idFacNot);
            rs = ps.executeQuery();
            while (rs.next()) {
                idCliente = rs.getInt("c.idCliente");
                nombre = rs.getString("c.nombre");
                apPat = rs.getString("c.apellidoPat");
                apMat = rs.getString("c.apellidoMat");
                rfc = rs.getString("c.RFC");
                correo = rs.getString("c.correo");
                c = new Cliente(idCliente, nombre, apPat, apMat, rfc, correo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return c;
    }

    public Cliente listaFNotaWhereClienteNota(int idFacNot) {
        Cliente c = null;
        try {
            int idCliente;
            String nombre, apPat, apMat, correo;
            conn = getConnection();
            ps = conn.prepareStatement(SELECT_FACNOTA_WHERE_CLIEN_NOTA);
            ps.setInt(1, idFacNot);
            rs = ps.executeQuery();
            while (rs.next()) {
                idCliente = rs.getInt("c.idCliente");
                nombre = rs.getString("c.nombre");
                apPat = rs.getString("c.apellidoPat");
                apMat = rs.getString("c.apellidoMat");
                correo = rs.getString("c.correo");
                c = new Cliente(idCliente, nombre, apPat, apMat, correo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(rs);
            close(ps);
            close(conn);
        }
        return c;
    }

    public int actualizarP(String nombre, double precio, int cantidad, int IdP) {
        int registros = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(UPDATE_PROD);
            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            ps.setInt(3, cantidad);
            ps.setInt(4, IdP);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
            close(conn);
        }
        return registros;
    }

    public int actualizarPcant(int cantidad, int IdP) {
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            ps = conn.prepareStatement(UPDATE_PROD_CANT);
            ps.setInt(1, cantidad);
            ps.setInt(2, IdP);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return registros;
    }

    public int actualizarCliente(String nombre, String apPat, String apMat,
            String rfc, String correo, String tel, int idCliente) {
        int registros = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(UPDATE_CLIENTE);
            ps.setString(1, nombre);
            ps.setString(2, apPat);
            ps.setString(3, apMat);
            ps.setString(4, rfc);
            ps.setString(5, correo);
            ps.setString(6, tel);
            ps.setInt(7, idCliente);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
            close(conn);
        }
        return registros;
    }

    public int actualizarCliente(String rfc, String correo, String tel, int idCliente) {
        int registros = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(UPDATE_CLIENTE_2);
            ps.setString(1, rfc);
            ps.setString(2, correo);
            ps.setString(3, tel);
            ps.setInt(4, idCliente);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
            close(conn);
        }
        return registros;
    }

    public int deletePW(int IdP) {
        int registros = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(DELETE_PROD_WHERE);
            ps.setInt(1, IdP);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
            close(conn);
        }
        return registros;
    }

    public int deleteCW(int IdP) {
        int registros = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(DELETE_CLIENTE_WHERE);
            ps.setInt(1, IdP);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
            close(conn);
        }
        return registros;
    }

    public int insertCliente(int idCliente, String nombre, String apPat,
            String apMat, String rfc, String correo, String tel) {
        int registros = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(INSERT_CLIENTE);
            ps.setInt(1, idCliente);
            ps.setString(2, nombre);
            ps.setString(3, apPat);
            ps.setString(4, apMat);
            ps.setString(5, rfc);
            ps.setString(6, correo);
            ps.setString(7, tel);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
            close(conn);
        }
        return registros;
    }

    public int insertP(int idP, String nombre, double precio, int cantidad) {
        int registros = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(INSERT_PROD);
            ps.setInt(1, idP);
            ps.setString(2, nombre);
            ps.setDouble(3, precio);
            ps.setInt(4, cantidad);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
            close(conn);
        }
        return registros;
    }

    public int insertNota(int idNota, int desc, int idVenta, int idCliente) {
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            ps = conn.prepareStatement(INSERT_NOT);
            ps.setInt(1, idNota);
            ps.setInt(2, desc);
            ps.setInt(3, idVenta);
            ps.setInt(4, idCliente);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
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
            ps = conn.prepareStatement(INSERT_FAC);
            ps.setInt(1, idFact);
            ps.setString(2, rfc);
            ps.setDouble(3, iva);
            ps.setInt(4, idVenta);
            ps.setInt(5, idCliente);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
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
            ps = conn.prepareStatement(INSERT_PROD_VENT);
            ps.setInt(1, idProd);
            ps.setInt(2, idVenta);
            ps.setInt(3, cantidad);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
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
            ps = conn.prepareStatement(INSERT_VENTAS);
            ps.setInt(1, idVenta);
            ps.setDouble(2, monto);
            ps.setDouble(3, total);
            ps.setInt(4, idVendedor);
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            close(ps);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return registros;
    }

}
