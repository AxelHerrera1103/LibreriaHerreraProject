package Controlador;
/**
 *
 * @author Grupo No.4
 */
import Modelo.ModeloGestion;
import Vista.VistaActualizacionProductos;
import Vista.VistaGestionInventario;
import Vista.VistaIngresoProductos;
import Vista.VistaVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorGestion implements ActionListener {
    
    Modelo.ModeloGestion modelo;

    public ControladorGestion(ModeloGestion modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(modelo.getVistaGestion().btnIngresoProductos.getActionCommand())){
            Vista.VistaIngresoProductos vingreso = new VistaIngresoProductos();
            vingreso.setVisible(true);
            modelo.getVistaGestion().dispose();
              
        }else if(e.getActionCommand().equals(modelo.getVistaGestion().btnVenta.getActionCommand())){
            Vista.VistaVentas vventas = new VistaVentas();
            vventas.setVisible(true);
            modelo.getVistaGestion().dispose();
        }else if(e.getActionCommand().equals(modelo.getVistaGestion().btnActualizacionProductos.getActionCommand())){
            Vista.VistaActualizacionProductos vActualizacion = new VistaActualizacionProductos();
            vActualizacion.setVisible(true);
            modelo.getVistaGestion().dispose();
        }
            
    }
    
}
