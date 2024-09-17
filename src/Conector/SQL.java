package Conector;

public class SQL {
    // informes
    private final String CONSULTA_DETALLES_VENTA = "SELECT * FROM detalle_venta";
    private final String CONSULTA_DETALLE_VENTA_ID = "SELECT * FROM detalle_venta WHERE id_detalle_ventas = ?";
    
    public SQL() {
    }

    public String getCONSULTA_DETALLES_VENTA() {
        return CONSULTA_DETALLES_VENTA;
    }

    public String getCONSULTA_DETALLE_VENTA_ID() {
        return CONSULTA_DETALLE_VENTA_ID;
    }

// productos
    private final String CONSULTA_PRODUCTOS = "SELECT * FROM producto";
    private final String CONSULTA_PRODUCTO_ID = "SELECT * FROM producto WHERE id_producto = ?";
    private final String INSERTAR_PRODUCTO = "INSERT INTO producto (nombre_producto, cantidad_producto, precio_producto, precio_venta_producto, id_proveedor) VALUES (?, ?, ?, ?, ?)";
    private final String ELIMINAR_PRODUCTO = "DELETE FROM producto WHERE id_producto = ?";
    private final String ACTUALIZAR_PRODUCTO = "UPDATE producto SET nombre_producto = ?, cantidad_producto = ?, precio_producto = ?, precio_venta_producto = ?, id_proveedor = ? WHERE id_producto = ?";

    public String getCONSULTA_PRODUCTOS() {
        return CONSULTA_PRODUCTOS;
    }

    public String getCONSULTA_PRODUCTO_ID() {
        return CONSULTA_PRODUCTO_ID;
    }

    public String getINSERTAR_PRODUCTO() {
        return INSERTAR_PRODUCTO;
    }

    public String getELIMINAR_PRODUCTO() {
        return ELIMINAR_PRODUCTO;
    }

    public String getACTUALIZAR_PRODUCTO() {
        return ACTUALIZAR_PRODUCTO;
    }
// Panel venta
    private final String CONSULTA_VENTAS = "SELECT * FROM venta";
    private final String CONSULTA_VENTA_ID = "SELECT * FROM venta WHERE id_venta = ?";
    private final String INSERTAR_VENTA = "INSERT INTO venta (fecha_venta, id_empleado) VALUES (?, ?)";
    private final String ELIMINAR_VENTA = "DELETE FROM venta WHERE id_venta = ?";
    private final String ACTUALIZAR_VENTA = "UPDATE venta SET fecha_venta = ?, id_empleado = ? WHERE id_venta = ?";

    public String getCONSULTA_VENTAS() {
        return CONSULTA_VENTAS;
    }

    public String getCONSULTA_VENTA_ID() {
        return CONSULTA_VENTA_ID;
    }

    public String getINSERTAR_VENTA() {
        return INSERTAR_VENTA;
    }

    public String getELIMINAR_VENTA() {
        return ELIMINAR_VENTA;
    }

    public String getACTUALIZAR_VENTA() {
        return ACTUALIZAR_VENTA;
    }
    // REGISTRO USUARIO CREO 
    //  empleado
    
    private final String CONSULTA_EMPLEADOS = "SELECT * FROM empleado";
    private final String CONSULTA_EMPLEADO_ID = "DELETE FROM empleado WHERE id_empleado = ?";
    /*
    private final String INSERTAR_EMPLEADO = "INSERT INTO empleado (nombre_empleado, apellido_empleado, id_telefono_empleado, id_puesto_empleado) VALUES (?, ?, ?, ?)" ; 
    private final String ELIMINAR_EMPLEADO = "DELETE FROM empleado WHERE id_empleado";
    private final String ACTUALIZAR_EMPLEADO = "UPDATE empleado SET nombre_empleado = ?, apellido_empleado = ?, id_telefono_empleado = ?, id_puesto_empleado = ? WHERE id_empleado = ?";

    public String getINSERTAR_EMPLEADO() {
        return INSERTAR_EMPLEADO;
    }

    public String getELIMINAR_EMPLEADO() {
        return ELIMINAR_EMPLEADO;
    }

    public String getACTUALIZAR_EMPLEADO() {
        return ACTUALIZAR_EMPLEADO;
    }
    POR SI ACASO
    */
    public String getCONSULTA_EMPLEADOS() {
        return CONSULTA_EMPLEADOS;
    }

    public String getCONSULTA_EMPLEADO_ID() {
        return CONSULTA_EMPLEADO_ID;
    }
    
//PUESTOS 
     private final String CONSULTA_PUESTOS = "SELECT * FROM puestoEmpleado";
    private final String CONSULTA_PUESTO_ID = "SELECT * FROM puestoEmpleado WHERE id_puesto_empleado = ?";
   
    public String getCONSULTA_PUESTOS() {
        return CONSULTA_PUESTOS;
    }

    public String getCONSULTA_PUESTO_ID() {
        return CONSULTA_PUESTO_ID;
    }

   /* public String getINSERTAR_PUESTO() {
        return INSERTAR_PUESTO;
    }

    public String getELIMINAR_PUESTO() {
        return ELIMINAR_PUESTO;
    }

    public String getACTUALIZAR_PUESTO() {
        return ACTUALIZAR_PUESTO;
    }
     private final String INSERTAR_PUESTO = "INSERT INTO puestoEmpleado (puesto_Empleado) VALUES (?)";
    private final String ELIMINAR_PUESTO = "DELETE FROM puestoEmpleado WHERE id_puesto_empleado = ?";
    private final String ACTUALIZAR_PUESTO = "UPDATE puestoEmpleado SET puesto_Empleado = ? WHERE id_puesto_empleado = ?";

    por si acaso se necesita 
*/ 
    
    // telefono
    private final String CONSULTA_TELEFONOS = "SELECT * FROM telefonoEmpleado";
    private final String CONSULTA_TELEFONO_ID = "SELECT * FROM telefonoEmpleado WHERE id_telefono_empleado = ?";

    public String getCONSULTA_TELEFONOS() {
        return CONSULTA_TELEFONOS;
    }

    public String getCONSULTA_TELEFONO_ID() {
        return CONSULTA_TELEFONO_ID;
    }
    
    //usuarios
    private final String CONSULTA_USUARIO = "SELECT usuario, contraseña, id_tipo_usuario FROM usuarios WHERE usuario = ? AND contraseña = ?";

    public String getCONSULTA_USUARIO() {
        return CONSULTA_USUARIO;
    }
    
}
