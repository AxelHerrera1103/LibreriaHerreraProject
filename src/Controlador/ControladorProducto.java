package Controlador;

import Modelo.ModeloProducto;
import Vista.VistaGestionInventario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorProducto implements ActionListener{
    
    ModeloProducto modelo;
    ArrayList<ModeloProducto> baseDatos = new ArrayList<>();

    public ControladorProducto(ModeloProducto modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(modelo.getVistaAP() == null && modelo.getVistaV() == null){
            if(e.getActionCommand().equals(modelo.getVistaP().btnRegresarIP.getActionCommand())){
                VistaGestionInventario vistaGestion = new VistaGestionInventario();
                vistaGestion.setVisible(true);
                modelo.getVistaP().dispose();
            }
        }else if(modelo.getVistaP() == null && modelo.getVistaV() == null){
            if(e.getActionCommand().equals(modelo.getVistaAP().btnRegresar.getActionCommand())){
                VistaGestionInventario vistaGestion = new VistaGestionInventario();
                vistaGestion.setVisible(true);
                modelo.getVistaAP().dispose();
            }
        }else if(modelo.getVistaP() == null && modelo.getVistaAP() == null){
            if(e.getActionCommand().equals(modelo.getVistaV().btnRegresarV.getActionCommand())){
                VistaGestionInventario vistaGestion = new VistaGestionInventario();
                vistaGestion.setVisible(true);
                modelo.getVistaV().dispose();
            }
        }
    }
    
    
    
}
