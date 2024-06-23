package Modelo;

import Vista.VistaIngresoProductos;

public class ModeloProducto {
    private String nombreProducto;
    private int cantidadProducto;
    private String codigoProducto;
    private double precioProducto;
    private double precioVentaProducto;
    private VistaIngresoProductos vistaP;

    public ModeloProducto() {
    }

    public ModeloProducto(VistaIngresoProductos vistaP) {
        this.vistaP = vistaP;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getPrecioVentaProducto() {
        return precioVentaProducto;
    }

    public void setPrecioVentaProducto(double precioVentaProducto) {
        this.precioVentaProducto = precioVentaProducto;
    }

    public VistaIngresoProductos getVistaP() {
        return vistaP;
    }

    public void setVistaP(VistaIngresoProductos vistaP) {
        this.vistaP = vistaP;
    }
    
    
}

