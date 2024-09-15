package Controlador;

import Modelo.ModeloProducto;
import Vista.VistaPrincipal;
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
                VistaPrincipal vistaGestion = new VistaPrincipal();
                vistaGestion.setVisible(true);
                modelo.getVistaP().dispose();
            }
        }else if(modelo.getVistaP() == null && modelo.getVistaV() == null){
            if(e.getActionCommand().equals(modelo.getVistaAP().btnRegresar.getActionCommand())){
                VistaPrincipal vistaGestion = new VistaPrincipal();
                vistaGestion.setVisible(true);
                modelo.getVistaAP().dispose();
            }
        }else if(modelo.getVistaP() == null && modelo.getVistaAP() == null){
            if(e.getActionCommand().equals(modelo.getVistaV().btnRegresarV.getActionCommand())){
                VistaPrincipal vistaGestion = new VistaPrincipal();
                vistaGestion.setVisible(true);
                modelo.getVistaV().dispose();
            }
        }
    }
    
    
    
}
